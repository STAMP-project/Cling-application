import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = days0.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ONE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = seconds0.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = period2.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = minutes5.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration5 = new org.joda.time.Duration((java.lang.Object) periodType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ONE;
        org.joda.time.Hours hours1 = seconds0.toStandardHours();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P5D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P5D\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = seconds2.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        int int8 = period7.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period7.plusMillis((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Days days7 = minutes5.toStandardDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) 0, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds2 = org.joda.time.Seconds.secondsBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = period21.withMonths(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
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
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = org.joda.time.Hours.hoursBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds2 = org.joda.time.Seconds.secondsBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT1H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration3, readableInstant4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = periodFormatter2.print((org.joda.time.ReadablePeriod) period5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = weeks0.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 7");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        java.lang.Class<?> wildcardClass3 = periodType2.getClass();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Days days1 = hours0.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours3 = hours0.plus(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 10");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutesBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = periodFormatter2.print((org.joda.time.ReadablePeriod) period7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Period period8 = period5.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod9, "YearMonthDay", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Days days1 = seconds0.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = days1.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.fieldDifference(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        org.joda.time.Days days1 = weeks0.toStandardDays();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.days();
        boolean boolean5 = periodType3.isSupported(durationFieldType4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration6 = new org.joda.time.Duration((java.lang.Object) durationFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        boolean boolean3 = weeks0.isLessThan(weeks2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes4 = weeks0.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 10080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = minutes0.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.SEVEN;
        org.joda.time.Minutes minutes5 = days4.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = periodFormatter2.print((org.joda.time.ReadablePeriod) minutes5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Period period8 = period2.plusWeeks((-1));
        int int9 = period8.size();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks4 = weeks0.plus((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Days days1 = org.joda.time.Days.SEVEN;
        org.joda.time.Minutes minutes2 = days1.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes3 = minutes0.minus(minutes2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -10080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        int int2 = weeks1.getWeeks();
        org.joda.time.Minutes minutes3 = weeks1.toStandardMinutes();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(minutes3);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("YearMonthDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.plus(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes4 = minutes2.minus(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483647 + -10");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
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
        java.io.Writer writer18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Period period27 = duration26.toPeriod();
        org.joda.time.Duration duration29 = duration26.plus((long) (byte) 0);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration29);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer18, (org.joda.time.ReadablePeriod) period30);
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
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = org.joda.time.Hours.hoursBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SIX;
        org.joda.time.Seconds seconds1 = hours0.toStandardSeconds();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        int int5 = period4.getYears();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.Period period8 = period6.plusMinutes(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = period8.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean4 = weeks2.isGreaterThan(weeks3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = weeks3.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
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
        java.io.Writer writer18 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        boolean boolean33 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, readableInstant34);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer18, (org.joda.time.ReadablePeriod) period35);
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
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT1H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Hours hours6 = minutes5.toStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(hours6);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = org.joda.time.Days.daysBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT2S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod19 = periodFormatter2.parseMutablePeriod("minutes");
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
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutesBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
        org.joda.time.Period period2 = hours1.toPeriod();
        org.joda.time.format.PeriodPrinter periodPrinter3 = null;
        org.joda.time.format.PeriodParser periodParser4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = new org.joda.time.format.PeriodFormatter(periodPrinter3, periodParser4);
        boolean boolean6 = periodFormatter5.isParser();
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds10 = seconds8.plus(seconds9);
        org.joda.time.PeriodType periodType11 = seconds8.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period14.negated();
        org.joda.time.DurationFieldType durationFieldType17 = period14.getFieldType((int) (short) 1);
        int int18 = periodType11.indexOf(durationFieldType17);
        org.joda.time.Period period19 = new org.joda.time.Period((long) ' ', periodType11);
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter5.withParseType(periodType11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = period2.toString(periodFormatter20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter20);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        int int2 = weeks1.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks4 = weeks1.dividedBy((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Hours hours2 = weeks1.toStandardHours();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        long long10 = duration9.getStandardDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = org.joda.time.Days.daysBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.Hours hours0 = org.joda.time.Hours.TWO;
        org.joda.time.Minutes minutes1 = hours0.toStandardMinutes();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        java.io.Writer writer8 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Period period15 = period13.minusSeconds(0);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.minutes();
        int int17 = period13.get(durationFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter7.printTo(writer8, (org.joda.time.ReadablePeriod) period13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = periodType4.getFieldType((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Weeks weeks7 = days6.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = periodFormatter5.print((org.joda.time.ReadablePeriod) days6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(weeks7);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
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
        boolean boolean18 = periodFormatter2.isPrinter();
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        org.joda.time.MutablePeriod mutablePeriod20 = seconds19.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod20, "P-100M10D", (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
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
        java.io.Writer writer18 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Period period25 = period23.minusSeconds(0);
        org.joda.time.Period period26 = period25.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer18, (org.joda.time.ReadablePeriod) period26);
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
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.multipliedBy((int) 'a');
        java.lang.Class<?> wildcardClass3 = hours0.getClass();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.io.Writer writer6 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Minutes minutes14 = minutes12.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) minutes12, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer6, (org.joda.time.ReadablePeriod) minutes12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes14);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours7 = period4.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = periodFormatter2.print(readablePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = minutes5.toPeriod();
        org.joda.time.Hours hours8 = minutes5.toStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration9 = new org.joda.time.Duration((java.lang.Object) minutes5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Minutes");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(hours8);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        boolean boolean8 = periodFormatter7.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = periodFormatter7.parseMutablePeriod("PeriodType[Days]");
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
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Minutes minutes1 = hours0.toStandardMinutes();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("years");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"years\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("P5D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds4 = seconds1.plus((int) (byte) 0);
        org.joda.time.Seconds seconds6 = seconds4.minus((int) (byte) -1);
        java.lang.String str7 = seconds4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = seconds4.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT2S" + "'", str7, "PT2S");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = new org.joda.time.Period(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
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
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = periodFormatter7.print((org.joda.time.ReadablePeriod) period13);
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
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.MutablePeriod mutablePeriod7 = seconds6.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = periodFormatter5.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod7, "P0W", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = periodFormatter7.parsePeriod("years");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = period5.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDayTime();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.PeriodType periodType1 = seconds0.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration2 = new org.joda.time.Duration((java.lang.Object) seconds0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Seconds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Days days2 = weeks1.toStandardDays();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.ONE;
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = days4.isSupported(durationFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer3, (org.joda.time.ReadablePeriod) days4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
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
        long long19 = duration17.getStandardMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        org.joda.time.Seconds seconds2 = weeks0.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = seconds2.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        java.io.Writer writer4 = null;
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer4, (org.joda.time.ReadablePeriod) period10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = periodFormatter13.parsePeriod("YearMonthDay");
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
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, (int) ' ', (int) '4', (int) (short) -1, 10, (int) 'a', (-1), (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = period2.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
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
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        int int8 = period7.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period7.plusSeconds((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
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
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        java.lang.String str13 = days12.toString();
        org.joda.time.Days days15 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days16 = days12.minus(days15);
        org.joda.time.Days days18 = days15.minus((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter7.printTo(stringBuffer11, (org.joda.time.ReadablePeriod) days18);
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
        org.junit.Assert.assertNull(periodParser10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P5D" + "'", str13, "P5D");
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days18);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("P-100M10D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 10);
        org.joda.time.format.PeriodPrinter periodPrinter2 = null;
        org.joda.time.format.PeriodParser periodParser3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = new org.joda.time.format.PeriodFormatter(periodPrinter2, periodParser3);
        boolean boolean5 = periodFormatter4.isParser();
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter4.withParseType(periodType7);
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.PeriodType periodType12 = periodType11.withSecondsRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withYearsRemoved();
        java.lang.String str14 = periodType13.toString();
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter9.withParseType(periodType13);
        org.joda.time.PeriodType periodType16 = periodFormatter15.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = period1.toString(periodFormatter15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PeriodType[Days]" + "'", str14, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds7 = seconds4.plus((int) (byte) 0);
        org.joda.time.Seconds seconds9 = seconds7.minus((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.months();
        int int11 = seconds7.get(durationFieldType10);
        boolean boolean12 = period2.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = new org.joda.time.DurationFieldType[] { durationFieldType10, durationFieldType13 };
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.forFields(durationFieldTypeArray14);
        org.joda.time.Chronology chronology16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) periodType15, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(durationFieldTypeArray14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = periodFormatter2.getParseType();
        org.joda.time.Period period10 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period11 = period10.toPeriod();
        org.joda.time.Period period13 = period10.plusMinutes(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = periodFormatter2.print((org.joda.time.ReadablePeriod) period13);
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
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours3 = hours0.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        boolean boolean3 = period1.isSupported(durationFieldType2);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType8 = periodType5.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period1.withPeriodType(periodType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        int int2 = weeks1.getWeeks();
        org.joda.time.Days days3 = weeks1.toStandardDays();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Period period7 = period5.minusSeconds(0);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.minutes();
        int int9 = period5.get(durationFieldType8);
        org.joda.time.PeriodType periodType10 = period5.getPeriodType();
        org.joda.time.Chronology chronology11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) (byte) 1, periodType10, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Hours hours2 = hours0.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds3 = hours0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 3600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT1H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT1H\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period2 = new org.joda.time.Period((-128849018880L), periodType1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = period2.withYears((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withMillisRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period8 = period4.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType9 = period4.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) periodType1, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = period20.withMinutes((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        org.joda.time.Days days3 = hours0.toStandardDays();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getMillis();
        long long9 = duration1.getStandardSeconds();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Period period16 = period12.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType17 = period12.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withMinutesRemoved();
        org.joda.time.Chronology chronology19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) long9, periodType17, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100000L + "'", long8 == 100000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT-128849018880S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT-128849018880S\" is malformed at \"-128849018880S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        int int4 = hours3.getHours();
        org.joda.time.MutablePeriod mutablePeriod5 = hours3.toMutablePeriod();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) hours3);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(minutes6);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Weeks weeks3 = weeks1.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks4 = null;
        org.joda.time.Weeks weeks5 = weeks3.minus(weeks4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks3, chronology6);
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period7.minusMillis((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT2S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        org.joda.time.Period period4 = new org.joda.time.Period();
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod5, "PT6H", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
        org.junit.Assert.assertNotNull(mutablePeriod5);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.Days days4 = weeks0.toStandardDays();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = periodType2.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        java.lang.String str13 = periodType12.toString();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter8.withParseType(periodType12);
        org.joda.time.PeriodType periodType15 = periodFormatter14.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = org.joda.time.Period.parse("YearMonthDay", periodFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PeriodType[Days]" + "'", str13, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Seconds seconds2 = days0.toStandardSeconds();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        org.joda.time.Duration duration11 = duration6.withMillis((long) 1);
        long long12 = duration11.getStandardSeconds();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.Days days8 = days5.plus((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer4, (org.joda.time.ReadablePeriod) days5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(days8);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Period period4 = new org.joda.time.Period();
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod5, "PT1H", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(mutablePeriod5);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = org.joda.time.Period.parse("PT0H", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks(1);
        boolean boolean4 = weeks1.isGreaterThan(weeks3);
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks6 = weeks1.plus(weeks5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -10 + -2147483648");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("years");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"years\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.Period period1 = org.joda.time.Period.years((-10));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PeriodType[StandardNoMinutes]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[StandardNoMinutes]\" is malformed at \"eriodType[StandardNoMinutes]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period7.minusMonths(0);
        org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
        org.joda.time.Minutes minutes12 = minutes10.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes13 = minutes4.minus(minutes10);
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        org.joda.time.Minutes minutes22 = minutes19.multipliedBy((int) (short) 1);
        int int23 = minutes4.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = period3.plus((org.joda.time.ReadablePeriod) minutes4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PeriodType[Standard]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Standard]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = seconds1.plus(seconds2);
        org.joda.time.PeriodType periodType4 = seconds1.getPeriodType();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.DurationFieldType durationFieldType10 = period7.getFieldType((int) (short) 1);
        int int11 = periodType4.indexOf(durationFieldType10);
        org.joda.time.Period period12 = new org.joda.time.Period((long) ' ', periodType4);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period15.negated();
        int int17 = period15.getHours();
        org.joda.time.MutablePeriod mutablePeriod18 = period15.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod19 = period15.toMutablePeriod();
        org.joda.time.Period period21 = period15.minusMinutes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = period12.plus((org.joda.time.ReadablePeriod) period21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        org.joda.time.Seconds seconds6 = seconds0.multipliedBy(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = seconds6.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds6);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.seconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) ' ');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withSecondsRemoved();
        org.joda.time.Period period8 = duration2.toPeriodFrom(readableInstant3, periodType5);
        long long9 = duration2.getMillis();
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withMinutesRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withWeeksRemoved();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(10L, (long) (byte) -1, periodType17, chronology18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2, periodType17);
        org.joda.time.Chronology chronology21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) periodType17, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100000L + "'", long9 == 100000L);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period2 = new org.joda.time.Period((-128849018880L), periodType1);
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period((java.lang.Object) periodType1, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = days0.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 1440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMillisRemoved();
        org.joda.time.Period period10 = duration1.toPeriodFrom(readableInstant5, periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = periodType8.getFieldType(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2147483647");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.Weeks weeks1 = hours0.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = weeks1.getValue((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -36");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getMillis();
        org.joda.time.Period period9 = duration1.toPeriod();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Period period16 = period12.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType17 = period12.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withMinutesRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = period9.withPeriodType(periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100000L + "'", long8 == 100000L);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Period period13 = period9.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withMinutesRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType15);
        org.joda.time.Days days18 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType19 = days18.getPeriodType();
        java.lang.String str20 = periodType19.getName();
        org.joda.time.Period period21 = period17.withPeriodType(periodType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = period4.normalizedStandard(periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Days" + "'", str20, "Days");
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType2 = hours1.getFieldType();
        org.joda.time.Hours hours3 = hours1.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours4 = hours0.plus(hours1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str2 = seconds1.toString();
        org.joda.time.DurationFieldType durationFieldType3 = seconds1.getFieldType();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) seconds1);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Duration duration3 = weeks0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days4 = weeks0.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 7");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("P10D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
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
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period23.toDurationFrom(readableInstant25);
        int int27 = period23.getYears();
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
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Weeks weeks1 = minutes0.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes3 = minutes0.plus((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 97");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Days days1 = seconds0.toStandardDays();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Period period7 = period3.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType8 = period3.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) -1, periodType10, chronology11);
        org.joda.time.format.PeriodPrinter periodPrinter13 = null;
        org.joda.time.format.PeriodParser periodParser14 = null;
        org.joda.time.format.PeriodFormatter periodFormatter15 = new org.joda.time.format.PeriodFormatter(periodPrinter13, periodParser14);
        boolean boolean16 = periodFormatter15.isParser();
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds20 = seconds18.plus(seconds19);
        org.joda.time.PeriodType periodType21 = seconds18.getPeriodType();
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period24.negated();
        org.joda.time.DurationFieldType durationFieldType27 = period24.getFieldType((int) (short) 1);
        int int28 = periodType21.indexOf(durationFieldType27);
        org.joda.time.Period period29 = new org.joda.time.Period((long) ' ', periodType21);
        org.joda.time.format.PeriodFormatter periodFormatter30 = periodFormatter15.withParseType(periodType21);
        org.joda.time.PeriodType periodType31 = periodType21.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = period12.withPeriodType(periodType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter30);
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P35M");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
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
        long long52 = duration49.getMillis();
        org.joda.time.Chronology chronology53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period54 = new org.joda.time.Period((java.lang.Object) long52, chronology53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-128849018880000L) + "'", long52 == (-128849018880000L));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType8);
        java.lang.Class<?> wildcardClass10 = periodType8.getClass();
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("minutes", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
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
            org.joda.time.Period period18 = period12.withMinutes((int) (short) 100);
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
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Period period3 = period1.withYears(8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds21 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P1MT35H0.036S");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
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
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        java.lang.String str6 = period2.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.036S" + "'", str6, "PT0.036S");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-10));
        org.joda.time.Hours hours2 = org.joda.time.Hours.MIN_VALUE;
        boolean boolean3 = hours1.isLessThan(hours2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours5 = hours2.minus(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT0.036S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter3.getPrinter();
        boolean boolean5 = periodFormatter3.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = org.joda.time.Period.parse("years", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Period period16 = period12.minusSeconds((int) (byte) 100);
        org.joda.time.Days days17 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        org.joda.time.PeriodType periodType20 = periodType18.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.days();
        boolean boolean22 = periodType20.isSupported(durationFieldType21);
        int int23 = period12.get(durationFieldType21);
        org.joda.time.Period period25 = period12.withHours(1);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearDay();
        boolean boolean27 = period25.equals((java.lang.Object) periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = new org.joda.time.Period(7, 3, (int) (short) 100, (int) 'a', 1, 3, 8, (-36), periodType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(0);
        org.joda.time.Hours hours2 = seconds1.toStandardHours();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
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
            org.joda.time.Period period10 = periodFormatter2.parsePeriod("YearMonthDay");
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
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        org.joda.time.Period period3 = period1.withWeeks((int) (byte) 0);
        org.joda.time.Period period5 = period1.plusSeconds((int) '4');
        org.joda.time.Period period7 = period1.withWeeks((-10));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.plus(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds3 = minutes0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = periodFormatter7.parsePeriod("P0D");
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
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period7 = period6.normalizedStandard();
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.format.PeriodPrinter periodPrinter9 = null;
        org.joda.time.format.PeriodParser periodParser10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = new org.joda.time.format.PeriodFormatter(periodPrinter9, periodParser10);
        boolean boolean12 = periodFormatter11.isParser();
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter11.withParseType(periodType14);
        boolean boolean17 = periodFormatter16.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = period7.toString(periodFormatter16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 0);
        org.joda.time.Period period3 = period1.plusMonths((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days4 = period3.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
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
        java.util.Locale locale14 = periodFormatter13.getLocale();
        java.io.Writer writer15 = null;
        org.joda.time.Hours hours16 = org.joda.time.Hours.EIGHT;
        int int17 = hours16.getHours();
        org.joda.time.Hours hours18 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours19 = hours16.minus(hours18);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter13.printTo(writer15, (org.joda.time.ReadablePeriod) hours18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours19);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("months");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"months\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
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
        org.joda.time.Duration duration26 = duration25.toDuration();
        long long27 = duration25.getStandardHours();
        org.joda.time.ReadableInstant readableInstant28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval29 = duration25.toIntervalFrom(readableInstant28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-35791394L) + "'", long27 == (-35791394L));
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("YearMonthDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.ONE;
        boolean boolean4 = seconds1.isGreaterThan(seconds3);
        org.joda.time.Duration duration5 = seconds3.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = seconds3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
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
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks4 = weeks0.dividedBy(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds5 = weeks0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 604800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
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
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = periodFormatter13.print(readablePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
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
        java.lang.StringBuffer stringBuffer16 = null;
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str19 = duration18.toString();
        org.joda.time.Duration duration21 = duration18.minus((long) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration21.toPeriodTo(readableInstant22);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter13.printTo(stringBuffer16, (org.joda.time.ReadablePeriod) period23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0S" + "'", str19, "PT0S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        int int3 = hours0.getHours();
        org.joda.time.PeriodType periodType4 = hours0.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hours0.getValue((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -36");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SEVEN;
        org.joda.time.Period period1 = hours0.toPeriod();
        org.joda.time.Hours hours2 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.DurationFieldType durationFieldType4 = hours2.getFieldType();
        int int5 = hours2.getHours();
        org.joda.time.PeriodType periodType6 = hours2.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours7 = hours0.plus(hours2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 7 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours21 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P1M-1WT35H0.036S");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
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
        java.io.Writer writer10 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer10, (org.joda.time.ReadablePeriod) minutes16);
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
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.Hours hours1 = seconds0.toStandardHours();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.Period period1 = org.joda.time.Period.years((-36));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = periodFormatter13.parsePeriod("years");
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
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter2.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = periodFormatter2.parsePeriod("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter2.getParseType();
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) periodFormatter2, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.format.PeriodFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("YearMonthDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType4 = days2.getFieldType();
        boolean boolean5 = days0.isLessThan(days2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days7 = days0.dividedBy((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.PeriodType periodType9 = days1.getPeriodType();
        org.joda.time.Days days11 = days1.dividedBy((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = days1.getFieldType(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(days11);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Hours hours10 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours12 = hours10.multipliedBy((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = minutes9.compareTo((org.joda.time.base.BaseSingleFieldPeriod) hours12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Hours");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
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
        org.joda.time.format.PeriodPrinter periodPrinter16 = null;
        org.joda.time.format.PeriodParser periodParser17 = null;
        org.joda.time.format.PeriodFormatter periodFormatter18 = new org.joda.time.format.PeriodFormatter(periodPrinter16, periodParser17);
        boolean boolean19 = periodFormatter18.isParser();
        org.joda.time.Days days20 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType21 = days20.getPeriodType();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter18.withParseType(periodType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = period15.withPeriodType(periodType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodFormatter23);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.Period period1 = new org.joda.time.Period(100000L);
        org.joda.time.Period period3 = period1.minusYears(100);
        int int4 = period1.getDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
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
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = periodFormatter7.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod19, "P-97M10DT100S", (int) (short) 10);
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
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(mutablePeriod19);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Period period15 = period12.withYears((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer7, (org.joda.time.ReadablePeriod) period15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        int int2 = weeks1.getWeeks();
        org.joda.time.Period period3 = weeks1.toPeriod();
        java.lang.Class<?> wildcardClass4 = weeks1.getClass();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Duration duration3 = weeks0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours4 = duration3.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 360777252696");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Period period14 = period10.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withMinutesRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period((int) (byte) 10, 10, 8, (-95), 2147483647, (int) (byte) 1, (int) (short) 1, (int) (short) 0, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Duration duration5 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration7 = duration5.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        boolean boolean11 = period9.isSupported(durationFieldType10);
        org.joda.time.Period period13 = period1.withField(durationFieldType10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = period1.getValue(14400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14400");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Period period8 = period2.plusWeeks((-1));
        int int9 = period8.size();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = period8.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
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
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = duration1.toPeriodFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval29 = duration1.toIntervalFrom(readableInstant28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        int int3 = hours0.getHours();
        org.joda.time.Weeks weeks4 = hours0.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes5 = hours0.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        java.lang.String str7 = period4.toString();
        org.joda.time.Period period9 = period4.minusMillis((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks10 = period4.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P-100M10D" + "'", str7, "P-100M10D");
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) '4');
        org.joda.time.Hours hours2 = seconds1.toStandardHours();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("P1W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
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
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter3.withLocale(locale22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = org.joda.time.Period.parse("Seconds", periodFormatter3);
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
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
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
        org.joda.time.Period period19 = org.joda.time.Period.millis((int) '#');
        int int20 = period19.getYears();
        org.joda.time.Hours hours21 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period19);
        int int22 = hours21.getHours();
        org.joda.time.MutablePeriod mutablePeriod23 = hours21.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod23, "PT-2S", 1);
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
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod23);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        int int2 = period1.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
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
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period2.toDurationTo(readableInstant16);
        org.joda.time.MutablePeriod mutablePeriod18 = period2.toMutablePeriod();
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
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter2.getParseType();
        boolean boolean7 = periodFormatter2.isParser();
        boolean boolean8 = periodFormatter2.isParser();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        org.joda.time.Weeks weeks12 = weeks10.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks13 = null;
        org.joda.time.Weeks weeks14 = weeks12.minus(weeks13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) weeks12, chronology15);
        org.joda.time.PeriodType periodType17 = period16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) periodFormatter2, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.format.PeriodFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
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
        boolean boolean18 = periodFormatter2.isPrinter();
        java.lang.StringBuffer stringBuffer19 = null;
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Minutes minutes28 = minutes26.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes29 = minutes20.minus(minutes26);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period34 = period32.minusMonths(0);
        org.joda.time.Minutes minutes35 = period34.toStandardMinutes();
        org.joda.time.Minutes minutes37 = minutes35.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) minutes35, chronology38);
        org.joda.time.Minutes minutes40 = minutes20.minus(minutes35);
        org.joda.time.DurationFieldType durationFieldType42 = minutes40.getFieldType((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer19, (org.joda.time.ReadablePeriod) minutes40);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(durationFieldType42);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks3 = weeks2.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        boolean boolean7 = weeks4.isLessThan(weeks6);
        boolean boolean8 = weeks3.isGreaterThan(weeks6);
        boolean boolean9 = weeks0.isLessThan(weeks3);
        org.joda.time.Duration duration10 = weeks0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes11 = weeks0.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 10080");
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
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = seconds7.plus(seconds8);
        org.joda.time.PeriodType periodType10 = seconds7.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = period13.getFieldType((int) (short) 1);
        int int17 = periodType10.indexOf(durationFieldType16);
        org.joda.time.Period period18 = new org.joda.time.Period((long) ' ', periodType10);
        org.joda.time.Period period19 = duration2.toPeriodTo(readableInstant5, periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType21 = period19.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
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
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationTo(readableInstant25);
        org.joda.time.Minutes minutes27 = period24.toStandardMinutes();
        org.joda.time.PeriodType periodType28 = minutes27.getPeriodType();
        boolean boolean29 = minutes15.isLessThan(minutes27);
        org.joda.time.Seconds seconds31 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds34 = seconds32.plus(seconds33);
        org.joda.time.Seconds seconds36 = seconds32.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds37 = seconds31.plus(seconds32);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = minutes15.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds37);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = seconds1.getValue((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.standardMinutesIn(readablePeriod0);
        org.joda.time.Seconds seconds2 = minutes1.toStandardSeconds();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        boolean boolean4 = periodFormatter2.isParser();
        boolean boolean5 = periodFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod7 = periodFormatter2.parseMutablePeriod("P-97M10DT100S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod19 = periodFormatter2.parseMutablePeriod("PeriodType[Standard]");
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
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.Period period1 = org.joda.time.Period.millis(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT9072000S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withYearsRemoved();
        java.lang.String str6 = periodType5.toString();
        org.joda.time.PeriodType periodType7 = periodType5.withHoursRemoved();
        java.lang.String str8 = periodType7.toString();
        org.joda.time.Chronology chronology9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) (short) 10, periodType7, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Days]" + "'", str6, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PeriodType[Days]" + "'", str8, "PeriodType[Days]");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        boolean boolean4 = periodFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = periodFormatter2.parsePeriod("PT0.036S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Minutes minutes10 = minutes7.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration11 = minutes7.toStandardDuration();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period14.negated();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationTo(readableInstant16);
        boolean boolean18 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration22 = duration17.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Period period29 = period25.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType30 = period25.getPeriodType();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = duration17.toPeriod(periodType30, chronology31);
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType30);
        java.lang.String str34 = period33.toString();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT0S" + "'", str34, "PT0S");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 100, (int) '#', (-36), (-2), (-36), (int) (byte) -1, (int) (short) 0, 35, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks3 = weeks1.dividedBy((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period10 = new org.joda.time.Period((-128849018880L), periodType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period(100, (int) (short) -1, 2, (int) (byte) 0, 7, (int) (short) -1, (-1), 2147483647, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
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
        org.joda.time.Hours hours19 = org.joda.time.Hours.hours((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod20 = hours19.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod20, "PT0M", (-2));
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
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks1 = weeks0.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = weeks1.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483647 * 168");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (short) 0);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        org.joda.time.Period period14 = duration4.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = period14.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("months");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"months\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = seconds9.plus(seconds10);
        org.joda.time.PeriodType periodType12 = seconds9.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', periodType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period((int) '#', (int) '4', (int) (byte) 0, 6, (int) '4', (int) (short) 10, 3, (int) (short) 1, periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.multipliedBy((int) (byte) 1);
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Period period16 = period13.withWeeks((int) '#');
        boolean boolean17 = duration8.equals((java.lang.Object) period16);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType3 = seconds2.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration4 = new org.joda.time.Duration((java.lang.Object) seconds2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Seconds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = period12.minusYears((-36));
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
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(100, (int) (short) 1, (int) (short) 10, (int) (byte) -1, (int) (byte) 10, (int) '4', (int) (short) 100, (-1), periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((int) '#', (-95), (-95), 35, 10, (-10), (int) '#', 1, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType4 = days2.getFieldType();
        boolean boolean5 = days0.isLessThan(days2);
        org.joda.time.Duration duration6 = days0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = days0.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod18 = periodFormatter13.parseMutablePeriod("P-97M10DT100S");
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
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("YearMonthDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        java.lang.String str1 = durationFieldType0.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuries" + "'", str1, "centuries");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.plus(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes4 = minutes0.multipliedBy(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 6");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Hours hours2 = hours0.negated();
        org.joda.time.Duration duration3 = hours0.toStandardDuration();
        java.lang.String str4 = hours0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes5 = hours0.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT2147483647H" + "'", str4, "PT2147483647H");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Seconds seconds2 = weeks1.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = weeks1.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        int int3 = period1.getMonths();
        int int4 = period1.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod1 = minutes0.toMutablePeriod();
        org.joda.time.Duration duration2 = minutes0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = minutes0.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.Days days1 = org.joda.time.Days.days((-95));
        org.joda.time.Hours hours2 = days1.toStandardHours();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.Period period4 = period1.withFields(readablePeriod3);
        org.joda.time.Hours hours5 = period1.toStandardHours();
        org.joda.time.Days days7 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days9 = days7.multipliedBy((int) (short) 100);
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.Days days13 = days10.minus(0);
        org.joda.time.Days days14 = days7.minus(days13);
        org.joda.time.PeriodType periodType15 = days7.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hours5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
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
        long long28 = duration26.getMillis();
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        java.lang.String str1 = seconds0.toString();
        org.joda.time.Weeks weeks2 = seconds0.toStandardWeeks();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PT0S" + "'", str1, "PT0S");
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks(1);
        int int4 = weeks3.getWeeks();
        org.joda.time.Period period5 = weeks3.toPeriod();
        int int6 = weeks3.size();
        int int7 = weeks3.size();
        int int8 = weeks3.getWeeks();
        boolean boolean9 = days0.equals((java.lang.Object) weeks3);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
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
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, readableInstant21);
        org.joda.time.Period period24 = period22.plusSeconds((int) (short) 1);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.Class<?> wildcardClass1 = periodType0.getClass();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days1 = org.joda.time.Days.SEVEN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = days0.plus(days1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 7");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
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
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        org.joda.time.Minutes minutes20 = minutes17.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes22 = minutes20.dividedBy((-36));
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter7.printTo(stringBuffer11, (org.joda.time.ReadablePeriod) minutes22);
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
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
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
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, readableInstant73, periodType74);
        // The following exception was thrown during execution in test generation
        try {
            int int77 = period75.getValue(14400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14400");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(periodType74);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        int int5 = period4.getYears();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.Period period8 = period6.plusMinutes(100);
        org.joda.time.Period period10 = period6.minusMillis(1);
        org.joda.time.Period period12 = period10.multipliedBy(1);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = period12.withFieldAdded(durationFieldType13, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = period6.equals(obj8);
        org.joda.time.Period period11 = period6.withWeeks((int) '#');
        org.joda.time.Period period13 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Period period16 = period13.minusMonths(100);
        org.joda.time.Period period18 = period16.minusYears((int) (short) 10);
        org.joda.time.Period period19 = period11.plus((org.joda.time.ReadablePeriod) period16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration20 = new org.joda.time.Duration((java.lang.Object) period11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(7);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Minutes minutes10 = minutes7.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType11 = minutes7.getFieldType();
        org.joda.time.Period period13 = period1.withFieldAdded(durationFieldType11, (int) (byte) 1);
        org.joda.time.Period period15 = period1.minusMonths((-10));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours16 = period15.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusSeconds((int) (short) 1);
        int int8 = period7.getDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(10);
        org.joda.time.Hours hours2 = weeks1.toStandardHours();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        java.lang.String str13 = periodType12.toString();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter8.withParseType(periodType12);
        org.joda.time.PeriodType periodType15 = periodFormatter14.getParseType();
        java.util.Locale locale16 = periodFormatter14.getLocale();
        java.util.Locale locale17 = periodFormatter14.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = org.joda.time.Period.parse("PeriodType[Standard]", periodFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PeriodType[Days]" + "'", str13, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNull(locale17);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Days days4 = days2.plus((int) ' ');
        org.joda.time.DurationFieldType durationFieldType5 = days4.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = days4.getFieldType((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -36");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod1 = minutes0.toMutablePeriod();
        org.joda.time.Duration duration2 = minutes0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = minutes0.getValue((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -95");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(2147483647);
        org.joda.time.MutablePeriod mutablePeriod2 = minutes1.toMutablePeriod();
        org.joda.time.format.PeriodPrinter periodPrinter3 = null;
        org.joda.time.format.PeriodParser periodParser4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = new org.joda.time.format.PeriodFormatter(periodPrinter3, periodParser4);
        boolean boolean6 = periodFormatter5.isParser();
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter5.withParseType(periodType8);
        boolean boolean11 = periodFormatter10.isPrinter();
        boolean boolean12 = periodFormatter10.isParser();
        org.joda.time.PeriodType periodType13 = periodFormatter10.getParseType();
        boolean boolean14 = periodFormatter10.isParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = mutablePeriod2.toString(periodFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks4 = weeks3.negated();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        boolean boolean9 = weeks4.isGreaterThan(weeks7);
        org.joda.time.Weeks weeks10 = null;
        org.joda.time.Weeks weeks11 = weeks7.minus(weeks10);
        org.joda.time.DurationFieldType durationFieldType12 = weeks11.getFieldType();
        org.joda.time.Chronology chronology13 = null;
        boolean boolean14 = durationFieldType12.isSupported(chronology13);
        org.joda.time.Period period16 = org.joda.time.Period.millis((int) '#');
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.minutes();
        boolean boolean18 = period16.isSupported(durationFieldType17);
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds21 = seconds19.plus(seconds20);
        org.joda.time.Seconds seconds23 = seconds20.plus((int) (byte) 0);
        org.joda.time.Seconds seconds25 = seconds20.minus(8);
        org.joda.time.DurationFieldType durationFieldType26 = seconds20.getFieldType();
        org.joda.time.Hours hours27 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType28 = hours27.getFieldType();
        org.joda.time.DurationFieldType durationFieldType29 = hours27.getFieldType();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.days();
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = new org.joda.time.DurationFieldType[] { durationFieldType1, durationFieldType12, durationFieldType17, durationFieldType26, durationFieldType29, durationFieldType30 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.forFields(durationFieldTypeArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [hours]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(durationFieldTypeArray31);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = seconds1.plus(seconds2);
        org.joda.time.PeriodType periodType4 = seconds1.getPeriodType();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.DurationFieldType durationFieldType10 = period7.getFieldType((int) (short) 1);
        int int11 = periodType4.indexOf(durationFieldType10);
        org.joda.time.Period period12 = new org.joda.time.Period((long) ' ', periodType4);
        int int13 = period12.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = period12.withMinutes((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withSecondsRemoved();
        org.joda.time.Period period17 = duration11.toPeriodFrom(readableInstant12, periodType14);
        long long18 = duration11.getStandardHours();
        org.joda.time.Days days19 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType20 = days19.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = duration11.toPeriod(periodType20, chronology21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType24 = periodType23.withMillisRemoved();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) period22, periodType24, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', (long) (byte) -1, periodType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 10, 0, 2147483647, (int) 'a', 6, (int) (byte) 10, 2, periodType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        int int3 = period1.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str13 = periodType12.getName();
        boolean boolean15 = periodType12.equals((java.lang.Object) true);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 0, (long) (-10), periodType12, chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period(0, (int) (short) 100, (int) (byte) 1, (int) '#', (int) ' ', (int) (byte) 100, 0, (-10), periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "YearMonthDay" + "'", str13, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = weeks0.minus(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -35");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
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
            org.joda.time.Weeks weeks26 = period24.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
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
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = org.joda.time.Period.parse("P0W", periodFormatter8);
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
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period8 = period7.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = period8.getFieldType((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        int int9 = period6.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = period6.multipliedBy(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -36 * 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days3 = days0.plus((int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = days0.getClass();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds9 = seconds7.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType10 = seconds9.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter5.printTo(stringBuffer6, (org.joda.time.ReadablePeriod) seconds9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        java.lang.String str11 = periodType10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period(7, 2147483645, (-1), (int) 'a', 2, 0, (int) (byte) 1, 100, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PeriodType[Days]" + "'", str11, "PeriodType[Days]");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
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
            org.joda.time.Period period26 = period24.plusMinutes(8);
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
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(10L, (long) (byte) -1, periodType7, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) period9, chronology10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = period11.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
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
        // The following exception was thrown during execution in test generation
        try {
            int int24 = minutes0.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType3 = seconds2.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = seconds2.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        java.lang.String str4 = periodType3.toString();
        org.joda.time.PeriodType periodType5 = periodType3.withHoursRemoved();
        java.lang.String str6 = periodType5.toString();
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withMillisRemoved();
        java.lang.String str11 = periodType10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) periodType5, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PeriodType[Days]" + "'", str4, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PeriodType[Days]" + "'", str6, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PeriodType[Days]" + "'", str11, "PeriodType[Days]");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.Weeks weeks1 = hours0.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours3 = hours0.multipliedBy((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 32");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.Seconds seconds1 = hours0.toStandardSeconds();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ONE;
        org.joda.time.Period period1 = seconds0.toPeriod();
        org.joda.time.Minutes minutes2 = seconds0.toStandardMinutes();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.days();
        boolean boolean15 = periodType13.isSupported(durationFieldType14);
        org.joda.time.PeriodType periodType16 = periodType13.withMinutesRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((-128849018880L), periodType13);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '4', periodType13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = periodFormatter7.print((org.joda.time.ReadablePeriod) period18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
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
        // The following exception was thrown during execution in test generation
        try {
            int int24 = days9.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks8 = null;
        org.joda.time.Weeks weeks9 = weeks5.minus(weeks8);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds12 = seconds10.multipliedBy((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = weeks9.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Weeks cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT0M\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = seconds0.getValue(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2147483645");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getMillis();
        org.joda.time.Period period9 = duration1.toPeriod();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration1.toIntervalFrom(readableInstant10);
        org.joda.time.Days days12 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval11);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100000L + "'", long8 == 100000L);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(days12);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Weeks weeks1 = minutes0.toStandardWeeks();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period((long) 2, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period4.minusYears(3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType3 = minutes2.getFieldType();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.days();
        boolean boolean10 = periodType8.isSupported(durationFieldType9);
        org.joda.time.PeriodType periodType11 = periodType8.withMinutesRemoved();
        org.joda.time.Period period12 = new org.joda.time.Period((-128849018880L), periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) durationFieldType3, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hours\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("Seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("weeks");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weeks\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.io.Writer writer4 = null;
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        org.joda.time.Period period12 = period10.minusMonths((int) 'a');
        org.joda.time.Period period14 = period12.withMillis((int) (short) 100);
        int int15 = period14.getYears();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer4, (org.joda.time.ReadablePeriod) period14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) (short) 100);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
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
            org.joda.time.Hours hours26 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P32YT0.036S");
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
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ONE;
        org.joda.time.Weeks weeks1 = seconds0.toStandardWeeks();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod4 = weeks0.toMutablePeriod();
        org.joda.time.Minutes minutes5 = weeks0.toStandardMinutes();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        int int5 = period4.getYears();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.format.PeriodPrinter periodPrinter7 = null;
        org.joda.time.format.PeriodParser periodParser8 = null;
        org.joda.time.format.PeriodFormatter periodFormatter9 = new org.joda.time.format.PeriodFormatter(periodPrinter7, periodParser8);
        java.util.Locale locale10 = periodFormatter9.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = period6.toString(periodFormatter9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNull(locale10);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
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
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = duration28.toPeriodFrom(readableInstant49, periodType50);
        java.lang.String str52 = duration28.toString();
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
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PT0S" + "'", str52, "PT0S");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.Period period4 = new org.joda.time.Period(10, 3, (-95), (int) '#');
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes2 = minutes0.dividedBy((int) (byte) -1);
        org.joda.time.Minutes minutes4 = minutes2.plus((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes6 = minutes4.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
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
            org.joda.time.DurationFieldType durationFieldType16 = period14.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
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
        org.joda.time.PeriodType periodType27 = period24.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) periodType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod18 = periodFormatter13.parseMutablePeriod("PT-128849018880S");
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
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, (int) ' ', (int) '4', (int) (short) -1, 10, (int) 'a', (-1), (int) '4');
        int int9 = period8.getDays();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes2 = minutes0.dividedBy((int) (byte) -1);
        org.joda.time.Minutes minutes4 = minutes2.plus((int) (byte) -1);
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.Seconds seconds9 = seconds5.multipliedBy((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = minutes2.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, (long) (byte) 100, periodType4);
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Period period12 = period8.minusSeconds((int) (byte) 100);
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.days();
        boolean boolean18 = periodType16.isSupported(durationFieldType17);
        int int19 = period8.get(durationFieldType17);
        org.joda.time.Period period21 = period8.withHours(1);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Period period28 = period24.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType29 = period24.getPeriodType();
        org.joda.time.PeriodType periodType30 = periodType29.withMinutesRemoved();
        java.lang.String str31 = periodType30.toString();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) period8, periodType30, chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) periodType4, periodType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str31, "PeriodType[StandardNoMinutes]");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("P-97M10DT100S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
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
        java.util.Locale locale14 = periodFormatter13.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod16 = periodFormatter13.parseMutablePeriod("days");
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
        org.junit.Assert.assertNull(locale14);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
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
        org.joda.time.format.PeriodParser periodParser23 = periodFormatter22.getParser();
        org.joda.time.format.PeriodParser periodParser24 = periodFormatter22.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = periodFormatter22.parsePeriod("weeks");
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
        org.junit.Assert.assertNull(periodParser23);
        org.junit.Assert.assertNull(periodParser24);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withSecondsRemoved();
        org.joda.time.Period period8 = duration2.toPeriodFrom(readableInstant3, periodType5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (short) 1, periodType5, chronology9);
        int int11 = period10.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period10.withHours((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
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
        org.joda.time.Duration duration50 = duration42.minus((long) (byte) 1);
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period54 = period53.negated();
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationTo(readableInstant55);
        int int57 = duration50.compareTo((org.joda.time.ReadableDuration) duration56);
        long long58 = duration56.getMillis();
        org.joda.time.Duration duration61 = duration56.withDurationAdded((long) (short) 0, (-1));
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
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 36L + "'", long58 == 36L);
        org.junit.Assert.assertNotNull(duration61);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean4 = weeks2.isGreaterThan(weeks3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds5 = weeks3.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 604800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) '4');
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) days1, chronology2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = period3.getValue((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -95");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        int int1 = hours0.getHours();
        org.joda.time.Hours hours3 = hours0.dividedBy(8);
        int int4 = hours3.size();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (byte) 1);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
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
        org.joda.time.Period period23 = period21.plusMonths((int) 'a');
        org.joda.time.PeriodType periodType24 = period21.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) '4', periodType24, chronology25);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        int int1 = hours0.getHours();
        org.joda.time.Hours hours2 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours3 = hours0.minus(hours2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds4 = hours2.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 3600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.PeriodType periodType9 = days1.getPeriodType();
        org.joda.time.Days days11 = days1.dividedBy((int) 'a');
        org.joda.time.Days days13 = days11.dividedBy((int) '4');
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration18 = duration16.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalFrom(readableInstant21);
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Seconds seconds25 = seconds23.plus(0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = days11.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds7 = seconds4.plus((int) (byte) 0);
        org.joda.time.Seconds seconds9 = seconds7.minus((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.months();
        int int11 = seconds7.get(durationFieldType10);
        boolean boolean12 = period2.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = new org.joda.time.DurationFieldType[] { durationFieldType10, durationFieldType13 };
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.forFields(durationFieldTypeArray14);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.forFields(durationFieldTypeArray14);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.forFields(durationFieldTypeArray14);
        int int18 = periodType17.size();
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(durationFieldTypeArray14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Seconds seconds2 = hours1.toStandardSeconds();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Hours hours2 = hours0.negated();
        org.joda.time.Duration duration3 = hours0.toStandardDuration();
        int int4 = hours0.size();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
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
        boolean boolean12 = periodType0.equals((java.lang.Object) periodParser11);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(periodParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period8 = period4.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType9 = period4.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType14 = periodType10.getFieldType(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2147483645");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT100S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = periodFormatter7.print((org.joda.time.ReadablePeriod) minutes53);
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
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
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
            org.joda.time.Seconds seconds9 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) weeks0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1298798109705600");
        } catch (java.lang.ArithmeticException e) {
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
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(100, (int) (short) 1, (int) (short) 10, (int) (byte) -1, (int) (byte) 10, (int) '4', (int) (short) 100, (-1), periodType8);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Period period16 = period12.minusSeconds((int) (byte) 100);
        org.joda.time.Days days17 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        org.joda.time.PeriodType periodType20 = periodType18.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.days();
        boolean boolean22 = periodType20.isSupported(durationFieldType21);
        int int23 = period12.get(durationFieldType21);
        int int24 = period12.getDays();
        org.joda.time.Period period26 = period12.plusHours((int) '#');
        org.joda.time.Period period28 = period26.plusMonths((int) (short) 1);
        boolean boolean29 = period9.equals((java.lang.Object) period28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds30 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P1MT35H0.036S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("YearMonthDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) weeks0);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        java.lang.String str2 = weeks1.toString();
        java.lang.String str3 = weeks1.toString();
        org.joda.time.Hours hours4 = weeks1.toStandardHours();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P1W" + "'", str2, "P1W");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P1W" + "'", str3, "P1W");
        org.junit.Assert.assertNotNull(hours4);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.days();
        boolean boolean8 = periodType6.isSupported(durationFieldType7);
        org.joda.time.PeriodType periodType9 = periodType6.withMinutesRemoved();
        int int10 = periodType6.size();
        org.joda.time.Period period11 = duration1.toPeriodFrom(readableInstant2, periodType6);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withYearsRemoved();
        java.lang.String str17 = periodType16.toString();
        org.joda.time.PeriodType periodType18 = periodType16.withHoursRemoved();
        java.lang.String str19 = periodType18.toString();
        org.joda.time.Period period20 = duration1.toPeriodTo(readableInstant12, periodType18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Days days24 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType25 = days24.getPeriodType();
        org.joda.time.PeriodType periodType26 = periodType25.withHoursRemoved();
        org.joda.time.PeriodType periodType27 = periodType25.withSecondsRemoved();
        org.joda.time.PeriodType periodType28 = periodType25.withMinutesRemoved();
        org.joda.time.PeriodType periodType29 = periodType28.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 1, (long) (short) 10, periodType29);
        org.joda.time.Period period31 = duration1.toPeriodTo(readableInstant21, periodType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = period31.minusMonths((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PeriodType[Days]" + "'", str17, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PeriodType[Days]" + "'", str19, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.Days days1 = org.joda.time.Days.days(6);
        org.joda.time.Hours hours2 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) days1);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
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
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withHoursRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withYearsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType17);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType22 = periodType21.withMillisRemoved();
        org.joda.time.Chronology chronology23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) periodFormatter2, periodType21, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.format.PeriodFormatter");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("Seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        boolean boolean4 = periodFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = periodFormatter2.parsePeriod("PT0M");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period4.minusSeconds((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval8);
        int int11 = weeks10.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = weeks10.getValue(87);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 87");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = minutes5.toPeriod();
        org.joda.time.Weeks weeks8 = minutes5.toStandardWeeks();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.ONE;
        boolean boolean4 = seconds1.isGreaterThan(seconds3);
        org.joda.time.Duration duration5 = seconds3.toStandardDuration();
        org.joda.time.Seconds seconds6 = seconds3.negated();
        org.joda.time.Seconds seconds8 = seconds6.multipliedBy((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Duration duration16 = duration7.withDurationAdded((org.joda.time.ReadableDuration) duration14, (int) (short) 100);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str18 = periodType17.getName();
        boolean boolean20 = periodType17.equals((java.lang.Object) true);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType23 = periodType17.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "YearMonthDay" + "'", str18, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.MutablePeriod mutablePeriod5 = period2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod6 = period2.toMutablePeriod();
        org.joda.time.Period period8 = period2.minusMinutes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period2.minusMillis(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -36 + -2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        int int1 = hours0.getHours();
        org.joda.time.Hours hours3 = hours0.dividedBy(8);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        boolean boolean18 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration20 = duration10.plus((long) (short) 10);
        org.joda.time.Period period21 = duration10.toPeriod();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Minutes minutes28 = period27.toStandardMinutes();
        org.joda.time.Duration duration29 = minutes28.toStandardDuration();
        org.joda.time.Period period30 = duration29.toPeriod();
        org.joda.time.Duration duration32 = duration29.plus((long) (byte) 0);
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant22, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.Period period34 = duration32.toPeriod();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.days();
        org.joda.time.Period period36 = duration32.toPeriod(periodType35);
        boolean boolean37 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period45 = period43.minusMonths(0);
        org.joda.time.Period period47 = period43.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType48 = period43.getPeriodType();
        org.joda.time.PeriodType periodType49 = periodType48.withMinutesRemoved();
        org.joda.time.PeriodType periodType50 = periodType49.withHoursRemoved();
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType49);
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, readableInstant38, periodType49);
        org.joda.time.PeriodType periodType53 = periodType49.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period54 = new org.joda.time.Period((java.lang.Object) 8, periodType49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType53);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        int int7 = period6.getYears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days8 = period6.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        java.lang.String str2 = periodType1.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = periodType1.getFieldType(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Days" + "'", str2, "Days");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = periodFormatter2.parsePeriod("years");
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
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT99.640S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType3 = minutes2.getFieldType();
        int int4 = minutes2.getMinutes();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Minutes minutes13 = minutes11.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes14 = minutes5.minus(minutes11);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Minutes minutes22 = minutes20.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) minutes20, chronology23);
        org.joda.time.Minutes minutes25 = minutes5.minus(minutes20);
        org.joda.time.DurationFieldType durationFieldType27 = minutes25.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType28 = minutes25.getPeriodType();
        org.joda.time.Minutes minutes29 = minutes25.negated();
        org.joda.time.Minutes minutes30 = minutes2.minus(minutes29);
        org.joda.time.Minutes minutes31 = minutes30.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType33 = minutes30.getFieldType(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2147483645");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14400 + "'", int4 == 14400);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes31);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        org.joda.time.Period period12 = period10.minusMonths((int) 'a');
        org.joda.time.Period period13 = period2.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Hours hours14 = period2.toStandardHours();
        int int15 = hours14.getHours();
        org.joda.time.Seconds seconds16 = hours14.toStandardSeconds();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(seconds16);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        org.joda.time.Duration duration11 = duration6.withMillis((long) 1);
        org.joda.time.Minutes minutes12 = duration6.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes14 = minutes12.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(minutes12);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.Days days1 = org.joda.time.Days.days(8);
        org.joda.time.Minutes minutes2 = days1.toStandardMinutes();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        java.lang.Class<?> wildcardClass7 = minutes5.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str2 = seconds1.toString();
        org.joda.time.DurationFieldType durationFieldType3 = seconds1.getFieldType();
        org.joda.time.Minutes minutes4 = seconds1.toStandardMinutes();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Weeks weeks1 = minutes0.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds2 = minutes0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
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
        java.io.Writer writer14 = null;
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds19 = seconds17.plus(seconds18);
        org.joda.time.Seconds seconds21 = seconds17.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds22 = seconds16.plus(seconds17);
        org.joda.time.Seconds seconds24 = seconds16.plus((int) '4');
        org.joda.time.Duration duration25 = seconds24.toStandardDuration();
        org.joda.time.Seconds seconds27 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds30 = seconds28.plus(seconds29);
        org.joda.time.Seconds seconds32 = seconds28.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds33 = seconds27.plus(seconds28);
        org.joda.time.Seconds seconds35 = seconds27.plus((int) '4');
        org.joda.time.Duration duration36 = seconds35.toStandardDuration();
        boolean boolean37 = seconds24.isLessThan(seconds35);
        org.joda.time.Seconds seconds38 = seconds24.negated();
        org.joda.time.Seconds seconds39 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds40 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds41 = seconds39.plus(seconds40);
        org.joda.time.Seconds seconds43 = seconds40.plus((int) (byte) 0);
        org.joda.time.Seconds seconds45 = seconds40.minus(8);
        org.joda.time.DurationFieldType durationFieldType46 = seconds40.getFieldType();
        boolean boolean47 = seconds24.isGreaterThan(seconds40);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter7.printTo(writer14, (org.joda.time.ReadablePeriod) seconds40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
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
        long long28 = duration26.getStandardDays();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = duration26.toPeriod(chronology29);
        org.joda.time.Duration duration33 = duration26.withDurationAdded(0L, (int) ' ');
        java.lang.Class<?> wildcardClass34 = duration33.getClass();
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Duration duration8 = seconds2.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.Period period1 = org.joda.time.Period.days(2);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
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
        java.io.Writer writer22 = null;
        org.joda.time.Days days23 = org.joda.time.Days.THREE;
        int int24 = days23.size();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter21.printTo(writer22, (org.joda.time.ReadablePeriod) days23);
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
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.Period period12 = new org.joda.time.Period((long) 1, periodType11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = new org.joda.time.Period((int) (short) 10, (int) '#', 0, 52, (int) (byte) 1, (int) (short) 0, (-95), (int) '#', periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds((long) 0);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        org.joda.time.Period period21 = duration20.toPeriod();
        org.joda.time.Duration duration23 = duration20.plus((long) (byte) 0);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) duration23, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant12, periodType25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = new org.joda.time.Period((int) (short) 1, (-2), 87, 7, (int) (short) 0, 35, (int) (short) 0, (int) '#', periodType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) minutes5, chronology8);
        org.joda.time.PeriodType periodType10 = minutes5.getPeriodType();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
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
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period24.negated();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationTo(readableInstant26);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = duration27.toPeriod(periodType28, chronology29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = periodFormatter21.print((org.joda.time.ReadablePeriod) period30);
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
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P2147483647W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P2147483647W\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.Period period4 = new org.joda.time.Period(0, 0, 100, 2147483645);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.Days days0 = org.joda.time.Days.MIN_VALUE;
        org.joda.time.Days days2 = days0.dividedBy(2147483647);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days4 = days0.multipliedBy(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
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
        org.joda.time.Period period19 = duration17.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = period19.getValue(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
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
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period8 = period6.minusSeconds(0);
        org.joda.time.Period period10 = period8.minusWeeks(10);
        org.joda.time.Period period11 = period8.negated();
        org.joda.time.Period period13 = period8.minusMillis((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = period8.getFieldTypes();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.forFields(durationFieldTypeArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldTypeArray14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) weeks2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 360777252696");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
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
        org.joda.time.Period period28 = period26.minusDays(5);
        org.joda.time.Period period30 = period28.plusMonths(2147483647);
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
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
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
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        boolean boolean29 = duration6.equals((java.lang.Object) period28);
        org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) duration6);
        int[] intArray31 = period30.getValues();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
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
        int int22 = weeks14.getWeeks();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = seconds1.plus(seconds2);
        java.lang.String str4 = seconds1.toString();
        org.joda.time.DurationFieldType durationFieldType5 = seconds1.getFieldType();
        org.joda.time.Seconds seconds7 = seconds1.multipliedBy(0);
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration9 = seconds8.toStandardDuration();
        boolean boolean10 = seconds7.isGreaterThan(seconds8);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = minutes0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT2S" + "'", str4, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 87);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = duration1.toPeriodTo(readableInstant2);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType3 = seconds0.getFieldType();
        int int4 = seconds0.getSeconds();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        java.lang.String str7 = periodType6.getName();
        org.joda.time.Chronology chronology8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) int4, periodType6, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Days" + "'", str7, "Days");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks6 = weeks5.negated();
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn(readableInterval8);
        boolean boolean10 = weeks7.isLessThan(weeks9);
        boolean boolean11 = weeks6.isGreaterThan(weeks9);
        boolean boolean12 = weeks3.isLessThan(weeks6);
        org.joda.time.Duration duration13 = weeks3.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks14 = weeks1.minus(weeks3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean4 = weeks2.isGreaterThan(weeks3);
        org.joda.time.Duration duration5 = weeks2.toStandardDuration();
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.ZERO;
        java.lang.String str7 = weeks6.toString();
        int int8 = weeks6.size();
        org.joda.time.PeriodType periodType9 = weeks6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = weeks6.toMutablePeriod();
        org.joda.time.Weeks weeks11 = weeks2.minus(weeks6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds12 = weeks11.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 604800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0W" + "'", str7, "P0W");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(weeks11);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = period6.equals(obj8);
        org.joda.time.Period period11 = period6.withWeeks((int) '#');
        org.joda.time.Period period13 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Period period16 = period13.minusMonths(100);
        org.joda.time.Period period18 = period16.minusYears((int) (short) 10);
        org.joda.time.Period period19 = period11.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period21 = period11.minusYears(0);
        java.lang.String str22 = period11.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P35W" + "'", str22, "P35W");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.days();
        boolean boolean11 = periodType9.isSupported(durationFieldType10);
        org.joda.time.PeriodType periodType12 = periodType9.withMinutesRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((-128849018880L), periodType9);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '4', periodType9);
        org.joda.time.PeriodType periodType15 = periodType9.withMonthsRemoved();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((-1L), (long) (byte) 1, periodType9, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (-1), (long) ' ', periodType9, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = period19.plusYears(87);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PeriodType[StandardNoMinutes]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[StandardNoMinutes]\" is malformed at \"eriodType[StandardNoMinutes]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str2 = seconds1.toString();
        org.joda.time.DurationFieldType durationFieldType3 = seconds1.getFieldType();
        org.joda.time.Hours hours4 = seconds1.toStandardHours();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(hours4);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
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
        java.lang.StringBuffer stringBuffer10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.FIVE;
        java.lang.String str12 = days11.toString();
        org.joda.time.Days days14 = days11.multipliedBy((int) (byte) -1);
        org.joda.time.Days days15 = days11.negated();
        org.joda.time.Duration duration16 = days11.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant17);
        java.lang.Object obj19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(obj19);
        org.joda.time.Period period22 = period20.minusWeeks((int) (short) 100);
        org.joda.time.Period period23 = period18.minus((org.joda.time.ReadablePeriod) period22);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter7.printTo(stringBuffer10, (org.joda.time.ReadablePeriod) period22);
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
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P5D" + "'", str12, "P5D");
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.multipliedBy((int) (byte) -1);
        org.joda.time.Days days4 = days0.negated();
        org.joda.time.Days days5 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = org.joda.time.Days.ONE;
        int int7 = days5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days6);
        org.joda.time.Days days9 = days6.multipliedBy((int) '#');
        org.joda.time.Days days10 = days4.minus(days6);
        org.joda.time.Days days12 = days4.minus((int) 'a');
        java.lang.String str13 = days12.toString();
        org.joda.time.Days days15 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days17 = days15.multipliedBy((int) (short) 100);
        org.joda.time.Days days18 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType19 = days18.getPeriodType();
        org.joda.time.Days days21 = days18.minus(0);
        org.joda.time.Days days22 = days15.minus(days21);
        boolean boolean23 = days12.isGreaterThan(days21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days25 = days21.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-102D" + "'", str13, "P-102D");
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT0.036S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
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
        org.joda.time.Chronology chronology21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) periodType17, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period5 = period1.multipliedBy((int) (byte) 0);
        java.lang.String str6 = period5.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        org.joda.time.Duration duration24 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration22, (int) (short) 100);
        org.joda.time.Duration duration26 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration24, 3);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration31 = duration29.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, readableInstant32);
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
        boolean boolean54 = duration31.isEqual((org.joda.time.ReadableDuration) duration53);
        long long55 = duration53.getStandardDays();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = duration53.toPeriod(chronology56);
        org.joda.time.Duration duration60 = duration53.withDurationAdded(0L, (int) ' ');
        boolean boolean61 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardSeconds((long) 10);
        long long64 = duration63.getStandardHours();
        boolean boolean65 = duration8.isShorterThan((org.joda.time.ReadableDuration) duration63);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
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
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds15 = seconds13.plus(seconds14);
        org.joda.time.Seconds seconds17 = seconds14.plus((int) (byte) 0);
        org.joda.time.Seconds seconds19 = seconds17.minus((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.months();
        int int21 = seconds17.get(durationFieldType20);
        boolean boolean22 = period12.isSupported(durationFieldType20);
        org.joda.time.Period period23 = period12.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = periodFormatter7.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod24, "weeks", (int) 'a');
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
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(mutablePeriod24);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT-2S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
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
        org.joda.time.Period period20 = period18.plusDays((int) (byte) -1);
        int int21 = period20.getHours();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Hours hours1 = days0.toStandardHours();
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.ZERO;
        java.lang.String str3 = weeks2.toString();
        org.joda.time.Weeks weeks5 = weeks2.multipliedBy(7);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hours1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Weeks");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0W" + "'", str3, "P0W");
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
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
        java.io.Writer writer18 = null;
        org.joda.time.Hours hours19 = org.joda.time.Hours.ONE;
        int int20 = hours19.getHours();
        org.joda.time.Hours hours22 = hours19.multipliedBy((-95));
        org.joda.time.Hours hours24 = hours22.dividedBy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter17.printTo(writer18, (org.joda.time.ReadablePeriod) hours24);
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
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours24);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod12 = periodFormatter7.parseMutablePeriod("PeriodType[Days]");
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
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.Hours hours7 = org.joda.time.Hours.hours((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod8 = hours7.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod8, "P1W", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period((long) 2, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period4.minusYears((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
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
        org.joda.time.Period period24 = period21.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod25, "P6M", 1);
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
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(mutablePeriod25);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType2 = days0.getFieldType();
        org.joda.time.Days days3 = org.joda.time.Days.MAX_VALUE;
        boolean boolean4 = days0.isGreaterThan(days3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = days0.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.days(10);
        org.joda.time.Period period5 = period3.plusMonths((int) 'a');
        org.joda.time.Period period7 = period3.plusSeconds((int) (short) 100);
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
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.Period period29 = duration17.toPeriodTo(readableInstant27, periodType28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = duration17.toPeriodFrom(readableInstant30);
        org.joda.time.Period period32 = period31.negated();
        org.joda.time.Period period34 = period32.minusHours(8);
        org.joda.time.PeriodType periodType35 = period32.getPeriodType();
        org.joda.time.Period period36 = period3.normalizedStandard(periodType35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period37 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
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
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        int int5 = period2.getMonths();
        org.joda.time.Period period7 = period2.withMonths(2147483647);
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        boolean boolean11 = weeks8.isLessThan(weeks10);
        org.joda.time.Weeks weeks13 = weeks10.multipliedBy((int) (short) 100);
        org.joda.time.Period period14 = period2.withFields((org.joda.time.ReadablePeriod) weeks13);
        org.joda.time.MutablePeriod mutablePeriod15 = weeks13.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = weeks13.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(mutablePeriod15);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        org.joda.time.Period period3 = period1.withMonths((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod22 = periodFormatter20.parseMutablePeriod("PT0H");
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
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = periodType1.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.withWeeks((-1));
        org.joda.time.Period period6 = period4.withMinutes((-1));
        org.joda.time.Period period8 = period4.minusDays(52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 100);
        int int3 = seconds2.getSeconds();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) '#');
        int int2 = period1.getMonths();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P35M");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        org.joda.time.MutablePeriod mutablePeriod9 = period6.toMutablePeriod();
        int int11 = period6.getValue((int) (byte) 1);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks(1);
        boolean boolean15 = weeks12.isGreaterThan(weeks14);
        org.joda.time.DurationFieldType durationFieldType16 = weeks14.getFieldType();
        org.joda.time.Period period18 = period6.withFieldAdded(durationFieldType16, 2147483647);
        java.lang.String str19 = durationFieldType16.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "weeks" + "'", str19, "weeks");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
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
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.parseSeconds("PT100S");
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration29 = duration27.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration29, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Interval interval33 = duration29.toIntervalFrom(readableInstant32);
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval33);
        org.joda.time.Seconds seconds36 = seconds34.plus(0);
        org.joda.time.Seconds seconds37 = seconds24.plus(seconds36);
        org.joda.time.MutablePeriod mutablePeriod38 = seconds36.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int41 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod38, "P0W", (-1));
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
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(mutablePeriod38);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
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
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Period period50 = period48.minusSeconds(0);
        org.joda.time.Period period52 = period50.minusWeeks(10);
        int int53 = period50.getWeeks();
        boolean boolean54 = duration43.equals((java.lang.Object) period50);
        int int55 = period50.getMonths();
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
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) '#');
        org.joda.time.Days days2 = seconds1.toStandardDays();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
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
        org.joda.time.Weeks weeks33 = weeks29.minus(100);
        org.joda.time.Weeks weeks35 = weeks29.plus((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks36 = weeks11.plus(weeks35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 10");
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
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks35);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter7 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter8 = periodFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = periodFormatter2.parsePeriod("Seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(periodPrinter7);
        org.junit.Assert.assertNull(periodPrinter8);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 10);
        org.joda.time.Days days2 = hours1.toStandardDays();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.format.PeriodPrinter periodPrinter8 = null;
        org.joda.time.format.PeriodParser periodParser9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = new org.joda.time.format.PeriodFormatter(periodPrinter8, periodParser9);
        boolean boolean11 = periodFormatter10.isParser();
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter10.withParseType(periodType13);
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withYearsRemoved();
        java.lang.String str20 = periodType19.toString();
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter15.withParseType(periodType19);
        org.joda.time.PeriodType periodType22 = periodFormatter21.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = new org.joda.time.Period(1, 8, 8, (int) (byte) 1, (int) (byte) -1, (int) (short) 1, 0, 14400, periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PeriodType[Days]" + "'", str20, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter7 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter8 = periodFormatter2.getPrinter();
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.Days days12 = days9.minus(0);
        org.joda.time.Days days13 = days12.negated();
        java.lang.String str14 = days12.toString();
        org.joda.time.Days days16 = days12.plus((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = periodFormatter2.print((org.joda.time.ReadablePeriod) days12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(periodPrinter7);
        org.junit.Assert.assertNull(periodPrinter8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P5D" + "'", str14, "P5D");
        org.junit.Assert.assertNotNull(days16);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds4 = seconds0.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        java.lang.String str8 = seconds5.toString();
        org.joda.time.DurationFieldType durationFieldType9 = seconds5.getFieldType();
        java.lang.String str10 = durationFieldType9.getName();
        boolean boolean11 = seconds0.isSupported(durationFieldType9);
        org.joda.time.Chronology chronology12 = null;
        boolean boolean13 = durationFieldType9.isSupported(chronology12);
        org.joda.time.Chronology chronology14 = null;
        boolean boolean15 = durationFieldType9.isSupported(chronology14);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT2S" + "'", str8, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "seconds" + "'", str10, "seconds");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
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
        long long22 = duration8.getMillis();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-36L) + "'", long22 == (-36L));
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) periodFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.format.PeriodFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(periodFormatter5);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks3 = weeks2.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        boolean boolean7 = weeks4.isLessThan(weeks6);
        boolean boolean8 = weeks3.isGreaterThan(weeks6);
        org.joda.time.Weeks weeks9 = null;
        org.joda.time.Weeks weeks10 = weeks6.minus(weeks9);
        org.joda.time.DurationFieldType durationFieldType11 = weeks10.getFieldType();
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks15 = weeks14.negated();
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeksIn(readableInterval17);
        boolean boolean19 = weeks16.isLessThan(weeks18);
        boolean boolean20 = weeks15.isGreaterThan(weeks18);
        boolean boolean21 = weeks12.isLessThan(weeks15);
        org.joda.time.Weeks weeks22 = weeks10.plus(weeks15);
        org.joda.time.Weeks weeks24 = weeks15.minus(2);
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks27 = weeks25.dividedBy(1);
        org.joda.time.Weeks weeks29 = weeks25.dividedBy(8);
        org.joda.time.Weeks weeks30 = weeks24.plus(weeks25);
        boolean boolean31 = weeks0.isGreaterThan(weeks25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks33 = weeks0.minus(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -35");
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
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = periodFormatter2.parsePeriod("PT1H");
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
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
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
        org.joda.time.Period period21 = duration6.toPeriod();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration6.toPeriodTo(readableInstant22);
        int int24 = period23.getSeconds();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
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
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Period period20 = period16.withMillis((int) (short) 0);
        int int21 = period20.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod22 = period20.toMutablePeriod();
        org.joda.time.Duration duration23 = period20.toStandardDuration();
        org.joda.time.Seconds seconds24 = duration23.toStandardSeconds();
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds26 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds27 = seconds25.plus(seconds26);
        org.joda.time.Seconds seconds29 = seconds25.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds30 = seconds24.minus(seconds29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = periodFormatter13.print((org.joda.time.ReadablePeriod) seconds24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
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
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("P10W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = period6.equals(obj8);
        org.joda.time.Period period11 = period6.withWeeks((int) '#');
        int int12 = period6.getYears();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.Period period2 = new org.joda.time.Period((-128849018880L), 100000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds3 = period2.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
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
        java.util.Locale locale19 = periodFormatter3.getLocale();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str21 = periodType20.getName();
        org.joda.time.PeriodType periodType22 = periodType20.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter3.withParseType(periodType20);
        org.joda.time.format.PeriodParser periodParser24 = periodFormatter23.getParser();
        org.joda.time.format.PeriodParser periodParser25 = periodFormatter23.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = org.joda.time.Period.parse("weeks", periodFormatter23);
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
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "YearMonthDay" + "'", str21, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertNull(periodParser24);
        org.junit.Assert.assertNull(periodParser25);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Days days4 = days2.plus((int) ' ');
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) days4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = period5.minusMinutes(4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period8 = duration6.toPeriod();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) duration6, periodType9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = period10.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod2 = hours1.toMutablePeriod();
        org.joda.time.Seconds seconds3 = hours1.toStandardSeconds();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.Period period7 = period2.plusDays(6);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period2.getFieldTypes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PeriodType[Standard]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Standard]\" is malformed at \"eriodType[Standard]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
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
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.minutes(2147483647);
        org.joda.time.Minutes minutes23 = minutes20.minus(minutes22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes25 = minutes23.multipliedBy(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483645 * 2147483645");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes23);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration15 = seconds14.toStandardDuration();
        int int16 = duration13.compareTo((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType20);
        org.joda.time.PeriodType periodType22 = periodType20.withMinutesRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant17, periodType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = period23.withMinutes((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours3 = hours1.dividedBy((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
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
            org.joda.time.Period period30 = periodFormatter28.parsePeriod("PT2S");
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
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks3 = weeks1.dividedBy(1);
        org.joda.time.PeriodType periodType4 = weeks3.getPeriodType();
        boolean boolean5 = weeks0.isLessThan(weeks3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks6 = weeks0.negated();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hours\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds11 = seconds9.plus(0);
        org.joda.time.Hours hours12 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours14 = hours12.multipliedBy((int) 'a');
        org.joda.time.PeriodType periodType15 = hours12.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) 0, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Period period15 = duration6.toPeriod();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        long long18 = duration17.getStandardSeconds();
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
        org.joda.time.Duration duration41 = duration17.plus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Duration duration42 = duration41.toDuration();
        int int43 = duration6.compareTo((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration46 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration48 = duration46.plus((long) (-1));
        int int49 = duration6.compareTo((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = duration48.toPeriod(chronology50);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-128849018880L) + "'", long18 == (-128849018880L));
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
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(period51);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Seconds seconds9 = seconds2.multipliedBy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = seconds9.getFieldType(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        org.joda.time.Period period12 = period6.withMinutes(1);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Days days14 = days13.negated();
        org.joda.time.Period period15 = days14.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer4, (org.joda.time.ReadablePeriod) period15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration10 = duration7.plus((long) (byte) 0);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) duration10, periodType12, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period14.withWeeks((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("P35W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("Seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
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
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType28);
        org.joda.time.PeriodType periodType32 = periodType28.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = new org.joda.time.Period((int) 'a', 0, 6, 2147483645, (int) ' ', 87, (int) (byte) 0, (int) (byte) 0, periodType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(periodType32);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PeriodType[Days]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Days]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) (byte) 10);
        org.joda.time.Minutes minutes2 = seconds1.toStandardMinutes();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
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
            org.joda.time.DurationFieldType durationFieldType18 = seconds10.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Weeks weeks3 = weeks1.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks4 = null;
        org.joda.time.Weeks weeks5 = weeks3.minus(weeks4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks3, chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period7.withMillis((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days3 = days0.minus(0);
        org.joda.time.Days days4 = days3.negated();
        org.joda.time.Duration duration5 = days3.toStandardDuration();
        java.lang.String str6 = days3.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P5D" + "'", str6, "P5D");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds((long) 10);
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
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        boolean boolean32 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) duration27, chronology33);
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration27, periodType35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period37 = new org.joda.time.Period((int) '4', 14400, (int) ' ', (int) (byte) 1, 0, 14400, 7, (int) (short) 100, periodType35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
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
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.Days days9 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days11 = days9.multipliedBy((int) (short) 100);
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.Days days15 = days12.minus(0);
        org.joda.time.Days days16 = days9.minus(days15);
        org.joda.time.PeriodType periodType17 = days9.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period((int) (short) 0, (int) 'a', (int) '4', (int) (byte) 0, (-1), 87, 7, 0, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        int int4 = hours3.getHours();
        java.lang.String str5 = hours3.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0H" + "'", str5, "PT0H");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
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
        java.lang.StringBuffer stringBuffer23 = null;
        org.joda.time.Days days25 = org.joda.time.Days.days((int) '4');
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) days25, chronology26);
        org.joda.time.Period period28 = period27.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer23, (org.joda.time.ReadablePeriod) period28);
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
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Period period4 = period1.multipliedBy((int) (byte) 100);
        org.joda.time.Hours hours5 = period1.toStandardHours();
        int int6 = hours5.size();
        java.lang.String str7 = hours5.toString();
        org.joda.time.Period period8 = hours5.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0H" + "'", str7, "PT0H");
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod25 = periodFormatter2.parseMutablePeriod("P1W");
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
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Period period15 = duration6.toPeriod();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        long long18 = duration17.getStandardSeconds();
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
        org.joda.time.Duration duration41 = duration17.plus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Duration duration42 = duration41.toDuration();
        int int43 = duration6.compareTo((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval45 = duration41.toIntervalTo(readableInstant44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
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
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-128849018880L) + "'", long18 == (-128849018880L));
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
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("Days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
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
        java.util.Locale locale20 = periodFormatter19.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = periodFormatter19.parsePeriod("P10D");
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
        org.junit.Assert.assertNull(locale20);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
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
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardSeconds((long) 0);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Period period33 = duration32.toPeriod();
        org.joda.time.Duration duration35 = duration32.plus((long) (byte) 0);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) duration35, periodType37, chronology38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant24, periodType37);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardMinutes(100L);
        boolean boolean43 = duration22.isLongerThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        boolean boolean45 = duration22.isLongerThan(readableDuration44);
        boolean boolean46 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration17, periodType47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = duration17.toPeriod(chronology49);
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
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(period50);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes10 = minutes8.multipliedBy(2);
        int int11 = minutes8.getMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isPrinter();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Weeks weeks13 = minutes12.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = periodFormatter2.print((org.joda.time.ReadablePeriod) minutes12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(weeks13);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(36L, chronology1);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        int int3 = hours0.getHours();
        org.joda.time.PeriodType periodType4 = hours0.getPeriodType();
        org.joda.time.Hours hours6 = hours0.plus((-2));
        int int7 = hours6.getHours();
        org.joda.time.Hours hours9 = org.joda.time.Hours.hours(100);
        org.joda.time.Hours hours10 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours11 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours13 = hours11.dividedBy(100);
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Period period20 = period18.minusSeconds(0);
        org.joda.time.Period period21 = period20.normalizedStandard();
        org.joda.time.Hours hours22 = period21.toStandardHours();
        boolean boolean23 = hours13.isLessThan(hours22);
        boolean boolean24 = hours10.isLessThan(hours13);
        org.joda.time.Duration duration25 = hours13.toStandardDuration();
        java.lang.String str26 = hours13.toString();
        org.joda.time.Period period28 = org.joda.time.Period.millis((int) '#');
        int int29 = period28.getYears();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.Period period31 = period28.withFields(readablePeriod30);
        org.joda.time.Hours hours32 = period28.toStandardHours();
        org.joda.time.Hours hours33 = hours13.minus(hours32);
        boolean boolean34 = hours9.isLessThan(hours32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours35 = hours6.plus(hours9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483645 + 100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483645 + "'", int7 == 2147483645);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0H" + "'", str26, "PT0H");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT0.001S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(52);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
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
        org.joda.time.Hours hours19 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours21 = hours19.dividedBy(100);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Period period28 = period26.minusSeconds(0);
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Hours hours30 = period29.toStandardHours();
        boolean boolean31 = hours21.isLessThan(hours30);
        org.joda.time.Period period33 = org.joda.time.Period.millis((int) '#');
        int int34 = period33.getYears();
        org.joda.time.Hours hours35 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period37 = period33.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours38 = period37.toStandardHours();
        org.joda.time.Hours hours39 = hours21.minus(hours38);
        boolean boolean40 = hours16.isLessThan(hours38);
        org.joda.time.Hours hours41 = org.joda.time.Hours.ONE;
        java.lang.String str42 = hours41.toString();
        org.joda.time.Hours hours43 = hours41.negated();
        org.joda.time.Hours hours44 = hours38.plus(hours41);
        org.joda.time.Hours hours46 = hours38.dividedBy(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType48 = hours46.getFieldType(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
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
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1H" + "'", str42, "PT1H");
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertNotNull(hours46);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("P2147483647W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT0.010S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Duration duration15 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration13, (int) (short) 100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = duration15.toPeriod(chronology16);
        long long18 = duration15.getMillis();
        org.joda.time.Duration duration21 = duration15.withDurationAdded((long) 52, (-2));
        org.joda.time.ReadableInstant readableInstant22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval23 = duration21.toIntervalFrom(readableInstant22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(duration21);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        org.joda.time.Period period12 = period10.minusMonths((int) 'a');
        org.joda.time.Period period13 = period2.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Hours hours14 = period2.toStandardHours();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period17.negated();
        org.joda.time.Period period19 = period2.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period19.withMonths(8);
        org.joda.time.Period period23 = period21.minusSeconds((-95));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P8MT0.036S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
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
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.seconds((int) '#');
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds21 = seconds19.plus(seconds20);
        org.joda.time.Seconds seconds23 = seconds19.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds24 = seconds18.plus(seconds19);
        boolean boolean25 = seconds1.isLessThan(seconds24);
        org.joda.time.DurationFieldType durationFieldType26 = seconds1.getFieldType();
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
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(durationFieldType26);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Minutes minutes1 = days0.toStandardMinutes();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.Days days1 = hours0.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = days1.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -89478485 * 1440");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.Period period1 = org.joda.time.Period.days((-95));
        org.joda.time.Period period3 = period1.multipliedBy(0);
        org.joda.time.Period period5 = period1.minusMinutes((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 0, periodType1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = period3.getFieldType(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
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
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str19 = periodType18.getName();
        org.joda.time.Period period20 = duration6.toPeriodTo(readableInstant17, periodType18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = period20.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "YearMonthDay" + "'", str19, "YearMonthDay");
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks4 = weeks0.dividedBy(8);
        java.lang.String str5 = weeks4.toString();
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeks(1);
        boolean boolean10 = weeks7.isGreaterThan(weeks9);
        org.joda.time.Weeks weeks11 = weeks4.minus(weeks7);
        boolean boolean13 = weeks11.equals((java.lang.Object) "P2147483647W");
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P268435455W" + "'", str5, "P268435455W");
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.Period period1 = org.joda.time.Period.millis(3);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        java.lang.String str7 = period4.toString();
        org.joda.time.Period period9 = period4.withMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = period4.getValue((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P-100M10D" + "'", str7, "P-100M10D");
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.minus(8);
        java.lang.String str4 = days3.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P-3D" + "'", str4, "P-3D");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.Duration duration3 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.days();
        boolean boolean10 = periodType8.isSupported(durationFieldType9);
        org.joda.time.PeriodType periodType11 = periodType8.withMinutesRemoved();
        int int12 = periodType8.size();
        org.joda.time.Period period13 = duration3.toPeriodFrom(readableInstant4, periodType8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) -1, (long) 4, periodType8, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = period15.plusMillis((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.standardHoursIn(readablePeriod0);
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod25 = periodFormatter2.parseMutablePeriod("P100W");
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
    }
}

