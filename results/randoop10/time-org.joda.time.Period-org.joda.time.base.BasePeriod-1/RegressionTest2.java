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
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks8 = null;
        org.joda.time.Weeks weeks9 = weeks5.minus(weeks8);
        org.joda.time.DurationFieldType durationFieldType10 = weeks9.getFieldType();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks14 = weeks13.negated();
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn(readableInterval16);
        boolean boolean18 = weeks15.isLessThan(weeks17);
        boolean boolean19 = weeks14.isGreaterThan(weeks17);
        boolean boolean20 = weeks11.isLessThan(weeks14);
        org.joda.time.Weeks weeks21 = weeks9.plus(weeks14);
        org.joda.time.Weeks weeks23 = weeks14.minus(2);
        org.joda.time.Weeks weeks25 = weeks23.dividedBy((-10));
        org.joda.time.Duration duration26 = weeks23.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval28 = duration26.toIntervalFrom(readableInstant27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.Seconds seconds5 = seconds0.minus(87);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = seconds5.getValue(14405);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 14405");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(seconds5);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT-1.872S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.format.PeriodPrinter periodPrinter2 = null;
        org.joda.time.format.PeriodParser periodParser3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = new org.joda.time.format.PeriodFormatter(periodPrinter2, periodParser3);
        boolean boolean5 = periodFormatter4.isParser();
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter4.withParseType(periodType7);
        boolean boolean10 = periodFormatter9.isPrinter();
        boolean boolean11 = periodFormatter9.isParser();
        org.joda.time.PeriodType periodType12 = periodFormatter9.getParseType();
        org.joda.time.PeriodType periodType13 = periodType12.withSecondsRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withDaysRemoved();
        org.joda.time.PeriodType periodType15 = periodType14.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration2 = new org.joda.time.Duration((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        org.joda.time.Days days1 = org.joda.time.Days.days(36);
        org.joda.time.Seconds seconds2 = days1.toStandardSeconds();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        java.lang.String str8 = weeks2.toString();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Minutes minutes16 = minutes14.dividedBy((int) (byte) 100);
        int int17 = minutes16.size();
        org.joda.time.PeriodType periodType18 = minutes16.getPeriodType();
        org.joda.time.Chronology chronology19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) weeks2, periodType18, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P-1W" + "'", str8, "P-1W");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration6.plus((long) (short) 10);
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        int int22 = period21.getYears();
        org.joda.time.Period period24 = period21.plusYears((int) ' ');
        boolean boolean25 = duration16.equals((java.lang.Object) period24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration26 = period24.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(10);
        org.joda.time.Period period3 = period1.withDays(6);
        java.lang.String str4 = period3.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P6DT10S" + "'", str4, "P6DT10S");
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period17 = duration16.toPeriod();
        boolean boolean18 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.Period period21 = duration9.toPeriodTo(readableInstant19, periodType20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant22);
        long long24 = duration9.getStandardMinutes();
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period27.negated();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationTo(readableInstant29);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = duration30.toPeriod(periodType31, chronology32);
        int int34 = duration9.compareTo((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration36 = duration9.withMillis((long) 52);
        org.joda.time.Duration duration38 = duration36.minus(120L);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration38);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 999);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period5.minusDays((-36));
        org.joda.time.Period period12 = period5.minusMonths((int) 'a');
        org.joda.time.Period period14 = period5.withWeeks((int) (byte) 1);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(10);
        int int2 = seconds1.getSeconds();
        org.joda.time.format.PeriodPrinter periodPrinter3 = null;
        org.joda.time.format.PeriodParser periodParser4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = new org.joda.time.format.PeriodFormatter(periodPrinter3, periodParser4);
        boolean boolean6 = periodFormatter5.isParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter5.withLocale(locale7);
        boolean boolean9 = periodFormatter5.isParser();
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter5.withLocale(locale10);
        java.util.Locale locale12 = null;
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter11.withLocale(locale12);
        boolean boolean14 = seconds1.equals((java.lang.Object) periodFormatter13);
        org.joda.time.Minutes minutes15 = seconds1.toStandardMinutes();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(minutes15);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Duration duration23 = minutes22.toStandardDuration();
        boolean boolean24 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(readableInstant25, readableInstant26);
        org.joda.time.Duration duration28 = duration16.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration29 = duration16.toDuration();
        org.joda.time.Duration duration30 = duration9.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant31);
        org.joda.time.Period period34 = period32.minusMonths((-1));
        int int35 = period34.getMillis();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        org.joda.time.PeriodType periodType9 = periodFormatter8.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = org.joda.time.Period.parse("Standard", periodFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        org.joda.time.Period period2 = new org.joda.time.Period((-2147483648L), (long) (byte) 0);
        org.joda.time.Period period4 = period2.minusMillis(5);
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period4);
        java.lang.String str6 = period4.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P3W3DT20H31M23.643S" + "'", str6, "P3W3DT20H31M23.643S");
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(56);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType19);
        boolean boolean21 = periodFormatter2.isPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter22 = periodFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer23 = null;
        org.joda.time.Days days24 = org.joda.time.Days.FIVE;
        java.lang.String str25 = days24.toString();
        org.joda.time.Days days27 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days28 = days24.minus(days27);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer23, (org.joda.time.ReadablePeriod) days24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(periodPrinter22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P5D" + "'", str25, "P5D");
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) '4');
        org.joda.time.Days days2 = duration1.toStandardDays();
        org.joda.time.DurationFieldType durationFieldType3 = days2.getFieldType();
        org.joda.time.Weeks weeks4 = days2.toStandardWeeks();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("Standard");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Standard\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType8);
        org.joda.time.Duration duration11 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.days();
        boolean boolean18 = periodType16.isSupported(durationFieldType17);
        org.joda.time.PeriodType periodType19 = periodType16.withMinutesRemoved();
        int int20 = periodType16.size();
        org.joda.time.Period period21 = duration11.toPeriodFrom(readableInstant12, periodType16);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Days days23 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType24 = days23.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withSecondsRemoved();
        org.joda.time.PeriodType periodType26 = periodType24.withYearsRemoved();
        java.lang.String str27 = periodType26.toString();
        org.joda.time.PeriodType periodType28 = periodType26.withHoursRemoved();
        java.lang.String str29 = periodType28.toString();
        org.joda.time.Period period30 = duration11.toPeriodTo(readableInstant22, periodType28);
        org.joda.time.PeriodType periodType31 = periodType28.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) periodType8, periodType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PeriodType[Days]" + "'", str27, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PeriodType[Days]" + "'", str29, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(0L);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days8);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration14 = duration12.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalFrom(readableInstant17);
        org.joda.time.Days days19 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Days days21 = days19.minus((int) '4');
        org.joda.time.Days days22 = days9.minus(days21);
        org.joda.time.MutablePeriod mutablePeriod23 = days9.toMutablePeriod();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(mutablePeriod23);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        org.joda.time.Hours hours4 = hours0.dividedBy((-95));
        org.joda.time.Hours hours6 = hours4.dividedBy((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds7 = hours6.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -645859 * 3600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType3 = seconds2.getPeriodType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str6 = seconds5.toString();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        int int12 = period11.getYears();
        org.joda.time.Period period13 = period11.toPeriod();
        org.joda.time.Seconds seconds14 = period11.toStandardSeconds();
        boolean boolean15 = seconds5.isLessThan(seconds14);
        org.joda.time.Seconds seconds16 = seconds2.plus(seconds14);
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds19 = seconds17.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType20 = seconds17.getFieldType();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds23 = seconds21.plus(seconds22);
        org.joda.time.Seconds seconds25 = seconds21.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds26 = seconds17.plus(seconds21);
        org.joda.time.Seconds seconds27 = seconds2.plus(seconds26);
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.seconds((int) (short) 0);
        int int30 = seconds29.getSeconds();
        boolean boolean31 = seconds26.isGreaterThan(seconds29);
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds34 = seconds32.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType35 = seconds34.getPeriodType();
        org.joda.time.Seconds seconds37 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str38 = seconds37.toString();
        org.joda.time.Period period41 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period43 = period41.minusMonths(0);
        int int44 = period43.getYears();
        org.joda.time.Period period45 = period43.toPeriod();
        org.joda.time.Seconds seconds46 = period43.toStandardSeconds();
        boolean boolean47 = seconds37.isLessThan(seconds46);
        org.joda.time.Seconds seconds48 = seconds34.plus(seconds46);
        org.joda.time.Seconds seconds49 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds51 = seconds49.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType52 = seconds49.getFieldType();
        org.joda.time.Seconds seconds53 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds54 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds55 = seconds53.plus(seconds54);
        org.joda.time.Seconds seconds57 = seconds53.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds58 = seconds49.plus(seconds53);
        org.joda.time.Seconds seconds59 = seconds34.plus(seconds58);
        boolean boolean60 = seconds26.isLessThan(seconds58);
        int int62 = seconds58.getValue(0);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT0S" + "'", str38, "PT0S");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds55);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        long long11 = duration10.getMillis();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 120000L + "'", long11 == 120000L);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period2 = new org.joda.time.Period((-128849018880L), periodType1);
        org.joda.time.Seconds seconds3 = period2.toStandardSeconds();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = seconds4.plus(seconds5);
        org.joda.time.PeriodType periodType7 = seconds4.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period10.negated();
        org.joda.time.DurationFieldType durationFieldType13 = period10.getFieldType((int) (short) 1);
        int int14 = periodType7.indexOf(durationFieldType13);
        java.lang.String str15 = durationFieldType13.toString();
        boolean boolean16 = period2.isSupported(durationFieldType13);
        java.lang.String str17 = durationFieldType13.toString();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "months" + "'", str15, "months");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "months" + "'", str17, "months");
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks8 = null;
        org.joda.time.Weeks weeks9 = weeks5.minus(weeks8);
        org.joda.time.Weeks weeks11 = weeks9.minus(35);
        java.lang.String str12 = weeks11.toString();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P-35W" + "'", str12, "P-35W");
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        boolean boolean21 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(readableInstant22, readableInstant23);
        org.joda.time.Duration duration25 = duration13.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration26 = duration13.toDuration();
        boolean boolean27 = duration4.isEqual((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Duration duration34 = minutes33.toStandardDuration();
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        boolean boolean42 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = new org.joda.time.Duration(readableInstant43, readableInstant44);
        org.joda.time.Duration duration46 = duration34.minus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration34, readableInstant47);
        org.joda.time.Duration duration50 = duration34.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Interval interval52 = duration50.toIntervalFrom(readableInstant51);
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period57 = period55.minusMonths(0);
        org.joda.time.Minutes minutes58 = period57.toStandardMinutes();
        org.joda.time.Duration duration59 = minutes58.toStandardDuration();
        org.joda.time.Period period62 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period64 = period62.minusMonths(0);
        org.joda.time.Minutes minutes65 = period64.toStandardMinutes();
        org.joda.time.Duration duration66 = minutes65.toStandardDuration();
        boolean boolean67 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.Duration duration69 = duration59.plus((long) (short) 10);
        org.joda.time.Duration duration71 = duration50.withDurationAdded((org.joda.time.ReadableDuration) duration69, (int) (byte) 0);
        boolean boolean72 = duration26.isEqual((org.joda.time.ReadableDuration) duration69);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Duration duration75 = org.joda.time.Duration.standardSeconds((long) 0);
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant73, (org.joda.time.ReadableDuration) duration75);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period83 = period81.minusMonths(0);
        org.joda.time.Minutes minutes84 = period83.toStandardMinutes();
        org.joda.time.Duration duration85 = minutes84.toStandardDuration();
        org.joda.time.Period period86 = duration85.toPeriod();
        org.joda.time.Duration duration88 = duration85.plus((long) (byte) 0);
        org.joda.time.Period period89 = new org.joda.time.Period(readableInstant78, (org.joda.time.ReadableDuration) duration88);
        org.joda.time.PeriodType periodType90 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period((java.lang.Object) duration88, periodType90, chronology91);
        org.joda.time.Period period93 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration75, readableInstant77, periodType90);
        org.joda.time.Period period94 = new org.joda.time.Period((java.lang.Object) duration26, periodType90);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period96 = period94.minusYears((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(minutes84);
        org.junit.Assert.assertNotNull(duration85);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertNotNull(periodType90);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration1 = minutes0.toStandardDuration();
        long long2 = duration1.getStandardSeconds();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration12 = minutes8.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Duration duration19 = minutes18.toStandardDuration();
        org.joda.time.Period period20 = duration19.toPeriod();
        boolean boolean21 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.Period period24 = duration12.toPeriodTo(readableInstant22, periodType23);
        org.joda.time.Duration duration25 = duration1.plus((org.joda.time.ReadableDuration) duration12);
        java.lang.String str26 = duration1.toString();
        org.joda.time.Duration duration29 = duration1.withDurationAdded((long) (short) -1, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Duration duration37 = minutes36.toStandardDuration();
        org.joda.time.Minutes minutes39 = minutes36.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration40 = minutes36.toStandardDuration();
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period45 = period43.minusMonths(0);
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Duration duration47 = minutes46.toStandardDuration();
        org.joda.time.Period period48 = duration47.toPeriod();
        boolean boolean49 = duration40.isLongerThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.days();
        org.joda.time.Period period52 = duration40.toPeriodTo(readableInstant50, periodType51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = duration40.toPeriodFrom(readableInstant53);
        int int55 = period54.getMinutes();
        org.joda.time.Period period57 = period54.withHours(6);
        org.joda.time.PeriodType periodType58 = period54.getPeriodType();
        org.joda.time.Period period59 = duration1.toPeriodTo(readableInstant30, periodType58);
        org.joda.time.Period period61 = period59.plusMillis(2);
        java.lang.String str62 = period59.toString();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-128849018880L) + "'", long2 == (-128849018880L));
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT-128849018880S" + "'", str26, "PT-128849018880S");
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "P-4083Y-3W-2DT-2H-8M" + "'", str62, "P-4083Y-3W-2DT-2H-8M");
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = period9.withHours(268435465);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(1);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) hours1);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes10 = minutes8.multipliedBy(2);
        org.joda.time.Period period11 = minutes10.toPeriod();
        org.joda.time.DurationFieldType durationFieldType12 = minutes10.getFieldType();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period17 = duration16.toPeriod();
        boolean boolean18 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.Period period21 = duration9.toPeriodTo(readableInstant19, periodType20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant22);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        long long26 = duration25.getStandardSeconds();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Duration duration33 = minutes32.toStandardDuration();
        org.joda.time.Minutes minutes35 = minutes32.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration36 = minutes32.toStandardDuration();
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period41 = period39.minusMonths(0);
        org.joda.time.Minutes minutes42 = period41.toStandardMinutes();
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        org.joda.time.Period period44 = duration43.toPeriod();
        boolean boolean45 = duration36.isLongerThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.days();
        org.joda.time.Period period48 = duration36.toPeriodTo(readableInstant46, periodType47);
        org.joda.time.Duration duration49 = duration25.plus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration50 = duration49.toDuration();
        boolean boolean51 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds52 = duration49.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -128849018880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-128849018880L) + "'", long26 == (-128849018880L));
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMillisRemoved();
        org.joda.time.Period period10 = duration1.toPeriodFrom(readableInstant5, periodType8);
        java.lang.Class<?> wildcardClass11 = duration1.getClass();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes5.plus(8);
        org.joda.time.Minutes minutes11 = minutes9.dividedBy((int) (short) 1);
        org.joda.time.Period period13 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType15 = minutes14.getFieldType();
        int int16 = minutes14.getMinutes();
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Minutes minutes25 = minutes23.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes26 = minutes17.minus(minutes23);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Minutes minutes34 = minutes32.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((java.lang.Object) minutes32, chronology35);
        org.joda.time.Minutes minutes37 = minutes17.minus(minutes32);
        org.joda.time.DurationFieldType durationFieldType39 = minutes37.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType40 = minutes37.getPeriodType();
        org.joda.time.Minutes minutes41 = minutes37.negated();
        org.joda.time.Minutes minutes42 = minutes14.minus(minutes41);
        org.joda.time.Minutes minutes43 = minutes42.negated();
        org.joda.time.Minutes minutes44 = minutes9.plus(minutes43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes46 = minutes9.plus(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 8 + 2147483645");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14400 + "'", int16 == 14400);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes44);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.withDays(8);
        int int3 = period0.getSeconds();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.seconds();
        int int5 = period0.get(durationFieldType4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DurationField durationField7 = durationFieldType4.getField(chronology6);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(432000L, (long) ' ');
        org.joda.time.ReadableInstant readableInstant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval4 = duration2.toIntervalFrom(readableInstant3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("months");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"months\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Period period3 = period1.plusMonths((int) 'a');
        org.joda.time.Period period5 = period1.plusSeconds((int) (short) 100);
        org.joda.time.Period period7 = period5.minusMonths((int) 'a');
        org.joda.time.Period period9 = period7.withMillis((int) (short) 100);
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        java.lang.String str11 = days10.toString();
        org.joda.time.Days days13 = days10.multipliedBy((int) (byte) -1);
        org.joda.time.Days days14 = days10.negated();
        org.joda.time.Days days15 = org.joda.time.Days.ONE;
        org.joda.time.Days days16 = org.joda.time.Days.ONE;
        int int17 = days15.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days16);
        org.joda.time.Days days19 = days16.multipliedBy((int) '#');
        org.joda.time.Days days20 = days14.minus(days16);
        org.joda.time.Days days22 = days14.minus((int) 'a');
        org.joda.time.DurationFieldType durationFieldType23 = days14.getFieldType();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DurationField durationField25 = durationFieldType23.getField(chronology24);
        org.joda.time.Period period27 = period7.withFieldAdded(durationFieldType23, 5);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DurationField durationField29 = durationFieldType23.getField(chronology28);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P5D" + "'", str11, "P5D");
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = period6.equals(obj8);
        org.joda.time.Period period11 = period6.withWeeks((int) '#');
        org.joda.time.Period period13 = period11.plusMillis((-1));
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Duration duration27 = minutes26.toStandardDuration();
        boolean boolean28 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant29);
        java.lang.String str31 = duration27.toString();
        long long32 = duration27.getMillis();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Minutes minutes42 = minutes39.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType43 = minutes42.getPeriodType();
        org.joda.time.PeriodType periodType44 = minutes42.getPeriodType();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant33, periodType44);
        boolean boolean46 = period11.equals((java.lang.Object) period45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period48 = period45.plusWeeks(1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT0S" + "'", str31, "PT0S");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 8, (long) '4', chronology2);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("Weeks");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Weeks\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.Days days5 = days2.minus(0);
        boolean boolean6 = days0.isLessThan(days5);
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Minutes minutes15 = minutes13.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes16 = minutes7.minus(minutes13);
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Minutes minutes25 = minutes23.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes26 = minutes17.minus(minutes23);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Duration duration33 = minutes32.toStandardDuration();
        org.joda.time.Minutes minutes35 = minutes32.multipliedBy((int) (short) 1);
        int int36 = minutes17.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes35);
        org.joda.time.Minutes minutes37 = minutes16.plus(minutes35);
        org.joda.time.PeriodType periodType38 = minutes16.getPeriodType();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str41 = duration40.toString();
        boolean boolean42 = periodType38.equals((java.lang.Object) duration40);
        org.joda.time.PeriodType periodType43 = periodType38.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) days5, periodType43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PT0S" + "'", str41, "PT0S");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType19);
        boolean boolean21 = periodFormatter2.isParser();
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.Minutes minutes29 = period28.toStandardMinutes();
        org.joda.time.Minutes minutes31 = minutes29.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes32 = minutes23.minus(minutes29);
        org.joda.time.Period period35 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period37 = period35.minusMonths(0);
        org.joda.time.Minutes minutes38 = period37.toStandardMinutes();
        org.joda.time.Duration duration39 = minutes38.toStandardDuration();
        org.joda.time.Minutes minutes41 = minutes38.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration42 = minutes38.toStandardDuration();
        org.joda.time.Period period45 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period46 = period45.negated();
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period46.toDurationTo(readableInstant47);
        boolean boolean49 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration52 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration53 = duration48.plus((org.joda.time.ReadableDuration) duration52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Interval interval55 = duration52.toIntervalTo(readableInstant54);
        org.joda.time.Minutes minutes56 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval55);
        boolean boolean57 = minutes29.isGreaterThan(minutes56);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer22, (org.joda.time.ReadablePeriod) minutes29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes9 = minutes8.negated();
        java.lang.String str10 = minutes8.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0M" + "'", str10, "PT0M");
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        org.joda.time.Period period10 = duration6.toPeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.Duration duration21 = duration18.plus((long) (byte) 0);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) duration21, periodType23, chronology24);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Minutes minutes34 = minutes31.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration35 = minutes31.toStandardDuration();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Duration duration42 = minutes41.toStandardDuration();
        org.joda.time.Period period43 = duration42.toPeriod();
        boolean boolean44 = duration35.isLongerThan((org.joda.time.ReadableDuration) duration42);
        boolean boolean45 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration46 = duration6.minus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period53 = period51.minusMonths(0);
        org.joda.time.Minutes minutes54 = period53.toStandardMinutes();
        org.joda.time.Duration duration55 = minutes54.toStandardDuration();
        org.joda.time.Minutes minutes57 = minutes54.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration58 = minutes54.toStandardDuration();
        org.joda.time.Period period61 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period63 = period61.minusMonths(0);
        org.joda.time.Minutes minutes64 = period63.toStandardMinutes();
        org.joda.time.Duration duration65 = minutes64.toStandardDuration();
        org.joda.time.Period period66 = duration65.toPeriod();
        boolean boolean67 = duration58.isLongerThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = duration65.toIntervalTo(readableInstant68);
        boolean boolean70 = duration48.isLongerThan((org.joda.time.ReadableDuration) duration65);
        boolean boolean71 = duration46.isLongerThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardHours(52000L);
        org.joda.time.Duration duration74 = duration46.minus((org.joda.time.ReadableDuration) duration73);
        org.joda.time.ReadableInstant readableInstant75 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval76 = duration74.toIntervalTo(readableInstant75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(minutes64);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(duration74);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        java.lang.String str5 = periodType3.toString();
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = period6.withSeconds(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PeriodType[Days]" + "'", str5, "PeriodType[Days]");
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("P268435455W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) minutes0);
        java.lang.String str2 = period1.toString();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT-2147483648M" + "'", str2, "PT-2147483648M");
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        org.joda.time.Days days1 = org.joda.time.Days.days(999);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        org.joda.time.Period period2 = new org.joda.time.Period((-1491308L), 7730941129200000L);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Period period9 = period5.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType10 = period5.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withMinutesRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (-1), periodType11, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = period15.getValue(36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType19);
        java.util.Locale locale21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter2.withLocale(locale21);
        org.joda.time.format.PeriodPrinter periodPrinter23 = periodFormatter22.getPrinter();
        java.util.Locale locale24 = periodFormatter22.getLocale();
        org.joda.time.format.PeriodPrinter periodPrinter25 = periodFormatter22.getPrinter();
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.weeks(35);
        org.joda.time.Weeks weeks29 = weeks27.multipliedBy(5);
        org.joda.time.MutablePeriod mutablePeriod30 = weeks29.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = periodFormatter22.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod30, "PT10S", 87);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNull(periodPrinter23);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNull(periodPrinter25);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(mutablePeriod30);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        boolean boolean3 = weeks0.isGreaterThan(weeks2);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean5 = weeks2.isGreaterThan(weeks4);
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeks(1);
        boolean boolean9 = weeks6.isGreaterThan(weeks8);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.ZERO;
        java.lang.String str11 = weeks10.toString();
        int int12 = weeks10.size();
        org.joda.time.PeriodType periodType13 = weeks10.getPeriodType();
        org.joda.time.Weeks weeks15 = weeks10.minus(7);
        org.joda.time.PeriodType periodType16 = weeks15.getPeriodType();
        org.joda.time.Weeks weeks17 = weeks6.plus(weeks15);
        org.joda.time.Weeks weeks18 = weeks2.minus(weeks15);
        org.joda.time.Weeks weeks20 = weeks15.dividedBy(2147483647);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0W" + "'", str11, "P0W");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        org.joda.time.Duration duration11 = duration6.withMillis((long) 1);
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        org.joda.time.Period period21 = duration20.toPeriod();
        org.joda.time.Duration duration23 = duration20.plus((long) (byte) 0);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration25 = duration11.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Period period26 = duration25.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType28 = period26.getFieldType(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        org.joda.time.Period period1 = org.joda.time.Period.months(7);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration2 = duration1.toDuration();
        org.joda.time.Minutes minutes3 = duration1.toStandardMinutes();
        org.joda.time.Minutes minutes4 = minutes3.negated();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period7.minusMonths(0);
        org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
        org.joda.time.Duration duration11 = minutes10.toStandardDuration();
        org.joda.time.Minutes minutes12 = minutes3.minus(minutes10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes14 = minutes12.multipliedBy(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 100 * 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(minutes12);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Days days4 = days2.plus((int) ' ');
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) days4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = period5.plusSeconds(36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        boolean boolean8 = periodFormatter7.isPrinter();
        boolean boolean9 = periodFormatter7.isParser();
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter7.withLocale(locale10);
        java.io.Writer writer12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        java.lang.String str14 = days13.toString();
        org.joda.time.Days days16 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days17 = days13.minus(days16);
        org.joda.time.Days days19 = days16.minus((int) '#');
        org.joda.time.Days days20 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days21 = days19.plus(days20);
        org.joda.time.DurationFieldType durationFieldType22 = days21.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter11.printTo(writer12, (org.joda.time.ReadablePeriod) days21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P5D" + "'", str14, "P5D");
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(durationFieldType22);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 52, 11L, chronology2);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = duration1.toPeriod(periodType10, chronology11);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType14 = periodType13.withMillisRemoved();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) period12, periodType14, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = period16.plusYears(14405);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType9 = minutes8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-35));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("P-10WT8M0.036S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        org.joda.time.Period period1 = org.joda.time.Period.days((-1));
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration6 = duration4.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration6.toIntervalFrom(readableInstant9);
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval10);
        org.joda.time.Seconds seconds13 = seconds11.plus(0);
        org.joda.time.DurationFieldType durationFieldType14 = seconds13.getFieldType();
        int int15 = period1.indexOf(durationFieldType14);
        org.joda.time.Chronology chronology16 = null;
        boolean boolean17 = durationFieldType14.isSupported(chronology16);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withSecondsRemoved();
        org.joda.time.Period period12 = duration6.toPeriodFrom(readableInstant7, periodType9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, periodType9, chronology13);
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withParseType(periodType9);
        org.joda.time.format.PeriodPrinter periodPrinter16 = periodFormatter15.getPrinter();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.dayTime();
        org.joda.time.format.PeriodPrinter periodPrinter18 = null;
        org.joda.time.format.PeriodParser periodParser19 = null;
        org.joda.time.format.PeriodFormatter periodFormatter20 = new org.joda.time.format.PeriodFormatter(periodPrinter18, periodParser19);
        boolean boolean21 = periodFormatter20.isParser();
        java.util.Locale locale22 = null;
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter20.withLocale(locale22);
        boolean boolean24 = periodFormatter20.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter25 = periodFormatter20.getPrinter();
        boolean boolean26 = periodType17.equals((java.lang.Object) periodPrinter25);
        org.joda.time.PeriodType periodType27 = periodType17.withMonthsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter15.withParseType(periodType17);
        org.joda.time.format.PeriodParser periodParser29 = periodFormatter15.getParser();
        java.lang.StringBuffer stringBuffer30 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        int int36 = period35.getYears();
        org.joda.time.Period period37 = period35.toPeriod();
        org.joda.time.Period period39 = period37.plusMinutes(100);
        org.joda.time.Period period41 = period37.minusMillis(1);
        org.joda.time.Period period43 = period41.plusWeeks(4);
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Period period50 = period48.minusSeconds(0);
        org.joda.time.Period period51 = period50.normalizedStandard();
        org.joda.time.Period period53 = period50.withHours((int) 'a');
        org.joda.time.Period period55 = period53.minusHours(0);
        org.joda.time.Hours hours56 = period53.toStandardHours();
        org.joda.time.Period period58 = period53.plusHours(11);
        boolean boolean59 = period41.equals((java.lang.Object) 11);
        org.joda.time.Period period61 = period41.plusYears((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter15.printTo(stringBuffer30, (org.joda.time.ReadablePeriod) period61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNull(periodPrinter16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(periodPrinter25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodFormatter28);
        org.junit.Assert.assertNull(periodParser29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(hours56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(period61);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        boolean boolean3 = weeks0.isGreaterThan(weeks2);
        org.joda.time.DurationFieldType durationFieldType4 = weeks2.getFieldType();
        java.lang.String str5 = weeks2.toString();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P1W" + "'", str5, "P1W");
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter2.getParseType();
        boolean boolean7 = periodFormatter2.isParser();
        boolean boolean8 = periodFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = periodFormatter2.parsePeriod("PT-128849018880S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes5.multipliedBy(8);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.minutes((int) (byte) 100);
        boolean boolean14 = minutes5.isGreaterThan(minutes13);
        org.joda.time.Days days15 = org.joda.time.Days.ONE;
        org.joda.time.Days days17 = days15.dividedBy((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = minutes5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationFrom(readableInstant1);
        org.joda.time.Period period4 = period0.multipliedBy(0);
        org.joda.time.Period period6 = period4.minusDays(35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = period4.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes19 = minutes10.minus(minutes16);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Minutes minutes28 = minutes25.multipliedBy((int) (short) 1);
        int int29 = minutes10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes28);
        org.joda.time.Minutes minutes30 = minutes9.plus(minutes28);
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Minutes minutes38 = minutes36.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) minutes36, chronology39);
        org.joda.time.Period period41 = minutes36.toPeriod();
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean43 = minutes36.isLessThan(minutes42);
        org.joda.time.Minutes minutes44 = minutes30.minus(minutes36);
        org.joda.time.Minutes minutes46 = minutes36.dividedBy((-36));
        org.joda.time.Minutes minutes48 = minutes46.dividedBy((int) (short) 1);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period53 = period51.minusMonths(0);
        org.joda.time.Minutes minutes54 = period53.toStandardMinutes();
        org.joda.time.Duration duration55 = minutes54.toStandardDuration();
        org.joda.time.Minutes minutes57 = minutes54.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration58 = minutes54.toStandardDuration();
        org.joda.time.Period period61 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period62 = period61.negated();
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationTo(readableInstant63);
        boolean boolean65 = duration58.isShorterThan((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Duration duration68 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration69 = duration64.plus((org.joda.time.ReadableDuration) duration68);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Interval interval71 = duration69.toIntervalFrom(readableInstant70);
        org.joda.time.Minutes minutes72 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval71);
        boolean boolean73 = minutes48.isLessThan(minutes72);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Duration duration4 = duration1.minus((long) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = duration4.toPeriodTo(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Period period8 = period2.plusWeeks((-1));
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = seconds10.plus(seconds11);
        org.joda.time.PeriodType periodType13 = seconds10.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 'a', periodType13);
        org.joda.time.Period period15 = period14.normalizedStandard();
        org.joda.time.Period period16 = period8.minus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = period16.toPeriod();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        int int3 = hours0.getHours();
        org.joda.time.PeriodType periodType4 = hours0.getPeriodType();
        org.joda.time.Hours hours6 = org.joda.time.Hours.hours(2147483647);
        boolean boolean7 = hours0.isGreaterThan(hours6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes8 = hours0.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        org.joda.time.Days days8 = duration1.toStandardDays();
        org.joda.time.Days days9 = org.joda.time.Days.MIN_VALUE;
        boolean boolean10 = days8.isLessThan(days9);
        org.joda.time.MutablePeriod mutablePeriod11 = days9.toMutablePeriod();
        org.joda.time.Duration duration12 = days9.toStandardDuration();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant19);
        org.joda.time.Period period22 = period20.withYears((int) (byte) 1);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period25.negated();
        org.joda.time.DurationFieldType durationFieldType28 = period25.getFieldType((int) (short) 1);
        org.joda.time.Period period30 = period20.withField(durationFieldType28, 6);
        int[] intArray31 = period30.getValues();
        org.joda.time.Period period33 = period30.plusMinutes((-95));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours34 = period33.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 6, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        org.joda.time.Period period1 = org.joda.time.Period.years(100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        boolean boolean16 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration20 = duration15.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Duration duration22 = duration19.withMillis(100L);
        java.lang.String str23 = duration22.toString();
        java.lang.Class<?> wildcardClass24 = duration22.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT0.100S" + "'", str23, "PT0.100S");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Hours hours2 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.DurationFieldType durationFieldType4 = hours2.getFieldType();
        org.joda.time.Period period5 = period1.plus((org.joda.time.ReadablePeriod) hours2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours7 = hours2.multipliedBy((-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * -2147483646");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-10));
        org.joda.time.Hours hours2 = org.joda.time.Hours.MIN_VALUE;
        boolean boolean3 = hours1.isLessThan(hours2);
        org.joda.time.Hours hours5 = hours1.multipliedBy(52);
        org.joda.time.Hours hours6 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType7 = hours6.getFieldType();
        org.joda.time.Hours hours8 = hours6.negated();
        org.joda.time.Hours hours9 = hours8.negated();
        java.lang.String str10 = hours8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours11 = hours5.plus(hours8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -520 + -2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT-2147483647H" + "'", str10, "PT-2147483647H");
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((-10));
        org.joda.time.Seconds seconds3 = seconds1.multipliedBy((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = seconds3.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT1M40S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT0S");
        org.joda.time.DurationFieldType durationFieldType2 = weeks1.getFieldType();
        org.joda.time.Hours hours3 = weeks1.toStandardHours();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period4.negated();
        int int6 = period4.getHours();
        org.joda.time.Period period8 = org.joda.time.Period.days(10);
        org.joda.time.Period period10 = period8.plusMonths((int) 'a');
        org.joda.time.Period period12 = period8.plusSeconds((int) (short) 100);
        org.joda.time.Period period14 = period12.minusMonths((int) 'a');
        org.joda.time.Period period15 = period4.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Hours hours16 = period4.toStandardHours();
        int int17 = hours16.getHours();
        org.joda.time.Hours hours18 = hours0.plus(hours16);
        org.joda.time.Hours hours20 = hours18.minus((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours22 = hours20.multipliedBy((-35));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * -35");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours20);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType7 = period2.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.Days days11 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withSecondsRemoved();
        org.joda.time.PeriodType periodType15 = periodType12.withMinutesRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withWeeksRemoved();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(10L, (long) (byte) -1, periodType16, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) period18, chronology19);
        int[] intArray21 = period20.getValues();
        java.lang.String str22 = period20.toString();
        boolean boolean23 = periodType7.equals((java.lang.Object) period20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = period20.minusMonths((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P0D" + "'", str22, "P0D");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = periodFormatter7.getParseType();
        org.joda.time.format.PeriodParser periodParser9 = periodFormatter7.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = periodFormatter7.parsePeriod("P6DT10S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNull(periodParser9);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Duration duration11 = duration1.withDurationAdded(10L, (-36));
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Period period14 = period12.plusSeconds(5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = period12.getValue((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2147483648");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT-2147483647H");
        java.lang.String str2 = hours1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes3 = hours1.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483647 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT-2147483647H" + "'", str2, "PT-2147483647H");
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Minutes minutes2 = weeks1.toStandardMinutes();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isPrinter();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str8 = periodType7.getName();
        org.joda.time.PeriodType periodType9 = periodType7.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter2.withParseType(periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod12 = periodFormatter2.parseMutablePeriod("PT97S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "YearMonthDay" + "'", str8, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter10);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.Weeks weeks4 = null;
        org.joda.time.Weeks weeks5 = weeks0.minus(weeks4);
        int int6 = weeks5.getWeeks();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-35), chronology1);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod2 = hours1.toMutablePeriod();
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = period3.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        org.joda.time.Period period1 = org.joda.time.Period.years(3);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Duration duration21 = minutes20.toStandardDuration();
        boolean boolean22 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(readableInstant23, readableInstant24);
        org.joda.time.Duration duration26 = duration14.minus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration27 = duration14.toDuration();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant28);
        org.joda.time.Period period31 = period29.withHours((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int35 = periodFormatter7.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod32, "PT0.011S", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(mutablePeriod32);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.Period period7 = period2.minusMinutes((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = period7.getValue((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -95");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Hours hours2 = hours0.negated();
        org.joda.time.Duration duration3 = hours0.toStandardDuration();
        long long4 = duration3.getMillis();
        org.joda.time.Duration duration6 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration9 = duration6.plus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration9.toIntervalFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = duration9.toPeriodFrom(readableInstant12);
        boolean boolean14 = duration3.isEqual((org.joda.time.ReadableDuration) duration9);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7730941129200000L + "'", long4 == 7730941129200000L);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant19);
        org.joda.time.Duration duration22 = duration6.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Interval interval24 = duration22.toIntervalFrom(readableInstant23);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Minutes minutes30 = period29.toStandardMinutes();
        org.joda.time.Duration duration31 = minutes30.toStandardDuration();
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Duration duration38 = minutes37.toStandardDuration();
        boolean boolean39 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration41 = duration31.plus((long) (short) 10);
        org.joda.time.Duration duration43 = duration22.withDurationAdded((org.joda.time.ReadableDuration) duration41, (int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period49 = period47.minusMonths(0);
        org.joda.time.Minutes minutes50 = period49.toStandardMinutes();
        org.joda.time.Duration duration51 = minutes50.toStandardDuration();
        org.joda.time.Minutes minutes53 = minutes50.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration54 = minutes50.toStandardDuration();
        org.joda.time.Period period57 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period59 = period57.minusMonths(0);
        org.joda.time.Minutes minutes60 = period59.toStandardMinutes();
        org.joda.time.Duration duration61 = minutes60.toStandardDuration();
        org.joda.time.Period period62 = duration61.toPeriod();
        boolean boolean63 = duration54.isLongerThan((org.joda.time.ReadableDuration) duration61);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.days();
        org.joda.time.Period period66 = duration54.toPeriodTo(readableInstant64, periodType65);
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant44, periodType65);
        org.joda.time.Chronology chronology68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period69 = new org.joda.time.Period((java.lang.Object) periodType65, chronology68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(period66);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.withDays(8);
        int int3 = period0.getSeconds();
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours(2);
        org.joda.time.Hours hours6 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours7 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours8 = hours6.minus(hours7);
        boolean boolean9 = hours5.isLessThan(hours6);
        org.joda.time.DurationFieldType durationFieldType10 = hours5.getFieldType();
        org.joda.time.Period period12 = period0.withField(durationFieldType10, (int) (short) 1);
        org.joda.time.Period period13 = period0.toPeriod();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.Seconds seconds5 = seconds0.plus(6);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds0);
        int int7 = seconds6.size();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks4 = weeks0.dividedBy(8);
        java.lang.String str5 = weeks4.toString();
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeks(1);
        boolean boolean10 = weeks7.isGreaterThan(weeks9);
        org.joda.time.Weeks weeks11 = weeks4.minus(weeks7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes12 = weeks4.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 268435455 * 10080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P268435455W" + "'", str5, "P268435455W");
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks11);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = periodFormatter2.getParseType();
        org.joda.time.PeriodType periodType9 = periodFormatter2.getParseType();
        java.io.Writer writer10 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration15 = duration13.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalFrom(readableInstant18);
        org.joda.time.Days days20 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval19);
        org.joda.time.Days days22 = days20.minus((int) '4');
        org.joda.time.Days days23 = days22.negated();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer10, (org.joda.time.ReadablePeriod) days23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodType9);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType19);
        java.lang.String str21 = periodType19.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PeriodType[Time]" + "'", str21, "PeriodType[Time]");
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        boolean boolean15 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration17 = duration7.plus((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str20 = periodType19.getName();
        org.joda.time.Period period21 = duration7.toPeriodTo(readableInstant18, periodType19);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Period period27 = period24.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period27.toDurationFrom(readableInstant29);
        org.joda.time.Period period31 = period27.normalizedStandard();
        org.joda.time.DurationFieldType durationFieldType33 = period31.getFieldType(0);
        int int34 = periodType19.indexOf(durationFieldType33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 52, periodType19, chronology35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period38 = period36.minusMillis((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "YearMonthDay" + "'", str20, "YearMonthDay");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        org.joda.time.Period period1 = org.joda.time.Period.months(268435465);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration1 = minutes0.toStandardDuration();
        long long2 = duration1.getStandardSeconds();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration12 = minutes8.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Duration duration19 = minutes18.toStandardDuration();
        org.joda.time.Period period20 = duration19.toPeriod();
        boolean boolean21 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.Period period24 = duration12.toPeriodTo(readableInstant22, periodType23);
        org.joda.time.Duration duration25 = duration1.plus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Period period35 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period37 = period35.minusMonths(0);
        org.joda.time.Minutes minutes38 = period37.toStandardMinutes();
        org.joda.time.Duration duration39 = minutes38.toStandardDuration();
        boolean boolean40 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration39, readableInstant41);
        long long43 = duration39.getStandardHours();
        org.joda.time.Duration duration44 = duration12.minus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType46 = periodType45.withDaysRemoved();
        org.joda.time.Period period47 = duration12.toPeriod(periodType45);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Interval interval49 = duration12.toIntervalTo(readableInstant48);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-128849018880L) + "'", long2 == (-128849018880L));
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(interval49);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) minutes3);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        java.lang.String str4 = seconds0.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT2S" + "'", str4, "PT2S");
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = period6.equals(obj8);
        org.joda.time.Period period11 = period6.withWeeks((int) '#');
        org.joda.time.Period period13 = period11.minusSeconds(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType15 = period11.getFieldType((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType3 = seconds0.getFieldType();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds4.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds9 = seconds0.plus(seconds4);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = seconds10.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType13 = seconds10.getFieldType();
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds16 = seconds14.plus(seconds15);
        org.joda.time.Seconds seconds18 = seconds14.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds19 = seconds10.plus(seconds14);
        boolean boolean20 = seconds9.isGreaterThan(seconds14);
        java.lang.String str21 = seconds9.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT4S" + "'", str21, "PT4S");
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Days days3 = days1.minus((int) '4');
        org.joda.time.Days days5 = days3.dividedBy((int) (short) 10);
        int int6 = days3.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = days3.getFieldType(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        org.joda.time.Period period3 = period1.withWeeks((int) (byte) 0);
        org.joda.time.Period period5 = period1.plusSeconds((int) '4');
        org.joda.time.Period period7 = period5.minusMinutes(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = period5.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.years((-1));
        org.joda.time.Days days5 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days7 = days5.multipliedBy((int) (short) 100);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.Days days11 = days8.minus(0);
        org.joda.time.Days days12 = days5.minus(days11);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days12);
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration18 = duration16.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalFrom(readableInstant21);
        org.joda.time.Days days23 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Days days25 = days23.minus((int) '4');
        org.joda.time.Days days26 = days13.minus(days25);
        org.joda.time.Period period27 = period3.withFields((org.joda.time.ReadablePeriod) days13);
        int int28 = period27.size();
        org.joda.time.PeriodType periodType29 = period27.getPeriodType();
        org.joda.time.PeriodType periodType30 = periodType29.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration5 = new org.joda.time.Duration((java.lang.Object) durationFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.DurationFieldType durationFieldType15 = period12.getFieldType((int) (short) 1);
        int int16 = periodType9.indexOf(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) ' ', periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter3.withParseType(periodType9);
        java.util.Locale locale19 = null;
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter3.withLocale(locale19);
        java.util.Locale locale21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter3.withLocale(locale21);
        org.joda.time.format.PeriodPrinter periodPrinter23 = periodFormatter22.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = org.joda.time.Period.parse("centuries", periodFormatter22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNull(periodPrinter23);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        org.joda.time.Weeks weeks4 = weeks2.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks5 = null;
        org.joda.time.Weeks weeks6 = weeks4.minus(weeks5);
        org.joda.time.PeriodType periodType7 = weeks4.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withMillisRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(10L, periodType7, chronology9);
        java.lang.String str11 = periodType7.getName();
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Weeks" + "'", str11, "Weeks");
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(14405);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = minutes5.toPeriod();
        org.joda.time.DurationFieldType durationFieldType8 = minutes5.getFieldType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DurationField durationField10 = durationFieldType8.getField(chronology9);
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = durationFieldType8.isSupported(chronology11);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Hours hours9 = org.joda.time.Hours.hoursIn(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Hours hours11 = org.joda.time.Hours.hoursIn(readableInterval10);
        org.joda.time.Hours hours13 = hours11.multipliedBy(8);
        org.joda.time.Hours hours14 = hours9.plus(hours11);
        org.joda.time.PeriodType periodType15 = hours9.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period(6, 2147483647, (-2), 2147483647, (-35), (int) (byte) 100, 118, 13, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks(1);
        boolean boolean4 = weeks1.isGreaterThan(weeks3);
        org.joda.time.MutablePeriod mutablePeriod5 = weeks1.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = mutablePeriod5.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mutablePeriod5);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration4 = minutes3.toStandardDuration();
        long long5 = duration4.getStandardSeconds();
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Duration duration12 = minutes11.toStandardDuration();
        org.joda.time.Minutes minutes14 = minutes11.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration15 = minutes11.toStandardDuration();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        org.joda.time.Period period23 = duration22.toPeriod();
        boolean boolean24 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.days();
        org.joda.time.Period period27 = duration15.toPeriodTo(readableInstant25, periodType26);
        org.joda.time.Duration duration28 = duration4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Duration duration35 = minutes34.toStandardDuration();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Duration duration42 = minutes41.toStandardDuration();
        boolean boolean43 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration42, readableInstant44);
        long long46 = duration42.getStandardHours();
        org.joda.time.Duration duration47 = duration15.minus((org.joda.time.ReadableDuration) duration42);
        int int48 = duration2.compareTo((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = duration2.toPeriodFrom(readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period57 = period55.minusMonths(0);
        org.joda.time.Minutes minutes58 = period57.toStandardMinutes();
        org.joda.time.Duration duration59 = minutes58.toStandardDuration();
        org.joda.time.Period period60 = duration59.toPeriod();
        org.joda.time.Duration duration62 = duration59.plus((long) (byte) 0);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant52, (org.joda.time.ReadableDuration) duration62);
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((java.lang.Object) duration62, periodType64, chronology65);
        org.joda.time.PeriodType periodType67 = periodType64.withDaysRemoved();
        org.joda.time.PeriodType periodType68 = periodType67.withSecondsRemoved();
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, readableInstant51, periodType68);
        org.joda.time.PeriodType periodType70 = periodType68.withDaysRemoved();
        org.joda.time.PeriodType periodType71 = periodType70.withHoursRemoved();
        int int72 = periodType70.size();
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-128849018880L) + "'", long5 == (-128849018880L));
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 2147483647, (long) '#', chronology2);
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.ONE;
        boolean boolean8 = seconds5.isGreaterThan(seconds7);
        org.joda.time.Duration duration9 = seconds7.toStandardDuration();
        org.joda.time.Seconds seconds10 = seconds7.negated();
        org.joda.time.Seconds seconds12 = seconds10.multipliedBy((int) '#');
        org.joda.time.Period period13 = period3.minus((org.joda.time.ReadablePeriod) seconds10);
        int int15 = period3.getValue((int) (short) 0);
        org.joda.time.Period period17 = period3.withWeeks(87);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 35, (long) (byte) 1);
        org.joda.time.Period period3 = period2.toPeriod();
        org.joda.time.Seconds seconds4 = period3.toStandardSeconds();
        org.joda.time.PeriodType periodType5 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withMonthsRemoved();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.DurationFieldType durationFieldType8 = seconds2.getFieldType();
        java.lang.String str9 = durationFieldType8.getName();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "seconds" + "'", str9, "seconds");
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(7);
        org.joda.time.Duration duration2 = hours1.toStandardDuration();
        org.joda.time.Seconds seconds3 = hours1.toStandardSeconds();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Duration duration11 = duration1.withDurationAdded(10L, (-36));
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration15 = duration11.withDurationAdded((long) ' ', (int) (byte) 0);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Period period22 = period18.minusSeconds((int) (byte) 100);
        org.joda.time.Days days23 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType24 = days23.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withHoursRemoved();
        org.joda.time.PeriodType periodType26 = periodType24.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.days();
        boolean boolean28 = periodType26.isSupported(durationFieldType27);
        int int29 = period18.get(durationFieldType27);
        org.joda.time.Period period31 = period18.withHours(1);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period18.toDurationTo(readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = duration33.toPeriodTo(readableInstant34);
        int int36 = duration15.compareTo((org.joda.time.ReadableDuration) duration33);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Days days41 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType42 = days41.getPeriodType();
        org.joda.time.PeriodType periodType43 = periodType42.withHoursRemoved();
        org.joda.time.PeriodType periodType44 = periodType42.withSecondsRemoved();
        org.joda.time.PeriodType periodType45 = periodType42.withMinutesRemoved();
        org.joda.time.PeriodType periodType46 = periodType45.withWeeksRemoved();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(10L, (long) (byte) -1, periodType46, chronology47);
        org.joda.time.PeriodType periodType49 = periodType46.withYearsRemoved();
        boolean boolean50 = periodType38.equals((java.lang.Object) periodType46);
        org.joda.time.Period period51 = duration33.toPeriodTo(readableInstant37, periodType46);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardDays(1L);
        boolean boolean54 = duration33.isEqual((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = duration33.toPeriod(chronology55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Days days58 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType59 = days58.getPeriodType();
        org.joda.time.PeriodType periodType60 = periodType59.withHoursRemoved();
        org.joda.time.PeriodType periodType61 = periodType59.withYearsRemoved();
        org.joda.time.PeriodType periodType62 = periodType59.withSecondsRemoved();
        org.joda.time.PeriodType periodType63 = periodType59.withHoursRemoved();
        int int64 = periodType63.size();
        org.joda.time.Period period65 = duration33.toPeriodTo(readableInstant57, periodType63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType67 = periodType63.getFieldType((-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2147483646");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(days58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(period65);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        org.joda.time.Period period2 = new org.joda.time.Period((-2147483648L), (long) (byte) 0);
        org.joda.time.Period period4 = period2.multipliedBy(52);
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        org.joda.time.Days days1 = org.joda.time.Days.days(14405);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = days1.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType19);
        java.util.Locale locale21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter2.withLocale(locale21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = periodFormatter22.parsePeriod("P-3D");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodFormatter22);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        org.joda.time.Days days1 = org.joda.time.Days.days(11);
        org.joda.time.Minutes minutes2 = days1.toStandardMinutes();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Weeks weeks1 = hours0.toStandardWeeks();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        org.joda.time.Period period4 = new org.joda.time.Period(59, 6, 1, 0);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.io.Writer writer6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks9 = weeks7.dividedBy(1);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean11 = weeks9.isGreaterThan(weeks10);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter5.printTo(writer6, (org.joda.time.ReadablePeriod) weeks10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        java.util.Locale locale18 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str20 = periodType19.getName();
        org.joda.time.PeriodType periodType21 = periodType19.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter2.withParseType(periodType19);
        java.util.Locale locale23 = periodFormatter2.getLocale();
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds26 = seconds24.plus(seconds25);
        org.joda.time.PeriodType periodType27 = seconds24.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter2.withParseType(periodType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod30 = periodFormatter2.parseMutablePeriod("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "YearMonthDay" + "'", str20, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodFormatter28);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        int int9 = period6.getWeeks();
        org.joda.time.Period period11 = period6.withMinutes(2);
        int int12 = period6.getYears();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.format.PeriodPrinter periodPrinter2 = null;
        org.joda.time.format.PeriodParser periodParser3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = new org.joda.time.format.PeriodFormatter(periodPrinter2, periodParser3);
        boolean boolean5 = periodFormatter4.isParser();
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = seconds7.plus(seconds8);
        org.joda.time.PeriodType periodType10 = seconds7.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = period13.getFieldType((int) (short) 1);
        int int17 = periodType10.indexOf(durationFieldType16);
        org.joda.time.Period period18 = new org.joda.time.Period((long) ' ', periodType10);
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter4.withParseType(periodType10);
        org.joda.time.PeriodType periodType20 = periodType10.withDaysRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        java.lang.String str22 = periodType20.getName();
        org.joda.time.PeriodType periodType23 = periodType20.withYearsRemoved();
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = period24.plusYears((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Seconds" + "'", str22, "Seconds");
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.standardDaysIn(readablePeriod0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.multipliedBy((int) (byte) 1);
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        boolean boolean23 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(readableInstant24, readableInstant25);
        org.joda.time.Duration duration27 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration28 = duration15.toDuration();
        int int29 = duration8.compareTo((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Duration duration31 = duration28.plus(7200L);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(duration31);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Duration duration11 = duration1.withDurationAdded(10L, (-36));
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration15 = duration11.withDurationAdded((long) ' ', (int) (byte) 0);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Period period22 = period18.minusSeconds((int) (byte) 100);
        org.joda.time.Days days23 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType24 = days23.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withHoursRemoved();
        org.joda.time.PeriodType periodType26 = periodType24.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.days();
        boolean boolean28 = periodType26.isSupported(durationFieldType27);
        int int29 = period18.get(durationFieldType27);
        org.joda.time.Period period31 = period18.withHours(1);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period18.toDurationTo(readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = duration33.toPeriodTo(readableInstant34);
        int int36 = duration15.compareTo((org.joda.time.ReadableDuration) duration33);
        org.joda.time.ReadableInstant readableInstant37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval38 = duration33.toIntervalFrom(readableInstant37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.multipliedBy((int) 'a');
        org.joda.time.PeriodType periodType3 = hours0.getPeriodType();
        org.joda.time.Hours hours5 = hours0.plus((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hours5.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks3 = weeks2.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        boolean boolean7 = weeks4.isLessThan(weeks6);
        boolean boolean8 = weeks3.isGreaterThan(weeks6);
        boolean boolean9 = weeks0.isLessThan(weeks3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks10 = weeks0.negated();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str2 = seconds1.toString();
        org.joda.time.DurationFieldType durationFieldType3 = seconds1.getFieldType();
        org.joda.time.Duration duration4 = seconds1.toStandardDuration();
        java.lang.String str5 = seconds1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = seconds1.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Days days4 = days2.plus((int) ' ');
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration9 = duration7.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Interval interval13 = duration9.toIntervalFrom(readableInstant12);
        org.joda.time.Days days14 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Days days16 = days14.minus((int) '4');
        org.joda.time.Duration duration17 = days14.toStandardDuration();
        org.joda.time.Days days18 = org.joda.time.Days.FIVE;
        java.lang.String str19 = days18.toString();
        org.joda.time.Days days21 = days18.multipliedBy((int) (byte) -1);
        org.joda.time.Days days22 = days18.negated();
        org.joda.time.Days days23 = org.joda.time.Days.ONE;
        org.joda.time.Days days24 = org.joda.time.Days.ONE;
        int int25 = days23.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days24);
        org.joda.time.Days days27 = days24.multipliedBy((int) '#');
        org.joda.time.Days days28 = days22.minus(days24);
        org.joda.time.MutablePeriod mutablePeriod29 = days22.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod30 = days22.toMutablePeriod();
        boolean boolean31 = days14.isGreaterThan(days22);
        org.joda.time.Days days32 = days2.plus(days14);
        int int33 = days14.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P5D" + "'", str19, "P5D");
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes5.plus(8);
        org.joda.time.Minutes minutes11 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Minutes minutes20 = minutes18.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes21 = minutes12.minus(minutes18);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Minutes minutes27 = period26.toStandardMinutes();
        org.joda.time.Minutes minutes29 = minutes27.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((java.lang.Object) minutes27, chronology30);
        org.joda.time.Minutes minutes32 = minutes12.minus(minutes27);
        org.joda.time.DurationFieldType durationFieldType34 = minutes32.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType35 = minutes32.getPeriodType();
        org.joda.time.Minutes minutes36 = minutes32.negated();
        org.joda.time.DurationFieldType durationFieldType37 = minutes32.getFieldType();
        org.joda.time.Minutes minutes38 = minutes5.plus(minutes32);
        java.lang.String str39 = minutes32.toString();
        org.joda.time.Period period41 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes42 = period41.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType43 = minutes42.getFieldType();
        boolean boolean44 = minutes32.isLessThan(minutes42);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = minutes32.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PT2M" + "'", str39, "PT2M");
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours1 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Hours hours3 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours4 = hours3.negated();
        org.joda.time.Hours hours5 = hours0.plus(hours4);
        org.joda.time.Hours hours7 = hours5.minus((int) 'a');
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(10);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        java.lang.String str3 = weeks1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks5 = weeks1.dividedBy((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P10W" + "'", str3, "P10W");
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Period period9 = period8.negated();
        org.joda.time.Period period11 = period9.minusMillis(56);
        int[] intArray12 = period9.getValues();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.format.PeriodParser periodParser14 = periodFormatter7.getParser();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period17.negated();
        int int19 = period17.getHours();
        org.joda.time.Period period21 = org.joda.time.Period.days(10);
        org.joda.time.Period period23 = period21.plusMonths((int) 'a');
        org.joda.time.Period period25 = period21.plusSeconds((int) (short) 100);
        org.joda.time.Period period27 = period25.minusMonths((int) 'a');
        org.joda.time.Period period28 = period17.withFields((org.joda.time.ReadablePeriod) period27);
        int int29 = period17.size();
        org.joda.time.MutablePeriod mutablePeriod30 = period17.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = periodFormatter7.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod30, "PeriodType[Standard]", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNull(periodParser14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod30);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getMillis();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant9);
        org.joda.time.Period period12 = period10.minusMillis(0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100000L + "'", long8 == 100000L);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period5 = period1.minusMillis((-10));
        int int6 = period5.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (short) 10);
        int int2 = period1.getMonths();
        org.joda.time.Period period4 = period1.withDays((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration((-128849018880L), (long) (-1));
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks7 = weeks5.dividedBy(1);
        org.joda.time.PeriodType periodType8 = weeks7.getPeriodType();
        java.lang.String str9 = periodType8.getName();
        org.joda.time.Period period10 = duration4.toPeriod(periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Weeks" + "'", str9, "Weeks");
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.days();
        boolean boolean14 = periodType12.isSupported(durationFieldType13);
        org.joda.time.PeriodType periodType15 = periodType12.withMinutesRemoved();
        org.joda.time.Period period16 = new org.joda.time.Period((-128849018880L), periodType12);
        org.joda.time.PeriodType periodType17 = periodType12.withDaysRemoved();
        org.joda.time.PeriodType periodType18 = periodType12.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period(14400, 56, 5, (-5), 59, (int) ' ', (int) (short) -1, (int) (byte) 1, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType3 = seconds0.getFieldType();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds4.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds9 = seconds0.plus(seconds4);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) seconds4, chronology10);
        org.joda.time.DurationFieldType durationFieldType12 = seconds4.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = seconds4.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) ' ');
        org.joda.time.format.PeriodPrinter periodPrinter2 = null;
        org.joda.time.format.PeriodParser periodParser3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = new org.joda.time.format.PeriodFormatter(periodPrinter2, periodParser3);
        boolean boolean5 = periodFormatter4.isParser();
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter4.withParseType(periodType7);
        org.joda.time.PeriodType periodType10 = periodType7.withSecondsRemoved();
        org.joda.time.Period period11 = duration1.toPeriod(periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period11.withWeeks(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        org.joda.time.Period period1 = org.joda.time.Period.hours(87);
        org.joda.time.Period period3 = period1.withWeeks((-10));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT6H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant15);
        java.lang.String str17 = duration13.toString();
        long long18 = duration13.getMillis();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Minutes minutes28 = minutes25.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType29 = minutes28.getPeriodType();
        org.joda.time.PeriodType periodType30 = minutes28.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant19, periodType30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = period31.plusSeconds(10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Weeks weeks2 = minutes1.toStandardWeeks();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, (-1491308L), chronology2);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT0.008S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P-4083Y-3W-2DT-2H-8M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P-4083Y-3W-2DT-2H-8M\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Period period3 = period1.plusMonths((int) 'a');
        org.joda.time.Period period5 = period1.plusSeconds((int) (short) 100);
        org.joda.time.Period period7 = period5.minusMonths((int) 'a');
        int int8 = period5.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        java.util.Locale locale18 = periodFormatter2.getLocale();
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        org.joda.time.Minutes minutes27 = minutes24.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration28 = minutes24.toStandardDuration();
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Duration duration35 = minutes34.toStandardDuration();
        org.joda.time.Period period36 = duration35.toPeriod();
        boolean boolean37 = duration28.isLongerThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.days();
        org.joda.time.Period period40 = duration28.toPeriodTo(readableInstant38, periodType39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, readableInstant41);
        org.joda.time.Period period44 = period42.plusMinutes(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = periodFormatter2.print((org.joda.time.ReadablePeriod) period44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period8 = duration6.toPeriod();
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        long long11 = duration10.getStandardSeconds();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        org.joda.time.Minutes minutes20 = minutes17.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration21 = minutes17.toStandardDuration();
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Minutes minutes27 = period26.toStandardMinutes();
        org.joda.time.Duration duration28 = minutes27.toStandardDuration();
        org.joda.time.Period period29 = duration28.toPeriod();
        boolean boolean30 = duration21.isLongerThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.days();
        org.joda.time.Period period33 = duration21.toPeriodTo(readableInstant31, periodType32);
        org.joda.time.Duration duration34 = duration10.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period46 = period44.minusMonths(0);
        org.joda.time.Minutes minutes47 = period46.toStandardMinutes();
        org.joda.time.Duration duration48 = minutes47.toStandardDuration();
        boolean boolean49 = duration41.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration48, readableInstant50);
        long long52 = duration48.getStandardHours();
        org.joda.time.Duration duration53 = duration21.minus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration54 = duration6.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Duration duration56 = duration53.plus((long) (short) 1);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-128849018880L) + "'", long11 == (-128849018880L));
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(duration56);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("P6DT10S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Period period10 = weeks9.toPeriod();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks(1);
        boolean boolean14 = weeks11.isGreaterThan(weeks13);
        org.joda.time.Weeks weeks15 = weeks9.minus(weeks11);
        org.joda.time.DurationFieldType durationFieldType16 = weeks11.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days17 = weeks11.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 7");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(durationFieldType16);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period((long) 2, periodType3);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period7 = period4.plusDays((-10));
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0D" + "'", str5, "P0D");
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType9 = minutes5.getFieldType();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod11 = minutes10.toMutablePeriod();
        org.joda.time.Minutes minutes12 = minutes5.plus(minutes10);
        org.joda.time.PeriodType periodType13 = minutes10.getPeriodType();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration16 = duration15.toDuration();
        org.joda.time.Minutes minutes17 = duration15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes17.negated();
        org.joda.time.Minutes minutes20 = minutes18.multipliedBy((-10));
        boolean boolean21 = minutes10.isLessThan(minutes20);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (short) -1);
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.ZERO;
        java.lang.String str3 = weeks2.toString();
        int int4 = weeks2.size();
        org.joda.time.PeriodType periodType5 = weeks2.getPeriodType();
        org.joda.time.Weeks weeks7 = weeks2.minus(7);
        java.lang.String str8 = weeks2.toString();
        org.joda.time.Duration duration9 = weeks2.toStandardDuration();
        int int10 = duration1.compareTo((org.joda.time.ReadableDuration) duration9);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0W" + "'", str3, "P0W");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0W" + "'", str8, "P0W");
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0.011S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds((long) 0);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Duration duration12 = minutes11.toStandardDuration();
        org.joda.time.Period period13 = duration12.toPeriod();
        org.joda.time.Duration duration15 = duration12.plus((long) (byte) 0);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) duration15, periodType17, chronology18);
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, readableInstant4, periodType17);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardMinutes(100L);
        boolean boolean23 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        boolean boolean25 = duration2.isLongerThan(readableDuration24);
        java.lang.Object obj26 = null;
        boolean boolean27 = duration2.equals(obj26);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Duration duration4 = duration1.minus((long) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = duration4.toPeriodTo(readableInstant5);
        org.joda.time.Period period7 = duration4.toPeriod();
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        long long10 = duration9.getStandardSeconds();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        org.joda.time.Minutes minutes19 = minutes16.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration20 = minutes16.toStandardDuration();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Duration duration27 = minutes26.toStandardDuration();
        org.joda.time.Period period28 = duration27.toPeriod();
        boolean boolean29 = duration20.isLongerThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.days();
        org.joda.time.Period period32 = duration20.toPeriodTo(readableInstant30, periodType31);
        org.joda.time.Duration duration33 = duration9.plus((org.joda.time.ReadableDuration) duration20);
        java.lang.String str34 = duration9.toString();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (byte) 100);
        boolean boolean37 = duration9.isEqual((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration38 = duration4.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval42 = duration4.toIntervalTo(readableInstant41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-128849018880L) + "'", long10 == (-128849018880L));
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT-128849018880S" + "'", str34, "PT-128849018880S");
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(duration38);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT6000S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.days();
        boolean boolean9 = periodType7.isSupported(durationFieldType8);
        org.joda.time.PeriodType periodType10 = periodType7.withMinutesRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((-128849018880L), periodType7);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '4', periodType7);
        org.joda.time.PeriodType periodType13 = periodType7.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        java.util.Locale locale18 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str20 = periodType19.getName();
        org.joda.time.PeriodType periodType21 = periodType19.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter2.withParseType(periodType19);
        java.util.Locale locale23 = periodFormatter2.getLocale();
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds26 = seconds24.plus(seconds25);
        org.joda.time.PeriodType periodType27 = seconds24.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter2.withParseType(periodType27);
        org.joda.time.format.PeriodPrinter periodPrinter29 = periodFormatter28.getPrinter();
        java.lang.StringBuffer stringBuffer30 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Duration duration37 = minutes36.toStandardDuration();
        org.joda.time.Minutes minutes39 = minutes36.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration40 = minutes36.toStandardDuration();
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period45 = period43.minusMonths(0);
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Duration duration47 = minutes46.toStandardDuration();
        org.joda.time.Period period48 = duration47.toPeriod();
        boolean boolean49 = duration40.isLongerThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.days();
        org.joda.time.Period period52 = duration40.toPeriodTo(readableInstant50, periodType51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = duration40.toPeriodFrom(readableInstant53);
        org.joda.time.Period period55 = period54.negated();
        org.joda.time.Period period57 = period55.minusHours(8);
        org.joda.time.Period period59 = period55.withYears(1);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter28.printTo(stringBuffer30, (org.joda.time.ReadablePeriod) period55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "YearMonthDay" + "'", str20, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodFormatter28);
        org.junit.Assert.assertNull(periodPrinter29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = periodType10.isSupported(durationFieldType11);
        int int13 = period2.get(durationFieldType11);
        int int14 = period2.getDays();
        org.joda.time.Period period16 = period2.plusHours((int) '#');
        org.joda.time.Period period18 = period2.plusMonths((int) (byte) 0);
        java.lang.String str19 = period2.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0.036S" + "'", str19, "PT0.036S");
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.PeriodType periodType5 = seconds0.getPeriodType();
        org.joda.time.Seconds seconds7 = seconds0.minus((int) (byte) -1);
        int int8 = seconds7.getSeconds();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT0S");
        org.joda.time.DurationFieldType durationFieldType2 = weeks1.getFieldType();
        org.joda.time.Chronology chronology3 = null;
        boolean boolean4 = durationFieldType2.isSupported(chronology3);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean8 = seconds6.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds9 = seconds0.plus(seconds6);
        org.joda.time.Seconds seconds11 = seconds9.plus((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds13 = seconds9.plus(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 12 + 2147483645");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        org.joda.time.Period period1 = org.joda.time.Period.days(11);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant19);
        org.joda.time.Duration duration22 = duration6.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Interval interval24 = duration22.toIntervalFrom(readableInstant23);
        long long25 = duration22.getStandardSeconds();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = duration22.toPeriodTo(readableInstant26, periodType27);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT0H");
        org.joda.time.Days days2 = minutes1.toStandardDays();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        org.joda.time.Period period8 = new org.joda.time.Period((-2147483646), 59, 8, (int) (byte) 1, 0, 8, (int) (short) -1, 0);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = new org.joda.time.Period();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationFrom(readableInstant2);
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period7.minusMonths(0);
        org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
        org.joda.time.Duration duration11 = minutes10.toStandardDuration();
        org.joda.time.Minutes minutes13 = minutes10.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType14 = minutes10.getFieldType();
        org.joda.time.Minutes minutes16 = minutes10.multipliedBy(1);
        org.joda.time.PeriodType periodType17 = minutes16.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration4, periodType17);
        int int19 = period18.getMonths();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period4.negated();
        int int6 = period4.getHours();
        org.joda.time.Period period8 = org.joda.time.Period.days(10);
        org.joda.time.Period period10 = period8.plusMonths((int) 'a');
        org.joda.time.Period period12 = period8.plusSeconds((int) (short) 100);
        org.joda.time.Period period14 = period12.minusMonths((int) 'a');
        org.joda.time.Period period15 = period4.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Hours hours16 = period4.toStandardHours();
        int int17 = hours16.getHours();
        org.joda.time.Hours hours18 = hours0.plus(hours16);
        org.joda.time.Hours hours20 = hours0.multipliedBy((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes21 = hours20.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours20);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.minus((int) 'a');
        int int3 = seconds0.size();
        int int4 = seconds0.getSeconds();
        org.joda.time.DurationFieldType durationFieldType5 = seconds0.getFieldType();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Period period7 = period3.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType8 = period3.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) -1, periodType10, chronology11);
        org.joda.time.Period period14 = period12.plusYears(2);
        org.joda.time.MutablePeriod mutablePeriod15 = period12.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType17 = mutablePeriod15.getFieldType(65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(mutablePeriod15);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Weeks weeks3 = weeks1.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks4 = null;
        org.joda.time.Weeks weeks5 = weeks3.minus(weeks4);
        java.lang.String str6 = weeks3.toString();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0W" + "'", str6, "P0W");
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Days days4 = days2.plus((int) ' ');
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration9 = duration7.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Interval interval13 = duration9.toIntervalFrom(readableInstant12);
        org.joda.time.Days days14 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Days days16 = days14.minus((int) '4');
        org.joda.time.Duration duration17 = days14.toStandardDuration();
        org.joda.time.Days days18 = org.joda.time.Days.FIVE;
        java.lang.String str19 = days18.toString();
        org.joda.time.Days days21 = days18.multipliedBy((int) (byte) -1);
        org.joda.time.Days days22 = days18.negated();
        org.joda.time.Days days23 = org.joda.time.Days.ONE;
        org.joda.time.Days days24 = org.joda.time.Days.ONE;
        int int25 = days23.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days24);
        org.joda.time.Days days27 = days24.multipliedBy((int) '#');
        org.joda.time.Days days28 = days22.minus(days24);
        org.joda.time.MutablePeriod mutablePeriod29 = days22.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod30 = days22.toMutablePeriod();
        boolean boolean31 = days14.isGreaterThan(days22);
        org.joda.time.Days days32 = days2.plus(days14);
        org.joda.time.Days days33 = days2.negated();
        java.lang.String str34 = days33.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P5D" + "'", str19, "P5D");
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P0D" + "'", str34, "P0D");
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days3 = days0.plus((int) (byte) 100);
        org.joda.time.Duration duration4 = days3.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = duration4.toPeriodFrom(readableInstant5);
        java.lang.String str7 = duration4.toString();
        org.joda.time.Duration duration9 = duration4.plus((long) (short) 0);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = duration4.toPeriod(chronology10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period11.minusYears(87);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT9072000S" + "'", str7, "PT9072000S");
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT-95H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.multipliedBy(10);
        org.joda.time.Seconds seconds6 = seconds2.minus(seconds3);
        org.joda.time.Seconds seconds8 = seconds2.minus((int) (byte) 10);
        org.joda.time.PeriodType periodType9 = seconds8.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.Period period7 = period2.minusMinutes((int) '#');
        org.joda.time.Period period9 = period7.plusSeconds((int) (byte) 1);
        org.joda.time.format.PeriodPrinter periodPrinter10 = null;
        org.joda.time.format.PeriodParser periodParser11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = new org.joda.time.format.PeriodFormatter(periodPrinter10, periodParser11);
        boolean boolean13 = periodFormatter12.isParser();
        org.joda.time.Days days14 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter12.withParseType(periodType15);
        org.joda.time.PeriodType periodType18 = periodFormatter12.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter19 = periodFormatter12.getPrinter();
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter12.withLocale(locale20);
        org.joda.time.PeriodType periodType22 = periodFormatter12.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter23 = periodFormatter12.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = period9.toString(periodFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNull(periodType18);
        org.junit.Assert.assertNull(periodPrinter19);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNull(periodType22);
        org.junit.Assert.assertNull(periodPrinter23);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds3 = seconds1.plus((int) (byte) 100);
        org.joda.time.PeriodType periodType4 = seconds1.getPeriodType();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant19);
        org.joda.time.Period period22 = period20.withYears((int) (byte) 1);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period25.negated();
        org.joda.time.DurationFieldType durationFieldType28 = period25.getFieldType((int) (short) 1);
        org.joda.time.Period period30 = period20.withField(durationFieldType28, 6);
        java.lang.String str31 = period30.toString();
        int int32 = period30.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours33 = period30.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P6M" + "'", str31, "P6M");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        boolean boolean16 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration20 = duration15.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = duration20.toPeriodTo(readableInstant21);
        org.joda.time.Period period23 = period22.normalizedStandard();
        org.joda.time.Period period25 = period22.withMonths(118);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration6.plus((long) (short) 10);
        org.joda.time.Period period17 = duration6.toPeriod();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Duration duration28 = duration25.plus((long) (byte) 0);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.Period period30 = duration28.toPeriod();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.days();
        org.joda.time.Period period32 = duration28.toPeriod(periodType31);
        boolean boolean33 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period41 = period39.minusMonths(0);
        org.joda.time.Period period43 = period39.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType44 = period39.getPeriodType();
        org.joda.time.PeriodType periodType45 = periodType44.withMinutesRemoved();
        org.joda.time.PeriodType periodType46 = periodType45.withHoursRemoved();
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType45);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, readableInstant34, periodType45);
        org.joda.time.PeriodType periodType49 = periodType45.withMonthsRemoved();
        org.joda.time.PeriodType periodType50 = periodType45.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType52 = periodType50.getFieldType(268435465);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 268435465");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.PeriodType periodType14 = periodFormatter13.getParseType();
        org.joda.time.format.PeriodParser periodParser15 = periodFormatter13.getParser();
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds18 = seconds16.plus(seconds17);
        org.joda.time.Seconds seconds20 = seconds17.plus((int) (byte) 0);
        org.joda.time.Seconds seconds22 = seconds17.minus(8);
        org.joda.time.DurationFieldType durationFieldType23 = seconds17.getFieldType();
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds27 = seconds25.multipliedBy(10);
        org.joda.time.Seconds seconds28 = seconds24.minus(seconds25);
        org.joda.time.Seconds seconds29 = seconds17.plus(seconds28);
        int int30 = seconds28.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod31 = seconds28.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = periodFormatter13.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod31, "PT14400S", 14405);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNull(periodParser15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod31);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = org.joda.time.Period.parse("PT21474836H", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType19);
        boolean boolean21 = periodFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod23 = periodFormatter2.parseMutablePeriod("P1W");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period5 = period1.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.Period period8 = period5.minusDays((int) '4');
        org.joda.time.Period period10 = period8.plusYears(2147483647);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration12 = minutes8.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Duration duration19 = minutes18.toStandardDuration();
        org.joda.time.Period period20 = duration19.toPeriod();
        boolean boolean21 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = duration19.toIntervalTo(readableInstant22);
        boolean boolean24 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) duration19, chronology25);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration19, periodType27);
        int int29 = periodType27.size();
        org.joda.time.PeriodType periodType30 = periodType27.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType32 = periodType30.getFieldType(14400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14400");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        int int1 = hours0.getHours();
        org.joda.time.Seconds seconds2 = hours0.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours4 = hours0.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P6M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P6M\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds4 = seconds1.plus((int) (byte) 0);
        org.joda.time.Seconds seconds6 = seconds1.minus(8);
        org.joda.time.DurationFieldType durationFieldType7 = seconds1.getFieldType();
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = seconds9.multipliedBy(10);
        org.joda.time.Seconds seconds12 = seconds8.minus(seconds9);
        org.joda.time.Seconds seconds13 = seconds1.plus(seconds12);
        org.joda.time.Seconds seconds15 = seconds13.plus(0);
        java.lang.String str16 = seconds13.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT2S" + "'", str16, "PT2S");
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withHoursRemoved();
        org.joda.time.Days days6 = org.joda.time.Days.days(52);
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) periodType1, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter2.getParseType();
        boolean boolean7 = periodFormatter2.isParser();
        boolean boolean8 = periodFormatter2.isParser();
        boolean boolean9 = periodFormatter2.isPrinter();
        org.joda.time.PeriodType periodType10 = periodFormatter2.getParseType();
        org.joda.time.PeriodType periodType11 = periodFormatter2.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod13 = periodFormatter2.parseMutablePeriod("P2147483647W");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(periodType10);
        org.junit.Assert.assertNull(periodType11);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod1 = minutes0.toMutablePeriod();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Minutes minutes10 = minutes8.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes11 = minutes2.minus(minutes8);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Minutes minutes19 = minutes17.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) minutes17, chronology20);
        org.joda.time.Minutes minutes22 = minutes2.minus(minutes17);
        org.joda.time.DurationFieldType durationFieldType24 = minutes22.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType25 = minutes22.getPeriodType();
        org.joda.time.Minutes minutes27 = minutes22.plus(59);
        boolean boolean28 = minutes0.isLessThan(minutes22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes30 = minutes0.plus(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 52");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 'a');
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks4 = weeks3.negated();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        boolean boolean9 = weeks4.isGreaterThan(weeks7);
        org.joda.time.Weeks weeks10 = null;
        org.joda.time.Weeks weeks11 = weeks7.minus(weeks10);
        org.joda.time.Period period13 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.months();
        boolean boolean15 = period13.isSupported(durationFieldType14);
        java.lang.String str16 = durationFieldType14.getName();
        java.lang.String str17 = durationFieldType14.toString();
        boolean boolean18 = weeks7.isSupported(durationFieldType14);
        boolean boolean19 = period1.isSupported(durationFieldType14);
        org.joda.time.Period period21 = period1.minusMillis((int) (short) -1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "months" + "'", str16, "months");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "months" + "'", str17, "months");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration2 = duration1.toDuration();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withSecondsRemoved();
        org.joda.time.Period period10 = duration4.toPeriodFrom(readableInstant5, periodType7);
        org.joda.time.Duration duration11 = duration2.minus((org.joda.time.ReadableDuration) duration4);
        long long12 = duration4.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        java.lang.String str1 = days0.toString();
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) days0);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P2D" + "'", str1, "P2D");
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hours\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        boolean boolean9 = periodFormatter8.isPrinter();
        boolean boolean10 = periodFormatter8.isParser();
        org.joda.time.PeriodType periodType11 = periodFormatter8.getParseType();
        org.joda.time.PeriodType periodType12 = periodType11.withSecondsRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withDaysRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((-2147483648L), periodType13, chronology15);
        org.joda.time.Period period18 = org.joda.time.Period.days(10);
        org.joda.time.Period period20 = period18.plusMonths((int) 'a');
        org.joda.time.Period period22 = period18.plusSeconds((int) (short) 100);
        org.joda.time.Period period24 = period18.withMinutes(1);
        org.joda.time.Days days25 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Days days26 = days25.negated();
        org.joda.time.Period period27 = days26.toPeriod();
        org.joda.time.Period period29 = period27.plusHours((-2147483646));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = period16.plus((org.joda.time.ReadablePeriod) period27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(100000L, 3000L);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = periodType10.isSupported(durationFieldType11);
        int int13 = period2.get(durationFieldType11);
        org.joda.time.Period period15 = period2.withHours(1);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Period period22 = period18.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.PeriodType periodType24 = periodType23.withMinutesRemoved();
        java.lang.String str25 = periodType24.toString();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) period2, periodType24, chronology26);
        org.joda.time.PeriodType periodType28 = periodType24.withHoursRemoved();
        org.joda.time.PeriodType periodType29 = periodType24.withMillisRemoved();
        org.joda.time.PeriodType periodType30 = periodType24.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType32 = periodType24.getFieldType(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str25, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period((long) (byte) -1, periodType3);
        org.joda.time.PeriodType periodType5 = periodType3.withMillisRemoved();
        java.lang.String str6 = periodType3.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Days]" + "'", str6, "PeriodType[Days]");
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        org.joda.time.Period period2 = new org.joda.time.Period((-35791394L), (long) (-1));
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Minutes minutes10 = minutes8.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes12 = minutes8.plus(8);
        org.joda.time.DurationFieldType durationFieldType13 = minutes12.getFieldType();
        int int14 = period2.get(durationFieldType13);
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = durationFieldType13.isSupported(chronology15);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("P3W3DT20H31M23.643S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration9 = period6.toStandardDuration();
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds13 = seconds11.plus(seconds12);
        org.joda.time.Seconds seconds15 = seconds11.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds16 = seconds10.minus(seconds15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration17 = new org.joda.time.Duration((java.lang.Object) seconds16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Seconds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        org.joda.time.Duration duration11 = duration6.withMillis((long) 1);
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        org.joda.time.Period period21 = duration20.toPeriod();
        org.joda.time.Duration duration23 = duration20.plus((long) (byte) 0);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration25 = duration11.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration27 = duration23.minus((long) (-10));
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration27.toIntervalFrom(readableInstant28);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(interval29);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant15);
        java.lang.String str17 = duration13.toString();
        long long18 = duration13.getMillis();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Minutes minutes28 = minutes25.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType29 = minutes28.getPeriodType();
        org.joda.time.PeriodType periodType30 = minutes28.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant19, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = duration13.toPeriodTo(readableInstant32);
        org.joda.time.Duration duration35 = duration13.withMillis((long) 59);
        java.lang.String str36 = duration35.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT0.059S" + "'", str36, "PT0.059S");
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks8 = null;
        org.joda.time.Weeks weeks9 = weeks5.minus(weeks8);
        org.joda.time.DurationFieldType durationFieldType10 = weeks9.getFieldType();
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration15 = duration13.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalFrom(readableInstant18);
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval19);
        org.joda.time.Period period21 = weeks20.toPeriod();
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeks(1);
        boolean boolean25 = weeks22.isGreaterThan(weeks24);
        org.joda.time.Weeks weeks26 = weeks20.minus(weeks22);
        boolean boolean27 = weeks9.isLessThan(weeks22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days28 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) weeks22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 15032385529");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        java.lang.String str14 = duration11.toString();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Days days18 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType19 = days18.getPeriodType();
        org.joda.time.PeriodType periodType20 = periodType19.withHoursRemoved();
        org.joda.time.PeriodType periodType21 = periodType19.withSecondsRemoved();
        org.joda.time.Period period22 = duration16.toPeriodFrom(readableInstant17, periodType19);
        long long23 = duration16.getStandardHours();
        org.joda.time.Duration duration26 = duration16.withDurationAdded(10L, (-36));
        org.joda.time.Period period27 = duration26.toPeriod();
        org.joda.time.Duration duration30 = duration26.withDurationAdded((long) ' ', (int) (byte) 0);
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Period period37 = period33.minusSeconds((int) (byte) 100);
        org.joda.time.Days days38 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType39 = days38.getPeriodType();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.PeriodType periodType41 = periodType39.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.days();
        boolean boolean43 = periodType41.isSupported(durationFieldType42);
        int int44 = period33.get(durationFieldType42);
        org.joda.time.Period period46 = period33.withHours(1);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period33.toDurationTo(readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = duration48.toPeriodTo(readableInstant49);
        int int51 = duration30.compareTo((org.joda.time.ReadableDuration) duration48);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Days days56 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType57 = days56.getPeriodType();
        org.joda.time.PeriodType periodType58 = periodType57.withHoursRemoved();
        org.joda.time.PeriodType periodType59 = periodType57.withSecondsRemoved();
        org.joda.time.PeriodType periodType60 = periodType57.withMinutesRemoved();
        org.joda.time.PeriodType periodType61 = periodType60.withWeeksRemoved();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(10L, (long) (byte) -1, periodType61, chronology62);
        org.joda.time.PeriodType periodType64 = periodType61.withYearsRemoved();
        boolean boolean65 = periodType53.equals((java.lang.Object) periodType61);
        org.joda.time.Period period66 = duration48.toPeriodTo(readableInstant52, periodType61);
        org.joda.time.Period period67 = duration11.toPeriod(periodType61);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = duration11.toIntervalFrom(readableInstant68);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT6000S" + "'", str14, "PT6000S");
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(interval69);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        int int3 = hours0.getHours();
        org.joda.time.PeriodType periodType4 = hours0.getPeriodType();
        org.joda.time.Hours hours6 = org.joda.time.Hours.hours(2147483647);
        boolean boolean7 = hours0.isGreaterThan(hours6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours9 = hours6.plus((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 1");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.PeriodType periodType3 = period2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-2147483648));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Minutes minutes16 = minutes13.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration17 = minutes13.toStandardDuration();
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Duration duration24 = minutes23.toStandardDuration();
        org.joda.time.Period period25 = duration24.toPeriod();
        boolean boolean26 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration24);
        boolean boolean27 = duration6.isEqual((org.joda.time.ReadableDuration) duration17);
        long long28 = duration6.getStandardMinutes();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant29, periodType30);
        int int32 = period31.getWeeks();
        int int33 = period31.size();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        org.joda.time.Seconds seconds6 = seconds0.multipliedBy(0);
        org.joda.time.Seconds seconds8 = seconds0.dividedBy((-1));
        org.joda.time.Seconds seconds10 = seconds0.dividedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType11 = seconds0.getPeriodType();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period5 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType4);
        org.joda.time.PeriodType periodType6 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        boolean boolean21 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(readableInstant22, readableInstant23);
        org.joda.time.Duration duration25 = duration13.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration26 = duration13.toDuration();
        boolean boolean27 = duration4.isEqual((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Duration duration34 = minutes33.toStandardDuration();
        org.joda.time.Period period35 = duration34.toPeriod();
        org.joda.time.Duration duration37 = duration34.plus((long) (byte) 0);
        org.joda.time.Duration duration39 = duration34.withMillis((long) 1);
        boolean boolean40 = duration4.isEqual((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration4.toIntervalTo(readableInstant41);
        org.joda.time.Period period45 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period47 = period45.minusMonths(0);
        org.joda.time.Minutes minutes48 = period47.toStandardMinutes();
        org.joda.time.Duration duration49 = minutes48.toStandardDuration();
        org.joda.time.Minutes minutes51 = minutes48.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration52 = minutes48.toStandardDuration();
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period56 = period55.negated();
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period56.toDurationTo(readableInstant57);
        boolean boolean59 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration58);
        org.joda.time.Duration duration62 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration63 = duration58.plus((org.joda.time.ReadableDuration) duration62);
        org.joda.time.Period period66 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period68 = period66.minusMonths(0);
        org.joda.time.Period period70 = period66.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType71 = period66.getPeriodType();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = duration58.toPeriod(periodType71, chronology72);
        org.joda.time.Period period76 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period78 = period76.minusMonths(0);
        org.joda.time.Minutes minutes79 = period78.toStandardMinutes();
        org.joda.time.Duration duration80 = minutes79.toStandardDuration();
        org.joda.time.Minutes minutes82 = minutes79.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration83 = minutes79.toStandardDuration();
        org.joda.time.Period period86 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period87 = period86.negated();
        org.joda.time.ReadableInstant readableInstant88 = null;
        org.joda.time.Duration duration89 = period87.toDurationTo(readableInstant88);
        boolean boolean90 = duration83.isShorterThan((org.joda.time.ReadableDuration) duration89);
        org.joda.time.Duration duration93 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration94 = duration89.plus((org.joda.time.ReadableDuration) duration93);
        boolean boolean95 = duration58.isLongerThan((org.joda.time.ReadableDuration) duration94);
        org.joda.time.Duration duration97 = org.joda.time.Duration.millis((long) ' ');
        boolean boolean98 = duration94.isShorterThan((org.joda.time.ReadableDuration) duration97);
        boolean boolean99 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration97);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(minutes79);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertNotNull(minutes82);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(duration89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(duration94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(duration97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(97);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.PeriodType periodType13 = periodType11.withHoursRemoved();
        java.lang.String str14 = periodType13.toString();
        org.joda.time.PeriodType periodType15 = periodType13.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period((-97), (int) '4', 2147483645, (int) (byte) 100, (int) (byte) 10, 100, 0, (int) (byte) 0, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PeriodType[Days]" + "'", str14, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("MinutesNoMinutes", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter2.getPrinter();
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter2.withLocale(locale10);
        org.joda.time.PeriodType periodType12 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter13 = periodFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = periodFormatter2.parsePeriod("P3W3DT20H31M23.643S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNull(periodType12);
        org.junit.Assert.assertNull(periodPrinter13);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        java.lang.String str9 = days8.toString();
        org.joda.time.DurationFieldType durationFieldType10 = days8.getFieldType();
        org.joda.time.Days days12 = days8.plus(14400);
        org.joda.time.Days days14 = days12.minus((int) (byte) 0);
        int int15 = days12.getDays();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0D" + "'", str9, "P0D");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14400 + "'", int15 == 14400);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean4 = days2.isSupported(durationFieldType3);
        boolean boolean5 = days0.isGreaterThan(days2);
        org.joda.time.Days days7 = org.joda.time.Days.parseDays("P0W");
        org.joda.time.Days days8 = days2.plus(days7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = days7.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Hours hours2 = hours0.negated();
        org.joda.time.Duration duration3 = hours0.toStandardDuration();
        long long4 = duration3.getMillis();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.format.PeriodPrinter periodPrinter8 = null;
        org.joda.time.format.PeriodParser periodParser9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = new org.joda.time.format.PeriodFormatter(periodPrinter8, periodParser9);
        boolean boolean11 = periodFormatter10.isParser();
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds15 = seconds13.plus(seconds14);
        org.joda.time.PeriodType periodType16 = seconds13.getPeriodType();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period19.negated();
        org.joda.time.DurationFieldType durationFieldType22 = period19.getFieldType((int) (short) 1);
        int int23 = periodType16.indexOf(durationFieldType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) ' ', periodType16);
        org.joda.time.format.PeriodFormatter periodFormatter25 = periodFormatter10.withParseType(periodType16);
        org.joda.time.PeriodType periodType26 = periodType16.withDaysRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 0, (long) 3, periodType26, chronology28);
        org.joda.time.PeriodType periodType30 = periodType26.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration3, readableInstant5, periodType26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 7730941129200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7730941129200000L + "'", long4 == 7730941129200000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter2.withLocale(locale18);
        org.joda.time.format.PeriodParser periodParser20 = periodFormatter2.getParser();
        org.joda.time.format.PeriodParser periodParser21 = periodFormatter2.getParser();
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks24 = weeks22.dividedBy(1);
        org.joda.time.Weeks weeks26 = weeks22.dividedBy(8);
        java.lang.String str27 = weeks26.toString();
        org.joda.time.Weeks weeks29 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Weeks weeks31 = org.joda.time.Weeks.weeks(1);
        boolean boolean32 = weeks29.isGreaterThan(weeks31);
        org.joda.time.Weeks weeks33 = weeks26.minus(weeks29);
        org.joda.time.MutablePeriod mutablePeriod34 = weeks29.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod34, "PT52S", (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNull(periodParser20);
        org.junit.Assert.assertNull(periodParser21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "P268435455W" + "'", str27, "P268435455W");
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(mutablePeriod34);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = periodType0.getFieldType(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = period6.equals(obj8);
        org.joda.time.Period period11 = period6.withWeeks((int) '#');
        org.joda.time.Period period12 = period6.negated();
        org.joda.time.Period period14 = period12.plusYears(8);
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.Period period4 = period1.withFields(readablePeriod3);
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Period period9 = period6.minusMonths(100);
        org.joda.time.Period period11 = period9.minusYears((int) (short) 10);
        java.lang.String str12 = period9.toString();
        org.joda.time.Period period14 = period9.minusMillis((int) (short) 10);
        org.joda.time.Period period15 = period1.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period17 = period1.plusSeconds(10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Duration duration28 = duration25.plus((long) (byte) 0);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) duration28, periodType30, chronology31);
        org.joda.time.PeriodType periodType33 = periodType30.withDaysRemoved();
        org.joda.time.Period period34 = period1.normalizedStandard(periodType33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period36 = period34.plusDays((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P-100M10D" + "'", str12, "P-100M10D");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.plusMinutes(0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = period2.getValue((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = period8.getValue((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -95");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        boolean boolean9 = periodFormatter8.isPrinter();
        boolean boolean10 = periodFormatter8.isParser();
        org.joda.time.format.PeriodParser periodParser11 = periodFormatter8.getParser();
        org.joda.time.PeriodType periodType12 = periodFormatter8.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter13 = periodFormatter8.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = org.joda.time.Period.parse("PT-7H", periodFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(periodParser11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNull(periodPrinter13);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Duration duration11 = duration1.withDurationAdded(10L, (-36));
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration15 = duration11.withDurationAdded((long) ' ', (int) (byte) 0);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Period period22 = period18.minusSeconds((int) (byte) 100);
        org.joda.time.Days days23 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType24 = days23.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withHoursRemoved();
        org.joda.time.PeriodType periodType26 = periodType24.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.days();
        boolean boolean28 = periodType26.isSupported(durationFieldType27);
        int int29 = period18.get(durationFieldType27);
        org.joda.time.Period period31 = period18.withHours(1);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period18.toDurationTo(readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = duration33.toPeriodTo(readableInstant34);
        int int36 = duration15.compareTo((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Days days38 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType39 = days38.getPeriodType();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.PeriodType periodType41 = periodType39.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.days();
        boolean boolean43 = periodType41.isSupported(durationFieldType42);
        org.joda.time.PeriodType periodType44 = periodType41.withMinutesRemoved();
        org.joda.time.Period period45 = new org.joda.time.Period((-128849018880L), periodType41);
        java.lang.String str46 = periodType41.getName();
        org.joda.time.PeriodType periodType47 = periodType41.withMillisRemoved();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = duration33.toPeriod(periodType47, chronology48);
        int int50 = period49.getMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Days" + "'", str46, "Days");
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.minus((int) 'a');
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds7 = seconds3.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds10 = seconds8.plus(seconds9);
        java.lang.String str11 = seconds8.toString();
        org.joda.time.DurationFieldType durationFieldType12 = seconds8.getFieldType();
        java.lang.String str13 = durationFieldType12.getName();
        boolean boolean14 = seconds3.isSupported(durationFieldType12);
        int int15 = seconds2.get(durationFieldType12);
        java.lang.String str16 = durationFieldType12.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT2S" + "'", str11, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "seconds" + "'", str13, "seconds");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-95) + "'", int15 == (-95));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "seconds" + "'", str16, "seconds");
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        boolean boolean16 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration20 = duration15.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = duration20.toPeriodTo(readableInstant21);
        org.joda.time.Period period23 = period22.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration24 = new org.joda.time.Duration((java.lang.Object) period22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Minutes minutes16 = minutes13.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration17 = minutes13.toStandardDuration();
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Duration duration24 = minutes23.toStandardDuration();
        org.joda.time.Period period25 = duration24.toPeriod();
        boolean boolean26 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration24);
        boolean boolean27 = duration6.isEqual((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period28 = duration17.toPeriod();
        org.joda.time.Duration duration30 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration33 = duration30.plus((org.joda.time.ReadableDuration) duration32);
        boolean boolean34 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration36 = duration30.withMillis((long) 100);
        long long37 = duration30.getStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT-2147483644M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT-2147483644M\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.Period period6 = period5.toPeriod();
        org.joda.time.Minutes minutes7 = period5.toStandardMinutes();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Minutes minutes15 = minutes13.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) minutes13, chronology16);
        org.joda.time.Period period18 = minutes13.toPeriod();
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean20 = minutes13.isLessThan(minutes19);
        org.joda.time.Minutes minutes22 = minutes13.minus((int) (short) 0);
        boolean boolean23 = minutes7.isGreaterThan(minutes22);
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.Minutes minutes29 = period28.toStandardMinutes();
        org.joda.time.Duration duration30 = minutes29.toStandardDuration();
        org.joda.time.Minutes minutes32 = minutes29.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes34 = minutes32.dividedBy((-36));
        org.joda.time.Period period36 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType38 = minutes37.getFieldType();
        int int39 = minutes37.getMinutes();
        org.joda.time.Minutes minutes40 = minutes32.minus(minutes37);
        org.joda.time.Minutes minutes41 = minutes37.negated();
        org.joda.time.Minutes minutes43 = org.joda.time.Minutes.minutes((int) (short) 1);
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Minutes minutes49 = period48.toStandardMinutes();
        org.joda.time.Duration duration50 = minutes49.toStandardDuration();
        org.joda.time.Minutes minutes52 = minutes49.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType53 = minutes49.getFieldType();
        org.joda.time.Minutes minutes54 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod55 = minutes54.toMutablePeriod();
        org.joda.time.Minutes minutes56 = minutes49.plus(minutes54);
        org.joda.time.Minutes minutes57 = minutes43.minus(minutes49);
        boolean boolean58 = minutes37.isLessThan(minutes57);
        int int59 = minutes7.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes37);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 14400 + "'", int39 == 14400);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 59);
        int int2 = period1.getWeeks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days3 = days0.minus(0);
        org.joda.time.Days days4 = days3.negated();
        java.lang.String str5 = days3.toString();
        org.joda.time.Days days7 = days3.plus((int) (byte) 10);
        org.joda.time.Days days8 = days3.negated();
        java.lang.Class<?> wildcardClass9 = days8.getClass();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P5D" + "'", str5, "P5D");
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-95), (int) '#', 1, 11, (int) (short) 100, 118, 0, 10, periodType8);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P-100M10D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P-100M10D\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant19);
        org.joda.time.Duration duration22 = duration6.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Interval interval24 = duration22.toIntervalFrom(readableInstant23);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Minutes minutes30 = period29.toStandardMinutes();
        org.joda.time.Duration duration31 = minutes30.toStandardDuration();
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Duration duration38 = minutes37.toStandardDuration();
        boolean boolean39 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration41 = duration31.plus((long) (short) 10);
        org.joda.time.Duration duration43 = duration22.withDurationAdded((org.joda.time.ReadableDuration) duration41, (int) (byte) 0);
        org.joda.time.Duration duration44 = duration43.toDuration();
        org.joda.time.Duration duration45 = new org.joda.time.Duration((java.lang.Object) duration44);
        long long46 = duration44.getMillis();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 8L + "'", long46 == 8L);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
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
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter3.withLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = org.joda.time.Period.parse("P13D", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(periodFormatter6);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.MutablePeriod mutablePeriod1 = period0.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period0.getFieldType((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter2.getPrinter();
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter2.withLocale(locale10);
        org.joda.time.PeriodType periodType12 = periodFormatter2.getParseType();
        java.io.Writer writer13 = null;
        org.joda.time.Hours hours14 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours15 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours16 = hours14.minus(hours15);
        org.joda.time.Hours hours18 = hours15.minus((-10));
        org.joda.time.PeriodType periodType19 = hours15.getPeriodType();
        org.joda.time.Hours hours20 = hours15.negated();
        org.joda.time.Hours hours22 = hours20.plus((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer13, (org.joda.time.ReadablePeriod) hours22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNull(periodType12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds4 = seconds1.plus((int) (byte) 0);
        org.joda.time.Seconds seconds6 = seconds1.minus(8);
        org.joda.time.Period period7 = seconds6.toPeriod();
        org.joda.time.Period period9 = period7.plusMillis((int) ' ');
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period13 = period10.plusMinutes(87);
        org.joda.time.Period period15 = period13.plusSeconds((int) '#');
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        org.joda.time.Period period9 = period6.negated();
        org.joda.time.Period period11 = period6.minusMillis((int) (short) 0);
        org.joda.time.Weeks weeks12 = period11.toStandardWeeks();
        org.joda.time.Weeks weeks14 = weeks12.minus(36);
        int int15 = weeks14.getWeeks();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        org.joda.time.Period period9 = period6.negated();
        org.joda.time.Period period11 = period6.plusMonths(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = period6.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.PeriodType periodType14 = periodFormatter13.getParseType();
        java.util.Locale locale15 = periodFormatter13.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod17 = periodFormatter13.parseMutablePeriod("P6MT0.010S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant19);
        org.joda.time.Period period22 = period20.plusMonths((int) 'a');
        org.joda.time.Period period23 = period22.normalizedStandard();
        int int24 = period23.getDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks3 = weeks1.dividedBy(100);
        org.joda.time.Weeks weeks5 = weeks1.minus((int) (short) 100);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Duration duration8 = seconds2.toStandardDuration();
        org.joda.time.Period period10 = org.joda.time.Period.hours((int) '#');
        org.joda.time.Seconds seconds11 = period10.toStandardSeconds();
        boolean boolean12 = seconds2.isLessThan(seconds11);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Period period19 = period15.withMillis((int) (short) 0);
        int int20 = period19.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod21 = period19.toMutablePeriod();
        org.joda.time.Duration duration22 = period19.toStandardDuration();
        org.joda.time.Seconds seconds23 = duration22.toStandardSeconds();
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds26 = seconds24.plus(seconds25);
        org.joda.time.Seconds seconds28 = seconds24.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds29 = seconds23.minus(seconds28);
        int int30 = seconds29.size();
        org.joda.time.Seconds seconds31 = seconds11.minus(seconds29);
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds34 = seconds32.plus(seconds33);
        org.joda.time.Seconds seconds35 = org.joda.time.Seconds.ONE;
        boolean boolean36 = seconds33.isGreaterThan(seconds35);
        org.joda.time.Duration duration37 = seconds35.toStandardDuration();
        org.joda.time.Seconds seconds38 = seconds35.negated();
        org.joda.time.Seconds seconds40 = seconds38.multipliedBy((int) '#');
        boolean boolean41 = seconds31.isLessThan(seconds38);
        java.lang.String str42 = seconds38.toString();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT-1S" + "'", str42, "PT-1S");
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        boolean boolean8 = periodFormatter7.isPrinter();
        org.joda.time.format.PeriodParser periodParser9 = periodFormatter7.getParser();
        java.io.Writer writer10 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration15 = duration13.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalFrom(readableInstant18);
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval19);
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval19);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval19);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter7.printTo(writer10, (org.joda.time.ReadablePeriod) minutes22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(periodParser9);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes22);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Minutes minutes16 = minutes13.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((-36));
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        org.joda.time.Minutes minutes27 = minutes24.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType28 = minutes24.getFieldType();
        boolean boolean29 = minutes18.equals((java.lang.Object) minutes24);
        org.joda.time.DurationFieldType durationFieldType30 = minutes24.getFieldType();
        int int31 = period7.get(durationFieldType30);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        org.joda.time.Period period1 = new org.joda.time.Period(10L);
        org.joda.time.Period period3 = period1.withDays((-2147483648));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours4 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -51539607551");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter2.getPrinter();
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter2.withLocale(locale10);
        org.joda.time.PeriodType periodType12 = periodFormatter2.getParseType();
        org.joda.time.Period period14 = org.joda.time.Period.millis((int) '#');
        int int15 = period14.getYears();
        org.joda.time.Hours hours16 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period14);
        int int17 = hours16.getHours();
        org.joda.time.MutablePeriod mutablePeriod18 = hours16.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod18, "PT0.003S", 118);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNull(periodType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod18);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType9 = minutes8.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = minutes8.isSupported(durationFieldType10);
        java.lang.String str12 = minutes8.toString();
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        long long15 = duration14.getStandardSeconds();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        org.joda.time.Minutes minutes24 = minutes21.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration25 = minutes21.toStandardDuration();
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Period period33 = duration32.toPeriod();
        boolean boolean34 = duration25.isLongerThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.days();
        org.joda.time.Period period37 = duration25.toPeriodTo(readableInstant35, periodType36);
        org.joda.time.Duration duration38 = duration14.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration39 = duration38.toDuration();
        org.joda.time.Minutes minutes40 = duration39.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes41 = minutes8.minus(minutes40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0M" + "'", str12, "PT0M");
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-128849018880L) + "'", long15 == (-128849018880L));
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(minutes40);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration9 = period6.toStandardDuration();
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds13 = seconds11.plus(seconds12);
        org.joda.time.Seconds seconds15 = seconds11.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds16 = seconds10.minus(seconds15);
        java.lang.String str17 = seconds10.toString();
        org.joda.time.Seconds seconds19 = seconds10.plus(2147483647);
        org.joda.time.Period period21 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period22 = period21.toPeriod();
        org.joda.time.Period period24 = period21.plusMinutes(1);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period21.toDurationTo(readableInstant25);
        org.joda.time.Seconds seconds27 = period21.toStandardSeconds();
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str30 = seconds29.toString();
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        int int36 = period35.getYears();
        org.joda.time.Period period37 = period35.toPeriod();
        org.joda.time.Seconds seconds38 = period35.toStandardSeconds();
        boolean boolean39 = seconds29.isLessThan(seconds38);
        java.lang.String str40 = seconds38.toString();
        org.joda.time.Seconds seconds41 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds42 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds43 = seconds41.plus(seconds42);
        java.lang.String str44 = seconds41.toString();
        org.joda.time.DurationFieldType durationFieldType45 = seconds41.getFieldType();
        org.joda.time.Seconds seconds47 = seconds41.multipliedBy(0);
        org.joda.time.Seconds seconds48 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration49 = seconds48.toStandardDuration();
        boolean boolean50 = seconds47.isGreaterThan(seconds48);
        org.joda.time.Seconds seconds51 = seconds38.plus(seconds48);
        boolean boolean52 = seconds27.isLessThan(seconds48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds53 = seconds19.plus(seconds48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 3");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT0S" + "'", str30, "PT0S");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0S" + "'", str40, "PT0S");
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT2S" + "'", str44, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(seconds47);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.MutablePeriod mutablePeriod1 = hours0.toMutablePeriod();
        org.joda.time.Hours hours2 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours3 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours4 = hours2.minus(hours3);
        int int5 = hours3.getHours();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.months();
        boolean boolean7 = hours3.isSupported(durationFieldType6);
        boolean boolean8 = hours0.isLessThan(hours3);
        org.joda.time.Hours hours9 = org.joda.time.Hours.EIGHT;
        int int10 = hours9.getHours();
        org.joda.time.Hours hours11 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours12 = hours9.minus(hours11);
        org.joda.time.Hours hours13 = hours0.minus(hours11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours15 = hours13.multipliedBy((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483642 * 100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours13);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("centuries");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"centuries\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT-2147483648M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT-2147483648M\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Minutes minutes10 = minutes3.minus(minutes9);
        java.lang.String str11 = minutes3.toString();
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0M" + "'", str11, "PT0M");
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        long long7 = duration6.getStandardMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withMinutesRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) -1, periodType5, chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration8 = new org.joda.time.Duration((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("YearMonthDayTimeNoDays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDayTimeNoDays\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) '#');
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        org.joda.time.Minutes minutes12 = minutes9.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration13 = minutes9.toStandardDuration();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period16.negated();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationTo(readableInstant18);
        boolean boolean20 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration24 = duration19.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Period period31 = period27.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType32 = period27.getPeriodType();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = duration19.toPeriod(periodType32, chronology33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType32);
        org.joda.time.Period period36 = period1.plus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Days days37 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType38 = days37.getPeriodType();
        org.joda.time.PeriodType periodType39 = periodType38.withHoursRemoved();
        org.joda.time.PeriodType periodType40 = periodType38.withYearsRemoved();
        org.joda.time.PeriodType periodType41 = periodType38.withSecondsRemoved();
        org.joda.time.PeriodType periodType42 = periodType38.withHoursRemoved();
        org.joda.time.PeriodType periodType43 = periodType42.withYearsRemoved();
        org.joda.time.PeriodType periodType44 = periodType43.withHoursRemoved();
        int int45 = periodType44.size();
        org.joda.time.PeriodType periodType46 = periodType44.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period47 = period1.withPeriodType(periodType44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(periodType46);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) 0);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks4 = weeks3.negated();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        boolean boolean9 = weeks4.isGreaterThan(weeks7);
        boolean boolean10 = weeks1.isLessThan(weeks7);
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeksIn(readableInterval12);
        boolean boolean14 = weeks11.isLessThan(weeks13);
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks17 = weeks15.dividedBy(1);
        boolean boolean18 = weeks11.isGreaterThan(weeks17);
        java.lang.String str19 = weeks11.toString();
        org.joda.time.Weeks weeks20 = weeks1.minus(weeks11);
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.weeks(1);
        boolean boolean24 = weeks21.isGreaterThan(weeks23);
        org.joda.time.DurationFieldType durationFieldType25 = weeks23.getFieldType();
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeksIn(readableInterval27);
        boolean boolean29 = weeks26.isLessThan(weeks28);
        org.joda.time.Weeks weeks31 = weeks28.multipliedBy(10);
        org.joda.time.Weeks weeks32 = weeks23.minus(weeks28);
        boolean boolean33 = weeks11.isGreaterThan(weeks28);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P2147483647W" + "'", str19, "P2147483647W");
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.DurationFieldType durationFieldType15 = period12.getFieldType((int) (short) 1);
        int int16 = periodType9.indexOf(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) ' ', periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter3.withParseType(periodType9);
        java.util.Locale locale19 = null;
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter3.withLocale(locale19);
        org.joda.time.format.PeriodParser periodParser21 = periodFormatter3.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = org.joda.time.Period.parse("P6DT10S", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNull(periodParser21);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration19 = duration6.toDuration();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant20);
        org.joda.time.Period period23 = period21.withHours((int) (byte) -1);
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.Period period26 = period23.minusMonths(2);
        org.joda.time.DurationFieldType durationFieldType27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = period23.withField(durationFieldType27, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (short) 0, (long) 3);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Seconds seconds9 = seconds1.plus((int) '4');
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = seconds10.multipliedBy(10);
        org.joda.time.Duration duration13 = seconds10.toStandardDuration();
        org.joda.time.Seconds seconds15 = seconds10.minus(3);
        org.joda.time.Seconds seconds16 = seconds1.plus(seconds10);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Chronology chronology18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) seconds10, periodType17, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        int int8 = minutes7.size();
        org.joda.time.PeriodType periodType9 = minutes7.getPeriodType();
        java.lang.String str10 = periodType9.getName();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Minutes" + "'", str10, "Minutes");
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration1 = minutes0.toStandardDuration();
        long long2 = duration1.getStandardSeconds();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration12 = minutes8.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Duration duration19 = minutes18.toStandardDuration();
        org.joda.time.Period period20 = duration19.toPeriod();
        boolean boolean21 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.Period period24 = duration12.toPeriodTo(readableInstant22, periodType23);
        org.joda.time.Duration duration25 = duration1.plus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = duration12.toPeriod(chronology26);
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardSeconds((long) 7);
        boolean boolean30 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Period period37 = period33.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.PeriodType periodType39 = periodType38.withMinutesRemoved();
        org.joda.time.PeriodType periodType40 = periodType39.withHoursRemoved();
        org.joda.time.Period period41 = duration12.toPeriod(periodType40);
        java.lang.String str42 = duration12.toString();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-128849018880L) + "'", long2 == (-128849018880L));
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT0S" + "'", str42, "PT0S");
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = seconds1.plus(seconds2);
        org.joda.time.PeriodType periodType4 = seconds1.getPeriodType();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.DurationFieldType durationFieldType10 = period7.getFieldType((int) (short) 1);
        int int11 = periodType4.indexOf(durationFieldType10);
        org.joda.time.Period period12 = new org.joda.time.Period((long) ' ', periodType4);
        org.joda.time.PeriodType periodType13 = periodType4.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType15 = periodType13.getFieldType((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.standardMinutesIn(readablePeriod0);
        org.joda.time.Weeks weeks2 = minutes1.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = weeks2.getFieldType((-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod2 = hours1.toMutablePeriod();
        org.joda.time.Hours hours4 = hours1.multipliedBy(52);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hours4.getValue((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -2147483648");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(hours4);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        org.joda.time.Hours hours4 = hours0.dividedBy((-95));
        org.joda.time.DurationFieldType durationFieldType5 = hours0.getFieldType();
        org.joda.time.PeriodType periodType6 = hours0.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours8 = hours0.plus(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 11");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        boolean boolean6 = periodType4.isSupported(durationFieldType5);
        org.joda.time.PeriodType periodType7 = periodType4.withMinutesRemoved();
        org.joda.time.Period period8 = new org.joda.time.Period((-128849018880L), periodType4);
        java.lang.String str9 = periodType4.getName();
        org.joda.time.Period period11 = org.joda.time.Period.years((int) '4');
        boolean boolean12 = periodType4.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType14 = periodType4.getFieldType((-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2147483646");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Days" + "'", str9, "Days");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period17 = duration16.toPeriod();
        boolean boolean18 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.Period period21 = duration9.toPeriodTo(readableInstant19, periodType20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration9.toPeriodFrom(readableInstant22);
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.Period period26 = period24.minusHours(8);
        org.joda.time.Period period28 = period24.plusMinutes((-14400));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, (int) ' ', (int) '4', (int) (short) -1, 10, (int) 'a', (-1), (int) '4');
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        int int14 = period13.getYears();
        org.joda.time.Period period16 = period13.plusYears((int) ' ');
        org.joda.time.Period period18 = period13.plusMinutes((-1));
        org.joda.time.Period period20 = org.joda.time.Period.weeks(7);
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Duration duration27 = minutes26.toStandardDuration();
        org.joda.time.Minutes minutes29 = minutes26.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType30 = minutes26.getFieldType();
        org.joda.time.Period period32 = period20.withFieldAdded(durationFieldType30, (int) (byte) 1);
        boolean boolean33 = period18.isSupported(durationFieldType30);
        org.joda.time.Period period35 = period8.withField(durationFieldType30, (-2));
        int int36 = period8.getWeeks();
        org.joda.time.Period period38 = period8.plusSeconds(59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration39 = period38.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 2147483645, 3120000L);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        int int4 = seconds2.get(durationFieldType3);
        org.joda.time.Seconds seconds5 = seconds2.negated();
        java.lang.String str6 = seconds5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds8 = seconds5.multipliedBy((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -4 * -2147483648");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-4S" + "'", str6, "PT-4S");
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.minus((int) 'a');
        org.joda.time.Seconds seconds3 = seconds2.negated();
        org.joda.time.Seconds seconds5 = seconds2.minus(3);
        java.lang.String str6 = seconds2.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-95S" + "'", str6, "PT-95S");
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        org.joda.time.Period period1 = org.joda.time.Period.parse("P0D");
        org.joda.time.Period period3 = org.joda.time.Period.millis((int) '#');
        int int4 = period3.getYears();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Period period6 = period3.withFields(readablePeriod5);
        org.joda.time.Hours hours7 = period3.toStandardHours();
        org.joda.time.Hours hours8 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType9 = hours8.getFieldType();
        org.joda.time.Hours hours10 = hours8.negated();
        org.joda.time.Duration duration11 = hours8.toStandardDuration();
        org.joda.time.Duration duration12 = hours8.toStandardDuration();
        boolean boolean13 = hours7.isLessThan(hours8);
        org.joda.time.Period period14 = period1.minus((org.joda.time.ReadablePeriod) hours8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours16 = hours8.plus((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 97");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds(100);
        org.joda.time.Period period8 = period2.withMillis(1);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes19 = minutes10.minus(minutes16);
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Minutes minutes28 = minutes26.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes29 = minutes20.minus(minutes26);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period34 = period32.minusMonths(0);
        org.joda.time.Minutes minutes35 = period34.toStandardMinutes();
        org.joda.time.Duration duration36 = minutes35.toStandardDuration();
        org.joda.time.Minutes minutes38 = minutes35.multipliedBy((int) (short) 1);
        int int39 = minutes20.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes38);
        org.joda.time.Minutes minutes40 = minutes19.plus(minutes38);
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period45 = period43.minusMonths(0);
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Duration duration47 = minutes46.toStandardDuration();
        org.joda.time.Minutes minutes49 = minutes46.multipliedBy((int) (short) 1);
        java.lang.String str50 = minutes49.toString();
        org.joda.time.Minutes minutes51 = minutes40.minus(minutes49);
        org.joda.time.Minutes minutes53 = minutes40.minus((-95));
        org.joda.time.Minutes minutes54 = minutes9.plus(minutes53);
        java.lang.String str55 = minutes54.toString();
        org.joda.time.Days days56 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType57 = days56.getPeriodType();
        org.joda.time.Days days59 = days56.plus((int) (byte) 100);
        org.joda.time.Days days60 = org.joda.time.Days.FIVE;
        java.lang.String str61 = days60.toString();
        org.joda.time.Days days63 = days60.multipliedBy((int) (byte) -1);
        org.joda.time.Days days64 = days60.negated();
        org.joda.time.Days days65 = org.joda.time.Days.ONE;
        org.joda.time.Days days66 = org.joda.time.Days.ONE;
        int int67 = days65.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days66);
        org.joda.time.Days days69 = days66.multipliedBy((int) '#');
        org.joda.time.Days days70 = days64.minus(days66);
        org.joda.time.DurationFieldType durationFieldType71 = days70.getFieldType();
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Days days75 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType76 = days75.getPeriodType();
        org.joda.time.PeriodType periodType77 = periodType76.withHoursRemoved();
        org.joda.time.PeriodType periodType78 = periodType76.withSecondsRemoved();
        org.joda.time.Period period79 = duration73.toPeriodFrom(readableInstant74, periodType76);
        org.joda.time.Days days80 = duration73.toStandardDays();
        org.joda.time.Days days81 = org.joda.time.Days.MIN_VALUE;
        boolean boolean82 = days80.isLessThan(days81);
        org.joda.time.Period period83 = days81.toPeriod();
        org.joda.time.Period period86 = new org.joda.time.Period((long) 35, (long) (byte) 1);
        org.joda.time.Period period87 = period86.toPeriod();
        org.joda.time.Days days88 = period87.toStandardDays();
        int int89 = days81.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days88);
        org.joda.time.Days days90 = days70.plus(days88);
        org.joda.time.Days days91 = days56.plus(days90);
        // The following exception was thrown during execution in test generation
        try {
            int int92 = minutes54.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days90);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT0M" + "'", str50, "PT0M");
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PT97M" + "'", str55, "PT97M");
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(days60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "P5D" + "'", str61, "P5D");
        org.junit.Assert.assertNotNull(days63);
        org.junit.Assert.assertNotNull(days64);
        org.junit.Assert.assertNotNull(days65);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(days69);
        org.junit.Assert.assertNotNull(days70);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(days75);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(days80);
        org.junit.Assert.assertNotNull(days81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(days88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(days90);
        org.junit.Assert.assertNotNull(days91);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days3 = days0.plus((int) (byte) 100);
        org.joda.time.Duration duration4 = days3.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = duration4.toPeriodFrom(readableInstant5);
        java.lang.String str7 = duration4.toString();
        long long8 = duration4.getStandardMinutes();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration4.toPeriod(chronology9);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT9072000S" + "'", str7, "PT9072000S");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 151200L + "'", long8 == 151200L);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        int int5 = period4.getYears();
        org.joda.time.Period period7 = period4.plusYears((int) ' ');
        org.joda.time.Period period9 = period4.plusMinutes((-1));
        org.joda.time.Period period11 = org.joda.time.Period.weeks(7);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        org.joda.time.Minutes minutes20 = minutes17.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType21 = minutes17.getFieldType();
        org.joda.time.Period period23 = period11.withFieldAdded(durationFieldType21, (int) (byte) 1);
        boolean boolean24 = period9.isSupported(durationFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType26 = period9.getFieldType((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType3);
        org.joda.time.Hours hours5 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = period4.withYears((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        org.joda.time.Period period1 = org.joda.time.Period.hours(97);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        java.lang.String str3 = durationFieldType2.toString();
        org.joda.time.Chronology chronology4 = null;
        boolean boolean5 = durationFieldType2.isSupported(chronology4);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hours" + "'", str3, "hours");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.Seconds seconds9 = seconds6.plus((int) (byte) 0);
        org.joda.time.Seconds seconds11 = seconds9.minus((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        int int13 = seconds9.get(durationFieldType12);
        boolean boolean14 = period4.isSupported(durationFieldType12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray16 = new org.joda.time.DurationFieldType[] { durationFieldType12, durationFieldType15 };
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.forFields(durationFieldTypeArray16);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.forFields(durationFieldTypeArray16);
        org.joda.time.PeriodType periodType19 = periodType18.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(durationFieldTypeArray16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration10 = duration7.plus((long) (byte) 0);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Period period12 = duration10.toPeriod();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Interval interval14 = duration10.toIntervalTo(readableInstant13);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Duration duration21 = minutes20.toStandardDuration();
        org.joda.time.Minutes minutes23 = minutes20.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration24 = minutes20.toStandardDuration();
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period27.negated();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationTo(readableInstant29);
        boolean boolean31 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration35 = duration30.plus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Period period42 = period38.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType43 = period38.getPeriodType();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = duration30.toPeriod(periodType43, chronology44);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period50 = period48.minusMonths(0);
        org.joda.time.Minutes minutes51 = period50.toStandardMinutes();
        org.joda.time.Duration duration52 = minutes51.toStandardDuration();
        org.joda.time.Minutes minutes54 = minutes51.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration55 = minutes51.toStandardDuration();
        org.joda.time.Period period58 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period59 = period58.negated();
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period59.toDurationTo(readableInstant60);
        boolean boolean62 = duration55.isShorterThan((org.joda.time.ReadableDuration) duration61);
        org.joda.time.Duration duration65 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration66 = duration61.plus((org.joda.time.ReadableDuration) duration65);
        boolean boolean67 = duration30.isLongerThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration30, readableInstant68);
        org.joda.time.Duration duration71 = duration30.minus((long) (-2147483646));
        boolean boolean72 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration71);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days8);
        org.joda.time.Days days11 = days8.dividedBy(3);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = days11.getValue(56);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 56");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT-95H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT-4S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        boolean boolean3 = weeks0.isGreaterThan(weeks2);
        org.joda.time.DurationFieldType durationFieldType4 = weeks2.getFieldType();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        org.joda.time.Weeks weeks10 = weeks7.multipliedBy(10);
        org.joda.time.Weeks weeks11 = weeks2.minus(weeks7);
        int int12 = weeks11.getWeeks();
        org.joda.time.Weeks weeks14 = weeks11.multipliedBy(2147483647);
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn(readableInterval16);
        boolean boolean18 = weeks15.isLessThan(weeks17);
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks21 = weeks19.dividedBy(1);
        boolean boolean22 = weeks15.isGreaterThan(weeks21);
        java.lang.String str23 = weeks15.toString();
        int int24 = weeks14.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks15);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks27 = weeks26.negated();
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn(readableInterval29);
        boolean boolean31 = weeks28.isLessThan(weeks30);
        boolean boolean32 = weeks27.isGreaterThan(weeks30);
        org.joda.time.Weeks weeks34 = weeks30.dividedBy(52);
        boolean boolean35 = weeks14.isGreaterThan(weeks30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours36 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) weeks14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 360777252696");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "P2147483647W" + "'", str23, "P2147483647W");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-5));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.Period period9 = org.joda.time.Period.hours(2147483645);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks(1);
        boolean boolean14 = weeks11.isGreaterThan(weeks13);
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean16 = weeks13.isGreaterThan(weeks15);
        org.joda.time.Weeks weeks18 = weeks13.multipliedBy(0);
        boolean boolean19 = weeks10.isGreaterThan(weeks13);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeksIn(readableInterval20);
        org.joda.time.Weeks weeks23 = weeks21.plus((-97));
        boolean boolean24 = weeks10.isGreaterThan(weeks21);
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) weeks10);
        boolean boolean26 = weeks2.isGreaterThan(weeks10);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        boolean boolean3 = weeks0.isLessThan(weeks2);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks6 = weeks4.dividedBy(1);
        boolean boolean7 = weeks0.isGreaterThan(weeks6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes8 = weeks6.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 10080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(10);
        org.joda.time.Period period3 = period1.minusMillis(0);
        org.joda.time.Period period5 = period3.withMonths(1);
        org.joda.time.Period period7 = period5.withMonths(52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        boolean boolean15 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration17 = duration7.plus((long) (short) 10);
        long long18 = duration17.getStandardSeconds();
        org.joda.time.Duration duration19 = duration17.toDuration();
        java.lang.String str20 = duration17.toString();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Period period27 = period23.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType28 = period23.getPeriodType();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period23.toDurationTo(readableInstant29);
        long long31 = duration30.getStandardSeconds();
        boolean boolean32 = duration17.equals((java.lang.Object) long31);
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period34 = duration17.toPeriod();
        org.joda.time.Period period36 = period34.plusHours((-5));
        org.joda.time.Period period38 = period34.plusHours(11);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0.010S" + "'", str20, "PT0.010S");
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT100S");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Interval interval3 = duration1.toIntervalTo(readableInstant2);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval3);
        org.joda.time.Duration duration5 = hours4.toStandardDuration();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.PeriodType periodType3 = weeks1.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = periodType3.getFieldType((-14400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -14400");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Weeks weeks3 = weeks1.dividedBy(11);
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.parseWeeks("P0W");
        org.joda.time.Weeks weeks6 = weeks1.minus(weeks5);
        org.joda.time.MutablePeriod mutablePeriod7 = weeks5.toMutablePeriod();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(2);
        org.joda.time.Hours hours2 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours3 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours4 = hours2.minus(hours3);
        boolean boolean5 = hours1.isLessThan(hours2);
        org.joda.time.Hours hours6 = org.joda.time.Hours.ZERO;
        org.joda.time.Duration duration7 = hours6.toStandardDuration();
        org.joda.time.Hours hours8 = hours2.plus(hours6);
        org.joda.time.Period period10 = org.joda.time.Period.millis((int) '#');
        int int11 = period10.getYears();
        org.joda.time.Hours hours12 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period10);
        int int13 = hours12.getHours();
        org.joda.time.Hours hours15 = hours12.multipliedBy((int) (short) 1);
        org.joda.time.Hours hours16 = hours8.minus(hours12);
        int int17 = hours16.getHours();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        org.joda.time.Period period1 = org.joda.time.Period.hours(100);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = period1.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        java.lang.String str5 = periodType3.getName();
        int int6 = periodType3.size();
        org.joda.time.PeriodType periodType7 = periodType3.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Days" + "'", str5, "Days");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period8 = period4.minusSeconds((int) (byte) 100);
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.days();
        boolean boolean14 = periodType12.isSupported(durationFieldType13);
        int int15 = period4.get(durationFieldType13);
        org.joda.time.Period period17 = period4.withHours(1);
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Period period24 = period20.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.PeriodType periodType26 = periodType25.withMinutesRemoved();
        java.lang.String str27 = periodType26.toString();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) period4, periodType26, chronology28);
        org.joda.time.PeriodType periodType30 = periodType26.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str27, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        org.joda.time.Period period9 = period6.negated();
        org.joda.time.Period period11 = period6.minusMillis((int) (short) 0);
        org.joda.time.Period period13 = period6.minusWeeks(0);
        org.joda.time.Hours hours14 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period6);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours14);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = periodType10.isSupported(durationFieldType11);
        int int13 = period2.get(durationFieldType11);
        int int14 = period2.getDays();
        org.joda.time.Period period16 = period2.plusHours((int) '#');
        org.joda.time.Period period18 = period16.plusMonths((int) (short) 1);
        org.joda.time.Period period20 = period18.minusWeeks((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period18.toDurationTo(readableInstant21);
        org.joda.time.Period period23 = duration22.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 14400, 10L);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withParseType(periodType9);
        org.joda.time.Period period12 = org.joda.time.Period.millis((int) '#');
        int int13 = period12.getYears();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.Period period15 = period12.withFields(readablePeriod14);
        org.joda.time.MutablePeriod mutablePeriod16 = period12.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = periodFormatter10.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod16, "minutes", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(87);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        org.joda.time.DurationFieldType durationFieldType3 = days0.getFieldType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        org.joda.time.Period period1 = org.joda.time.Period.months(14400);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period8 = period4.minusSeconds((int) (byte) 100);
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.days();
        boolean boolean14 = periodType12.isSupported(durationFieldType13);
        int int15 = period4.get(durationFieldType13);
        org.joda.time.Period period17 = period4.withHours(1);
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Period period24 = period20.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.PeriodType periodType26 = periodType25.withMinutesRemoved();
        java.lang.String str27 = periodType26.toString();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) period4, periodType26, chronology28);
        org.joda.time.PeriodType periodType30 = periodType26.withHoursRemoved();
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType26);
        org.joda.time.Period period33 = period31.withMillis(14400);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = period33.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str27, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        boolean boolean9 = periodFormatter8.isPrinter();
        boolean boolean10 = periodFormatter8.isParser();
        org.joda.time.PeriodType periodType11 = periodFormatter8.getParseType();
        boolean boolean12 = periodFormatter8.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter13 = periodFormatter8.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = org.joda.time.Period.parse("P-5D", periodFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(periodPrinter13);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        org.joda.time.Period period1 = org.joda.time.Period.millis(14400);
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.DurationFieldType durationFieldType5 = periodType2.getFieldType(0);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration10 = duration8.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds15 = seconds13.plus(seconds14);
        org.joda.time.PeriodType periodType16 = seconds13.getPeriodType();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period19.negated();
        org.joda.time.DurationFieldType durationFieldType22 = period19.getFieldType((int) (short) 1);
        int int23 = periodType16.indexOf(durationFieldType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) ' ', periodType16);
        org.joda.time.Period period25 = duration8.toPeriodTo(readableInstant11, periodType16);
        org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) (byte) 0);
        java.lang.String str28 = durationFieldType27.getName();
        int int29 = periodType2.indexOf(durationFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = period1.withPeriodType(periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YearMonthDay" + "'", str3, "YearMonthDay");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "seconds" + "'", str28, "seconds");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration19 = duration6.toDuration();
        org.joda.time.Period period20 = duration6.toPeriod();
        org.joda.time.Period period22 = period20.plusWeeks(35);
        org.joda.time.Period period24 = period22.withSeconds((int) (byte) 100);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.Period period4 = period1.withFields(readablePeriod3);
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Period period9 = period6.minusMonths(100);
        org.joda.time.Period period11 = period9.minusYears((int) (short) 10);
        java.lang.String str12 = period9.toString();
        org.joda.time.Period period14 = period9.minusMillis((int) (short) 10);
        org.joda.time.Period period15 = period1.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period17 = period1.plusSeconds(10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Duration duration28 = duration25.plus((long) (byte) 0);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) duration28, periodType30, chronology31);
        org.joda.time.PeriodType periodType33 = periodType30.withDaysRemoved();
        org.joda.time.Period period34 = period1.normalizedStandard(periodType33);
        org.joda.time.Period period36 = period1.minusMinutes((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P-100M10D" + "'", str12, "P-100M10D");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period19 = duration6.toPeriod();
        int int20 = period19.getMillis();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = periodType10.isSupported(durationFieldType11);
        int int13 = period2.get(durationFieldType11);
        java.lang.String str14 = durationFieldType11.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "days" + "'", str14, "days");
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Duration duration11 = duration1.withDurationAdded(10L, (-36));
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration15 = duration11.withDurationAdded((long) ' ', (int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableDuration17);
        org.joda.time.Days days19 = period18.toStandardDays();
        org.joda.time.Days days21 = days19.minus(7);
        org.joda.time.MutablePeriod mutablePeriod22 = days19.toMutablePeriod();
        boolean boolean23 = duration11.equals((java.lang.Object) days19);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Days days29 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        org.joda.time.PeriodType periodType31 = periodType30.withHoursRemoved();
        org.joda.time.PeriodType periodType32 = periodType30.withSecondsRemoved();
        org.joda.time.Period period33 = duration27.toPeriodFrom(readableInstant28, periodType30);
        org.joda.time.Days days34 = duration27.toStandardDays();
        org.joda.time.PeriodType periodType35 = days34.getPeriodType();
        org.joda.time.Period period36 = new org.joda.time.Period((long) 10, (long) (byte) 0, periodType35);
        org.joda.time.PeriodType periodType37 = periodType35.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period38 = new org.joda.time.Period((java.lang.Object) boolean23, periodType35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        org.joda.time.Period period4 = new org.joda.time.Period((-5), (-5), (-2), (-1));
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT1H36M0.036S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withSecondsRemoved();
        org.joda.time.Period period12 = duration6.toPeriodFrom(readableInstant7, periodType9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, periodType9, chronology13);
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withParseType(periodType9);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period18.negated();
        int int20 = period18.getHours();
        int int21 = period18.getMonths();
        org.joda.time.Period period23 = period18.withMonths(2147483647);
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeksIn(readableInterval25);
        boolean boolean27 = weeks24.isLessThan(weeks26);
        org.joda.time.Weeks weeks29 = weeks26.multipliedBy((int) (short) 100);
        org.joda.time.Period period30 = period18.withFields((org.joda.time.ReadablePeriod) weeks29);
        org.joda.time.MutablePeriod mutablePeriod31 = weeks29.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod31, "P3M2W2D", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(mutablePeriod31);
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration6 = new org.joda.time.Duration((java.lang.Object) minutes5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Minutes");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes19 = minutes10.minus(minutes16);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Minutes minutes28 = minutes25.multipliedBy((int) (short) 1);
        int int29 = minutes10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes28);
        org.joda.time.Minutes minutes30 = minutes9.plus(minutes28);
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Minutes minutes38 = minutes36.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) minutes36, chronology39);
        org.joda.time.Period period41 = minutes36.toPeriod();
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean43 = minutes36.isLessThan(minutes42);
        org.joda.time.Minutes minutes44 = minutes30.minus(minutes36);
        org.joda.time.Minutes minutes46 = minutes36.dividedBy((-36));
        org.joda.time.Minutes minutes48 = minutes46.dividedBy(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType50 = minutes48.getFieldType(14400);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 14400");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(minutes48);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        boolean boolean3 = weeks0.isGreaterThan(weeks2);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean5 = weeks2.isGreaterThan(weeks4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks6 = weeks4.negated();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withSecondsRemoved();
        org.joda.time.Period period12 = duration6.toPeriodFrom(readableInstant7, periodType9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, periodType9, chronology13);
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withParseType(periodType9);
        org.joda.time.format.PeriodPrinter periodPrinter16 = periodFormatter15.getPrinter();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.dayTime();
        org.joda.time.format.PeriodPrinter periodPrinter18 = null;
        org.joda.time.format.PeriodParser periodParser19 = null;
        org.joda.time.format.PeriodFormatter periodFormatter20 = new org.joda.time.format.PeriodFormatter(periodPrinter18, periodParser19);
        boolean boolean21 = periodFormatter20.isParser();
        java.util.Locale locale22 = null;
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter20.withLocale(locale22);
        boolean boolean24 = periodFormatter20.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter25 = periodFormatter20.getPrinter();
        boolean boolean26 = periodType17.equals((java.lang.Object) periodPrinter25);
        org.joda.time.PeriodType periodType27 = periodType17.withMonthsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter15.withParseType(periodType17);
        org.joda.time.format.PeriodParser periodParser29 = periodFormatter15.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = periodFormatter15.parsePeriod("PT97M");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNull(periodPrinter16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(periodPrinter25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodFormatter28);
        org.junit.Assert.assertNull(periodParser29);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("Days", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration6.plus((long) (short) 10);
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        int int22 = period21.getYears();
        org.joda.time.Period period24 = period21.plusYears((int) ' ');
        boolean boolean25 = duration16.equals((java.lang.Object) period24);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Period period33 = duration32.toPeriod();
        org.joda.time.Duration duration35 = duration32.plus((long) (byte) 0);
        org.joda.time.Duration duration37 = duration32.withMillis((long) 1);
        boolean boolean38 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration32);
        long long39 = duration32.getStandardHours();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str46 = periodType45.getName();
        boolean boolean48 = periodType45.equals((java.lang.Object) true);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType45);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) 0, (long) (-10), periodType45, chronology50);
        org.joda.time.Period period52 = duration32.toPeriodFrom(readableInstant40, periodType45);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, readableInstant53, periodType54);
        java.lang.String str56 = duration32.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "YearMonthDay" + "'", str46, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT0S" + "'", str56, "PT0S");
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.Seconds seconds5 = seconds0.plus(6);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds0);
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = seconds9.plus(seconds10);
        org.joda.time.Seconds seconds13 = seconds9.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds14 = seconds8.plus(seconds9);
        org.joda.time.Seconds seconds16 = seconds8.plus((int) '4');
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds19 = seconds17.plus(seconds18);
        org.joda.time.Seconds seconds21 = seconds17.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds22 = seconds8.plus(seconds17);
        org.joda.time.Seconds seconds23 = seconds6.plus(seconds8);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = seconds8.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.DurationFieldType durationFieldType15 = period12.getFieldType((int) (short) 1);
        int int16 = periodType9.indexOf(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) ' ', periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter3.withParseType(periodType9);
        org.joda.time.PeriodType periodType19 = periodType9.withDaysRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period(10L, periodType9);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration22 = new org.joda.time.Duration((java.lang.Object) period20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration8.toPeriod(chronology9);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Days days14 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType18 = periodType15.withMinutesRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType19);
        org.joda.time.Duration duration21 = duration8.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant22, periodType23);
        org.joda.time.Period period26 = period24.minusMinutes(97);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = new org.joda.time.Period((java.lang.Object) "Weeks", chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Weeks\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period4.negated();
        int int6 = period4.getHours();
        org.joda.time.Period period8 = org.joda.time.Period.days(10);
        org.joda.time.Period period10 = period8.plusMonths((int) 'a');
        org.joda.time.Period period12 = period8.plusSeconds((int) (short) 100);
        org.joda.time.Period period14 = period12.minusMonths((int) 'a');
        org.joda.time.Period period15 = period4.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Hours hours16 = period4.toStandardHours();
        int int17 = hours16.getHours();
        org.joda.time.Hours hours18 = hours0.plus(hours16);
        org.joda.time.Hours hours20 = hours18.minus((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hours18.getValue((-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours20);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 52);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(47L);
        org.joda.time.Duration duration3 = duration1.withMillis((long) (-5));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Minutes minutes17 = minutes15.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) minutes15, chronology18);
        org.joda.time.Minutes minutes20 = minutes0.minus(minutes15);
        org.joda.time.Duration duration21 = minutes0.toStandardDuration();
        org.joda.time.PeriodType periodType22 = minutes0.getPeriodType();
        int int23 = minutes0.getMinutes();
        org.joda.time.DurationFieldType durationFieldType24 = minutes0.getFieldType();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(durationFieldType24);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        org.joda.time.Period period14 = duration4.toPeriod();
        org.joda.time.Period period16 = period14.minusSeconds((int) (short) 100);
        org.joda.time.Period period18 = period16.withDays(59);
        org.joda.time.format.PeriodPrinter periodPrinter19 = null;
        org.joda.time.format.PeriodParser periodParser20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = new org.joda.time.format.PeriodFormatter(periodPrinter19, periodParser20);
        boolean boolean22 = periodFormatter21.isParser();
        org.joda.time.Days days23 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType24 = days23.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter21.withParseType(periodType24);
        org.joda.time.Days days27 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType28 = days27.getPeriodType();
        org.joda.time.PeriodType periodType29 = periodType28.withSecondsRemoved();
        org.joda.time.PeriodType periodType30 = periodType28.withYearsRemoved();
        java.lang.String str31 = periodType30.toString();
        org.joda.time.format.PeriodFormatter periodFormatter32 = periodFormatter26.withParseType(periodType30);
        org.joda.time.PeriodType periodType33 = periodFormatter32.getParseType();
        org.joda.time.format.PeriodParser periodParser34 = periodFormatter32.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = period18.toString(periodFormatter32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodFormatter26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PeriodType[Days]" + "'", str31, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNull(periodParser34);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        org.joda.time.Period period14 = duration4.toPeriod();
        org.joda.time.Period period16 = period14.minusSeconds((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration17 = new org.joda.time.Duration((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-36), chronology1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = period2.getValue((-31));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.PeriodType periodType8 = weeks2.getPeriodType();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        org.joda.time.Weeks weeks12 = weeks10.plus(11);
        org.joda.time.Weeks weeks14 = weeks10.plus((int) (short) 100);
        boolean boolean15 = weeks2.isLessThan(weeks10);
        int int16 = weeks2.getWeeks();
        org.joda.time.Weeks weeks18 = weeks2.minus(14405);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(weeks18);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withSecondsRemoved();
        org.joda.time.Period period12 = duration6.toPeriodFrom(readableInstant7, periodType9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, periodType9, chronology13);
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withParseType(periodType9);
        org.joda.time.format.PeriodPrinter periodPrinter16 = periodFormatter15.getPrinter();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardSeconds((long) (-95));
        org.joda.time.Hours hours19 = duration18.toStandardHours();
        int int20 = hours19.size();
        org.joda.time.MutablePeriod mutablePeriod21 = hours19.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = periodFormatter15.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod21, "P-100M10D", 65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNull(periodPrinter16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(mutablePeriod21);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        org.joda.time.Period period8 = period6.withMillis((-36));
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withSecondsRemoved();
        org.joda.time.Period period12 = duration6.toPeriodFrom(readableInstant7, periodType9);
        long long13 = duration6.getStandardHours();
        org.joda.time.Duration duration16 = duration6.withDurationAdded(10L, (-36));
        org.joda.time.Period period17 = duration16.toPeriod();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = duration16.toPeriodTo(readableInstant18);
        org.joda.time.Days days20 = duration16.toStandardDays();
        org.joda.time.Duration duration21 = duration3.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Days days23 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType24 = days23.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withHoursRemoved();
        org.joda.time.PeriodType periodType26 = periodType24.withYearsRemoved();
        org.joda.time.PeriodType periodType27 = periodType24.withSecondsRemoved();
        org.joda.time.PeriodType periodType28 = periodType24.withHoursRemoved();
        org.joda.time.PeriodType periodType29 = periodType28.withYearsRemoved();
        org.joda.time.PeriodType periodType30 = periodType29.withHoursRemoved();
        org.joda.time.Days days31 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType32 = days31.getPeriodType();
        org.joda.time.Days days33 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType34 = days33.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType35 = days33.getFieldType();
        boolean boolean36 = days31.isLessThan(days33);
        boolean boolean37 = periodType30.equals((java.lang.Object) boolean36);
        org.joda.time.Period period38 = duration3.toPeriodTo(readableInstant22, periodType30);
        long long39 = duration3.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 6000000L + "'", long39 == 6000000L);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        org.joda.time.format.PeriodPrinter periodPrinter2 = null;
        org.joda.time.format.PeriodParser periodParser3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = new org.joda.time.format.PeriodFormatter(periodPrinter2, periodParser3);
        boolean boolean5 = periodFormatter4.isParser();
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter4.withParseType(periodType7);
        org.joda.time.PeriodType periodType10 = periodType7.withSecondsRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((long) (-14400), (long) (short) 10, periodType10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT0.008S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = periodType10.isSupported(durationFieldType11);
        int int13 = period2.get(durationFieldType11);
        org.joda.time.Period period15 = period2.withHours(1);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Period period22 = period18.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.PeriodType periodType24 = periodType23.withMinutesRemoved();
        java.lang.String str25 = periodType24.toString();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) period2, periodType24, chronology26);
        org.joda.time.PeriodType periodType28 = periodType24.withHoursRemoved();
        org.joda.time.PeriodType periodType29 = periodType24.withMillisRemoved();
        org.joda.time.PeriodType periodType30 = periodType24.withMillisRemoved();
        org.joda.time.Chronology chronology31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) periodType30, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str25, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period17 = duration16.toPeriod();
        boolean boolean18 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration21 = duration16.withDurationAdded(11L, (int) (byte) 10);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Minutes minutes27 = period26.toStandardMinutes();
        org.joda.time.Duration duration28 = minutes27.toStandardDuration();
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Duration duration35 = minutes34.toStandardDuration();
        boolean boolean36 = duration28.isShorterThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Duration duration38 = duration28.plus((long) (short) 10);
        long long39 = duration38.getStandardSeconds();
        org.joda.time.Duration duration40 = duration38.toDuration();
        java.lang.String str41 = duration38.toString();
        boolean boolean42 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration43 = duration38.toDuration();
        long long44 = duration38.getStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PT0.010S" + "'", str41, "PT0.010S");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(14400);
        int int2 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        boolean boolean8 = periodFormatter7.isPrinter();
        boolean boolean9 = periodFormatter7.isParser();
        org.joda.time.PeriodType periodType10 = periodFormatter7.getParseType();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Hours hours12 = org.joda.time.Hours.hoursIn(readableInterval11);
        org.joda.time.Period period13 = hours12.toPeriod();
        org.joda.time.Period period14 = period13.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = periodFormatter7.print((org.joda.time.ReadablePeriod) period14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Period period3 = period1.plusMonths((int) 'a');
        org.joda.time.Period period5 = period1.plusSeconds((int) (short) 100);
        int int6 = period5.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.util.Locale locale3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withLocale(locale3);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Hours hours6 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours8 = hours6.dividedBy(100);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Period period15 = period13.minusSeconds(0);
        org.joda.time.Period period16 = period15.normalizedStandard();
        org.joda.time.Hours hours17 = period16.toStandardHours();
        boolean boolean18 = hours8.isLessThan(hours17);
        org.joda.time.Period period20 = org.joda.time.Period.millis((int) '#');
        int int21 = period20.getYears();
        org.joda.time.Hours hours22 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period24 = period20.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours25 = period24.toStandardHours();
        org.joda.time.Hours hours26 = hours8.minus(hours25);
        org.joda.time.Hours hours28 = hours26.dividedBy(59);
        org.joda.time.Hours hours30 = hours28.minus((-36));
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer5, (org.joda.time.ReadablePeriod) hours28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours30);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter2.withLocale(locale18);
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter2.withLocale(locale20);
        org.joda.time.format.PeriodPrinter periodPrinter22 = periodFormatter21.getPrinter();
        java.lang.StringBuffer stringBuffer23 = null;
        org.joda.time.Days days24 = org.joda.time.Days.FIVE;
        java.lang.String str25 = days24.toString();
        org.joda.time.Days days27 = days24.multipliedBy((int) (byte) -1);
        org.joda.time.Days days28 = days24.negated();
        org.joda.time.Days days29 = org.joda.time.Days.ONE;
        org.joda.time.Days days30 = org.joda.time.Days.ONE;
        int int31 = days29.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days30);
        org.joda.time.Days days33 = days30.multipliedBy((int) '#');
        org.joda.time.Days days34 = days28.minus(days30);
        org.joda.time.DurationFieldType durationFieldType35 = days34.getFieldType();
        org.joda.time.Duration duration36 = days34.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter21.printTo(stringBuffer23, (org.joda.time.ReadablePeriod) days34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNull(periodPrinter22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P5D" + "'", str25, "P5D");
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(duration36);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Seconds seconds9 = seconds1.plus((int) '4');
        org.joda.time.Duration duration10 = seconds9.toStandardDuration();
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds15 = seconds13.plus(seconds14);
        org.joda.time.Seconds seconds17 = seconds13.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds18 = seconds12.plus(seconds13);
        org.joda.time.Seconds seconds20 = seconds12.plus((int) '4');
        org.joda.time.Duration duration21 = seconds20.toStandardDuration();
        boolean boolean22 = seconds9.isLessThan(seconds20);
        org.joda.time.Seconds seconds23 = seconds9.negated();
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds26 = seconds24.plus(seconds25);
        org.joda.time.Seconds seconds28 = seconds25.plus((int) (byte) 0);
        org.joda.time.Seconds seconds30 = seconds25.minus(8);
        org.joda.time.DurationFieldType durationFieldType31 = seconds25.getFieldType();
        boolean boolean32 = seconds9.isGreaterThan(seconds25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration33 = new org.joda.time.Duration((java.lang.Object) boolean32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.plusMinutes(1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period1.toDurationTo(readableInstant5);
        org.joda.time.Seconds seconds7 = period1.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = period1.getValue(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        org.joda.time.Period period4 = new org.joda.time.Period((-5), 7, 2147483647, 87);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.PeriodType periodType8 = weeks2.getPeriodType();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        org.joda.time.Weeks weeks12 = weeks10.plus(11);
        org.joda.time.Weeks weeks14 = weeks10.plus((int) (short) 100);
        boolean boolean15 = weeks2.isLessThan(weeks10);
        org.joda.time.Duration duration16 = weeks2.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType18 = weeks2.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.multipliedBy((int) (byte) -1);
        org.joda.time.Days days4 = days0.negated();
        org.joda.time.Days days5 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = org.joda.time.Days.ONE;
        int int7 = days5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days6);
        org.joda.time.Days days9 = days6.multipliedBy((int) '#');
        org.joda.time.Days days10 = days4.minus(days6);
        org.joda.time.DurationFieldType durationFieldType11 = days10.getFieldType();
        org.joda.time.Duration duration12 = days10.toStandardDuration();
        org.joda.time.Days days14 = days10.minus(3);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(days14);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        org.joda.time.format.PeriodPrinter periodPrinter2 = null;
        org.joda.time.format.PeriodParser periodParser3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = new org.joda.time.format.PeriodFormatter(periodPrinter2, periodParser3);
        boolean boolean5 = periodFormatter4.isParser();
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = seconds7.plus(seconds8);
        org.joda.time.PeriodType periodType10 = seconds7.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = period13.getFieldType((int) (short) 1);
        int int17 = periodType10.indexOf(durationFieldType16);
        org.joda.time.Period period18 = new org.joda.time.Period((long) ' ', periodType10);
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter4.withParseType(periodType10);
        org.joda.time.PeriodType periodType20 = periodType10.withDaysRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period(10L, periodType10);
        org.joda.time.PeriodType periodType22 = periodType10.withMinutesRemoved();
        java.lang.String str23 = periodType22.toString();
        org.joda.time.Period period24 = new org.joda.time.Period((-128849018880L), periodType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = period24.minusMillis((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PeriodType[Seconds]" + "'", str23, "PeriodType[Seconds]");
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period8 = period4.minusSeconds((int) (byte) 100);
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.days();
        boolean boolean14 = periodType12.isSupported(durationFieldType13);
        int int15 = period4.get(durationFieldType13);
        org.joda.time.Period period17 = period4.withHours(1);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearDay();
        boolean boolean19 = period17.equals((java.lang.Object) periodType18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType18);
        org.joda.time.PeriodType periodType21 = periodType18.withHoursRemoved();
        org.joda.time.Period period23 = org.joda.time.Period.seconds(2);
        org.joda.time.PeriodType periodType24 = period23.getPeriodType();
        boolean boolean25 = periodType18.equals((java.lang.Object) periodType24);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT-2147483648M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.ZERO;
        java.lang.String str3 = weeks2.toString();
        int int4 = weeks2.size();
        org.joda.time.PeriodType periodType5 = weeks2.getPeriodType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(0L, 0L, periodType5, chronology6);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((java.lang.Object) 0L);
        org.joda.time.Period period10 = org.joda.time.Period.parse("P0D");
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = duration8.toPeriod(periodType11, chronology12);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0W" + "'", str3, "P0W");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        org.joda.time.Period period14 = duration13.toPeriod();
        org.joda.time.ReadableDuration readableDuration15 = null;
        boolean boolean16 = duration13.isShorterThan(readableDuration15);
        org.joda.time.Chronology chronology17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) boolean16, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (byte) 100);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withSecondsRemoved();
        org.joda.time.Period period14 = duration8.toPeriodFrom(readableInstant9, periodType11);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.minutes();
        boolean boolean16 = periodType11.equals((java.lang.Object) durationFieldType15);
        java.lang.String str17 = durationFieldType15.getName();
        org.joda.time.Period period19 = period6.withFieldAdded(durationFieldType15, 8);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        int int21 = period19.getMinutes();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "minutes" + "'", str17, "minutes");
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter2.withLocale(locale18);
        org.joda.time.format.PeriodParser periodParser20 = periodFormatter2.getParser();
        java.io.Writer writer21 = null;
        org.joda.time.Period period23 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Minutes minutes26 = minutes24.multipliedBy(1);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer21, (org.joda.time.ReadablePeriod) minutes26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNull(periodParser20);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(minutes26);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (-95), (long) (-95), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes(999);
        org.joda.time.Period period6 = period5.negated();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        boolean boolean4 = periodFormatter2.isParser();
        boolean boolean5 = periodFormatter2.isParser();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Period period23 = period19.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType24 = period19.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        org.joda.time.PeriodType periodType26 = periodType25.withHoursRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (-1), periodType25, chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period((int) '#', (int) (short) 10, 14400, 2, (int) (short) 1, 0, (int) (short) 1, (int) ' ', periodType25);
        java.lang.String str31 = periodType25.getName();
        org.joda.time.format.PeriodFormatter periodFormatter32 = periodFormatter2.withParseType(periodType25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period34 = periodFormatter32.parsePeriod("centuries");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StandardNoMinutes" + "'", str31, "StandardNoMinutes");
        org.junit.Assert.assertNotNull(periodFormatter32);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = seconds1.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType4 = seconds1.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        int int9 = seconds5.size();
        org.joda.time.PeriodType periodType10 = seconds5.getPeriodType();
        org.joda.time.Seconds seconds12 = seconds5.minus((int) (byte) -1);
        org.joda.time.Seconds seconds14 = seconds12.dividedBy((int) (byte) 100);
        org.joda.time.Seconds seconds15 = seconds1.minus(seconds12);
        org.joda.time.Seconds seconds16 = seconds0.minus(seconds15);
        java.lang.String str17 = seconds0.toString();
        org.joda.time.Period period18 = seconds0.toPeriod();
        int int19 = seconds0.getSeconds();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT2S" + "'", str17, "PT2S");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Hours hours3 = org.joda.time.Hours.hoursIn(readableInterval2);
        org.joda.time.Hours hours5 = hours3.multipliedBy(8);
        org.joda.time.Hours hours6 = hours1.plus(hours3);
        org.joda.time.Duration duration7 = hours6.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = hours6.getFieldType(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        boolean boolean9 = periodFormatter8.isPrinter();
        boolean boolean10 = periodFormatter8.isParser();
        org.joda.time.format.PeriodParser periodParser11 = periodFormatter8.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter12 = periodFormatter8.getPrinter();
        boolean boolean13 = periodFormatter8.isPrinter();
        org.joda.time.PeriodType periodType14 = periodFormatter8.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = org.joda.time.Period.parse("PT2147483647H", periodFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(periodParser11);
        org.junit.Assert.assertNull(periodPrinter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-5), (long) (short) 1);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        org.joda.time.Period period8 = new org.joda.time.Period((-2), (-35), (int) (short) 100, 5, 35, 52, (-31), 87);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days5 = period4.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.multipliedBy((int) (byte) -1);
        org.joda.time.Days days4 = days0.negated();
        org.joda.time.Duration duration5 = days0.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6);
        java.lang.Object obj8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(obj8);
        org.joda.time.Period period11 = period9.minusWeeks((int) (short) 100);
        org.joda.time.Period period12 = period7.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.plusYears((-36));
        org.joda.time.Period period16 = period14.minusMillis((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours17 = period16.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter2.getParseType();
        boolean boolean7 = periodFormatter2.isParser();
        boolean boolean8 = periodFormatter2.isParser();
        boolean boolean9 = periodFormatter2.isPrinter();
        org.joda.time.PeriodType periodType10 = periodFormatter2.getParseType();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds16 = seconds14.plus(seconds15);
        org.joda.time.Seconds seconds18 = seconds14.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds19 = seconds13.plus(seconds14);
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds22 = seconds20.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType23 = seconds20.getFieldType();
        int int24 = seconds20.getSeconds();
        org.joda.time.Seconds seconds25 = seconds20.negated();
        org.joda.time.Seconds seconds26 = seconds13.plus(seconds25);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer11, (org.joda.time.ReadablePeriod) seconds25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(periodType10);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        java.lang.String str5 = seconds0.toString();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.multipliedBy(10);
        org.joda.time.Duration duration9 = seconds6.toStandardDuration();
        boolean boolean10 = seconds0.isLessThan(seconds6);
        org.joda.time.Seconds seconds11 = seconds6.negated();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT2S" + "'", str5, "PT2S");
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(seconds11);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        org.joda.time.Period period9 = period5.normalizedStandard();
        org.joda.time.Period period11 = period9.withHours((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period9.multipliedBy((-2147483596));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -36 * -2147483596");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        boolean boolean16 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration20 = duration15.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration20.toIntervalFrom(readableInstant21);
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Minutes minutes30 = period29.toStandardMinutes();
        org.joda.time.Minutes minutes32 = minutes30.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes34 = minutes30.plus(8);
        org.joda.time.Minutes minutes36 = minutes30.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes37 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period42 = period40.minusMonths(0);
        org.joda.time.Minutes minutes43 = period42.toStandardMinutes();
        org.joda.time.Minutes minutes45 = minutes43.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes46 = minutes37.minus(minutes43);
        org.joda.time.Period period49 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period51 = period49.minusMonths(0);
        org.joda.time.Minutes minutes52 = period51.toStandardMinutes();
        org.joda.time.Minutes minutes54 = minutes52.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((java.lang.Object) minutes52, chronology55);
        org.joda.time.Minutes minutes57 = minutes37.minus(minutes52);
        org.joda.time.DurationFieldType durationFieldType59 = minutes57.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType60 = minutes57.getPeriodType();
        org.joda.time.Minutes minutes61 = minutes57.negated();
        org.joda.time.DurationFieldType durationFieldType62 = minutes57.getFieldType();
        org.joda.time.Minutes minutes63 = minutes30.plus(minutes57);
        org.joda.time.Minutes minutes64 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period67 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period69 = period67.minusMonths(0);
        org.joda.time.Minutes minutes70 = period69.toStandardMinutes();
        org.joda.time.Minutes minutes72 = minutes70.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes73 = minutes64.minus(minutes70);
        org.joda.time.Period period76 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period78 = period76.minusMonths(0);
        org.joda.time.Minutes minutes79 = period78.toStandardMinutes();
        org.joda.time.Minutes minutes81 = minutes79.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period((java.lang.Object) minutes79, chronology82);
        org.joda.time.Minutes minutes84 = minutes64.minus(minutes79);
        org.joda.time.DurationFieldType durationFieldType86 = minutes84.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType87 = minutes84.getPeriodType();
        org.joda.time.Minutes minutes88 = minutes84.negated();
        int int89 = minutes88.getMinutes();
        boolean boolean90 = minutes63.isGreaterThan(minutes88);
        org.joda.time.Minutes minutes91 = minutes24.plus(minutes88);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(minutes63);
        org.junit.Assert.assertNotNull(minutes64);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(minutes70);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertNotNull(minutes73);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(minutes79);
        org.junit.Assert.assertNotNull(minutes81);
        org.junit.Assert.assertNotNull(minutes84);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertNotNull(periodType87);
        org.junit.Assert.assertNotNull(minutes88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-2) + "'", int89 == (-2));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(minutes91);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days3 = days0.plus((int) (byte) 100);
        org.joda.time.Duration duration4 = days3.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = duration4.toPeriodFrom(readableInstant5);
        java.lang.String str7 = duration4.toString();
        org.joda.time.Duration duration9 = duration4.plus((long) (short) 0);
        org.joda.time.Days days11 = org.joda.time.Days.days(1);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        boolean boolean13 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = duration12.toPeriodFrom(readableInstant14);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT9072000S" + "'", str7, "PT9072000S");
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.multipliedBy((int) (byte) -1);
        org.joda.time.Days days4 = days0.negated();
        org.joda.time.Days days5 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = org.joda.time.Days.ONE;
        int int7 = days5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days6);
        org.joda.time.Days days9 = days6.multipliedBy((int) '#');
        org.joda.time.Days days10 = days4.minus(days6);
        org.joda.time.Period period11 = days10.toPeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.parseMinutes("PT0H");
        org.joda.time.Minutes minutes11 = minutes5.minus(minutes10);
        org.joda.time.Minutes minutes13 = minutes10.dividedBy(7);
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = minutes10.get(durationFieldType14);
        org.joda.time.PeriodType periodType16 = minutes10.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType18 = minutes10.getFieldType(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        boolean boolean8 = periodFormatter7.isPrinter();
        boolean boolean9 = periodFormatter7.isParser();
        org.joda.time.format.PeriodParser periodParser10 = periodFormatter7.getParser();
        org.joda.time.PeriodType periodType11 = periodFormatter7.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(periodParser10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Seconds seconds9 = seconds2.multipliedBy((int) (short) 1);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = seconds10.plus(seconds11);
        java.lang.String str13 = seconds10.toString();
        org.joda.time.Seconds seconds15 = seconds10.plus(6);
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds10);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds21 = seconds19.plus(seconds20);
        org.joda.time.Seconds seconds23 = seconds19.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds24 = seconds18.plus(seconds19);
        org.joda.time.Seconds seconds26 = seconds18.plus((int) '4');
        org.joda.time.Seconds seconds27 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds29 = seconds27.plus(seconds28);
        org.joda.time.Seconds seconds31 = seconds27.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds32 = seconds18.plus(seconds27);
        org.joda.time.Seconds seconds33 = seconds16.plus(seconds18);
        boolean boolean34 = seconds2.isLessThan(seconds33);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT2S" + "'", str13, "PT2S");
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) 13);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Duration duration9 = period7.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Minutes minutes18 = minutes15.multipliedBy((int) (short) 1);
        java.lang.String str19 = minutes18.toString();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration24 = duration22.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Interval interval28 = duration24.toIntervalFrom(readableInstant27);
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval28);
        org.joda.time.Minutes minutes31 = minutes29.multipliedBy((-95));
        org.joda.time.Minutes minutes32 = minutes18.minus(minutes31);
        org.joda.time.Period period33 = period7.minus((org.joda.time.ReadablePeriod) minutes31);
        org.joda.time.Period period35 = period7.withWeeks((-10));
        org.joda.time.Period period37 = period7.minusDays(2147483647);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0M" + "'", str19, "PT0M");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        java.lang.String str3 = days2.toString();
        org.joda.time.Days days5 = days2.multipliedBy((int) (byte) -1);
        org.joda.time.Days days6 = days2.negated();
        org.joda.time.Duration duration7 = days2.toStandardDuration();
        org.joda.time.Days days8 = duration7.toStandardDays();
        org.joda.time.Period period10 = org.joda.time.Period.seconds(2);
        boolean boolean11 = duration7.equals((java.lang.Object) 2);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Period period19 = period15.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.PeriodType periodType21 = periodType20.withMinutesRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withHoursRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period((long) (-97), periodType22);
        org.joda.time.Period period24 = duration7.toPeriod(periodType22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((-128849018880L), 11L, periodType22, chronology25);
        int int27 = period26.getYears();
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P5D" + "'", str3, "P5D");
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 10);
        org.joda.time.Period period3 = period1.minusSeconds((-95));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        org.joda.time.Period period1 = org.joda.time.Period.hours(11);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes2 = minutes0.dividedBy((int) (byte) -1);
        org.joda.time.Minutes minutes4 = minutes0.plus((-2));
        // The following exception was thrown during execution in test generation
        try {
            int int6 = minutes4.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period5 = period1.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.Period period8 = period5.minusDays((int) '4');
        org.joda.time.Period period10 = period8.minusYears((int) (short) -1);
        org.joda.time.Period period12 = period8.plusWeeks(87);
        org.joda.time.Period period14 = period12.minusMillis(3);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType16 = periodType15.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = period14.withPeriodType(periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        org.joda.time.PeriodType periodType9 = periodFormatter3.getParseType();
        org.joda.time.PeriodType periodType10 = periodFormatter3.getParseType();
        java.util.Locale locale11 = periodFormatter3.getLocale();
        org.joda.time.PeriodType periodType12 = periodFormatter3.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = org.joda.time.Period.parse("", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNull(periodType9);
        org.junit.Assert.assertNull(periodType10);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNull(periodType12);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(2);
        org.joda.time.Hours hours2 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours3 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours4 = hours2.minus(hours3);
        boolean boolean5 = hours1.isLessThan(hours2);
        org.joda.time.Hours hours7 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Hours hours9 = org.joda.time.Hours.hoursIn(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Hours hours11 = org.joda.time.Hours.hoursIn(readableInterval10);
        org.joda.time.Hours hours13 = hours11.multipliedBy(8);
        org.joda.time.Hours hours14 = hours9.plus(hours11);
        org.joda.time.Hours hours16 = hours14.dividedBy((int) (short) -1);
        boolean boolean17 = hours7.isGreaterThan(hours16);
        boolean boolean18 = hours1.isGreaterThan(hours7);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        java.lang.String str9 = minutes8.toString();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration14 = duration12.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalFrom(readableInstant17);
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Minutes minutes21 = minutes19.multipliedBy((-95));
        org.joda.time.Minutes minutes22 = minutes8.minus(minutes21);
        org.joda.time.Minutes minutes23 = minutes21.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes25 = minutes21.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0M" + "'", str9, "PT0M");
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes23);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean8 = seconds6.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds9 = seconds0.plus(seconds6);
        org.joda.time.Seconds seconds11 = seconds9.plus((int) (short) 0);
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = seconds12.minus((int) 'a');
        int int15 = seconds12.size();
        int int16 = seconds12.getSeconds();
        org.joda.time.Seconds seconds17 = seconds9.plus(seconds12);
        org.joda.time.Period period18 = seconds9.toPeriod();
        int int19 = seconds9.size();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.Days days10 = days1.minus(35);
        org.joda.time.Days days12 = days1.plus(14400);
        org.joda.time.DurationFieldType durationFieldType13 = days12.getFieldType();
        org.joda.time.Days days14 = org.joda.time.Days.FIVE;
        java.lang.String str15 = days14.toString();
        boolean boolean16 = days12.isGreaterThan(days14);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = days14.getValue(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P5D" + "'", str15, "P5D");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = seconds1.minus((int) 'a');
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds4.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = seconds9.plus(seconds10);
        java.lang.String str12 = seconds9.toString();
        org.joda.time.DurationFieldType durationFieldType13 = seconds9.getFieldType();
        java.lang.String str14 = durationFieldType13.getName();
        boolean boolean15 = seconds4.isSupported(durationFieldType13);
        int int16 = seconds3.get(durationFieldType13);
        org.joda.time.Chronology chronology17 = null;
        boolean boolean18 = durationFieldType13.isSupported(chronology17);
        int int19 = periodType0.indexOf(durationFieldType13);
        org.joda.time.Chronology chronology20 = null;
        boolean boolean21 = durationFieldType13.isSupported(chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DurationField durationField23 = durationFieldType13.getField(chronology22);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT2S" + "'", str12, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "seconds" + "'", str14, "seconds");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-95) + "'", int16 == (-95));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.PeriodType periodType14 = periodFormatter13.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter15 = periodFormatter13.getPrinter();
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        java.lang.String str17 = days16.toString();
        org.joda.time.Days days19 = days16.multipliedBy((int) (byte) -1);
        org.joda.time.Days days20 = days16.negated();
        org.joda.time.Days days21 = org.joda.time.Days.ONE;
        org.joda.time.Days days22 = org.joda.time.Days.ONE;
        int int23 = days21.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days22);
        org.joda.time.Days days25 = days22.multipliedBy((int) '#');
        org.joda.time.Days days26 = days20.minus(days22);
        org.joda.time.MutablePeriod mutablePeriod27 = days20.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = periodFormatter13.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod27, "PeriodType[YearDay]", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNull(periodPrinter15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P5D" + "'", str17, "P5D");
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Duration duration3 = weeks0.toStandardDuration();
        org.joda.time.PeriodType periodType4 = weeks0.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days5 = weeks0.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 7");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter3.getPrinter();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withSecondsRemoved();
        org.joda.time.Period period13 = duration7.toPeriodFrom(readableInstant8, periodType10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) 1, periodType10, chronology14);
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter3.withParseType(periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = org.joda.time.Period.parse("P-3D", periodFormatter16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodFormatter16);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((-36));
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Duration duration11 = duration1.withDurationAdded(10L, (-36));
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = duration11.toPeriod(chronology13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Days days17 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days19 = days17.multipliedBy((int) (short) 100);
        org.joda.time.Days days20 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType21 = days20.getPeriodType();
        org.joda.time.Days days23 = days20.minus(0);
        org.joda.time.Days days24 = days17.minus(days23);
        org.joda.time.Days days25 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days24);
        org.joda.time.Days days27 = days25.minus((-1));
        org.joda.time.PeriodType periodType28 = days27.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Period period35 = period31.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        boolean boolean37 = periodType28.equals((java.lang.Object) period31);
        org.joda.time.Period period38 = duration11.toPeriodFrom(readableInstant15, periodType28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = period38.minusWeeks((-97));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks1 = weeks0.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks4 = weeks3.negated();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        boolean boolean9 = weeks4.isGreaterThan(weeks7);
        org.joda.time.Weeks weeks11 = weeks7.plus((int) (short) 100);
        org.joda.time.Weeks weeks12 = weeks0.minus(weeks11);
        int int13 = weeks11.getWeeks();
        org.joda.time.Weeks weeks15 = weeks11.dividedBy(10);
        org.joda.time.PeriodType periodType16 = weeks11.getPeriodType();
        org.joda.time.Weeks weeks18 = weeks11.multipliedBy((int) (byte) 0);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(weeks18);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration2 = minutes1.toStandardDuration();
        long long3 = duration2.getStandardSeconds();
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        org.joda.time.Minutes minutes12 = minutes9.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration13 = minutes9.toStandardDuration();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        org.joda.time.Period period21 = duration20.toPeriod();
        boolean boolean22 = duration13.isLongerThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.days();
        org.joda.time.Period period25 = duration13.toPeriodTo(readableInstant23, periodType24);
        org.joda.time.Duration duration26 = duration2.plus((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration27 = duration26.toDuration();
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period30);
        org.joda.time.PeriodType periodType32 = period30.getPeriodType();
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration26, periodType32);
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period45 = period43.minusMonths(0);
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Duration duration47 = minutes46.toStandardDuration();
        boolean boolean48 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = new org.joda.time.Duration(readableInstant49, readableInstant50);
        org.joda.time.Duration duration52 = duration40.minus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Duration duration53 = duration40.toDuration();
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration40, readableInstant54);
        org.joda.time.Period period57 = period55.withHours((int) (byte) -1);
        org.joda.time.Period period58 = period57.negated();
        org.joda.time.Period period61 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period63 = period61.minusMonths(0);
        org.joda.time.Minutes minutes64 = period63.toStandardMinutes();
        org.joda.time.Duration duration65 = minutes64.toStandardDuration();
        org.joda.time.Period period66 = duration65.toPeriod();
        org.joda.time.Period period67 = period66.normalizedStandard();
        org.joda.time.Duration duration68 = period66.toStandardDuration();
        org.joda.time.Period period71 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period73 = period71.minusMonths(0);
        org.joda.time.Minutes minutes74 = period73.toStandardMinutes();
        org.joda.time.Duration duration75 = minutes74.toStandardDuration();
        org.joda.time.Minutes minutes77 = minutes74.multipliedBy((int) (short) 1);
        java.lang.String str78 = minutes77.toString();
        org.joda.time.Duration duration81 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration83 = duration81.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration83, readableInstant84);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.Interval interval87 = duration83.toIntervalFrom(readableInstant86);
        org.joda.time.Minutes minutes88 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval87);
        org.joda.time.Minutes minutes90 = minutes88.multipliedBy((-95));
        org.joda.time.Minutes minutes91 = minutes77.minus(minutes90);
        org.joda.time.Period period92 = period66.minus((org.joda.time.ReadablePeriod) minutes90);
        org.joda.time.DurationFieldType durationFieldType94 = period66.getFieldType(0);
        int int95 = period57.get(durationFieldType94);
        int int96 = periodType32.indexOf(durationFieldType94);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-128849018880L) + "'", long3 == (-128849018880L));
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(minutes64);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(minutes74);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(minutes77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "PT0M" + "'", str78, "PT0M");
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertNotNull(minutes88);
        org.junit.Assert.assertNotNull(minutes90);
        org.junit.Assert.assertNotNull(minutes91);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(durationFieldType94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter2.withLocale(locale18);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Period period25 = period22.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod26 = period25.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = periodFormatter19.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod26, "PT-2147483647H", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(mutablePeriod26);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.withWeeks((-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period1.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period1.plusMonths((-95));
        int int9 = period1.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean4 = days2.isSupported(durationFieldType3);
        boolean boolean5 = days0.isGreaterThan(days2);
        org.joda.time.Days days7 = org.joda.time.Days.parseDays("P0W");
        org.joda.time.Days days8 = days2.plus(days7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = days2.getFieldType(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period17 = duration16.toPeriod();
        boolean boolean18 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.Period period21 = duration9.toPeriodTo(readableInstant19, periodType20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant22);
        long long24 = duration9.getStandardMinutes();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = duration9.toPeriod(chronology25);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardSeconds(11L);
        boolean boolean29 = duration9.isEqual((org.joda.time.ReadableDuration) duration28);
        long long30 = duration28.getStandardSeconds();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 11L + "'", long30 == 11L);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Hours hours3 = org.joda.time.Hours.hoursIn(readableInterval2);
        org.joda.time.Hours hours5 = hours3.multipliedBy(8);
        org.joda.time.Hours hours6 = hours1.plus(hours3);
        org.joda.time.Period period8 = org.joda.time.Period.millis((int) '#');
        int int9 = period8.getYears();
        org.joda.time.Period period11 = period8.multipliedBy((int) (byte) 100);
        org.joda.time.Hours hours12 = period8.toStandardHours();
        int int13 = hours12.size();
        org.joda.time.Hours hours15 = hours12.multipliedBy(10);
        org.joda.time.Hours hours16 = hours1.minus(hours12);
        org.joda.time.PeriodType periodType17 = hours16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        java.lang.String str19 = periodType17.toString();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PeriodType[Hours]" + "'", str19, "PeriodType[Hours]");
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) 87);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withMonthsRemoved();
        java.lang.String str7 = periodType5.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PeriodType[Days]" + "'", str7, "PeriodType[Days]");
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        org.joda.time.Days days8 = duration1.toStandardDays();
        org.joda.time.Days days9 = org.joda.time.Days.MIN_VALUE;
        boolean boolean10 = days8.isLessThan(days9);
        org.joda.time.Period period11 = days9.toPeriod();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 35, (long) (byte) 1);
        org.joda.time.Period period15 = period14.toPeriod();
        org.joda.time.Days days16 = period15.toStandardDays();
        int int17 = days9.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days19 = days9.minus(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -6");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) -1);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isPrinter();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str8 = periodType7.getName();
        org.joda.time.PeriodType periodType9 = periodType7.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter2.withParseType(periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod12 = periodFormatter10.parseMutablePeriod("P-4083Y-3W-2DT-2H-8M");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "YearMonthDay" + "'", str8, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter10);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Period period9 = minutes7.toPeriod();
        org.joda.time.PeriodType periodType10 = minutes7.getPeriodType();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 118, (long) 14405, periodType10, chronology11);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(10);
        int int2 = weeks1.getWeeks();
        org.joda.time.Duration duration3 = weeks1.toStandardDuration();
        org.joda.time.Seconds seconds4 = weeks1.toStandardSeconds();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration19 = duration6.toDuration();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant20);
        org.joda.time.Period period23 = period21.withHours((int) (byte) -1);
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.Period period26 = period23.minusMonths(2);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType29 = periodType28.withMillisRemoved();
        org.joda.time.Period period31 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.months();
        boolean boolean33 = period31.isSupported(durationFieldType32);
        java.lang.String str34 = durationFieldType32.getName();
        int int35 = periodType28.indexOf(durationFieldType32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 35, periodType28, chronology36);
        org.joda.time.Period period38 = period23.withFields((org.joda.time.ReadablePeriod) period37);
        java.lang.Class<?> wildcardClass39 = period37.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "months" + "'", str34, "months");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType7 = period2.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.Days days11 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withSecondsRemoved();
        org.joda.time.PeriodType periodType15 = periodType12.withMinutesRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withWeeksRemoved();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(10L, (long) (byte) -1, periodType16, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) period18, chronology19);
        int[] intArray21 = period20.getValues();
        java.lang.String str22 = period20.toString();
        boolean boolean23 = periodType7.equals((java.lang.Object) period20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = period20.plusYears(268435465);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P0D" + "'", str22, "P0D");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = periodType10.isSupported(durationFieldType11);
        int int13 = period2.get(durationFieldType11);
        int int14 = period2.getDays();
        org.joda.time.Period period16 = period2.plusHours((int) '#');
        org.joda.time.Period period18 = period16.plusDays((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period16.toDurationTo(readableInstant19);
        org.joda.time.Period period21 = period16.toPeriod();
        int int23 = period21.getValue(0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.MutablePeriod mutablePeriod5 = period2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod6 = period2.toMutablePeriod();
        org.joda.time.Period period8 = period2.minusMinutes((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Period period10 = period8.minus(readablePeriod9);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = period10.getFieldType(13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        org.joda.time.Days days1 = org.joda.time.Days.days(1);
        org.joda.time.Days days3 = org.joda.time.Days.days((int) (short) 100);
        boolean boolean4 = days1.isLessThan(days3);
        org.joda.time.Days days6 = days3.plus(7);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period8 = period4.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType9 = period4.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.Period period14 = period12.plus(readablePeriod13);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 0, (-2147483648), 10, (int) (short) -1);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Minutes minutes16 = minutes14.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes17 = minutes8.minus(minutes14);
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Minutes minutes25 = minutes23.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) minutes23, chronology26);
        org.joda.time.Minutes minutes28 = minutes8.minus(minutes23);
        org.joda.time.Duration duration29 = minutes8.toStandardDuration();
        org.joda.time.PeriodType periodType30 = minutes8.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = new org.joda.time.Period(0, (-10), (-5), (int) '#', (int) 'a', 35, (int) (short) -1, (-10), periodType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days3 = days0.minus(0);
        org.joda.time.Days days4 = days3.negated();
        org.joda.time.Duration duration5 = days3.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days7 = days3.multipliedBy((-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 5 * -2147483646");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Minutes minutes16 = minutes13.multipliedBy((int) (short) 1);
        int int17 = minutes16.getMinutes();
        boolean boolean18 = minutes7.isGreaterThan(minutes16);
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Minutes minutes27 = minutes25.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes28 = minutes19.minus(minutes25);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Minutes minutes36 = minutes34.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((java.lang.Object) minutes34, chronology37);
        org.joda.time.Minutes minutes39 = minutes19.minus(minutes34);
        org.joda.time.DurationFieldType durationFieldType41 = minutes39.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType42 = minutes39.getPeriodType();
        boolean boolean43 = minutes16.isGreaterThan(minutes39);
        org.joda.time.DurationFieldType durationFieldType44 = minutes39.getFieldType();
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration49 = duration47.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration49, readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Interval interval53 = duration49.toIntervalFrom(readableInstant52);
        org.joda.time.Minutes minutes54 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval53);
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval53);
        org.joda.time.Minutes minutes56 = minutes55.negated();
        org.joda.time.Minutes minutes58 = minutes56.minus((-97));
        int int59 = minutes58.getMinutes();
        boolean boolean60 = minutes39.isLessThan(minutes58);
        java.lang.Class<?> wildcardClass61 = minutes39.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, (int) ' ', (int) '4', (int) (short) -1, 10, (int) 'a', (-1), (int) '4');
        org.joda.time.Period period10 = period8.minusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration11 = period8.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.plusMinutes(1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = period1.getValue((-53));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) '#');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter2.getPrinter();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Period period18 = period14.minusSeconds((int) (byte) 100);
        org.joda.time.Days days19 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType20 = days19.getPeriodType();
        org.joda.time.PeriodType periodType21 = periodType20.withHoursRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.days();
        boolean boolean24 = periodType22.isSupported(durationFieldType23);
        int int25 = period14.get(durationFieldType23);
        org.joda.time.Period period27 = period14.withHours(1);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearDay();
        boolean boolean29 = period27.equals((java.lang.Object) periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType28);
        org.joda.time.PeriodType periodType31 = periodType28.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter32 = periodFormatter2.withParseType(periodType28);
        java.util.Locale locale33 = periodFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod35 = periodFormatter2.parseMutablePeriod("PeriodType[Seconds]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodFormatter32);
        org.junit.Assert.assertNull(locale33);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(59);
        org.joda.time.Hours hours2 = seconds1.toStandardHours();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Duration duration9 = period7.toStandardDuration();
        int int10 = period7.getDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 6, chronology1);
        org.joda.time.PeriodType periodType3 = period2.getPeriodType();
        org.joda.time.format.PeriodPrinter periodPrinter4 = null;
        org.joda.time.format.PeriodParser periodParser5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = new org.joda.time.format.PeriodFormatter(periodPrinter4, periodParser5);
        org.joda.time.format.PeriodPrinter periodPrinter7 = periodFormatter6.getPrinter();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withSecondsRemoved();
        org.joda.time.Period period16 = duration10.toPeriodFrom(readableInstant11, periodType13);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 1, periodType13, chronology17);
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter6.withParseType(periodType13);
        org.joda.time.Days days20 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType21 = days20.getPeriodType();
        org.joda.time.PeriodType periodType22 = periodType21.withHoursRemoved();
        org.joda.time.PeriodType periodType23 = periodType21.withYearsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter24 = periodFormatter6.withParseType(periodType21);
        org.joda.time.format.PeriodPrinter periodPrinter25 = periodFormatter6.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = period2.toString(periodFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNull(periodPrinter7);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodFormatter24);
        org.junit.Assert.assertNull(periodPrinter25);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        org.joda.time.Hours hours9 = org.joda.time.Hours.ZERO;
        org.joda.time.Duration duration10 = hours9.toStandardDuration();
        org.joda.time.Period period11 = period8.minus((org.joda.time.ReadablePeriod) hours9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = period8.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.DurationFieldType durationFieldType15 = period12.getFieldType((int) (short) 1);
        int int16 = periodType9.indexOf(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) ' ', periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter3.withParseType(periodType9);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType20 = periodType19.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter3.withParseType(periodType20);
        java.util.Locale locale22 = null;
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter21.withLocale(locale22);
        boolean boolean24 = periodFormatter23.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = org.joda.time.Period.parse("PT14400S", periodFormatter23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        org.joda.time.Period period10 = duration6.toPeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.Duration duration21 = duration18.plus((long) (byte) 0);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) duration21, periodType23, chronology24);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Minutes minutes34 = minutes31.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration35 = minutes31.toStandardDuration();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Duration duration42 = minutes41.toStandardDuration();
        org.joda.time.Period period43 = duration42.toPeriod();
        boolean boolean44 = duration35.isLongerThan((org.joda.time.ReadableDuration) duration42);
        boolean boolean45 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration46 = duration6.minus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period53 = period51.minusMonths(0);
        org.joda.time.Minutes minutes54 = period53.toStandardMinutes();
        org.joda.time.Duration duration55 = minutes54.toStandardDuration();
        org.joda.time.Minutes minutes57 = minutes54.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration58 = minutes54.toStandardDuration();
        org.joda.time.Period period61 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period63 = period61.minusMonths(0);
        org.joda.time.Minutes minutes64 = period63.toStandardMinutes();
        org.joda.time.Duration duration65 = minutes64.toStandardDuration();
        org.joda.time.Period period66 = duration65.toPeriod();
        boolean boolean67 = duration58.isLongerThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = duration65.toIntervalTo(readableInstant68);
        boolean boolean70 = duration48.isLongerThan((org.joda.time.ReadableDuration) duration65);
        boolean boolean71 = duration46.isLongerThan((org.joda.time.ReadableDuration) duration48);
        long long72 = duration46.getMillis();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(minutes64);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 100, 120L, chronology2);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration10 = duration7.plus((long) (byte) 0);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Period period12 = duration10.toPeriod();
        int int13 = period12.getHours();
        org.joda.time.Period period15 = period12.minusWeeks(2147483647);
        int int16 = period15.getSeconds();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        org.joda.time.Hours hours4 = hours0.dividedBy((-95));
        org.joda.time.Hours hours6 = hours4.dividedBy((int) '#');
        org.joda.time.Hours hours7 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours8 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours9 = hours7.minus(hours8);
        int int10 = hours8.getHours();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.months();
        boolean boolean12 = hours8.isSupported(durationFieldType11);
        boolean boolean13 = hours6.isGreaterThan(hours8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds4.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds9 = seconds3.plus(seconds4);
        org.joda.time.Duration duration10 = seconds4.toStandardDuration();
        org.joda.time.Duration duration11 = duration1.minus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant12);
        org.joda.time.Period period15 = period13.withMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours16 = period15.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.PeriodType periodType14 = periodFormatter13.getParseType();
        java.util.Locale locale15 = periodFormatter13.getLocale();
        java.util.Locale locale16 = periodFormatter13.getLocale();
        org.joda.time.format.PeriodParser periodParser17 = periodFormatter13.getParser();
        boolean boolean18 = periodFormatter13.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = periodFormatter13.parsePeriod("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNull(periodParser17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period17 = duration16.toPeriod();
        boolean boolean18 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.Period period21 = duration9.toPeriodTo(readableInstant19, periodType20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration9.toPeriodFrom(readableInstant22);
        org.joda.time.Period period24 = period23.negated();
        int int25 = period23.getHours();
        org.joda.time.MutablePeriod mutablePeriod26 = period23.toMutablePeriod();
        org.joda.time.Period period28 = period23.withMillis(2147483647);
        org.joda.time.Period period30 = period23.withSeconds((int) (byte) 100);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter7 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter8 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodParser periodParser9 = periodFormatter2.getParser();
        boolean boolean10 = periodFormatter2.isPrinter();
        boolean boolean11 = periodFormatter2.isPrinter();
        java.util.Locale locale12 = periodFormatter2.getLocale();
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        java.lang.String str14 = days13.toString();
        org.joda.time.Days days16 = days13.multipliedBy((int) (byte) -1);
        org.joda.time.Days days17 = org.joda.time.Days.ZERO;
        boolean boolean18 = days16.isGreaterThan(days17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = periodFormatter2.print((org.joda.time.ReadablePeriod) days17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(periodPrinter7);
        org.junit.Assert.assertNull(periodPrinter8);
        org.junit.Assert.assertNull(periodParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P5D" + "'", str14, "P5D");
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration8 = duration6.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Hours hours10 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType11 = hours10.getFieldType();
        org.joda.time.DurationFieldType durationFieldType12 = hours10.getFieldType();
        int int13 = hours10.getHours();
        org.joda.time.PeriodType periodType14 = hours10.getPeriodType();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant9, periodType14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period18 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period19 = period18.toPeriod();
        org.joda.time.Period period21 = period18.withWeeks((-1));
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period18.toDurationFrom(readableInstant22);
        org.joda.time.Period period25 = period18.plusMonths((-95));
        org.joda.time.Period period27 = org.joda.time.Period.days(10);
        org.joda.time.Period period29 = period27.minusWeeks((int) (short) 1);
        org.joda.time.Period period30 = period25.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.PeriodType periodType31 = period25.getPeriodType();
        org.joda.time.Period period32 = duration6.toPeriodFrom(readableInstant16, periodType31);
        org.joda.time.PeriodType periodType33 = periodType31.withDaysRemoved();
        java.lang.String str34 = periodType33.getName();
        org.joda.time.Period period35 = new org.joda.time.Period((long) 0, (-128849018880000L), periodType33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period36 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "StandardNoDays" + "'", str34, "StandardNoDays");
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours1 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Hours hours4 = hours1.minus((-10));
        org.joda.time.PeriodType periodType5 = hours1.getPeriodType();
        int int6 = hours1.getHours();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withSecondsRemoved();
        org.joda.time.Period period7 = new org.joda.time.Period((long) 35, (-1L), periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period7.minusHours((-14400));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days8);
        org.joda.time.Days days11 = days9.plus(1);
        int int12 = days9.size();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT52S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Duration duration4 = days1.toStandardDuration();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        java.lang.String str6 = days5.toString();
        org.joda.time.Days days8 = days5.multipliedBy((int) (byte) -1);
        org.joda.time.Days days9 = days5.negated();
        org.joda.time.Duration duration10 = days5.toStandardDuration();
        org.joda.time.Days days11 = duration10.toStandardDays();
        org.joda.time.Days days13 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days15 = days13.multipliedBy((int) (short) 100);
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.Days days19 = days16.minus(0);
        org.joda.time.Days days20 = days13.minus(days19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableDuration22);
        org.joda.time.Period period25 = period23.minusYears(0);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Days days27 = days19.plus(days26);
        org.joda.time.Days days28 = days11.plus(days27);
        boolean boolean29 = days1.isLessThan(days11);
        org.joda.time.Days days31 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days33 = days31.multipliedBy((int) (short) 100);
        org.joda.time.Days days34 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType35 = days34.getPeriodType();
        org.joda.time.Days days37 = days34.minus(0);
        org.joda.time.Days days38 = days31.minus(days37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant39, readableDuration40);
        org.joda.time.Period period43 = period41.minusYears(0);
        org.joda.time.Days days44 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Days days45 = days37.plus(days44);
        org.joda.time.Days days47 = days44.multipliedBy(1);
        org.joda.time.Days days49 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days51 = days49.multipliedBy((int) (short) 100);
        org.joda.time.Days days52 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType53 = days52.getPeriodType();
        org.joda.time.Days days55 = days52.minus(0);
        org.joda.time.Days days56 = days49.minus(days55);
        java.lang.String str57 = days56.toString();
        org.joda.time.DurationFieldType durationFieldType58 = days56.getFieldType();
        org.joda.time.Days days60 = days56.plus(14400);
        boolean boolean61 = days47.isGreaterThan(days56);
        org.joda.time.Days days62 = org.joda.time.Days.FIVE;
        java.lang.String str63 = days62.toString();
        org.joda.time.Days days65 = days62.multipliedBy((int) (byte) -1);
        org.joda.time.Days days66 = days62.negated();
        org.joda.time.Days days67 = org.joda.time.Days.ONE;
        org.joda.time.Days days68 = org.joda.time.Days.ONE;
        int int69 = days67.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days68);
        org.joda.time.Days days71 = days68.multipliedBy((int) '#');
        org.joda.time.Days days72 = days66.minus(days68);
        org.joda.time.Duration duration75 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration77 = duration75.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration77, readableInstant78);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.Interval interval81 = duration77.toIntervalFrom(readableInstant80);
        org.joda.time.Days days82 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval81);
        org.joda.time.Days days84 = days82.minus((int) '4');
        org.joda.time.Days days86 = days82.minus((int) 'a');
        org.joda.time.Days days87 = days68.plus(days86);
        org.joda.time.PeriodType periodType88 = days86.getPeriodType();
        org.joda.time.Days days89 = days47.plus(days86);
        boolean boolean90 = days1.isGreaterThan(days47);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P5D" + "'", str6, "P5D");
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "P0D" + "'", str57, "P0D");
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertNotNull(days60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(days62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "P5D" + "'", str63, "P5D");
        org.junit.Assert.assertNotNull(days65);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertNotNull(days67);
        org.junit.Assert.assertNotNull(days68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(days71);
        org.junit.Assert.assertNotNull(days72);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(days82);
        org.junit.Assert.assertNotNull(days84);
        org.junit.Assert.assertNotNull(days86);
        org.junit.Assert.assertNotNull(days87);
        org.junit.Assert.assertNotNull(periodType88);
        org.junit.Assert.assertNotNull(days89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration12 = minutes8.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Duration duration19 = minutes18.toStandardDuration();
        org.joda.time.Period period20 = duration19.toPeriod();
        boolean boolean21 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = duration19.toIntervalTo(readableInstant22);
        boolean boolean24 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) duration19, chronology25);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration19, periodType27);
        int int29 = periodType27.size();
        org.joda.time.PeriodType periodType30 = periodType27.withMinutesRemoved();
        int int31 = periodType30.size();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        boolean boolean15 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(readableInstant16, readableInstant17);
        org.joda.time.Duration duration19 = duration7.minus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant20);
        org.joda.time.Duration duration23 = duration7.plus((long) 8);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Minutes minutes34 = minutes31.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration35 = minutes31.toStandardDuration();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Duration duration42 = minutes41.toStandardDuration();
        org.joda.time.Period period43 = duration42.toPeriod();
        boolean boolean44 = duration35.isLongerThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        boolean boolean47 = duration25.isLongerThan((org.joda.time.ReadableDuration) duration42);
        int int48 = duration7.compareTo((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes52 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period51);
        org.joda.time.PeriodType periodType53 = period51.getPeriodType();
        org.joda.time.Period period54 = duration25.toPeriod(periodType53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.Minutes minutes56 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period59 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period61 = period59.minusMonths(0);
        org.joda.time.Minutes minutes62 = period61.toStandardMinutes();
        org.joda.time.Minutes minutes64 = minutes62.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes65 = minutes56.minus(minutes62);
        org.joda.time.Period period68 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period70 = period68.minusMonths(0);
        org.joda.time.Minutes minutes71 = period70.toStandardMinutes();
        org.joda.time.Minutes minutes73 = minutes71.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((java.lang.Object) minutes71, chronology74);
        org.joda.time.Minutes minutes76 = minutes56.minus(minutes71);
        org.joda.time.Duration duration77 = minutes56.toStandardDuration();
        org.joda.time.PeriodType periodType78 = minutes56.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period79 = period55.withPeriodType(periodType78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(minutes64);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertNotNull(minutes73);
        org.junit.Assert.assertNotNull(minutes76);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(periodType78);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter2.withLocale(locale18);
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter2.withLocale(locale20);
        org.joda.time.PeriodType periodType22 = periodFormatter2.getParseType();
        org.joda.time.PeriodType periodType23 = periodFormatter2.getParseType();
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeks(35);
        org.joda.time.Weeks weeks27 = weeks25.multipliedBy(5);
        org.joda.time.MutablePeriod mutablePeriod28 = weeks27.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod28, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNull(periodType22);
        org.junit.Assert.assertNull(periodType23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(mutablePeriod28);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Duration duration11 = duration1.withDurationAdded(10L, (-36));
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = duration11.toPeriod(chronology13);
        java.lang.String str15 = period14.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT1M39.640S" + "'", str15, "PT1M39.640S");
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        boolean boolean8 = periodFormatter7.isPrinter();
        boolean boolean9 = periodFormatter7.isParser();
        org.joda.time.format.PeriodParser periodParser10 = periodFormatter7.getParser();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Period period17 = period13.withMillis((int) (short) 0);
        int int18 = period17.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod19 = period17.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = periodFormatter7.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod19, "PT-2M", 56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(periodParser10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod19);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        boolean boolean8 = periodFormatter7.isPrinter();
        boolean boolean9 = periodFormatter7.isParser();
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter7.withLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = periodFormatter11.parsePeriod("PT2147483647H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodFormatter11);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks8 = null;
        org.joda.time.Weeks weeks9 = weeks5.minus(weeks8);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration14 = duration12.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalFrom(readableInstant17);
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval18);
        int int21 = weeks20.getWeeks();
        org.joda.time.Weeks weeks22 = weeks5.plus(weeks20);
        int int23 = weeks20.getWeeks();
        org.joda.time.DurationFieldType durationFieldType24 = weeks20.getFieldType();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(durationFieldType24);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) '4');
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) days1, chronology2);
        int int4 = days1.getDays();
        org.joda.time.PeriodType periodType5 = days1.getPeriodType();
        java.lang.String str6 = periodType5.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Days]" + "'", str6, "PeriodType[Days]");
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-2147483596));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        java.lang.String str5 = seconds0.toString();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.multipliedBy(10);
        org.joda.time.Duration duration9 = seconds6.toStandardDuration();
        boolean boolean10 = seconds0.isLessThan(seconds6);
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds13 = seconds11.plus(seconds12);
        org.joda.time.PeriodType periodType14 = seconds11.getPeriodType();
        int int15 = seconds11.size();
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean19 = seconds17.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds20 = seconds11.plus(seconds17);
        org.joda.time.Seconds seconds22 = seconds20.plus((int) (short) 0);
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = seconds23.minus((int) 'a');
        int int26 = seconds23.size();
        int int27 = seconds23.getSeconds();
        org.joda.time.Seconds seconds28 = seconds20.plus(seconds23);
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds31 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds33 = seconds31.plus(seconds32);
        org.joda.time.Seconds seconds35 = seconds31.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds36 = seconds30.plus(seconds31);
        org.joda.time.Seconds seconds38 = seconds30.plus((int) '4');
        org.joda.time.Duration duration39 = seconds38.toStandardDuration();
        org.joda.time.Seconds seconds41 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds42 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds44 = seconds42.plus(seconds43);
        org.joda.time.Seconds seconds46 = seconds42.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds47 = seconds41.plus(seconds42);
        org.joda.time.Seconds seconds49 = seconds41.plus((int) '4');
        org.joda.time.Duration duration50 = seconds49.toStandardDuration();
        boolean boolean51 = seconds38.isLessThan(seconds49);
        org.joda.time.Seconds seconds52 = seconds38.negated();
        org.joda.time.Seconds seconds53 = seconds28.plus(seconds52);
        org.joda.time.Seconds seconds54 = seconds6.minus(seconds53);
        org.joda.time.Seconds seconds56 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds57 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds58 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds59 = seconds57.plus(seconds58);
        org.joda.time.Seconds seconds61 = seconds57.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds62 = seconds56.plus(seconds57);
        org.joda.time.Seconds seconds64 = seconds57.multipliedBy((int) (short) 1);
        org.joda.time.Seconds seconds65 = seconds54.plus(seconds64);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT2S" + "'", str5, "PT2S");
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(seconds47);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertNotNull(seconds61);
        org.junit.Assert.assertNotNull(seconds62);
        org.junit.Assert.assertNotNull(seconds64);
        org.junit.Assert.assertNotNull(seconds65);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        boolean boolean3 = weeks0.isLessThan(weeks2);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks6 = weeks4.dividedBy(1);
        boolean boolean7 = weeks0.isGreaterThan(weeks6);
        java.lang.String str8 = weeks0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = weeks0.getFieldType(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P2147483647W" + "'", str8, "P2147483647W");
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        org.joda.time.Period period14 = duration13.toPeriod();
        org.joda.time.Period period16 = period14.plusDays(2);
        org.joda.time.format.PeriodPrinter periodPrinter17 = null;
        org.joda.time.format.PeriodParser periodParser18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = new org.joda.time.format.PeriodFormatter(periodPrinter17, periodParser18);
        boolean boolean20 = periodFormatter19.isParser();
        org.joda.time.Days days21 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType22 = days21.getPeriodType();
        org.joda.time.PeriodType periodType23 = periodType22.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter24 = periodFormatter19.withParseType(periodType22);
        org.joda.time.PeriodType periodType25 = periodFormatter19.getParseType();
        org.joda.time.PeriodType periodType26 = periodFormatter19.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = period16.toString(periodFormatter19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodFormatter24);
        org.junit.Assert.assertNull(periodType25);
        org.junit.Assert.assertNull(periodType26);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PeriodType[StandardNoMinutes]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[StandardNoMinutes]\" is malformed at \"eriodType[StandardNoMinutes]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        int int1 = hours0.getHours();
        org.joda.time.Hours hours2 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours3 = hours0.minus(hours2);
        int int4 = hours3.size();
        org.joda.time.Hours hours6 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours7 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours9 = hours7.multipliedBy((int) 'a');
        boolean boolean10 = hours6.isGreaterThan(hours7);
        org.joda.time.Hours hours12 = hours6.plus((int) 'a');
        org.joda.time.Hours hours14 = hours12.minus(13);
        boolean boolean15 = hours3.isLessThan(hours14);
        java.lang.String str16 = hours14.toString();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT184H" + "'", str16, "PT184H");
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        java.lang.String str7 = period4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days8 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P-100M10D");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P-100M10D" + "'", str7, "P-100M10D");
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("P0D");
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getMillis();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant9);
        long long11 = duration1.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100000L + "'", long8 == 100000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100000L + "'", long11 == 100000L);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration3 = new org.joda.time.Duration((long) 35, (long) 35);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        int int6 = period4.getValue((int) (short) 0);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType11 = periodType8.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withMonthsRemoved();
        org.joda.time.Chronology chronology14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) int6, periodType13, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        org.joda.time.Minutes minutes17 = minutes14.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration18 = minutes14.toStandardDuration();
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period21.negated();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        boolean boolean25 = duration18.isShorterThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration29 = duration24.plus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Duration duration31 = duration28.withMillis(100L);
        java.lang.String str32 = duration31.toString();
        java.lang.String str33 = duration31.toString();
        java.lang.String str34 = duration31.toString();
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period46 = period44.minusMonths(0);
        org.joda.time.Minutes minutes47 = period46.toStandardMinutes();
        org.joda.time.Duration duration48 = minutes47.toStandardDuration();
        boolean boolean49 = duration41.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration51 = duration41.plus((long) (short) 10);
        org.joda.time.Period period52 = duration41.toPeriod();
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period58 = period56.minusMonths(0);
        org.joda.time.Minutes minutes59 = period58.toStandardMinutes();
        org.joda.time.Duration duration60 = minutes59.toStandardDuration();
        org.joda.time.Period period61 = duration60.toPeriod();
        org.joda.time.Duration duration63 = duration60.plus((long) (byte) 0);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant53, (org.joda.time.ReadableDuration) duration63);
        org.joda.time.Period period65 = duration63.toPeriod();
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.days();
        org.joda.time.Period period67 = duration63.toPeriod(periodType66);
        boolean boolean68 = duration41.isShorterThan((org.joda.time.ReadableDuration) duration63);
        java.lang.String str69 = duration63.toString();
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Period period71 = duration63.toPeriodTo(readableInstant70);
        org.joda.time.Duration duration72 = duration31.minus((org.joda.time.ReadableDuration) duration63);
        boolean boolean73 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration63);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT0.100S" + "'", str32, "PT0.100S");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT0.100S" + "'", str33, "PT0.100S");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT0.100S" + "'", str34, "PT0.100S");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PT0S" + "'", str69, "PT0S");
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Period period25 = period21.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType26 = period21.getPeriodType();
        org.joda.time.PeriodType periodType27 = periodType26.withMinutesRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withHoursRemoved();
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (-1), periodType27, chronology30);
        org.joda.time.Period period32 = new org.joda.time.Period((int) '#', (int) (short) 10, 14400, 2, (int) (short) 1, 0, (int) (short) 1, (int) ' ', periodType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = new org.joda.time.Period(87, 14400, 999, (int) (short) 0, 999, (int) 'a', 2147483645, 5, periodType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Period period13 = period9.minusSeconds((int) (byte) 100);
        org.joda.time.Days days14 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.days();
        boolean boolean19 = periodType17.isSupported(durationFieldType18);
        int int20 = period9.get(durationFieldType18);
        org.joda.time.Period period22 = period9.withHours(1);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Period period29 = period25.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType30 = period25.getPeriodType();
        org.joda.time.PeriodType periodType31 = periodType30.withMinutesRemoved();
        java.lang.String str32 = periodType31.toString();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) period9, periodType31, chronology33);
        org.joda.time.PeriodType periodType35 = periodType31.withHoursRemoved();
        org.joda.time.PeriodType periodType36 = periodType31.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period37 = period6.withPeriodType(periodType36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str32, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.multipliedBy((int) (byte) -1);
        org.joda.time.Days days4 = days0.negated();
        org.joda.time.Duration duration5 = days0.toStandardDuration();
        org.joda.time.Days days6 = duration5.toStandardDays();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = duration5.toPeriod(chronology7);
        org.joda.time.Period period10 = period8.minusYears(87);
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = seconds12.plus(seconds13);
        org.joda.time.PeriodType periodType15 = seconds12.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period18.negated();
        org.joda.time.DurationFieldType durationFieldType21 = period18.getFieldType((int) (short) 1);
        int int22 = periodType15.indexOf(durationFieldType21);
        org.joda.time.Period period23 = new org.joda.time.Period((long) ' ', periodType15);
        org.joda.time.PeriodType periodType24 = periodType15.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = period10.normalizedStandard(periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        org.joda.time.Period period9 = period6.negated();
        org.joda.time.Period period11 = period6.minusMillis((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = period6.getFieldTypes();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period16 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType15);
        int int17 = period16.getSeconds();
        org.joda.time.PeriodType periodType18 = period16.getPeriodType();
        boolean boolean19 = period6.equals((java.lang.Object) period16);
        org.joda.time.Days days20 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType21 = days20.getPeriodType();
        org.joda.time.PeriodType periodType22 = periodType21.withWeeksRemoved();
        java.lang.String str23 = periodType21.getName();
        int int24 = periodType21.size();
        org.joda.time.PeriodType periodType25 = periodType21.withMinutesRemoved();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.PeriodType periodType27 = periodType25.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = period6.withPeriodType(periodType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Days" + "'", str23, "Days");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        boolean boolean3 = weeks0.isGreaterThan(weeks2);
        org.joda.time.DurationFieldType durationFieldType4 = weeks2.getFieldType();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        org.joda.time.Weeks weeks10 = weeks7.multipliedBy(10);
        org.joda.time.Weeks weeks11 = weeks2.minus(weeks7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = weeks7.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks11);
    }
}

