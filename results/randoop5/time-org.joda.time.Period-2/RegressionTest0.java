import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = period2.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) 0L, periodType1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = period5.withFieldAdded(durationFieldType6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) -1);
        org.joda.time.PeriodType periodType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) (byte) -1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 1, (-1), (int) (byte) 100, 0, (int) (short) -1, (int) (byte) 10, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
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
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        java.lang.Class<?> wildcardClass5 = period3.getClass();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType13 = period8.getPeriodType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) -1, periodType13, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) 100L, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("hi!", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.Period period18 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period20 = period16.withMonths((int) (byte) 0);
        org.joda.time.Period period22 = period16.plusWeeks((int) (byte) 1);
        boolean boolean23 = period7.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) '4');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.Period period1 = org.joda.time.Period.days(100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType13 = period8.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Days days8 = period5.toStandardDays();
        java.lang.Class<?> wildcardClass9 = days8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        int int9 = period4.getWeeks();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = period4.normalizedStandard(periodType10);
        org.joda.time.Period period12 = period1.minus((org.joda.time.ReadablePeriod) period11);
        int int13 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period3.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Minutes minutes9 = period6.toStandardMinutes();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '#', 100, (int) ' ', (int) ' ');
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        int int3 = period2.getHours();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType12);
        org.joda.time.Period period14 = period3.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period3.minusHours((int) ' ');
        org.joda.time.Chronology chronology17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) ' ', chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.Period period14 = period10.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType15, chronology16);
        org.joda.time.Chronology chronology18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) 'a', periodType15, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = period1.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        int int7 = period6.getHours();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        int int5 = period2.getDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period5.getWeeks();
        int int7 = period5.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = period5.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.minusMillis((int) ' ');
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusDays((int) (short) 0);
        org.joda.time.Period period4 = period2.plusSeconds((int) (short) -1);
        int int5 = period4.getMinutes();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        int int7 = period3.getSeconds();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Hours hours5 = period3.toStandardHours();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '#');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 100);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType14, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType14, chronology17);
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(weeks19);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) -1, periodType20, chronology21);
        org.joda.time.Period period23 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds24 = period23.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes13 = period11.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.Period period13 = period11.minusWeeks((-100));
        org.joda.time.Period period14 = period11.toPeriod();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period14.plusMonths((int) '#');
        org.joda.time.Period period18 = period14.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType19 = period14.getPeriodType();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) -1, periodType19, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration6, periodType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = new org.joda.time.Period((java.lang.Object) 10.0f, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period19.plusMonths(0);
        org.joda.time.Period period25 = period23.plusMonths((int) '#');
        org.joda.time.Period period27 = period23.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType28 = period23.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType28, chronology29);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period35.toDurationFrom(readableInstant36);
        org.joda.time.Period period39 = period35.plusMonths(0);
        org.joda.time.Period period41 = period39.plusMonths((int) '#');
        org.joda.time.Period period43 = period39.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType44 = period39.getPeriodType();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType44, chronology45);
        org.joda.time.Period period47 = period30.withPeriodType(periodType44);
        org.joda.time.Chronology chronology48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) (-1), periodType44, chronology48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        int int2 = period1.getMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = period3.get(durationFieldType4);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period24.plusMonths(0);
        org.joda.time.Period period30 = period28.plusMonths((int) '#');
        org.joda.time.Period period32 = period28.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType33 = period28.getPeriodType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) -1, periodType33, chronology34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration20, periodType33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) 100, periodType33, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) int5, periodType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.Period period8 = new org.joda.time.Period((int) 'a', (-100), 1, 0, 8, (-1), (int) (short) 0, 97);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT32M", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.minusMillis((int) ' ');
        org.joda.time.Hours hours15 = period11.toStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = period11.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours15);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = period1.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks11 = period1.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.Object obj8 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 'a', periodType12, chronology13);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.Period period20 = period14.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period14.withYears(10);
        org.joda.time.Period period23 = period22.toPeriod();
        org.joda.time.Period period25 = period22.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.Period period44 = period40.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType45 = period40.getPeriodType();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (short) -1, periodType45, chronology46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration32, periodType45);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (byte) 0, periodType45, chronology49);
        org.joda.time.Period period51 = period25.normalizedStandard(periodType45);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(0L, (long) 8, periodType45, chronology52);
        org.joda.time.Period period54 = new org.joda.time.Period(obj8, periodType45);
        org.joda.time.Period period55 = new org.joda.time.Period(8, (int) (byte) 10, (int) 'a', (-1), 10, (-1), (int) ' ', 100, periodType45);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant56, readableInstant57);
        org.joda.time.Period period59 = period58.normalizedStandard();
        org.joda.time.Period period61 = period58.plusMinutes((int) ' ');
        org.joda.time.Period period62 = period61.normalizedStandard();
        org.joda.time.Period period63 = new org.joda.time.Period((java.lang.Object) period62);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant65, readableInstant66);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Duration duration69 = period67.toDurationFrom(readableInstant68);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant71, readableInstant72);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Duration duration75 = period73.toDurationFrom(readableInstant74);
        org.joda.time.Period period77 = period73.plusMonths(0);
        org.joda.time.Period period79 = period77.plusMonths((int) '#');
        org.joda.time.Period period81 = period77.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType82 = period77.getPeriodType();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (short) -1, periodType82, chronology83);
        org.joda.time.Period period85 = new org.joda.time.Period(readableInstant64, (org.joda.time.ReadableDuration) duration69, periodType82);
        org.joda.time.Period period86 = period63.withPeriodType(periodType82);
        org.joda.time.Chronology chronology87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period88 = new org.joda.time.Period((java.lang.Object) periodType45, periodType82, chronology87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period86);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        int int18 = period14.getMonths();
        org.joda.time.Period period20 = period14.plusMinutes(100);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period34.plusMonths(0);
        org.joda.time.Period period40 = period38.plusMonths((int) '#');
        org.joda.time.Period period42 = period38.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType43 = period38.getPeriodType();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) (short) -1, periodType43, chronology44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration30, periodType43);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType43);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (-100), (long) (-100), periodType43, chronology48);
        org.joda.time.Chronology chronology50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period51 = new org.joda.time.Period((java.lang.Object) 100, periodType43, chronology50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.minusMillis((int) ' ');
        org.joda.time.Period period16 = period14.plusMillis((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = period14.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds13 = period6.toStandardSeconds();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Period period16 = period14.plusSeconds((int) (byte) 1);
        org.joda.time.Period period18 = period14.withWeeks((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        org.joda.time.Period period29 = period23.plus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType32);
        org.joda.time.Period period35 = period33.plusMonths((int) '4');
        org.joda.time.Period period36 = period27.withFields((org.joda.time.ReadablePeriod) period35);
        org.joda.time.PeriodType periodType37 = period35.getPeriodType();
        org.joda.time.Period period38 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType37);
        boolean boolean39 = period14.equals((java.lang.Object) period38);
        org.joda.time.Period period41 = period14.withMinutes(10);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Hours hours12 = period11.toStandardHours();
        org.joda.time.Period period13 = period7.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = period7.withYears(10);
        org.joda.time.Period period16 = period15.toPeriod();
        org.joda.time.Period period18 = period15.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period29.plusMonths(0);
        org.joda.time.Period period35 = period33.plusMonths((int) '#');
        org.joda.time.Period period37 = period33.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) -1, periodType38, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration25, periodType38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 0, periodType38, chronology42);
        org.joda.time.Period period44 = period18.normalizedStandard(periodType38);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(0L, (long) 8, periodType38, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) ' ', periodType38, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(10L, periodType38, chronology49);
        int int51 = period50.getMonths();
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 0, (long) 0, chronology2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) '4', periodType2, chronology3);
        org.joda.time.Period period6 = period4.plusMillis(0);
        org.joda.time.Period period8 = period6.plusDays((-100));
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = period2.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds14 = period11.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 10);
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.Period period1 = org.joda.time.Period.millis((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period8.toDurationFrom(readableInstant11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period36.plusMonths((int) '#');
        org.joda.time.Period period40 = period36.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType41 = period36.getPeriodType();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) -1, periodType41, chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration28, periodType41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) 100, periodType41, chronology45);
        org.joda.time.Period period47 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType41);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration12, periodType41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) periodType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
        org.joda.time.Period period16 = period14.minusDays(100);
        int int17 = period16.size();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        java.lang.Object obj6 = null;
        boolean boolean7 = period5.equals(obj6);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        int int6 = period2.getMonths();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) 1);
        org.joda.time.Hours hours2 = period1.toStandardHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        int int8 = period2.getWeeks();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period12.minusHours((int) (byte) -1);
        org.joda.time.Period period16 = period12.plusHours((int) (short) 100);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.Period period9 = period8.normalizedStandard();
        org.joda.time.Period period11 = period8.plusMinutes((int) ' ');
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period12);
        org.joda.time.format.PeriodFormatter periodFormatter14 = null;
        java.lang.String str15 = period13.toString(periodFormatter14);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period34.plusMonths(0);
        org.joda.time.Period period40 = period38.plusMonths((int) '#');
        org.joda.time.Period period42 = period38.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType43 = period38.getPeriodType();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) (short) -1, periodType43, chronology44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration30, periodType43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (short) 100, periodType43, chronology47);
        org.joda.time.Period period49 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType43);
        org.joda.time.Period period50 = new org.joda.time.Period((java.lang.Object) str15, periodType43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period51 = new org.joda.time.Period((java.lang.Object) 1, periodType43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT32M" + "'", str15, "PT32M");
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.withHours((-100));
        org.joda.time.Hours hours9 = period6.toStandardHours();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0.097S");
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.Period period18 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.Period period25 = period16.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 'a', periodType29, chronology30);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Hours hours36 = period35.toStandardHours();
        org.joda.time.Period period37 = period31.withFields((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Period period39 = period31.withYears(10);
        org.joda.time.Period period40 = period39.toPeriod();
        org.joda.time.Period period42 = period39.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant45, readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationFrom(readableInstant48);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant51, readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationFrom(readableInstant54);
        org.joda.time.Period period57 = period53.plusMonths(0);
        org.joda.time.Period period59 = period57.plusMonths((int) '#');
        org.joda.time.Period period61 = period57.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType62 = period57.getPeriodType();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) (short) -1, periodType62, chronology63);
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant44, (org.joda.time.ReadableDuration) duration49, periodType62);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((long) (byte) 0, periodType62, chronology66);
        org.joda.time.Period period68 = period42.normalizedStandard(periodType62);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(0L, (long) 8, periodType62, chronology69);
        org.joda.time.Period period71 = new org.joda.time.Period((java.lang.Object) period16, periodType62);
        org.joda.time.Period period72 = new org.joda.time.Period((int) 'a', 100, (int) (short) -1, 100, (int) (short) -1, (int) (byte) 1, 8, 100, periodType62);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period73 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType25);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType25);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((java.lang.Object) periodType6, periodType25, chronology30);
        org.joda.time.DurationFieldType durationFieldType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period34 = period31.withFieldAdded(durationFieldType32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.Period period11 = period7.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType12 = period7.getPeriodType();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) -1, periodType12, chronology13);
        org.joda.time.Period period16 = period14.minusYears(10);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 1, (long) (-100), chronology2);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.Period period1 = org.joda.time.Period.millis(8);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days14 = period13.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        org.joda.time.Period period5 = period3.withWeeks(100);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 'a');
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, (long) '#');
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period10.toDurationTo(readableInstant15);
        org.joda.time.Hours hours17 = period10.toStandardHours();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(hours17);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 100);
        org.joda.time.Hours hours2 = period1.toStandardHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period5.getWeeks();
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) int6, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) ' ');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMinutes((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(mutablePeriod13);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType14 = period10.getFieldType((int) (byte) 0);
        org.joda.time.Hours hours15 = period10.toStandardHours();
        int int16 = period10.getMinutes();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = period7.plusMonths(0);
        org.joda.time.Period period13 = period11.plusMonths((int) '#');
        org.joda.time.Period period15 = period11.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType16 = period11.getPeriodType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType16, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType16, chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) (byte) -1, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = period5.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        int int15 = period10.getHours();
        org.joda.time.Weeks weeks16 = period10.toStandardWeeks();
        org.joda.time.Period period18 = period10.plusHours(8);
        java.lang.Class<?> wildcardClass19 = period18.getClass();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT-10M", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.Period period4 = new org.joda.time.Period(10, (int) (short) -1, (int) 'a', 0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.Period period14 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.Period period20 = period18.plusMonths((int) '4');
        org.joda.time.Period period21 = period12.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.PeriodType periodType22 = period20.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', (long) 10, periodType22);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) 100, 100L, periodType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Seconds seconds9 = period6.toStandardSeconds();
        org.joda.time.Period period11 = period6.plusSeconds(0);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period8.toDurationFrom(readableInstant11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration12);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) '4', chronology2);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period2.plusWeeks((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = period8.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        int int2 = period1.getDays();
        org.joda.time.Period period4 = period1.plusSeconds(8);
        java.lang.Class<?> wildcardClass5 = period4.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        int int14 = period11.getMinutes();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '4');
        org.joda.time.Period period3 = period1.minusYears(1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.Period period21 = period18.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) (byte) 0);
        org.joda.time.Period period29 = period18.withField(durationFieldType27, 1);
        int int30 = period14.get(durationFieldType27);
        org.joda.time.Period period32 = period14.withDays(1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.Period period10 = period7.withMinutes((int) (byte) 10);
        int int11 = period7.getSeconds();
        org.joda.time.Period period13 = period7.minusMillis((int) (short) 10);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.Period period8 = new org.joda.time.Period((int) 'a', 100, (int) (byte) -1, 8, 1, (int) '4', (-1), (int) '4');
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.Period period30 = period26.plusMonths(0);
        org.joda.time.Period period32 = period30.plusMonths((int) '#');
        org.joda.time.Period period34 = period30.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, periodType35, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22, periodType35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType35, chronology39);
        org.joda.time.Period period41 = period12.withPeriodType(periodType35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType43 = period12.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType12);
        org.joda.time.Period period14 = period3.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period14.minusMonths((int) (short) 100);
        org.joda.time.Period period18 = period16.withMillis((int) '4');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.MutablePeriod mutablePeriod42 = period41.toMutablePeriod();
        org.joda.time.Period period43 = period37.plus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.Period period49 = period47.plusMonths((int) '4');
        org.joda.time.Period period50 = period41.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) 'a', periodType54, chronology55);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) 'a', periodType58, chronology59);
        org.joda.time.Hours hours61 = period60.toStandardHours();
        org.joda.time.Period period62 = period56.withFields((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Period period64 = period56.withYears(10);
        org.joda.time.Period period65 = period64.toPeriod();
        org.joda.time.Period period67 = period64.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant70, readableInstant71);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Duration duration74 = period72.toDurationFrom(readableInstant73);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant76, readableInstant77);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Duration duration80 = period78.toDurationFrom(readableInstant79);
        org.joda.time.Period period82 = period78.plusMonths(0);
        org.joda.time.Period period84 = period82.plusMonths((int) '#');
        org.joda.time.Period period86 = period82.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType87 = period82.getPeriodType();
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((long) (short) -1, periodType87, chronology88);
        org.joda.time.Period period90 = new org.joda.time.Period(readableInstant69, (org.joda.time.ReadableDuration) duration74, periodType87);
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period((long) (byte) 0, periodType87, chronology91);
        org.joda.time.Period period93 = period67.normalizedStandard(periodType87);
        org.joda.time.Chronology chronology94 = null;
        org.joda.time.Period period95 = new org.joda.time.Period(0L, (long) 8, periodType87, chronology94);
        org.joda.time.Period period96 = new org.joda.time.Period((java.lang.Object) period41, periodType87);
        org.joda.time.Period period97 = new org.joda.time.Period((int) 'a', 100, (int) (short) -1, 100, (int) (short) -1, (int) (byte) 1, 8, 100, periodType87);
        org.joda.time.Period period98 = new org.joda.time.Period((int) '#', (int) (byte) 0, 0, (int) ' ', (int) ' ', (-1), (int) (byte) 100, 97, periodType87);
        org.joda.time.Period period99 = new org.joda.time.Period((java.lang.Object) period16, periodType87);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(mutablePeriod42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(hours61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(periodType87);
        org.junit.Assert.assertNotNull(period93);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = period2.normalizedStandard(periodType8);
        int int10 = period9.getYears();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.Period period7 = period5.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period5.toDurationTo(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, periodType36, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration23, periodType36);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (-100), (long) (-100), periodType36, chronology41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) 0, (long) 100, periodType36, chronology43);
        org.joda.time.Period period45 = period11.withPeriodType(periodType36);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (byte) 10, (long) '4', periodType36, chronology46);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (short) 10, chronology57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant61, readableInstant62);
        org.joda.time.Period period64 = period63.normalizedStandard();
        org.joda.time.Period period66 = period63.plusMinutes((int) ' ');
        org.joda.time.Period period67 = period66.normalizedStandard();
        org.joda.time.Period period68 = new org.joda.time.Period((java.lang.Object) period67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant70, readableInstant71);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Duration duration74 = period72.toDurationFrom(readableInstant73);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant76, readableInstant77);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Duration duration80 = period78.toDurationFrom(readableInstant79);
        org.joda.time.Period period82 = period78.plusMonths(0);
        org.joda.time.Period period84 = period82.plusMonths((int) '#');
        org.joda.time.Period period86 = period82.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType87 = period82.getPeriodType();
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((long) (short) -1, periodType87, chronology88);
        org.joda.time.Period period90 = new org.joda.time.Period(readableInstant69, (org.joda.time.ReadableDuration) duration74, periodType87);
        org.joda.time.Period period91 = period68.withPeriodType(periodType87);
        org.joda.time.Chronology chronology92 = null;
        org.joda.time.Period period93 = new org.joda.time.Period((java.lang.Object) period58, periodType87, chronology92);
        org.joda.time.Period period94 = new org.joda.time.Period((int) (byte) -1, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0, (int) (byte) 100, (int) ' ', 0, periodType87);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period95 = new org.joda.time.Period((java.lang.Object) periodType36, periodType87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(periodType87);
        org.junit.Assert.assertNotNull(period91);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-100));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration11);
        java.lang.Class<?> wildcardClass13 = period12.getClass();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration12, periodType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 0, periodType25, chronology29);
        org.joda.time.Period period31 = period5.withPeriodType(periodType25);
        int int32 = period5.getDays();
        org.joda.time.Period period34 = period5.minusYears(8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Hours hours9 = period6.toStandardHours();
        org.joda.time.Period period10 = period6.normalizedStandard();
        org.joda.time.Period period12 = period6.plusDays(10);
        org.joda.time.Period period13 = period12.toPeriod();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = period3.get(durationFieldType4);
        int int6 = period3.getHours();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod8 = period5.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod9 = mutablePeriod8.toMutablePeriod();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Duration duration5 = period3.toStandardDuration();
        org.joda.time.Period period7 = period3.withDays((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = period7.getFieldType((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '#');
        org.joda.time.Period period8 = period4.withMonths((int) (byte) -1);
        org.joda.time.Period period10 = period4.minusSeconds((int) (short) 10);
        int int11 = period4.size();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType21 = period16.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType21);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 10, periodType21);
        org.joda.time.Period period27 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period29 = period27.plusMillis((int) 'a');
        boolean boolean30 = period25.equals((java.lang.Object) period29);
        int int31 = period29.getMonths();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 100);
        org.joda.time.Period period3 = period1.withMonths((int) (byte) 10);
        org.joda.time.Period period5 = period3.minusWeeks((int) (short) 0);
        int int6 = period5.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Period period10 = period7.plusMinutes((int) ' ');
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.Period period26 = period22.plusMonths(0);
        org.joda.time.Period period28 = period26.plusMonths((int) '#');
        org.joda.time.Period period30 = period26.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType31 = period26.getPeriodType();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) -1, periodType31, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration18, periodType31);
        org.joda.time.Period period35 = period12.withPeriodType(periodType31);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) period2, periodType31, chronology36);
        int int38 = period2.getMinutes();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod11 = period6.toMutablePeriod();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = period2.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.minusMillis((int) ' ');
        org.joda.time.Period period16 = period14.plusMillis((int) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 0, 1, (int) (byte) 0, (int) '4');
        org.joda.time.Period period6 = period4.minusMonths(8);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Duration duration5 = period3.toStandardDuration();
        int int6 = period3.getMinutes();
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period30.plusMonths(0);
        org.joda.time.Period period36 = period34.plusMonths((int) '#');
        org.joda.time.Period period38 = period34.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType39 = period34.getPeriodType();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (short) -1, periodType39, chronology40);
        org.joda.time.Period period42 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType39);
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 10, periodType39);
        org.joda.time.Period period44 = period16.withPeriodType(periodType39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType46 = period44.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '#');
        org.joda.time.Period period8 = period4.withMonths((int) (byte) -1);
        org.joda.time.Period period10 = period4.minusSeconds((int) (short) 10);
        int int11 = period4.getYears();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.Period period9 = period7.plusMinutes((int) '4');
        org.joda.time.Days days10 = period7.toStandardDays();
        int int11 = period7.getWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType14 = period10.getFieldType((int) (byte) 0);
        java.lang.String str15 = period10.toString();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period10.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period21 = period19.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.Period period27 = period25.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType30);
        org.joda.time.DurationFieldType durationFieldType33 = period31.getFieldType((int) (byte) 0);
        int int34 = period27.indexOf(durationFieldType33);
        org.joda.time.Period period36 = period19.withFieldAdded(durationFieldType33, 1);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableInstant38);
        org.joda.time.Period period40 = period39.normalizedStandard();
        int int41 = period39.getMillis();
        org.joda.time.Period period42 = period36.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period44 = period39.withSeconds((int) (byte) -1);
        org.joda.time.Period period45 = period10.plus((org.joda.time.ReadablePeriod) period39);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT100M" + "'", str15, "PT100M");
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.minusDays(8);
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = period5.getFieldTypes();
        org.joda.time.Duration duration7 = period5.toStandardDuration();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, (long) (-1), chronology14);
        org.joda.time.Period period17 = period15.plusMinutes((int) (short) 10);
        org.joda.time.Period period19 = period17.plusMinutes((-1));
        int int20 = period19.getWeeks();
        org.joda.time.Period period22 = period19.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period40.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period40.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.Period period58 = period56.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant59, readableInstant60, periodType61);
        org.joda.time.DurationFieldType durationFieldType64 = period62.getFieldType((int) (byte) 0);
        int int65 = period58.indexOf(durationFieldType64);
        int int66 = period50.get(durationFieldType64);
        org.joda.time.Period period68 = period40.withField(durationFieldType64, (int) (short) 0);
        boolean boolean69 = period33.isSupported(durationFieldType64);
        org.joda.time.Period period71 = period22.withField(durationFieldType64, (int) ' ');
        org.joda.time.Period period73 = period11.withField(durationFieldType64, 100);
        int int74 = period73.getMillis();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 97 + "'", int74 == 97);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.Object obj0 = null;
        org.joda.time.Period period1 = new org.joda.time.Period(obj0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.Period period7 = period5.plusDays((int) (short) 100);
        int int8 = period7.getWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) ' ');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType12);
        org.joda.time.Period period14 = period3.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period14.minusMonths((int) (short) 100);
        org.joda.time.Period period18 = period16.withMillis((int) '4');
        java.lang.Class<?> wildcardClass19 = period18.getClass();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Days days9 = period8.toStandardDays();
        int int10 = period8.getSeconds();
        org.joda.time.Period period12 = period8.minusWeeks((int) (short) 10);
        int int13 = period8.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period5.plusYears((int) (byte) 0);
        org.joda.time.Period period11 = period5.withMonths(0);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 'a', periodType13, chronology14);
        org.joda.time.Period period17 = period15.withMinutes(0);
        org.joda.time.Period period19 = period17.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod20 = period17.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period27.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period27.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.Period period39 = period37.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType42);
        org.joda.time.Period period45 = period43.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.DurationFieldType durationFieldType51 = period49.getFieldType((int) (byte) 0);
        int int52 = period45.indexOf(durationFieldType51);
        int int53 = period37.get(durationFieldType51);
        org.joda.time.Period period55 = period27.withField(durationFieldType51, (int) (short) 0);
        int int56 = mutablePeriod20.indexOf(durationFieldType51);
        int int57 = period11.get(durationFieldType51);
        org.joda.time.Period period62 = new org.joda.time.Period(97, (int) (short) 0, 100, (int) (short) 100);
        org.joda.time.Period period64 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((long) 'a', periodType66, chronology67);
        org.joda.time.Hours hours69 = period68.toStandardHours();
        org.joda.time.Period period71 = period68.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, readableInstant73, periodType74);
        org.joda.time.DurationFieldType durationFieldType77 = period75.getFieldType((int) (byte) 0);
        org.joda.time.Period period79 = period68.withField(durationFieldType77, 1);
        boolean boolean80 = period64.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant81, readableInstant82, periodType83);
        org.joda.time.Period period86 = period84.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant87 = null;
        org.joda.time.ReadableInstant readableInstant88 = null;
        org.joda.time.PeriodType periodType89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period(readableInstant87, readableInstant88, periodType89);
        org.joda.time.DurationFieldType durationFieldType92 = period90.getFieldType((int) (byte) 0);
        int int93 = period86.indexOf(durationFieldType92);
        org.joda.time.Period period95 = period64.withFieldAdded(durationFieldType92, (int) (short) 0);
        int int96 = period62.get(durationFieldType92);
        boolean boolean97 = period11.isSupported(durationFieldType92);
        org.joda.time.format.PeriodFormatter periodFormatter98 = null;
        java.lang.String str99 = period11.toString(periodFormatter98);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(hours69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(durationFieldType77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(durationFieldType92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "PT0.011S" + "'", str99, "PT0.011S");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.Period period4 = new org.joda.time.Period((int) ' ', 0, (int) (short) 10, 100);
        org.joda.time.Hours hours5 = period4.toStandardHours();
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period9.minusMinutes(10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        java.lang.Object obj10 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 'a', periodType14, chronology15);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.Hours hours21 = period20.toStandardHours();
        org.joda.time.Period period22 = period16.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period24 = period16.withYears(10);
        org.joda.time.Period period25 = period24.toPeriod();
        org.joda.time.Period period27 = period24.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period38.plusMonths(0);
        org.joda.time.Period period44 = period42.plusMonths((int) '#');
        org.joda.time.Period period46 = period42.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType47 = period42.getPeriodType();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (short) -1, periodType47, chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration34, periodType47);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) 0, periodType47, chronology51);
        org.joda.time.Period period53 = period27.normalizedStandard(periodType47);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(0L, (long) 8, periodType47, chronology54);
        org.joda.time.Period period56 = new org.joda.time.Period(obj10, periodType47);
        org.joda.time.Period period57 = new org.joda.time.Period(8, (int) (byte) 10, (int) 'a', (-1), 10, (-1), (int) ' ', 100, periodType47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period58 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period53);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period10.toDurationTo(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant17);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period7.getFieldTypes();
        org.joda.time.Period period10 = period7.withDays((int) (byte) 10);
        org.joda.time.Period period12 = period7.plusHours((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = period15.plusMonths(0);
        org.joda.time.Period period21 = period19.plusMonths((int) '#');
        org.joda.time.Period period23 = period19.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType24 = period19.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, periodType24, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration11, periodType24);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType24);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (-100), (long) (-100), periodType24, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 0, (long) 100, periodType24, chronology31);
        org.joda.time.Period period34 = period32.withWeeks(1);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period11.plusMillis(1);
        int int15 = period14.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours16 = period14.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Period period6 = period3.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType9);
        org.joda.time.DurationFieldType durationFieldType12 = period10.getFieldType((int) (byte) 0);
        org.joda.time.Period period14 = period3.withField(durationFieldType12, 1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths(0);
        org.joda.time.Period period23 = period21.plusMonths((int) '#');
        org.joda.time.Period period25 = period21.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period28.plusMonths(0);
        org.joda.time.Period period34 = period32.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period32.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period32.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.Period period44 = period42.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.Period period50 = period48.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, readableInstant52, periodType53);
        org.joda.time.DurationFieldType durationFieldType56 = period54.getFieldType((int) (byte) 0);
        int int57 = period50.indexOf(durationFieldType56);
        int int58 = period42.get(durationFieldType56);
        org.joda.time.Period period60 = period32.withField(durationFieldType56, (int) (short) 0);
        boolean boolean61 = period25.isSupported(durationFieldType56);
        org.joda.time.Period period63 = period14.withFieldAdded(durationFieldType56, 1);
        org.joda.time.Period period65 = period14.plusWeeks(0);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1);
        org.joda.time.Period period3 = period1.minusMonths(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period5.withMinutes((-1));
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = period7.normalizedStandard(periodType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.Period period22 = period18.plusMonths(0);
        org.joda.time.Period period24 = period22.plusMonths((int) '#');
        org.joda.time.Period period26 = period22.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType27 = period22.getPeriodType();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType27, chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType27);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType27);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) periodType8, periodType27, chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period34 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        int int8 = period7.getDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds13 = period6.toStandardSeconds();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period6);
        int int15 = period14.getDays();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(10L, 1L, chronology2);
        int int4 = period3.getDays();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        int int18 = period17.getYears();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration14 = period11.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Period period13 = period11.withMinutes(0);
        org.joda.time.Period period15 = period13.minusSeconds((int) (short) 100);
        org.joda.time.Period period17 = period15.withWeeks((int) (short) -1);
        org.joda.time.Period period18 = period7.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Seconds seconds19 = period7.toStandardSeconds();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(seconds19);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.Period period7 = period5.withYears(0);
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period5);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.Period period26 = period22.plusMonths(0);
        org.joda.time.Period period28 = period26.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period26.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period26.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType35);
        org.joda.time.Period period38 = period36.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.Period period44 = period42.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.DurationFieldType durationFieldType50 = period48.getFieldType((int) (byte) 0);
        int int51 = period44.indexOf(durationFieldType50);
        int int52 = period36.get(durationFieldType50);
        org.joda.time.Period period54 = period26.withField(durationFieldType50, (int) (short) 0);
        boolean boolean55 = period19.isSupported(durationFieldType50);
        int int56 = period5.get(durationFieldType50);
        java.lang.String str57 = period5.toString();
        int int58 = period5.getDays();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "P52M" + "'", str57, "P52M");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.DurationFieldType durationFieldType2 = period0.getFieldType(1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        org.joda.time.Period period16 = period10.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.Period period22 = period20.plusMonths((int) '4');
        org.joda.time.Period period23 = period14.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.PeriodType periodType24 = period22.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType24);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 0, periodType24);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType24);
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) period0, periodType24);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.Period period1 = org.joda.time.Period.months((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod8 = period5.toMutablePeriod();
        org.joda.time.Days days9 = period5.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = period5.getValue(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(days9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = period1.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period13 = period3.withMinutes((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        org.joda.time.Period period28 = period22.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.Period period34 = period32.plusMonths((int) '4');
        org.joda.time.Period period35 = period26.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.PeriodType periodType36 = period34.getPeriodType();
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType36);
        org.joda.time.Period period38 = new org.joda.time.Period((long) 'a', (long) 10, periodType36);
        org.joda.time.Period period39 = new org.joda.time.Period((long) (short) 100, 100L, periodType36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) (byte) 1, periodType36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Duration duration6 = period2.toStandardDuration();
        org.joda.time.Period period8 = period2.minusDays((int) (short) 0);
        org.joda.time.Days days9 = period8.toStandardDays();
        int[] intArray10 = period8.getValues();
        java.lang.Class<?> wildcardClass11 = period8.getClass();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.withWeeks((int) (short) -1);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', periodType11, chronology12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', periodType15, chronology16);
        org.joda.time.Hours hours18 = period17.toStandardHours();
        org.joda.time.Period period19 = period13.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period13.withYears(10);
        org.joda.time.Period period23 = period13.minusWeeks((int) (short) -1);
        java.lang.String str24 = period13.toString();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period13.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.MutablePeriod mutablePeriod40 = period39.toMutablePeriod();
        org.joda.time.Period period41 = period35.plus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.Period period47 = period45.plusMonths((int) '4');
        org.joda.time.Period period48 = period39.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.PeriodType periodType49 = period47.getPeriodType();
        org.joda.time.Period period50 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType49);
        org.joda.time.Period period51 = new org.joda.time.Period((long) 'a', (long) 10, periodType49);
        org.joda.time.Period period52 = new org.joda.time.Period((long) (short) 100, 100L, periodType49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((java.lang.Object) duration26, periodType49, chronology53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period55 = new org.joda.time.Period((java.lang.Object) (short) -1, periodType49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.097S" + "'", str24, "PT0.097S");
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        org.joda.time.Period period4 = period2.withMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours5 = period4.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.plusMinutes((-1));
        org.joda.time.Period period10 = period6.plusMonths((int) (short) 100);
        org.joda.time.Period period12 = period6.minusWeeks((int) (byte) 100);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.plusMillis((int) (byte) 100);
        org.joda.time.Weeks weeks13 = period12.toStandardWeeks();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        int int6 = period2.getMillis();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType20, chronology21);
        boolean boolean23 = period2.equals((java.lang.Object) period22);
        int int24 = period2.getWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.withHours((-100));
        org.joda.time.MutablePeriod mutablePeriod9 = period6.toMutablePeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray10 = period6.getFieldTypes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(durationFieldTypeArray10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        int int11 = period10.getMinutes();
        org.joda.time.Period period13 = period10.minusWeeks(0);
        org.joda.time.Period period15 = period13.minusDays(100);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration12, periodType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 0, periodType25, chronology29);
        org.joda.time.Period period31 = period5.withPeriodType(periodType25);
        org.joda.time.Period period33 = period31.withYears((-100));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.Period period1 = org.joda.time.Period.months(97);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 1, (int) (short) 10, 97, (int) (byte) 1, 8, (int) (short) -1, 97, 8);
        int int10 = period8.getValue(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period17.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period17.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType32);
        org.joda.time.Period period35 = period33.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.DurationFieldType durationFieldType41 = period39.getFieldType((int) (byte) 0);
        int int42 = period35.indexOf(durationFieldType41);
        int int43 = period27.get(durationFieldType41);
        org.joda.time.Period period45 = period17.withField(durationFieldType41, (int) (short) 0);
        boolean boolean46 = period10.isSupported(durationFieldType41);
        int int47 = period10.getMonths();
        org.joda.time.MutablePeriod mutablePeriod48 = period10.toMutablePeriod();
        int[] intArray49 = mutablePeriod48.getValues();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, 0, 100, 0, 0]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0.011S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.Period period8 = new org.joda.time.Period(0, (int) ' ', (int) (byte) 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusWeeks((int) (short) -1);
        org.joda.time.Period period5 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = period9.get(durationFieldType10);
        org.joda.time.Period period12 = period5.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period14 = period12.multipliedBy((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period20 = period17.plusMinutes((int) ' ');
        org.joda.time.Period period21 = period20.normalizedStandard();
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) period21);
        org.joda.time.format.PeriodFormatter periodFormatter23 = null;
        java.lang.String str24 = period22.toString(periodFormatter23);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.Period period51 = period47.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType52 = period47.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) -1, periodType52, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration39, periodType52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (short) 100, periodType52, chronology56);
        org.joda.time.Period period58 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType52);
        org.joda.time.Period period59 = new org.joda.time.Period((java.lang.Object) str24, periodType52);
        org.joda.time.Period period60 = period14.withPeriodType(periodType52);
        org.joda.time.Period period61 = new org.joda.time.Period((java.lang.Object) period1, periodType52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT32M" + "'", str24, "PT32M");
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period60);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.Period period1 = org.joda.time.Period.hours(10);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.Period period8 = period5.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.DurationFieldType durationFieldType14 = period12.getFieldType((int) (byte) 0);
        org.joda.time.Period period16 = period5.withField(durationFieldType14, 1);
        int int17 = period1.indexOf(durationFieldType14);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        org.joda.time.Period period5 = period4.negated();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.Period period11 = period9.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.DurationFieldType durationFieldType17 = period15.getFieldType((int) (byte) 0);
        int int18 = period11.indexOf(durationFieldType17);
        org.joda.time.Period period20 = period4.withField(durationFieldType17, 10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(0L, chronology22);
        org.joda.time.Period period25 = period23.minusMillis((int) (short) 0);
        org.joda.time.Period period26 = period4.minus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period28 = period26.withDays((int) (short) 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period9.minusSeconds((int) '#');
        org.joda.time.Period period34 = period32.minusMillis((int) (byte) 10);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 1);
        org.joda.time.Period period3 = period1.plusMillis((int) ' ');
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = period16.plusMillis(100);
        org.joda.time.Period period21 = period16.minusMonths(98);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Hours hours26 = period25.toStandardHours();
        org.joda.time.Period period27 = period21.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period21.withYears(10);
        org.joda.time.Period period30 = period29.toPeriod();
        org.joda.time.Period period32 = period29.plusMillis(1);
        org.joda.time.Period period33 = period14.minus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period35 = period33.plusHours(0);
        org.joda.time.Period period37 = period33.withMillis((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 0, 1, (int) (byte) 0, (int) '4');
        org.joda.time.Period period6 = org.joda.time.Period.weeks(97);
        org.joda.time.Period period7 = period4.plus((org.joda.time.ReadablePeriod) period6);
        int int8 = period4.getSeconds();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.Period period30 = period26.plusMonths(0);
        org.joda.time.Period period32 = period30.plusMonths((int) '#');
        org.joda.time.Period period34 = period30.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, periodType35, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22, periodType35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) 100, periodType35, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType35);
        org.joda.time.Period period42 = new org.joda.time.Period((int) (byte) 1, 97, (-100), (int) (short) 1, (int) 'a', 100, (int) 'a', (int) '#', periodType35);
        int int43 = period42.getSeconds();
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Period period10 = period7.plusMinutes((int) ' ');
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.Period period26 = period22.plusMonths(0);
        org.joda.time.Period period28 = period26.plusMonths((int) '#');
        org.joda.time.Period period30 = period26.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType31 = period26.getPeriodType();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) -1, periodType31, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration18, periodType31);
        org.joda.time.Period period35 = period12.withPeriodType(periodType31);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) period2, periodType31, chronology36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology40);
        java.lang.String str42 = period41.toString();
        org.joda.time.Period period43 = new org.joda.time.Period((java.lang.Object) str42);
        org.joda.time.Period period45 = period43.plusSeconds((int) 'a');
        org.joda.time.Period period47 = period43.plusYears((int) (byte) 0);
        org.joda.time.Period period49 = period43.withMonths(0);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 'a', periodType51, chronology52);
        org.joda.time.Period period55 = period53.withMinutes(0);
        org.joda.time.Period period57 = period55.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod58 = period55.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant59, readableInstant60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = period61.toDurationFrom(readableInstant62);
        org.joda.time.Period period65 = period61.plusMonths(0);
        org.joda.time.Period period67 = period65.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Duration duration69 = period65.toDurationFrom(readableInstant68);
        org.joda.time.Period period71 = period65.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, readableInstant73, periodType74);
        org.joda.time.Period period77 = period75.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant78, readableInstant79, periodType80);
        org.joda.time.Period period83 = period81.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.Period period87 = new org.joda.time.Period(readableInstant84, readableInstant85, periodType86);
        org.joda.time.DurationFieldType durationFieldType89 = period87.getFieldType((int) (byte) 0);
        int int90 = period83.indexOf(durationFieldType89);
        int int91 = period75.get(durationFieldType89);
        org.joda.time.Period period93 = period65.withField(durationFieldType89, (int) (short) 0);
        int int94 = mutablePeriod58.indexOf(durationFieldType89);
        int int95 = period49.get(durationFieldType89);
        boolean boolean96 = period37.isSupported(durationFieldType89);
        org.joda.time.Period period98 = period37.withHours(8);
        int int99 = period98.getMillis();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT0.011S" + "'", str42, "PT0.011S");
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(mutablePeriod58);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(durationFieldType89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(period98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 10 + "'", int99 == 10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.Period period19 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.Period period25 = period23.plusMonths((int) '4');
        org.joda.time.Period period26 = period17.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.PeriodType periodType27 = period25.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType27);
        org.joda.time.Period period29 = new org.joda.time.Period((long) 'a', (long) 10, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 100, 100L, periodType27);
        org.joda.time.Period period31 = period3.withPeriodType(periodType27);
        int int32 = period3.getYears();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.format.PeriodFormatter periodFormatter10 = null;
        java.lang.String str11 = period7.toString(periodFormatter10);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT-99.903S" + "'", str11, "PT-99.903S");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 1, (int) (short) 10, 97, (int) (byte) 1, 8, (int) (short) -1, 97, 8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days9 = period8.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusDays((int) (short) 0);
        int int3 = period0.getYears();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = period1.plusWeeks((int) (byte) 0);
        org.joda.time.Period period21 = period19.plusSeconds(1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.Period period30 = period26.plusMonths(0);
        org.joda.time.Period period32 = period30.plusMonths((int) '#');
        org.joda.time.Period period34 = period30.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, periodType35, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22, periodType35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) 100, periodType35, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType35);
        org.joda.time.Period period42 = new org.joda.time.Period((int) (byte) 1, 97, (-100), (int) (short) 1, (int) 'a', 100, (int) 'a', (int) '#', periodType35);
        org.joda.time.Chronology chronology43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) periodType35, chronology43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType18);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.Period period21 = period15.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.Period period27 = period25.plusMonths((int) '4');
        org.joda.time.Period period28 = period19.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.PeriodType periodType29 = period27.getPeriodType();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant12, periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration11);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Days days9 = period8.toStandardDays();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) days9, chronology10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period12.minusHours((int) (byte) -1);
        org.joda.time.Period period15 = period14.normalizedStandard();
        org.joda.time.format.PeriodFormatter periodFormatter16 = null;
        java.lang.String str17 = period15.toString(periodFormatter16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days18 = period15.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P10YT1H0.097S" + "'", str17, "P10YT1H0.097S");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        int[] intArray17 = period16.getValues();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 1, 40, 0, 0]");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        int int6 = period5.getSeconds();
        org.joda.time.Weeks weeks7 = period5.toStandardWeeks();
        org.joda.time.Period period9 = period5.minusMinutes(98);
        int int10 = period9.getDays();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        int int8 = period2.getMinutes();
        org.joda.time.Period period10 = period2.withMinutes((int) (short) -1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0S");
        java.lang.Class<?> wildcardClass2 = period1.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 100);
        org.joda.time.Period period3 = period1.withMonths((int) (byte) 10);
        org.joda.time.Period period5 = period3.minusWeeks((int) (short) 0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period4 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period6 = period4.minusYears(100);
        org.joda.time.Period period7 = period6.negated();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType10);
        org.joda.time.Period period13 = period11.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.DurationFieldType durationFieldType19 = period17.getFieldType((int) (byte) 0);
        int int20 = period13.indexOf(durationFieldType19);
        org.joda.time.Period period22 = period6.withField(durationFieldType19, 10);
        boolean boolean23 = period1.isSupported(durationFieldType19);
        org.joda.time.Chronology chronology24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) durationFieldType19, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        org.joda.time.Period period5 = period3.withWeeks(100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period5.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period2.plusWeeks((int) ' ');
        org.joda.time.Period period10 = period2.plusMinutes((-1));
        org.joda.time.Period period12 = period10.plusSeconds((-100));
        org.joda.time.Period period14 = period10.withDays((int) (short) 10);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.Period period3 = period1.withWeeks((int) (short) 0);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period10 = period7.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.DurationFieldType durationFieldType16 = period14.getFieldType((int) (byte) 0);
        org.joda.time.Period period18 = period7.withField(durationFieldType16, 1);
        org.joda.time.Period period19 = period1.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = period19.normalizedStandard(periodType20);
        org.joda.time.Period period23 = period19.minusYears((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        int int6 = period5.getSeconds();
        org.joda.time.Period period8 = period5.plusMinutes(8);
        int int9 = period5.getSeconds();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) -1);
        int int2 = period1.getWeeks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray2 = period1.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldTypeArray2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period10.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours12 = period10.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', (long) (short) 100);
        org.joda.time.Period period4 = period2.minusHours((int) (short) 10);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.Period period19 = period18.negated();
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = period19.indexOf(durationFieldType20);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) -1, periodType20, chronology21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration7, periodType20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType20, chronology24);
        java.lang.Class<?> wildcardClass26 = period25.getClass();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.Period period5 = period3.withYears((int) '4');
        org.joda.time.Period period7 = period3.withYears((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = period3.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period9.minusSeconds((int) '#');
        org.joda.time.Period period34 = period32.minusMillis((-1));
        org.joda.time.Period period36 = period32.minusSeconds(10);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) 100, (long) (-1), chronology39);
        org.joda.time.Period period42 = period40.plusMinutes((int) (short) 10);
        org.joda.time.Period period44 = period42.plusMinutes((-1));
        int int45 = period44.getWeeks();
        org.joda.time.Period period47 = period44.withMinutes((int) (byte) 10);
        org.joda.time.PeriodType periodType48 = period47.getPeriodType();
        org.joda.time.Period period49 = period36.withPeriodType(periodType48);
        java.lang.Class<?> wildcardClass50 = period36.getClass();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 0, (-1), (int) (short) 100, (int) (short) 10, (-100), (-1), 100, 97);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = period12.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT-99.903S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Period period6 = period3.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType9);
        org.joda.time.DurationFieldType durationFieldType12 = period10.getFieldType((int) (byte) 0);
        org.joda.time.Period period14 = period3.withField(durationFieldType12, 1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (short) 10, chronology16);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Hours hours26 = period25.toStandardHours();
        org.joda.time.Period period27 = period21.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period21.withYears(10);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period32.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant39, readableInstant40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        org.joda.time.Period period45 = period41.plusMonths(0);
        org.joda.time.Period period47 = period45.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period45.toDurationFrom(readableInstant48);
        org.joda.time.Period period51 = period45.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant52, readableInstant53, periodType54);
        org.joda.time.Period period57 = period55.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant58, readableInstant59, periodType60);
        org.joda.time.Period period63 = period61.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant64, readableInstant65, periodType66);
        org.joda.time.DurationFieldType durationFieldType69 = period67.getFieldType((int) (byte) 0);
        int int70 = period63.indexOf(durationFieldType69);
        int int71 = period55.get(durationFieldType69);
        org.joda.time.Period period73 = period45.withField(durationFieldType69, (int) (short) 0);
        int int74 = period38.indexOf(durationFieldType69);
        int int75 = period29.get(durationFieldType69);
        int int76 = period17.get(durationFieldType69);
        org.joda.time.Period period78 = period14.withField(durationFieldType69, 100);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(durationFieldType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Weeks weeks8 = period6.toStandardWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.Period period7 = period5.plusDays((int) (short) 100);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period5.toString(periodFormatter8);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT-1M" + "'", str9, "PT-1M");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.Period period14 = period10.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType15, chronology16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType15);
        int int19 = period18.getSeconds();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, (long) ' ', chronology15);
        org.joda.time.Period period18 = period16.plusHours(1);
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology22);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) str24);
        org.joda.time.Period period27 = period25.plusSeconds((int) 'a');
        org.joda.time.Period period29 = period25.plusYears((int) (byte) 0);
        org.joda.time.Period period31 = period25.withMonths(0);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Period period37 = period35.withMinutes(0);
        org.joda.time.Period period39 = period37.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod40 = period37.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period47.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period47.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.Period period59 = period57.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.DurationFieldType durationFieldType71 = period69.getFieldType((int) (byte) 0);
        int int72 = period65.indexOf(durationFieldType71);
        int int73 = period57.get(durationFieldType71);
        org.joda.time.Period period75 = period47.withField(durationFieldType71, (int) (short) 0);
        int int76 = mutablePeriod40.indexOf(durationFieldType71);
        int int77 = period31.get(durationFieldType71);
        org.joda.time.Period period79 = period18.withFieldAdded(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period81 = period2.withField(durationFieldType71, 0);
        org.joda.time.Period period82 = period81.toPeriod();
        org.joda.time.Period period84 = period81.plusMillis((int) (short) 10);
        org.joda.time.Period period86 = period81.minusMonths(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.011S" + "'", str24, "PT0.011S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        int int9 = period8.size();
        org.joda.time.format.PeriodFormatter periodFormatter10 = null;
        java.lang.String str11 = period8.toString(periodFormatter10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P8Y100M10W8DT97H100M32S" + "'", str11, "P8Y100M10W8DT97H100M32S");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.Period period8 = new org.joda.time.Period((int) ' ', (int) '4', (int) (short) 0, (-100), 0, (int) (short) 10, 0, (int) (short) 1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.Period period3 = period1.withMinutes((int) '#');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) (short) 10, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.Period period14 = period10.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType15, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 'a', periodType15, chronology18);
        org.joda.time.Period period20 = new org.joda.time.Period((long) (short) 10, periodType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType22 = period20.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 10);
        org.joda.time.Period period3 = period1.minusSeconds((int) '4');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.Period period22 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.Period period28 = period26.plusMonths((int) '4');
        org.joda.time.Period period29 = period20.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = period28.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType30);
        org.joda.time.Period period32 = period11.withPeriodType(periodType30);
        org.joda.time.Period period34 = period11.plusSeconds(11);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 0);
        int[] intArray2 = period1.getValues();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period9.minusSeconds((int) '#');
        org.joda.time.MutablePeriod mutablePeriod33 = period9.toMutablePeriod();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(mutablePeriod33);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.Period period13 = period9.plusMonths(0);
        org.joda.time.Period period15 = period13.plusMonths((int) '#');
        org.joda.time.Period period17 = period13.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType18 = period13.getPeriodType();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (short) -1, periodType18, chronology19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5, periodType18);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray23 = mutablePeriod22.getFieldTypes();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(durationFieldTypeArray23);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        org.joda.time.Period period3 = period1.withMonths(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours4 = period3.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period13 = period2.normalizedStandard();
        org.joda.time.Period period15 = period2.plusSeconds((int) 'a');
        org.joda.time.Period period17 = period2.plusHours((int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = period2.getClass();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.Period period7 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Hours hours12 = period11.toStandardHours();
        org.joda.time.Period period14 = period11.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.DurationFieldType durationFieldType20 = period18.getFieldType((int) (byte) 0);
        org.joda.time.Period period22 = period11.withField(durationFieldType20, 1);
        boolean boolean23 = period7.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType32);
        org.joda.time.DurationFieldType durationFieldType35 = period33.getFieldType((int) (byte) 0);
        int int36 = period29.indexOf(durationFieldType35);
        org.joda.time.Period period38 = period7.withFieldAdded(durationFieldType35, (int) (short) 0);
        org.joda.time.Period period40 = period3.withFieldAdded(durationFieldType35, (int) '#');
        int int41 = period40.getMillis();
        org.joda.time.Chronology chronology42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period43 = new org.joda.time.Period((java.lang.Object) int41, chronology42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period10.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period10.toDurationTo(readableInstant12);
        int int14 = period10.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        java.lang.Class<?> wildcardClass18 = period17.getClass();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT8S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period17.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period17.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds24 = period17.toStandardSeconds();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) period17);
        org.joda.time.Period period27 = period25.withMinutes((int) '#');
        int int28 = period27.getMillis();
        org.joda.time.Period period29 = period1.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period31 = period1.minusMillis((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        org.joda.time.Period period5 = period4.negated();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.Period period11 = period9.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.DurationFieldType durationFieldType17 = period15.getFieldType((int) (byte) 0);
        int int18 = period11.indexOf(durationFieldType17);
        org.joda.time.Period period20 = period4.withField(durationFieldType17, 10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(0L, chronology22);
        org.joda.time.Period period25 = period23.minusMillis((int) (short) 0);
        org.joda.time.Period period26 = period4.minus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.format.PeriodFormatter periodFormatter27 = null;
        java.lang.String str28 = period4.toString(periodFormatter27);
        org.joda.time.Period period33 = new org.joda.time.Period(97, (int) (short) 0, 100, (int) (short) 100);
        org.joda.time.Period period35 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 'a', periodType37, chronology38);
        org.joda.time.Hours hours40 = period39.toStandardHours();
        org.joda.time.Period period42 = period39.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType45);
        org.joda.time.DurationFieldType durationFieldType48 = period46.getFieldType((int) (byte) 0);
        org.joda.time.Period period50 = period39.withField(durationFieldType48, 1);
        boolean boolean51 = period35.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant52, readableInstant53, periodType54);
        org.joda.time.Period period57 = period55.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant58, readableInstant59, periodType60);
        org.joda.time.DurationFieldType durationFieldType63 = period61.getFieldType((int) (byte) 0);
        int int64 = period57.indexOf(durationFieldType63);
        org.joda.time.Period period66 = period35.withFieldAdded(durationFieldType63, (int) (short) 0);
        int int67 = period33.get(durationFieldType63);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant68, readableInstant69);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = period70.toDurationFrom(readableInstant71);
        org.joda.time.Period period74 = period70.plusMonths(0);
        org.joda.time.Period period76 = period74.plusMonths((int) '#');
        org.joda.time.Period period78 = period74.plusMinutes((int) (short) 100);
        org.joda.time.Period period80 = period78.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType82 = period78.getFieldType((int) (byte) 0);
        boolean boolean83 = period33.isSupported(durationFieldType82);
        int int84 = period4.indexOf(durationFieldType82);
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.Duration duration86 = period4.toDurationFrom(readableInstant85);
        org.joda.time.Period period88 = period4.multipliedBy((int) 'a');
        java.lang.String str89 = period88.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "P-100YT0.001S" + "'", str28, "P-100YT0.001S");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(hours40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(durationFieldType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "P-9700YT0.097S" + "'", str89, "P-9700YT0.097S");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = period9.withSeconds((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.Period period15 = period14.normalizedStandard();
        org.joda.time.Period period17 = period14.withWeeks(1);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.Period period23 = period21.withMinutes(0);
        org.joda.time.Period period24 = period14.minus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period27.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period40.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period40.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.Period period58 = period56.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant59, readableInstant60, periodType61);
        org.joda.time.DurationFieldType durationFieldType64 = period62.getFieldType((int) (byte) 0);
        int int65 = period58.indexOf(durationFieldType64);
        int int66 = period50.get(durationFieldType64);
        org.joda.time.Period period68 = period40.withField(durationFieldType64, (int) (short) 0);
        int int69 = period33.indexOf(durationFieldType64);
        org.joda.time.Period period71 = period23.withField(durationFieldType64, (int) (short) 0);
        org.joda.time.Period period73 = period11.withField(durationFieldType64, 8);
        org.joda.time.format.PeriodFormatter periodFormatter74 = null;
        java.lang.String str75 = period11.toString(periodFormatter74);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PT-100M1.097S" + "'", str75, "PT-100M1.097S");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.Period period30 = period26.plusMonths(0);
        org.joda.time.Period period32 = period30.plusMonths((int) '#');
        org.joda.time.Period period34 = period30.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, periodType35, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22, periodType35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType35, chronology39);
        org.joda.time.Period period41 = period12.withPeriodType(periodType35);
        org.joda.time.Duration duration42 = period41.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period45 = org.joda.time.Period.days(10);
        int int46 = period45.getDays();
        org.joda.time.Period period48 = period45.plusSeconds(8);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant62, readableInstant63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period64.toDurationFrom(readableInstant65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant68, readableInstant69);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = period70.toDurationFrom(readableInstant71);
        org.joda.time.Period period74 = period70.plusMonths(0);
        org.joda.time.Period period76 = period74.plusMonths((int) '#');
        org.joda.time.Period period78 = period74.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType79 = period74.getPeriodType();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) (short) -1, periodType79, chronology80);
        org.joda.time.Period period82 = new org.joda.time.Period(readableInstant61, (org.joda.time.ReadableDuration) duration66, periodType79);
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant59, readableInstant60, periodType79);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((long) (-100), (long) (-100), periodType79, chronology84);
        org.joda.time.Period period86 = new org.joda.time.Period(100, (int) '4', 10, 0, (int) (short) 1, (int) ' ', (int) (short) 0, (int) (byte) 10, periodType79);
        org.joda.time.Period period87 = new org.joda.time.Period((java.lang.Object) period48, periodType79);
        org.joda.time.Period period88 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration42, readableInstant43, periodType79);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(periodType79);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) -1);
        org.joda.time.Period period3 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(100L, chronology5);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 'a', periodType12, chronology13);
        org.joda.time.Hours hours15 = period14.toStandardHours();
        org.joda.time.Period period16 = period10.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = period10.withYears(10);
        org.joda.time.Period period19 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period24 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period26 = period24.minusYears(100);
        org.joda.time.Period period27 = period26.negated();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType30);
        org.joda.time.Period period33 = period31.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.DurationFieldType durationFieldType39 = period37.getFieldType((int) (byte) 0);
        int int40 = period33.indexOf(durationFieldType39);
        org.joda.time.Period period42 = period26.withField(durationFieldType39, 10);
        boolean boolean43 = period21.isSupported(durationFieldType39);
        int int44 = period19.get(durationFieldType39);
        boolean boolean45 = period3.isSupported(durationFieldType39);
        int int46 = period1.indexOf(durationFieldType39);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        org.joda.time.Period period16 = period10.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.Period period22 = period20.plusMonths((int) '4');
        org.joda.time.Period period23 = period14.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 'a', periodType27, chronology28);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 'a', periodType31, chronology32);
        org.joda.time.Hours hours34 = period33.toStandardHours();
        org.joda.time.Period period35 = period29.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period37 = period29.withYears(10);
        org.joda.time.Period period38 = period37.toPeriod();
        org.joda.time.Period period40 = period37.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant49, readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        org.joda.time.Period period55 = period51.plusMonths(0);
        org.joda.time.Period period57 = period55.plusMonths((int) '#');
        org.joda.time.Period period59 = period55.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType60 = period55.getPeriodType();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) (short) -1, periodType60, chronology61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant42, (org.joda.time.ReadableDuration) duration47, periodType60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) (byte) 0, periodType60, chronology64);
        org.joda.time.Period period66 = period40.normalizedStandard(periodType60);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period(0L, (long) 8, periodType60, chronology67);
        org.joda.time.Period period69 = new org.joda.time.Period((java.lang.Object) period14, periodType60);
        org.joda.time.Period period70 = new org.joda.time.Period((int) 'a', (int) '#', 1, 0, (int) ' ', 52, (-1), 0, periodType60);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days71 = period70.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period66);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology13);
        java.lang.String str15 = period14.toString();
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) str15);
        org.joda.time.Period period18 = period16.plusSeconds((int) 'a');
        org.joda.time.Period period20 = period16.plusYears((int) (byte) 0);
        org.joda.time.Period period22 = period16.withMonths(0);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 'a', periodType24, chronology25);
        org.joda.time.Period period28 = period26.withMinutes(0);
        org.joda.time.Period period30 = period28.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod31 = period28.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period34.plusMonths(0);
        org.joda.time.Period period40 = period38.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period38.toDurationFrom(readableInstant41);
        org.joda.time.Period period44 = period38.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.Period period50 = period48.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, readableInstant52, periodType53);
        org.joda.time.Period period56 = period54.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, readableInstant58, periodType59);
        org.joda.time.DurationFieldType durationFieldType62 = period60.getFieldType((int) (byte) 0);
        int int63 = period56.indexOf(durationFieldType62);
        int int64 = period48.get(durationFieldType62);
        org.joda.time.Period period66 = period38.withField(durationFieldType62, (int) (short) 0);
        int int67 = mutablePeriod31.indexOf(durationFieldType62);
        int int68 = period22.get(durationFieldType62);
        int int69 = period8.get(durationFieldType62);
        int int70 = period8.getYears();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0.011S" + "'", str15, "PT0.011S");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.plusMillis((int) (byte) 100);
        org.joda.time.Period period14 = period12.withHours((-100));
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period14.plusMonths(0);
        org.joda.time.Period period20 = period18.plusMonths((int) '#');
        org.joda.time.Period period22 = period18.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, periodType23, chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration10, periodType23);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType23);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (-100), (long) (-100), periodType23, chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) -1, periodType23);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 1, (int) (short) 10, 97, (int) (byte) 1, 8, (int) (short) -1, 97, 8);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes11 = period8.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        int int6 = period4.getMillis();
        org.joda.time.Period period8 = period4.withHours((int) (byte) 0);
        org.joda.time.Period period10 = period4.withMonths((int) '4');
        org.joda.time.Period period12 = period10.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology15);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) str17);
        org.joda.time.Period period20 = period18.plusSeconds((int) 'a');
        org.joda.time.Period period22 = period18.plusYears((int) (byte) 0);
        org.joda.time.Period period24 = period18.withMonths(0);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', periodType26, chronology27);
        org.joda.time.Period period30 = period28.withMinutes(0);
        org.joda.time.Period period32 = period30.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod33 = period30.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period40.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period40.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.Period period58 = period56.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant59, readableInstant60, periodType61);
        org.joda.time.DurationFieldType durationFieldType64 = period62.getFieldType((int) (byte) 0);
        int int65 = period58.indexOf(durationFieldType64);
        int int66 = period50.get(durationFieldType64);
        org.joda.time.Period period68 = period40.withField(durationFieldType64, (int) (short) 0);
        int int69 = mutablePeriod33.indexOf(durationFieldType64);
        int int70 = period24.get(durationFieldType64);
        int int71 = period10.get(durationFieldType64);
        org.joda.time.Period period72 = period1.withFields((org.joda.time.ReadablePeriod) period10);
        int int73 = period10.getWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0.011S" + "'", str17, "PT0.011S");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 'a', periodType4, chronology5);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.Period period12 = period6.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period6.withYears(10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths(0);
        org.joda.time.Period period23 = period17.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.Period period30 = period26.plusMonths(0);
        org.joda.time.Period period32 = period30.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period30.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period30.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, readableInstant38, periodType39);
        org.joda.time.Period period42 = period40.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType45);
        org.joda.time.Period period48 = period46.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, readableInstant50, periodType51);
        org.joda.time.DurationFieldType durationFieldType54 = period52.getFieldType((int) (byte) 0);
        int int55 = period48.indexOf(durationFieldType54);
        int int56 = period40.get(durationFieldType54);
        org.joda.time.Period period58 = period30.withField(durationFieldType54, (int) (short) 0);
        int int59 = period23.indexOf(durationFieldType54);
        int int60 = period14.get(durationFieldType54);
        int int61 = period2.get(durationFieldType54);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant62, readableInstant63, periodType64);
        org.joda.time.MutablePeriod mutablePeriod66 = period65.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant73, readableInstant74);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant76, readableInstant77, periodType78);
        org.joda.time.MutablePeriod mutablePeriod80 = period79.toMutablePeriod();
        org.joda.time.Period period81 = period75.plus((org.joda.time.ReadablePeriod) period79);
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.PeriodType periodType84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period(readableInstant82, readableInstant83, periodType84);
        org.joda.time.Period period87 = period85.plusMonths((int) '4');
        org.joda.time.Period period88 = period79.withFields((org.joda.time.ReadablePeriod) period87);
        org.joda.time.PeriodType periodType89 = period87.getPeriodType();
        org.joda.time.Period period90 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType89);
        org.joda.time.Period period91 = new org.joda.time.Period((long) 'a', (long) 10, periodType89);
        org.joda.time.Period period92 = new org.joda.time.Period((long) (short) 100, 100L, periodType89);
        org.joda.time.Period period93 = period65.withPeriodType(periodType89);
        org.joda.time.Period period94 = period2.withPeriodType(periodType89);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod66);
        org.junit.Assert.assertNotNull(mutablePeriod80);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(periodType89);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(period94);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Duration duration5 = period3.toStandardDuration();
        org.joda.time.Period period7 = period3.withDays((int) (short) 0);
        org.joda.time.Period period9 = period3.plusYears((int) (short) 0);
        org.joda.time.Period period11 = period9.plusMonths((int) (short) 100);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.plusMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = period15.plusMonths(0);
        org.joda.time.Period period21 = period19.plusMonths((int) '#');
        org.joda.time.Period period23 = period19.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType24 = period19.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, periodType24, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration11, periodType24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) 100, periodType24, chronology28);
        org.joda.time.Period period30 = period4.withPeriodType(periodType24);
        org.joda.time.Period period32 = period30.plusMillis((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant45, readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType50);
        org.joda.time.MutablePeriod mutablePeriod52 = period51.toMutablePeriod();
        org.joda.time.Period period53 = period47.plus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.Period period59 = period57.plusMonths((int) '4');
        org.joda.time.Period period60 = period51.withFields((org.joda.time.ReadablePeriod) period59);
        org.joda.time.PeriodType periodType61 = period59.getPeriodType();
        org.joda.time.Period period62 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType61);
        org.joda.time.Period period63 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType61);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType61);
        org.joda.time.Period period65 = period30.withPeriodType(periodType61);
        org.joda.time.Period period67 = period30.minusYears((int) (byte) 10);
        org.joda.time.Period period69 = period67.minusYears((int) (short) 10);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(mutablePeriod52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.Period period1 = org.joda.time.Period.hours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray2 = period1.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray2);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) period1, chronology2);
        org.joda.time.Period period5 = period3.plusMonths((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, 1L, chronology2);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period4.withWeeks(1);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Period period13 = period11.withMinutes(0);
        org.joda.time.Period period14 = period4.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period13.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', periodType22, chronology23);
        org.joda.time.Hours hours25 = period24.toStandardHours();
        org.joda.time.Period period26 = period20.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period28 = period20.withYears(10);
        org.joda.time.Period period29 = period28.toPeriod();
        org.joda.time.Period period31 = period28.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period42.plusMonths(0);
        org.joda.time.Period period48 = period46.plusMonths((int) '#');
        org.joda.time.Period period50 = period46.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType51 = period46.getPeriodType();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) (short) -1, periodType51, chronology52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant33, (org.joda.time.ReadableDuration) duration38, periodType51);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (byte) 0, periodType51, chronology55);
        org.joda.time.Period period57 = period31.normalizedStandard(periodType51);
        org.joda.time.Period period58 = period13.normalizedStandard(periodType51);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant68, readableInstant69);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = period70.toDurationFrom(readableInstant71);
        org.joda.time.Period period74 = period70.plusMonths(0);
        org.joda.time.Period period76 = period74.plusMonths((int) '#');
        org.joda.time.Period period78 = period74.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType79 = period74.getPeriodType();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) (short) -1, periodType79, chronology80);
        org.joda.time.Period period82 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType79);
        org.joda.time.Period period83 = period58.normalizedStandard(periodType79);
        org.joda.time.Period period84 = new org.joda.time.Period((long) ' ', 0L, periodType79);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(period83);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.Days days17 = period16.toStandardDays();
        int int18 = period16.getMonths();
        org.joda.time.Period period20 = period16.plusMillis(98);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = period16.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period3.withField(durationFieldType10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = period2.toString(periodFormatter3);
        org.joda.time.Period period5 = period2.negated();
        org.joda.time.MutablePeriod mutablePeriod6 = period2.toMutablePeriod();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        int int6 = period5.getSeconds();
        org.joda.time.Weeks weeks7 = period5.toStandardWeeks();
        org.joda.time.Period period9 = period5.minusMinutes(98);
        int int10 = period5.getYears();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.Period period2 = new org.joda.time.Period(1L, (long) (short) 1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.Period period30 = period26.plusMonths(0);
        org.joda.time.Period period32 = period30.plusMonths((int) '#');
        org.joda.time.Period period34 = period30.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, periodType35, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22, periodType35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType35, chronology39);
        org.joda.time.Period period41 = period12.withPeriodType(periodType35);
        org.joda.time.Duration duration42 = period41.toStandardDuration();
        org.joda.time.Period period44 = period41.minusMillis(98);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.Period period1 = org.joda.time.Period.parse("P100Y52M10WT1H32M0.010S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.Period period18 = period16.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.DurationFieldType durationFieldType30 = period28.getFieldType((int) (byte) 0);
        int int31 = period24.indexOf(durationFieldType30);
        int int32 = period16.get(durationFieldType30);
        org.joda.time.Period period34 = period6.withField(durationFieldType30, (int) (short) 0);
        org.joda.time.Period period36 = period34.plusHours((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.Period period38 = period36.minus(readablePeriod37);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, (long) ' ', chronology15);
        org.joda.time.Period period18 = period16.plusHours(1);
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology22);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) str24);
        org.joda.time.Period period27 = period25.plusSeconds((int) 'a');
        org.joda.time.Period period29 = period25.plusYears((int) (byte) 0);
        org.joda.time.Period period31 = period25.withMonths(0);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Period period37 = period35.withMinutes(0);
        org.joda.time.Period period39 = period37.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod40 = period37.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period47.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period47.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.Period period59 = period57.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.DurationFieldType durationFieldType71 = period69.getFieldType((int) (byte) 0);
        int int72 = period65.indexOf(durationFieldType71);
        int int73 = period57.get(durationFieldType71);
        org.joda.time.Period period75 = period47.withField(durationFieldType71, (int) (short) 0);
        int int76 = mutablePeriod40.indexOf(durationFieldType71);
        int int77 = period31.get(durationFieldType71);
        org.joda.time.Period period79 = period18.withFieldAdded(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period81 = period2.withField(durationFieldType71, 0);
        org.joda.time.Period period82 = period81.toPeriod();
        org.joda.time.Period period84 = period81.plusMillis((int) (short) 10);
        org.joda.time.Period period85 = period84.normalizedStandard();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.011S" + "'", str24, "PT0.011S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period85);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) 0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.Period period1 = new org.joda.time.Period((long) ' ');
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period10 = period4.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period8.withMonths((int) (byte) 0);
        int int13 = period12.getMinutes();
        org.joda.time.Period period15 = period12.minusWeeks(0);
        org.joda.time.Period period17 = org.joda.time.Period.days((int) (byte) 100);
        org.joda.time.Period period19 = period17.withMonths((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.Period period26 = period22.plusMonths(0);
        org.joda.time.Period period28 = period26.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period26.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period26.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds33 = period26.toStandardSeconds();
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) period26);
        org.joda.time.Period period36 = period34.plusSeconds((int) (byte) 1);
        org.joda.time.Period period38 = period34.withWeeks((int) (byte) 10);
        boolean boolean39 = period17.equals((java.lang.Object) period34);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period42.plusMonths(0);
        org.joda.time.Period period48 = period46.plusMonths((int) '#');
        org.joda.time.Period period50 = period46.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant51, readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationFrom(readableInstant54);
        org.joda.time.Period period57 = period53.plusMonths(0);
        org.joda.time.Period period59 = period57.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period57.toDurationFrom(readableInstant60);
        org.joda.time.Period period63 = period57.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant64, readableInstant65, periodType66);
        org.joda.time.Period period69 = period67.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant70, readableInstant71, periodType72);
        org.joda.time.Period period75 = period73.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant76, readableInstant77, periodType78);
        org.joda.time.DurationFieldType durationFieldType81 = period79.getFieldType((int) (byte) 0);
        int int82 = period75.indexOf(durationFieldType81);
        int int83 = period67.get(durationFieldType81);
        org.joda.time.Period period85 = period57.withField(durationFieldType81, (int) (short) 0);
        boolean boolean86 = period50.isSupported(durationFieldType81);
        boolean boolean87 = period17.isSupported(durationFieldType81);
        org.joda.time.Period period89 = period15.withFieldAdded(durationFieldType81, (int) (short) 1);
        boolean boolean90 = period1.isSupported(durationFieldType81);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '4');
        org.joda.time.Period period3 = period1.minusDays((int) (byte) 100);
        org.joda.time.Period period5 = period1.plusMinutes(10);
        java.lang.Class<?> wildcardClass6 = period5.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType19);
        org.joda.time.Period period21 = period10.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period23 = period21.minusMonths((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period35.toDurationFrom(readableInstant36);
        org.joda.time.Period period39 = period35.plusMonths(0);
        org.joda.time.Period period41 = period39.plusMonths((int) '#');
        org.joda.time.Period period43 = period39.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType44 = period39.getPeriodType();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) -1, periodType44, chronology45);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration31, periodType44);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType44, chronology48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 100, (long) (-1), chronology52);
        org.joda.time.Period period55 = period53.plusMinutes((int) (short) 10);
        org.joda.time.Period period57 = period55.plusMinutes((-1));
        int int58 = period57.getWeeks();
        org.joda.time.Period period60 = period57.withMinutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType62 = period60.getFieldType(0);
        org.joda.time.Period period64 = period49.withFieldAdded(durationFieldType62, (int) (short) 100);
        boolean boolean65 = period21.isSupported(durationFieldType62);
        int int66 = period3.indexOf(durationFieldType62);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.Period period4 = new org.joda.time.Period(11, (int) '4', (int) (byte) 100, 98);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.Period period1 = org.joda.time.Period.hours(98);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        int int15 = period10.getHours();
        org.joda.time.Weeks weeks16 = period10.toStandardWeeks();
        org.joda.time.Period period18 = period10.plusHours(8);
        org.joda.time.Period period20 = period10.minusMinutes(8);
        org.joda.time.Period period22 = period20.plusSeconds((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = period20.getClass();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 100, (int) (byte) 100, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) '4', periodType1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period30.plusMonths(0);
        org.joda.time.Period period36 = period34.plusMonths((int) '#');
        org.joda.time.Period period38 = period34.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType39 = period34.getPeriodType();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (short) -1, periodType39, chronology40);
        org.joda.time.Period period42 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType39);
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 10, periodType39);
        org.joda.time.Period period44 = period16.withPeriodType(periodType39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period45 = new org.joda.time.Period((java.lang.Object) periodType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        int[] intArray9 = period8.getValues();
        int int10 = period8.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 97]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.Period period9 = period7.multipliedBy((int) (byte) -1);
        org.joda.time.Period period11 = period9.minusSeconds(8);
        int int12 = period11.size();
        org.joda.time.Period period14 = period11.withYears(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.Period period3 = period1.withDays(1);
        org.joda.time.Period period5 = period1.withSeconds(98);
        java.lang.Class<?> wildcardClass6 = period5.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.Period period1 = org.joda.time.Period.years((-1));
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType3);
        org.joda.time.Period period6 = period4.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period4.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.Period period21 = period19.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType23 = period19.getFieldType((int) (byte) 0);
        org.joda.time.Hours hours24 = period19.toStandardHours();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.Period period28 = period27.normalizedStandard();
        org.joda.time.Period period30 = period27.plusMinutes((int) ' ');
        org.joda.time.Period period31 = period30.normalizedStandard();
        org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) period31);
        org.joda.time.format.PeriodFormatter periodFormatter33 = null;
        java.lang.String str34 = period32.toString(periodFormatter33);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant45, readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationFrom(readableInstant48);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant51, readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationFrom(readableInstant54);
        org.joda.time.Period period57 = period53.plusMonths(0);
        org.joda.time.Period period59 = period57.plusMonths((int) '#');
        org.joda.time.Period period61 = period57.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType62 = period57.getPeriodType();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) (short) -1, periodType62, chronology63);
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant44, (org.joda.time.ReadableDuration) duration49, periodType62);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((long) (short) 100, periodType62, chronology66);
        org.joda.time.Period period68 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType62);
        org.joda.time.Period period69 = new org.joda.time.Period((java.lang.Object) str34, periodType62);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((java.lang.Object) hours24, periodType62, chronology70);
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration8, periodType62);
        org.joda.time.Period period74 = period72.plusMonths((int) (short) 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT32M" + "'", str34, "PT32M");
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(period74);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        int int8 = period2.size();
        org.joda.time.Period period10 = period2.minusDays((int) (byte) -1);
        org.joda.time.Period period12 = period2.withMillis((int) (byte) -1);
        int int13 = period12.getHours();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period13 = period3.minusWeeks((int) (short) -1);
        java.lang.String str14 = period3.toString();
        int int15 = period3.getMonths();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.097S" + "'", str14, "PT0.097S");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Hours hours23 = period22.toStandardHours();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period18.withYears(10);
        org.joda.time.Period period27 = period26.toPeriod();
        org.joda.time.Period period29 = period26.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.Period period44 = period40.plusMonths(0);
        org.joda.time.Period period46 = period44.plusMonths((int) '#');
        org.joda.time.Period period48 = period44.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType49 = period44.getPeriodType();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (short) -1, periodType49, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration36, periodType49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) 0, periodType49, chronology53);
        org.joda.time.Period period55 = period29.normalizedStandard(periodType49);
        org.joda.time.Period period56 = period11.normalizedStandard(periodType49);
        org.joda.time.format.PeriodFormatter periodFormatter57 = null;
        java.lang.String str58 = period11.toString(periodFormatter57);
        org.joda.time.Duration duration59 = period11.toStandardDuration();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0.097S" + "'", str58, "PT0.097S");
        org.junit.Assert.assertNotNull(duration59);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Duration duration9 = period8.toStandardDuration();
        int int10 = period8.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = period2.normalizedStandard(periodType8);
        org.joda.time.Period period11 = period9.minusMonths((int) ' ');
        org.joda.time.Period period13 = period11.minusMonths((int) (byte) 100);
        org.joda.time.Period period14 = period13.normalizedStandard();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = org.joda.time.Period.millis(1);
        org.joda.time.Period period5 = period3.withWeeks((int) (short) 0);
        org.joda.time.Period period6 = period1.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period7 = period6.toPeriod();
        int int8 = period7.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period7.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) durationFieldTypeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [Lorg.joda.time.DurationFieldType;");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period10.getFieldTypes();
        int int12 = period10.getMonths();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes13 = period10.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 100);
        org.joda.time.Period period3 = period1.minusMinutes((int) (short) -1);
        int int4 = period3.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period6.getMinutes();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        org.joda.time.Period period5 = period4.negated();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.Period period11 = period9.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.DurationFieldType durationFieldType17 = period15.getFieldType((int) (byte) 0);
        int int18 = period11.indexOf(durationFieldType17);
        org.joda.time.Period period20 = period4.withField(durationFieldType17, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period9.minusSeconds((int) '#');
        int[] intArray33 = period9.getValues();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, 0, -100, -100, 97]");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period13 = period3.minusWeeks((int) (short) -1);
        java.lang.String str14 = period3.toString();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period3.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.Period period31 = period25.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType34);
        org.joda.time.Period period37 = period35.plusMonths((int) '4');
        org.joda.time.Period period38 = period29.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.PeriodType periodType39 = period37.getPeriodType();
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType39);
        org.joda.time.Period period41 = new org.joda.time.Period((long) 'a', (long) 10, periodType39);
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 100, 100L, periodType39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) duration16, periodType39, chronology43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType46 = period44.getFieldType((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.097S" + "'", str14, "PT0.097S");
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period12.minusHours((int) (byte) -1);
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) period12);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.Period period9 = period7.plusDays((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = period9.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration12, periodType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 0, periodType25, chronology29);
        org.joda.time.Period period31 = period5.withPeriodType(periodType25);
        org.joda.time.DurationFieldType[] durationFieldTypeArray32 = period5.getFieldTypes();
        int[] intArray33 = period5.getValues();
        int int34 = period5.getWeeks();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldTypeArray32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, 1, 0, 0, -68]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-3));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT100M");
        org.joda.time.Duration duration2 = period1.toStandardDuration();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period13 = period7.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.Period period20 = period11.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType21 = period19.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType21);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, periodType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period14.plusMonths((int) '#');
        org.joda.time.Period period18 = period14.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType19 = period14.getPeriodType();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) -1, periodType19, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration6, periodType19);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.MutablePeriod mutablePeriod42 = period41.toMutablePeriod();
        org.joda.time.Period period43 = period37.plus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.Period period49 = period47.plusMonths((int) '4');
        org.joda.time.Period period50 = period41.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.PeriodType periodType51 = period49.getPeriodType();
        org.joda.time.Period period52 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType51);
        org.joda.time.Period period53 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType51);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType51);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration6, periodType51);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant56);
        org.joda.time.Period period59 = period57.minusWeeks(100);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(mutablePeriod42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(period59);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration12, periodType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 0, periodType25, chronology29);
        org.joda.time.Period period31 = period5.withPeriodType(periodType25);
        org.joda.time.DurationFieldType[] durationFieldTypeArray32 = period5.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) durationFieldTypeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [Lorg.joda.time.DurationFieldType;");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldTypeArray32);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology4);
        java.lang.String str6 = period5.toString();
        org.joda.time.Period period8 = period5.plusMinutes((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.MutablePeriod mutablePeriod26 = period25.toMutablePeriod();
        org.joda.time.Period period27 = period21.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType30);
        org.joda.time.Period period33 = period31.plusMonths((int) '4');
        org.joda.time.Period period34 = period25.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.PeriodType periodType35 = period33.getPeriodType();
        org.joda.time.Period period36 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType35);
        org.joda.time.Period period37 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType35);
        org.joda.time.Period period38 = new org.joda.time.Period((java.lang.Object) period5, periodType35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period39 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.011S" + "'", str6, "PT0.011S");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-100));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.Period period1 = org.joda.time.Period.years((-1));
        java.lang.String str2 = period1.toString();
        int int3 = period1.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y" + "'", str2, "P-1Y");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.Period period22 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.Period period28 = period26.plusMonths((int) '4');
        org.joda.time.Period period29 = period20.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = period28.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType30);
        org.joda.time.Period period32 = period11.withPeriodType(periodType30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType35);
        org.joda.time.Period period38 = period36.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period36.toDurationTo(readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration40, readableInstant41);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) 'a', periodType44, chronology45);
        org.joda.time.Period period48 = period46.withMinutes(0);
        org.joda.time.Period period50 = period48.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod51 = period48.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableInstant53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationFrom(readableInstant55);
        org.joda.time.Period period58 = period54.plusMonths(0);
        org.joda.time.Period period60 = period58.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = period58.toDurationFrom(readableInstant61);
        org.joda.time.Period period64 = period58.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant65, readableInstant66, periodType67);
        org.joda.time.Period period70 = period68.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant71, readableInstant72, periodType73);
        org.joda.time.Period period76 = period74.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period(readableInstant77, readableInstant78, periodType79);
        org.joda.time.DurationFieldType durationFieldType82 = period80.getFieldType((int) (byte) 0);
        int int83 = period76.indexOf(durationFieldType82);
        int int84 = period68.get(durationFieldType82);
        org.joda.time.Period period86 = period58.withField(durationFieldType82, (int) (short) 0);
        int int87 = mutablePeriod51.indexOf(durationFieldType82);
        boolean boolean88 = period42.isSupported(durationFieldType82);
        org.joda.time.Period period90 = period11.withField(durationFieldType82, (int) (byte) 100);
        int int91 = period90.getMinutes();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(durationFieldType82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period5.plusYears((int) (byte) 0);
        org.joda.time.Period period11 = period5.withMonths(0);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 'a', periodType13, chronology14);
        org.joda.time.Period period17 = period15.withMinutes(0);
        org.joda.time.Period period19 = period17.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod20 = period17.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period27.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period27.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.Period period39 = period37.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType42);
        org.joda.time.Period period45 = period43.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.DurationFieldType durationFieldType51 = period49.getFieldType((int) (byte) 0);
        int int52 = period45.indexOf(durationFieldType51);
        int int53 = period37.get(durationFieldType51);
        org.joda.time.Period period55 = period27.withField(durationFieldType51, (int) (short) 0);
        int int56 = mutablePeriod20.indexOf(durationFieldType51);
        int int57 = period11.get(durationFieldType51);
        org.joda.time.Period period59 = period11.plusSeconds(8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        int int11 = period6.getMillis();
        org.joda.time.Period period12 = period6.negated();
        org.joda.time.Period period14 = period12.minusDays((int) (short) 0);
        org.joda.time.Period period16 = period12.minusMinutes(10);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusDays((int) (short) 0);
        org.joda.time.Period period4 = period2.plusSeconds((int) (short) -1);
        org.joda.time.Period period6 = period4.withMillis((int) (short) 0);
        org.joda.time.Days days7 = period4.toStandardDays();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period9.minusSeconds((int) '#');
        org.joda.time.Period period34 = period32.minusMillis((-1));
        org.joda.time.Period period36 = period32.minusSeconds(11);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.hours((int) (byte) 100);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '#');
        org.joda.time.Period period8 = period4.plusSeconds((int) (short) 1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period10 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period12 = period10.minusYears(100);
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period12.withField(durationFieldType25, 10);
        org.joda.time.Period period30 = period28.minusMinutes((int) (short) 0);
        org.joda.time.Period period32 = period30.plusMillis((int) (short) 10);
        boolean boolean33 = period7.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 0);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = period1.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType25);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType25);
        org.joda.time.Period period30 = new org.joda.time.Period(8, (int) (short) 10, 52, 97, (int) '#', (int) (byte) 100, (int) (short) 10, 52, periodType25);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.Period period51 = period47.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType52 = period47.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) -1, periodType52, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration39, periodType52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (short) 100, periodType52, chronology56);
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType52);
        org.joda.time.Chronology chronology59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period60 = new org.joda.time.Period((java.lang.Object) 52, periodType52, chronology59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.Period period1 = org.joda.time.Period.years(0);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology4);
        java.lang.String str6 = period5.toString();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) str6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period14.plusMonths((int) '#');
        org.joda.time.Period period18 = period14.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType19 = period14.getPeriodType();
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) str6, periodType19);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', periodType22, chronology23);
        org.joda.time.Period period26 = period24.withMinutes(0);
        org.joda.time.Period period28 = period26.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod29 = period26.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period36.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period36.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period36.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType45);
        org.joda.time.Period period48 = period46.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, readableInstant50, periodType51);
        org.joda.time.Period period54 = period52.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType57);
        org.joda.time.DurationFieldType durationFieldType60 = period58.getFieldType((int) (byte) 0);
        int int61 = period54.indexOf(durationFieldType60);
        int int62 = period46.get(durationFieldType60);
        org.joda.time.Period period64 = period36.withField(durationFieldType60, (int) (short) 0);
        int int65 = mutablePeriod29.indexOf(durationFieldType60);
        int int66 = period20.get(durationFieldType60);
        org.joda.time.Period period68 = period1.withField(durationFieldType60, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType70 = period1.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.011S" + "'", str6, "PT0.011S");
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.Period period19 = period18.negated();
        org.joda.time.Period period21 = period19.withMonths(10);
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, periodType36, chronology37);
        org.joda.time.Period period39 = period23.minus((org.joda.time.ReadablePeriod) period38);
        int int40 = period23.getSeconds();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period44.toDurationTo(readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration48, readableInstant49);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) 'a', periodType52, chronology53);
        org.joda.time.Period period56 = period54.withMinutes(0);
        org.joda.time.Period period58 = period56.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod59 = period56.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant60, readableInstant61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationFrom(readableInstant63);
        org.joda.time.Period period66 = period62.plusMonths(0);
        org.joda.time.Period period68 = period66.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = period66.toDurationFrom(readableInstant69);
        org.joda.time.Period period72 = period66.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant73, readableInstant74, periodType75);
        org.joda.time.Period period78 = period76.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.PeriodType periodType81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period(readableInstant79, readableInstant80, periodType81);
        org.joda.time.Period period84 = period82.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.PeriodType periodType87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period(readableInstant85, readableInstant86, periodType87);
        org.joda.time.DurationFieldType durationFieldType90 = period88.getFieldType((int) (byte) 0);
        int int91 = period84.indexOf(durationFieldType90);
        int int92 = period76.get(durationFieldType90);
        org.joda.time.Period period94 = period66.withField(durationFieldType90, (int) (short) 0);
        int int95 = mutablePeriod59.indexOf(durationFieldType90);
        boolean boolean96 = period50.isSupported(durationFieldType90);
        boolean boolean97 = period23.isSupported(durationFieldType90);
        org.joda.time.Period period99 = period19.withFieldAdded(durationFieldType90, 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(mutablePeriod59);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(durationFieldType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNotNull(period99);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.Period period13 = period11.minusWeeks((-100));
        org.joda.time.Period period14 = period13.negated();
        org.joda.time.Period period16 = period14.plusMillis(0);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType3);
        org.joda.time.Period period6 = period4.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period4.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.Period period22 = period20.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) period20, periodType23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period20.toDurationTo(readableInstant25);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.Period period34 = period32.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period32.toDurationTo(readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period48.toDurationFrom(readableInstant49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableInstant53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationFrom(readableInstant55);
        org.joda.time.Period period58 = period54.plusMonths(0);
        org.joda.time.Period period60 = period58.plusMonths((int) '#');
        org.joda.time.Period period62 = period58.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType63 = period58.getPeriodType();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) (short) -1, periodType63, chronology64);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant45, (org.joda.time.ReadableDuration) duration50, periodType63);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType63);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) (-100), (long) (-100), periodType63, chronology68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) 0, (long) 100, periodType63, chronology70);
        org.joda.time.Period period72 = period38.withPeriodType(periodType63);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((long) (byte) 10, (long) '4', periodType63, chronology73);
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration26, periodType63);
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration8, periodType63);
        org.joda.time.Period period78 = period76.withMonths(11);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Period period6 = period3.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType9);
        org.joda.time.DurationFieldType durationFieldType12 = period10.getFieldType((int) (byte) 0);
        org.joda.time.Period period14 = period3.withField(durationFieldType12, 1);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Hours hours23 = period22.toStandardHours();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period18.withYears(10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period29.plusMonths(0);
        org.joda.time.Period period35 = period29.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period38.plusMonths(0);
        org.joda.time.Period period44 = period42.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period42.toDurationFrom(readableInstant45);
        org.joda.time.Period period48 = period42.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, readableInstant50, periodType51);
        org.joda.time.Period period54 = period52.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType57);
        org.joda.time.Period period60 = period58.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.DurationFieldType durationFieldType66 = period64.getFieldType((int) (byte) 0);
        int int67 = period60.indexOf(durationFieldType66);
        int int68 = period52.get(durationFieldType66);
        org.joda.time.Period period70 = period42.withField(durationFieldType66, (int) (short) 0);
        int int71 = period35.indexOf(durationFieldType66);
        int int72 = period26.get(durationFieldType66);
        org.joda.time.Period period74 = period14.withField(durationFieldType66, (int) (byte) -1);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(period74);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        java.lang.String str18 = mutablePeriod17.toString();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT100M" + "'", str18, "PT100M");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.Period period1 = org.joda.time.Period.years(0);
        org.joda.time.Period period3 = period1.plusMinutes(11);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        int int2 = period1.getDays();
        org.joda.time.Period period4 = period1.withSeconds(52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 10, (long) 98);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, 0L, chronology2);
        org.joda.time.Period period5 = period3.withHours((int) 'a');
        org.joda.time.Period period7 = period3.minusDays(100);
        java.lang.Class<?> wildcardClass8 = period7.getClass();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.withHours((-100));
        org.joda.time.MutablePeriod mutablePeriod9 = period6.toMutablePeriod();
        org.joda.time.Days days10 = period6.toStandardDays();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(days10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period15 = period12.plusMonths((int) (byte) 10);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0.097S" + "'", str13, "PT0.097S");
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period42.plusMonths(0);
        org.joda.time.Period period48 = period46.plusMonths((int) '#');
        org.joda.time.Period period50 = period46.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType51 = period46.getPeriodType();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) (short) -1, periodType51, chronology52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant33, (org.joda.time.ReadableDuration) duration38, periodType51);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableInstant68);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant70, readableInstant71, periodType72);
        org.joda.time.MutablePeriod mutablePeriod74 = period73.toMutablePeriod();
        org.joda.time.Period period75 = period69.plus((org.joda.time.ReadablePeriod) period73);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant76, readableInstant77, periodType78);
        org.joda.time.Period period81 = period79.plusMonths((int) '4');
        org.joda.time.Period period82 = period73.withFields((org.joda.time.ReadablePeriod) period81);
        org.joda.time.PeriodType periodType83 = period81.getPeriodType();
        org.joda.time.Period period84 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType83);
        org.joda.time.Period period85 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType83);
        org.joda.time.Period period86 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType83);
        org.joda.time.Period period87 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration38, periodType83);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((long) (short) -1, periodType83, chronology88);
        org.joda.time.Period period90 = new org.joda.time.Period((java.lang.Object) period28, periodType83);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(mutablePeriod74);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(periodType83);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.Period period10 = period7.withMinutes((int) (byte) 10);
        org.joda.time.Period period11 = period10.negated();
        org.joda.time.Period period13 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, chronology15);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', periodType22, chronology23);
        org.joda.time.Hours hours25 = period24.toStandardHours();
        org.joda.time.Period period26 = period20.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period28 = period20.withYears(10);
        org.joda.time.Period period29 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period34 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period36 = period34.minusYears(100);
        org.joda.time.Period period37 = period36.negated();
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.Period period43 = period41.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.DurationFieldType durationFieldType49 = period47.getFieldType((int) (byte) 0);
        int int50 = period43.indexOf(durationFieldType49);
        org.joda.time.Period period52 = period36.withField(durationFieldType49, 10);
        boolean boolean53 = period31.isSupported(durationFieldType49);
        int int54 = period29.get(durationFieldType49);
        boolean boolean55 = period13.isSupported(durationFieldType49);
        int int56 = period11.indexOf(durationFieldType49);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.Period period7 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Hours hours12 = period11.toStandardHours();
        org.joda.time.Period period14 = period11.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.DurationFieldType durationFieldType20 = period18.getFieldType((int) (byte) 0);
        org.joda.time.Period period22 = period11.withField(durationFieldType20, 1);
        boolean boolean23 = period7.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType32);
        org.joda.time.DurationFieldType durationFieldType35 = period33.getFieldType((int) (byte) 0);
        int int36 = period29.indexOf(durationFieldType35);
        org.joda.time.Period period38 = period7.withFieldAdded(durationFieldType35, (int) (short) 0);
        org.joda.time.Period period40 = period3.withFieldAdded(durationFieldType35, (int) '#');
        int int41 = period40.getMillis();
        org.joda.time.Period period43 = period40.withMillis((int) 'a');
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period43);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) '#');
        java.lang.String str5 = period2.toString();
        org.joda.time.Period period6 = period2.negated();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = period2.indexOf(durationFieldType3);
        org.joda.time.Days days5 = period2.toStandardDays();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(days5);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period11 = period7.withMonths((int) (short) 0);
        int[] intArray12 = period11.getValues();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 97, 11]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType14 = period10.getFieldType((int) (byte) 0);
        org.joda.time.Hours hours15 = period10.toStandardHours();
        int int16 = period10.getSeconds();
        org.joda.time.Period period18 = period10.withMonths(98);
        org.joda.time.Period period19 = period10.negated();
        org.joda.time.Period period21 = period10.withHours((int) (byte) 1);
        int[] intArray22 = period21.getValues();
        org.joda.time.Period period24 = period21.minusMonths(0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.Period period8 = period6.plusWeeks((int) '4');
        int int9 = period6.getWeeks();
        org.joda.time.Period period10 = period6.negated();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Hours hours26 = period25.toStandardHours();
        org.joda.time.Period period27 = period21.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period21.withYears(10);
        org.joda.time.Period period30 = period29.toPeriod();
        org.joda.time.Period period32 = period29.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.Period period51 = period47.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType52 = period47.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) -1, periodType52, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration39, periodType52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (byte) 0, periodType52, chronology56);
        org.joda.time.Period period58 = period32.normalizedStandard(periodType52);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(0L, (long) 8, periodType52, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) ' ', periodType52, chronology61);
        org.joda.time.Period period63 = new org.joda.time.Period((java.lang.Object) period14, periodType52);
        int int64 = period14.getYears();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 100, (long) (short) 0, chronology2);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 0, chronology1);
        org.joda.time.Period period4 = period2.minusMillis((int) (short) 10);
        org.joda.time.Period period6 = period2.plusWeeks(10);
        int int7 = period6.size();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration4);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period5.minusMonths((int) 'a');
        org.joda.time.Period period11 = period9.minusHours(10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period14.plusMonths(0);
        org.joda.time.Period period20 = period14.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period27.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period27.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.Period period39 = period37.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType42);
        org.joda.time.Period period45 = period43.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.DurationFieldType durationFieldType51 = period49.getFieldType((int) (byte) 0);
        int int52 = period45.indexOf(durationFieldType51);
        int int53 = period37.get(durationFieldType51);
        org.joda.time.Period period55 = period27.withField(durationFieldType51, (int) (short) 0);
        int int56 = period20.indexOf(durationFieldType51);
        org.joda.time.Period period58 = period9.withField(durationFieldType51, 0);
        org.joda.time.Period period60 = period58.withYears(97);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Duration duration6 = period2.toStandardDuration();
        org.joda.time.Period period8 = period2.minusDays((int) (short) 0);
        org.joda.time.Days days9 = period8.toStandardDays();
        int int10 = period8.getWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType13 = period8.getPeriodType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType13, chronology14);
        org.joda.time.Seconds seconds16 = period15.toStandardSeconds();
        int int17 = period15.getMonths();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = period15.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.withMinutes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = period6.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Duration duration5 = period3.toStandardDuration();
        org.joda.time.Period period7 = period3.withDays((int) (short) 0);
        org.joda.time.Period period9 = period3.plusYears((int) (short) 0);
        org.joda.time.Period period11 = period9.minusYears(11);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period11.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) -1, periodType34, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration21, periodType34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) 0, periodType34, chronology38);
        org.joda.time.Period period40 = period14.normalizedStandard(periodType34);
        org.joda.time.Period period42 = period40.withMillis((int) (byte) 10);
        org.joda.time.PeriodType periodType43 = period40.getPeriodType();
        int int44 = period40.getMillis();
        org.joda.time.Period period46 = period40.minusYears((int) (short) 100);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 98 + "'", int44 == 98);
        org.junit.Assert.assertNotNull(period46);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period9.plusMonths((int) (short) 10);
        org.joda.time.Period period34 = period9.plusMonths((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = period9.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-3));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.Period period19 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.Period period25 = period23.plusMonths((int) '4');
        org.joda.time.Period period26 = period17.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.PeriodType periodType27 = period25.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType27);
        org.joda.time.Period period29 = new org.joda.time.Period((long) 'a', (long) 10, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 100, 100L, periodType27);
        org.joda.time.Period period31 = period3.withPeriodType(periodType27);
        org.joda.time.Duration duration32 = period31.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, readableInstant33);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration32);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period7 = period5.minusMinutes((int) (short) 100);
        org.joda.time.Period period9 = org.joda.time.Period.years((int) (byte) 1);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = period5.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period10.getFieldTypes();
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) period10);
        org.joda.time.Period period14 = period10.withMonths(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.Period period11 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.Period period17 = period15.plusMonths((int) '4');
        org.joda.time.Period period18 = period9.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.PeriodType periodType19 = period17.getPeriodType();
        org.joda.time.Period period20 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType19);
        org.joda.time.Period period21 = new org.joda.time.Period((long) 0, periodType19);
        int int22 = period21.getDays();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 'a', periodType24, chronology25);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 'a', periodType28, chronology29);
        org.joda.time.Hours hours31 = period30.toStandardHours();
        org.joda.time.Period period32 = period26.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period30.minusSeconds((int) ' ');
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) 100, (long) (-1), chronology37);
        org.joda.time.Period period40 = period38.plusMinutes((int) (short) 10);
        org.joda.time.Period period42 = period40.plusMinutes((-1));
        int int43 = period42.getWeeks();
        org.joda.time.Period period45 = period42.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period48.toDurationFrom(readableInstant49);
        org.joda.time.Period period52 = period48.plusMonths(0);
        org.joda.time.Period period54 = period52.plusMonths((int) '#');
        org.joda.time.Period period56 = period52.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant57, readableInstant58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period59.toDurationFrom(readableInstant60);
        org.joda.time.Period period63 = period59.plusMonths(0);
        org.joda.time.Period period65 = period63.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = period63.toDurationFrom(readableInstant66);
        org.joda.time.Period period69 = period63.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant70, readableInstant71, periodType72);
        org.joda.time.Period period75 = period73.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant76, readableInstant77, periodType78);
        org.joda.time.Period period81 = period79.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.PeriodType periodType84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period(readableInstant82, readableInstant83, periodType84);
        org.joda.time.DurationFieldType durationFieldType87 = period85.getFieldType((int) (byte) 0);
        int int88 = period81.indexOf(durationFieldType87);
        int int89 = period73.get(durationFieldType87);
        org.joda.time.Period period91 = period63.withField(durationFieldType87, (int) (short) 0);
        boolean boolean92 = period56.isSupported(durationFieldType87);
        org.joda.time.Period period94 = period45.withField(durationFieldType87, (int) ' ');
        org.joda.time.Period period96 = period34.withField(durationFieldType87, 100);
        int int97 = period21.indexOf(durationFieldType87);
        org.joda.time.Period period99 = period21.withMonths(97);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(period99);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Weeks weeks7 = period5.toStandardWeeks();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.Period period24 = period20.plusMonths(0);
        org.joda.time.Period period26 = period24.plusMonths((int) '#');
        org.joda.time.Period period28 = period24.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType29 = period24.getPeriodType();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) -1, periodType29, chronology30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration16, periodType29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (short) 100, periodType29, chronology33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType29);
        org.joda.time.Period period36 = new org.joda.time.Period((java.lang.Object) weeks7, periodType29);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '4', 52, (-3), (int) (byte) 10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.Period period14 = period10.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType15, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        int int6 = period2.getMillis();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType20, chronology21);
        boolean boolean23 = period2.equals((java.lang.Object) period22);
        org.joda.time.Days days24 = period22.toStandardDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(days24);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period2.withYears((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period2.toDurationTo(readableInstant11);
        org.joda.time.format.PeriodFormatter periodFormatter13 = null;
        java.lang.String str14 = period2.toString(periodFormatter13);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0S" + "'", str14, "PT0S");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) 'a');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period14.plusMonths(0);
        org.joda.time.Period period20 = period18.plusMonths((int) '#');
        org.joda.time.Period period22 = period18.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, periodType23, chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType23);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) 10, periodType23);
        org.joda.time.Period period29 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period31 = period29.plusMillis((int) 'a');
        boolean boolean32 = period27.equals((java.lang.Object) period31);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType41);
        org.joda.time.Period period44 = period42.withYears((int) ' ');
        org.joda.time.Period period46 = period44.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) 'a', periodType49, chronology50);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) 'a', periodType53, chronology54);
        org.joda.time.Hours hours56 = period55.toStandardHours();
        org.joda.time.Period period57 = period51.withFields((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Period period59 = period51.withYears(10);
        org.joda.time.Period period60 = period59.toPeriod();
        org.joda.time.Period period62 = period59.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant65, readableInstant66);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Duration duration69 = period67.toDurationFrom(readableInstant68);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant71, readableInstant72);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Duration duration75 = period73.toDurationFrom(readableInstant74);
        org.joda.time.Period period77 = period73.plusMonths(0);
        org.joda.time.Period period79 = period77.plusMonths((int) '#');
        org.joda.time.Period period81 = period77.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType82 = period77.getPeriodType();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (short) -1, periodType82, chronology83);
        org.joda.time.Period period85 = new org.joda.time.Period(readableInstant64, (org.joda.time.ReadableDuration) duration69, periodType82);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.Period period87 = new org.joda.time.Period((long) (byte) 0, periodType82, chronology86);
        org.joda.time.Period period88 = period62.normalizedStandard(periodType82);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period((long) 'a', periodType82, chronology89);
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period((java.lang.Object) period44, periodType82, chronology91);
        org.joda.time.Chronology chronology93 = null;
        org.joda.time.Period period94 = new org.joda.time.Period((java.lang.Object) period27, periodType82, chronology93);
        org.joda.time.Period period95 = new org.joda.time.Period((long) 10, (long) (byte) 1, periodType82);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(hours56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period88);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period13 = period7.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.Period period20 = period11.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType21 = period19.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType21);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 0, periodType21);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType21);
        org.joda.time.Weeks weeks25 = period24.toStandardWeeks();
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(weeks25);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, (long) (-1), chronology12);
        org.joda.time.Period period15 = period13.plusMinutes((int) (short) 10);
        org.joda.time.Period period17 = period15.plusMinutes((-1));
        int int18 = period17.getWeeks();
        org.joda.time.Period period20 = period17.withMinutes((int) (byte) 10);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period((long) 52, (long) 1, periodType21);
        org.joda.time.Period period23 = new org.joda.time.Period((int) '4', 98, (int) (short) 1, (-3), (int) '4', (int) 'a', 10, 100, periodType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours24 = period23.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.Period period16 = period14.minusDays((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.Period period44 = period40.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType45 = period40.getPeriodType();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (short) -1, periodType45, chronology46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration32, periodType45);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType45, chronology49);
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant24, periodType45);
        org.joda.time.Period period52 = new org.joda.time.Period((java.lang.Object) readableInstant24);
        org.joda.time.Period period54 = period52.minusMinutes((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant57, readableInstant58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period59.toDurationFrom(readableInstant60);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant63, readableInstant64);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = period65.toDurationFrom(readableInstant66);
        org.joda.time.Period period69 = period65.plusMonths(0);
        org.joda.time.Period period71 = period69.plusMonths((int) '#');
        org.joda.time.Period period73 = period69.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType74 = period69.getPeriodType();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((long) (short) -1, periodType74, chronology75);
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant56, (org.joda.time.ReadableDuration) duration61, periodType74);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((long) (short) 100, periodType74, chronology78);
        org.joda.time.Period period80 = period52.normalizedStandard(periodType74);
        org.joda.time.Period period81 = period16.withPeriodType(periodType74);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period81);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 100);
        org.joda.time.Period period3 = period1.minusSeconds((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        int int15 = period10.getHours();
        org.joda.time.Weeks weeks16 = period10.toStandardWeeks();
        org.joda.time.Period period18 = period10.plusHours(8);
        org.joda.time.Period period20 = period10.minusMinutes(8);
        org.joda.time.Period period22 = period10.multipliedBy(8);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        org.joda.time.Period period3 = period1.withHours((-1));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType21 = period16.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration8, periodType21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) 100, periodType21, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', (long) (short) 1, periodType21);
        org.joda.time.Weeks weeks28 = period27.toStandardWeeks();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(weeks28);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 98, (long) (short) 1, chronology2);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Duration duration6 = period2.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period19.plusMonths(0);
        org.joda.time.Period period25 = period23.plusMonths((int) '#');
        org.joda.time.Period period27 = period23.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType28 = period23.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) -1, periodType28, chronology29);
        org.joda.time.Period period31 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType28);
        org.joda.time.Period period32 = new org.joda.time.Period((long) (byte) 10, periodType28);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) period2, periodType28, chronology33);
        org.joda.time.Weeks weeks35 = period34.toStandardWeeks();
        org.joda.time.Period period37 = period34.withHours(10);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.Period period8 = period6.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationTo(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period14.plusMonths(0);
        org.joda.time.Period period20 = period18.plusMonths((int) '#');
        org.joda.time.Period period22 = period18.plusMinutes((int) (short) 100);
        org.joda.time.Period period24 = period22.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) period22, periodType25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period22.toDurationTo(readableInstant27);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType33);
        org.joda.time.Period period36 = period34.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period34.toDurationTo(readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant54, readableInstant55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period56.toDurationFrom(readableInstant57);
        org.joda.time.Period period60 = period56.plusMonths(0);
        org.joda.time.Period period62 = period60.plusMonths((int) '#');
        org.joda.time.Period period64 = period60.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType65 = period60.getPeriodType();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((long) (short) -1, periodType65, chronology66);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant47, (org.joda.time.ReadableDuration) duration52, periodType65);
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType65);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (-100), (long) (-100), periodType65, chronology70);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((long) 0, (long) 100, periodType65, chronology72);
        org.joda.time.Period period74 = period40.withPeriodType(periodType65);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((long) (byte) 10, (long) '4', periodType65, chronology75);
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration28, periodType65);
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration10, periodType65);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period79 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(period74);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Duration duration6 = period2.toStandardDuration();
        org.joda.time.Period period8 = period2.minusDays((int) (short) 0);
        int int9 = period8.getSeconds();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.Period period7 = period5.plusMonths(100);
        org.joda.time.Period period8 = period5.normalizedStandard();
        org.joda.time.Period period10 = period5.minusMillis(98);
        org.joda.time.Period period12 = period10.minusDays(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period13 = period3.withMinutes((int) (byte) 1);
        org.joda.time.Hours hours14 = period3.toStandardHours();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours14);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.Period period8 = new org.joda.time.Period((-1), (-100), 98, 100, 97, 11, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.Period period8 = period5.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.DurationFieldType durationFieldType14 = period12.getFieldType((int) (byte) 0);
        org.joda.time.Period period16 = period5.withField(durationFieldType14, 1);
        boolean boolean17 = period1.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.Period period23 = period21.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.DurationFieldType durationFieldType29 = period27.getFieldType((int) (byte) 0);
        int int30 = period23.indexOf(durationFieldType29);
        org.joda.time.Period period32 = period1.withFieldAdded(durationFieldType29, (int) (short) 0);
        java.lang.Class<?> wildcardClass33 = period32.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period10.getFieldTypes();
        int int12 = period10.getMonths();
        org.joda.time.Period period14 = period10.withMinutes((int) ' ');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(10L, (long) (short) 0, periodType2, chronology3);
        org.joda.time.Period period6 = period4.plusWeeks((int) (short) 100);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.Period period7 = period5.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period5.toDurationTo(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, periodType36, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration23, periodType36);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (-100), (long) (-100), periodType36, chronology41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) 0, (long) 100, periodType36, chronology43);
        org.joda.time.Period period45 = period11.withPeriodType(periodType36);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (byte) 10, (long) '4', periodType36, chronology46);
        int int48 = period47.getHours();
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Days days9 = period8.toStandardDays();
        org.joda.time.MutablePeriod mutablePeriod10 = period8.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 1);
        org.joda.time.PeriodType periodType2 = period1.getPeriodType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period8.plusMonths(0);
        org.joda.time.Period period14 = period12.plusMonths((int) '#');
        org.joda.time.Period period16 = period12.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType17 = period12.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) str4, periodType17);
        int int19 = period18.getDays();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.Period period11 = period7.plusMinutes((int) (short) 100);
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) period11, periodType14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period11.toDurationTo(readableInstant16);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.Period period25 = period23.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period23.toDurationTo(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        org.joda.time.Period period49 = period45.plusMonths(0);
        org.joda.time.Period period51 = period49.plusMonths((int) '#');
        org.joda.time.Period period53 = period49.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType54 = period49.getPeriodType();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (short) -1, periodType54, chronology55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration41, periodType54);
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType54);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) (-100), (long) (-100), periodType54, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) 0, (long) 100, periodType54, chronology61);
        org.joda.time.Period period63 = period29.withPeriodType(periodType54);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) (byte) 10, (long) '4', periodType54, chronology64);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration17, periodType54);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant69, readableInstant70);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Duration duration73 = period71.toDurationFrom(readableInstant72);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant75, readableInstant76);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Duration duration79 = period77.toDurationFrom(readableInstant78);
        org.joda.time.Period period81 = period77.plusMonths(0);
        org.joda.time.Period period83 = period81.plusMonths((int) '#');
        org.joda.time.Period period85 = period81.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType86 = period81.getPeriodType();
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period((long) (short) -1, periodType86, chronology87);
        org.joda.time.Period period89 = new org.joda.time.Period(readableInstant68, (org.joda.time.ReadableDuration) duration73, periodType86);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.Period period91 = new org.joda.time.Period((long) (byte) 0, periodType86, chronology90);
        org.joda.time.Chronology chronology92 = null;
        org.joda.time.Period period93 = new org.joda.time.Period((java.lang.Object) readableInstant0, periodType86, chronology92);
        java.lang.Class<?> wildcardClass94 = period93.getClass();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(periodType86);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        int int9 = period8.size();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = period8.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) ' ');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.joda.time.format.PeriodFormatter periodFormatter5 = null;
        java.lang.String str6 = period3.toString(periodFormatter5);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.101S" + "'", str6, "PT0.101S");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period3.toDurationTo(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) -1, periodType34, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration21, periodType34);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType34);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (-100), (long) (-100), periodType34, chronology39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 0, (long) 100, periodType34, chronology41);
        org.joda.time.Period period43 = period9.withPeriodType(periodType34);
        org.joda.time.Period period45 = period43.withWeeks(11);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, (long) ' ', chronology15);
        org.joda.time.Period period18 = period16.plusHours(1);
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology22);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) str24);
        org.joda.time.Period period27 = period25.plusSeconds((int) 'a');
        org.joda.time.Period period29 = period25.plusYears((int) (byte) 0);
        org.joda.time.Period period31 = period25.withMonths(0);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Period period37 = period35.withMinutes(0);
        org.joda.time.Period period39 = period37.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod40 = period37.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period47.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period47.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.Period period59 = period57.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.DurationFieldType durationFieldType71 = period69.getFieldType((int) (byte) 0);
        int int72 = period65.indexOf(durationFieldType71);
        int int73 = period57.get(durationFieldType71);
        org.joda.time.Period period75 = period47.withField(durationFieldType71, (int) (short) 0);
        int int76 = mutablePeriod40.indexOf(durationFieldType71);
        int int77 = period31.get(durationFieldType71);
        org.joda.time.Period period79 = period18.withFieldAdded(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period81 = period2.withField(durationFieldType71, 0);
        org.joda.time.Period period82 = period81.toPeriod();
        org.joda.time.Period period84 = period81.plusMillis((int) (short) 10);
        org.joda.time.Period period85 = period81.toPeriod();
        org.joda.time.Period period87 = period81.withMillis(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.011S" + "'", str24, "PT0.011S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period5.minusMonths((int) 'a');
        org.joda.time.Period period11 = period9.minusHours(10);
        org.joda.time.Period period13 = period11.withSeconds(32);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.Period period20 = period18.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.Period period23 = period20.minusWeeks(0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray24 = period20.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldTypeArray24);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period8.multipliedBy((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, 0L, chronology2);
        org.joda.time.Period period5 = period3.withMillis(8);
        org.joda.time.Period period7 = period5.minusHours((int) '4');
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 100, 11, 98, 32);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.Period period7 = period5.plusDays((int) (short) 100);
        int int8 = period7.size();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType13 = period8.getPeriodType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType13, chronology14);
        org.joda.time.Period period17 = period15.plusDays(8);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        org.joda.time.Period period26 = period20.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period28 = period20.withYears((int) (byte) -1);
        org.joda.time.Period period30 = period20.withMinutes((int) 'a');
        org.joda.time.Period period31 = period15.withFields((org.joda.time.ReadablePeriod) period20);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period11 = period9.withWeeks(1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 0, chronology1);
        org.joda.time.Period period4 = period2.minusMillis((int) (short) 10);
        org.joda.time.Period period6 = period4.withMonths((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.Period period12 = period8.withMinutes(1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 10, 0L, chronology2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.Period period20 = period18.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.Period period27 = period25.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType30);
        org.joda.time.Period period33 = period31.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.DurationFieldType durationFieldType39 = period37.getFieldType((int) (byte) 0);
        int int40 = period33.indexOf(durationFieldType39);
        int int41 = period25.get(durationFieldType39);
        org.joda.time.Period period43 = period20.withFieldAdded(durationFieldType39, (int) (short) 0);
        org.joda.time.Period period45 = period43.minusYears(8);
        org.joda.time.Period period47 = period43.withDays(10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.Period period9 = period7.multipliedBy((int) (byte) -1);
        org.joda.time.Period period11 = period9.minusSeconds(8);
        org.joda.time.Period period13 = period11.plusDays(98);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType21 = period16.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType21);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 10, periodType21);
        org.joda.time.Period period27 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period29 = period27.plusMillis((int) 'a');
        boolean boolean30 = period25.equals((java.lang.Object) period29);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType39);
        org.joda.time.Period period42 = period40.withYears((int) ' ');
        org.joda.time.Period period44 = period42.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) 'a', periodType47, chronology48);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 'a', periodType51, chronology52);
        org.joda.time.Hours hours54 = period53.toStandardHours();
        org.joda.time.Period period55 = period49.withFields((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Period period57 = period49.withYears(10);
        org.joda.time.Period period58 = period57.toPeriod();
        org.joda.time.Period period60 = period57.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant63, readableInstant64);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = period65.toDurationFrom(readableInstant66);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant69, readableInstant70);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Duration duration73 = period71.toDurationFrom(readableInstant72);
        org.joda.time.Period period75 = period71.plusMonths(0);
        org.joda.time.Period period77 = period75.plusMonths((int) '#');
        org.joda.time.Period period79 = period75.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType80 = period75.getPeriodType();
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period((long) (short) -1, periodType80, chronology81);
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant62, (org.joda.time.ReadableDuration) duration67, periodType80);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((long) (byte) 0, periodType80, chronology84);
        org.joda.time.Period period86 = period60.normalizedStandard(periodType80);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period((long) 'a', periodType80, chronology87);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period((java.lang.Object) period42, periodType80, chronology89);
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period((java.lang.Object) period25, periodType80, chronology91);
        org.joda.time.Period period94 = period25.minusDays(10);
        org.joda.time.Period period96 = period94.withYears(32);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(hours54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period96);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '4');
        org.joda.time.Period period3 = period1.minusDays((int) (byte) 100);
        org.joda.time.Period period5 = period3.withMillis((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period3.toDurationTo(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = period7.plusMonths(0);
        org.joda.time.Period period13 = period11.plusMonths((int) '#');
        org.joda.time.Period period15 = period11.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType16 = period11.getPeriodType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType16, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType16, chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.Period period9 = period7.plusDays((int) ' ');
        org.joda.time.Period period11 = period9.plusSeconds((int) ' ');
        int int12 = period9.getDays();
        int int13 = period9.getHours();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period7.getFieldTypes();
        org.joda.time.Period period10 = period7.withSeconds((int) (short) 10);
        org.joda.time.Period period12 = period10.minusDays((int) '4');
        org.joda.time.Weeks weeks13 = period12.toStandardWeeks();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.Period period9 = period7.plusMinutes((int) '4');
        org.joda.time.Days days10 = period7.toStandardDays();
        org.joda.time.Period period12 = period7.minusWeeks((int) 'a');
        org.joda.time.Period period14 = period7.withSeconds((int) '4');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.joda.time.Period period13 = period7.minusMinutes((int) (byte) -1);
        org.joda.time.Duration duration14 = period13.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration14);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration14);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period11.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) -1, periodType34, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration21, periodType34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) 0, periodType34, chronology38);
        org.joda.time.Period period40 = period14.normalizedStandard(periodType34);
        org.joda.time.Period period42 = period40.withMillis((int) (byte) 10);
        org.joda.time.Period period43 = period42.toPeriod();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period43);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.Period period4 = new org.joda.time.Period((int) ' ', 8, (int) (short) 1, (int) '4');
        org.joda.time.Period period6 = org.joda.time.Period.millis((int) (short) -1);
        org.joda.time.Period period7 = period4.withFields((org.joda.time.ReadablePeriod) period6);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period6 = period3.negated();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = period15.plusMonths(0);
        org.joda.time.Period period21 = period15.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period24.plusMonths(0);
        org.joda.time.Period period30 = period28.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period28.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period28.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType37);
        org.joda.time.Period period40 = period38.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.DurationFieldType durationFieldType52 = period50.getFieldType((int) (byte) 0);
        int int53 = period46.indexOf(durationFieldType52);
        int int54 = period38.get(durationFieldType52);
        org.joda.time.Period period56 = period28.withField(durationFieldType52, (int) (short) 0);
        int int57 = period21.indexOf(durationFieldType52);
        org.joda.time.Period period59 = period11.withField(durationFieldType52, (int) (short) 0);
        org.joda.time.Period period61 = period59.withWeeks((int) (short) 100);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.plusMillis((int) '4');
        org.joda.time.Period period14 = period12.plusMinutes(52);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) (short) 10, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.Period period12 = period9.plusMinutes((int) ' ');
        org.joda.time.Period period13 = period12.normalizedStandard();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period24.plusMonths(0);
        org.joda.time.Period period30 = period28.plusMonths((int) '#');
        org.joda.time.Period period32 = period28.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType33 = period28.getPeriodType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) -1, periodType33, chronology34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration20, periodType33);
        org.joda.time.Period period37 = period14.withPeriodType(periodType33);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) period4, periodType33, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (short) 10, (long) 10, periodType33, chronology40);
        org.joda.time.Period period43 = period41.withHours(0);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period43);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = period7.plusMonths(0);
        org.joda.time.Period period13 = period7.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period20.toDurationFrom(readableInstant23);
        org.joda.time.Period period26 = period20.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, readableInstant28, periodType29);
        org.joda.time.Period period32 = period30.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType35);
        org.joda.time.Period period38 = period36.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.DurationFieldType durationFieldType44 = period42.getFieldType((int) (byte) 0);
        int int45 = period38.indexOf(durationFieldType44);
        int int46 = period30.get(durationFieldType44);
        org.joda.time.Period period48 = period20.withField(durationFieldType44, (int) (short) 0);
        int int49 = period13.indexOf(durationFieldType44);
        boolean boolean50 = period4.isSupported(durationFieldType44);
        org.joda.time.Period period52 = period4.minusMillis(0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType21 = period16.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType21);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 10, periodType21);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) period25, periodType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType29 = period27.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Period period13 = period11.withMinutes(0);
        org.joda.time.Period period15 = period13.minusSeconds((int) (short) 100);
        org.joda.time.Period period17 = period15.withWeeks((int) (short) -1);
        org.joda.time.Period period18 = period7.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period20 = period7.withMinutes(98);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        int int18 = period1.getSeconds();
        org.joda.time.Period period20 = period1.withMonths(97);
        org.joda.time.Period period22 = period1.minusDays((-1));
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.Period period8 = new org.joda.time.Period(0, (int) '#', 11, 97, 98, (-1), (int) (byte) 10, 8);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        int int6 = period5.getSeconds();
        org.joda.time.Period period8 = period5.withHours(100);
        int int9 = period8.getYears();
        int int10 = period8.size();
        org.joda.time.Period period12 = period8.withSeconds((int) (byte) 10);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period2.getFieldTypes();
        org.joda.time.Period period15 = period2.minusHours((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period20 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) 0, chronology25);
        org.joda.time.Period period28 = period26.minusMillis((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.Period period32 = period31.normalizedStandard();
        org.joda.time.Period period34 = period31.withWeeks(1);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) 'a', periodType36, chronology37);
        org.joda.time.Period period40 = period38.withMinutes(0);
        org.joda.time.Period period41 = period31.minus((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Period period43 = period40.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) 'a', periodType45, chronology46);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) 'a', periodType49, chronology50);
        org.joda.time.Hours hours52 = period51.toStandardHours();
        org.joda.time.Period period53 = period47.withFields((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Period period55 = period47.withYears(10);
        org.joda.time.Period period56 = period55.toPeriod();
        org.joda.time.Period period58 = period55.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant61, readableInstant62);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = period63.toDurationFrom(readableInstant64);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableInstant68);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Duration duration71 = period69.toDurationFrom(readableInstant70);
        org.joda.time.Period period73 = period69.plusMonths(0);
        org.joda.time.Period period75 = period73.plusMonths((int) '#');
        org.joda.time.Period period77 = period73.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType78 = period73.getPeriodType();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period((long) (short) -1, periodType78, chronology79);
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant60, (org.joda.time.ReadableDuration) duration65, periodType78);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period((long) (byte) 0, periodType78, chronology82);
        org.joda.time.Period period84 = period58.normalizedStandard(periodType78);
        org.joda.time.Period period85 = period40.normalizedStandard(periodType78);
        org.joda.time.Period period86 = period26.withPeriodType(periodType78);
        org.joda.time.Period period87 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant23, periodType78);
        org.joda.time.Period period88 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType78);
        org.joda.time.ReadableInstant readableInstant89 = null;
        org.joda.time.Duration duration90 = period88.toDurationFrom(readableInstant89);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(duration90);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.Period period4 = new org.joda.time.Period((int) 'a', (-1), 8, (int) '4');
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = period4.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(100L, chronology1);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 'a', periodType4, chronology5);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.Period period12 = period6.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period6.withYears(10);
        org.joda.time.Period period15 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period17 = period15.minusYears((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = period15.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period9.plusMonths((int) (short) 10);
        org.joda.time.Period period34 = period9.plusMonths((int) (byte) 10);
        org.joda.time.Period period36 = period9.minusWeeks(98);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, (long) ' ', chronology15);
        org.joda.time.Period period18 = period16.plusHours(1);
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology22);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) str24);
        org.joda.time.Period period27 = period25.plusSeconds((int) 'a');
        org.joda.time.Period period29 = period25.plusYears((int) (byte) 0);
        org.joda.time.Period period31 = period25.withMonths(0);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Period period37 = period35.withMinutes(0);
        org.joda.time.Period period39 = period37.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod40 = period37.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period47.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period47.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.Period period59 = period57.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.DurationFieldType durationFieldType71 = period69.getFieldType((int) (byte) 0);
        int int72 = period65.indexOf(durationFieldType71);
        int int73 = period57.get(durationFieldType71);
        org.joda.time.Period period75 = period47.withField(durationFieldType71, (int) (short) 0);
        int int76 = mutablePeriod40.indexOf(durationFieldType71);
        int int77 = period31.get(durationFieldType71);
        org.joda.time.Period period79 = period18.withFieldAdded(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period81 = period2.withField(durationFieldType71, 0);
        org.joda.time.Period period83 = period2.plusWeeks((-3));
        org.joda.time.Period period85 = period83.plusSeconds(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.011S" + "'", str24, "PT0.011S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        org.joda.time.Period period3 = period1.withMonths(52);
        org.joda.time.Period period4 = period3.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 100, (long) (-1), chronology3);
        int int5 = period4.getHours();
        org.joda.time.Period period7 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period9 = period7.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.Period period15 = period13.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType18);
        org.joda.time.DurationFieldType durationFieldType21 = period19.getFieldType((int) (byte) 0);
        int int22 = period15.indexOf(durationFieldType21);
        org.joda.time.Period period24 = period7.withFieldAdded(durationFieldType21, 1);
        org.joda.time.Period period26 = period24.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType27 = period26.getPeriodType();
        org.joda.time.Period period28 = period4.withPeriodType(periodType27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((-1L), periodType27, chronology29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.Period period14 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.Period period20 = period18.plusMonths((int) '4');
        org.joda.time.Period period21 = period12.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.PeriodType periodType22 = period20.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) 0, periodType22);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) 100, periodType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMonths((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period28.plusMonths(0);
        org.joda.time.Period period34 = period32.plusMonths((int) '#');
        org.joda.time.Period period36 = period32.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType37 = period32.getPeriodType();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (short) -1, periodType37, chronology38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (-100), (long) (-100), periodType37, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) 0, (long) 100, periodType37, chronology44);
        org.joda.time.Period period46 = period6.normalizedStandard(periodType37);
        int[] intArray47 = period46.getValues();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType21 = period16.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration8, periodType21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) 100, periodType21, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType21);
        org.joda.time.Chronology chronology28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) periodType21, chronology28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period7 = period5.minusMinutes((int) (short) 100);
        org.joda.time.Period period9 = period5.withHours((int) (byte) 10);
        org.joda.time.Period period11 = period5.minusHours((-3));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        org.joda.time.Period period5 = period4.negated();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.Period period11 = period9.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.DurationFieldType durationFieldType17 = period15.getFieldType((int) (byte) 0);
        int int18 = period11.indexOf(durationFieldType17);
        org.joda.time.Period period20 = period4.withField(durationFieldType17, 10);
        org.joda.time.Period period22 = period20.minusMinutes((int) (short) 0);
        org.joda.time.Period period24 = period22.withHours((-3));
        int int25 = period24.getYears();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period28.plusMonths(0);
        org.joda.time.Period period34 = period32.plusMonths((int) '#');
        org.joda.time.Period period36 = period32.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType37 = period32.getPeriodType();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (short) -1, periodType37, chronology38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 100, periodType37, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType37);
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) str9, periodType37);
        org.joda.time.Period period46 = period44.minusWeeks(100);
        org.joda.time.Minutes minutes47 = period44.toStandardMinutes();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT32M" + "'", str9, "PT32M");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(minutes47);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Hours hours26 = period25.toStandardHours();
        org.joda.time.Period period27 = period21.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period21.withYears(10);
        org.joda.time.Period period30 = period29.toPeriod();
        org.joda.time.Period period32 = period29.plusMillis(1);
        org.joda.time.Period period33 = period14.minus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period35 = period33.plusHours(0);
        org.joda.time.Chronology chronology36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) 0, chronology36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.plusMillis((int) (byte) 100);
        org.joda.time.Period period14 = period10.plusWeeks((int) '#');
        org.joda.time.Period period16 = period14.plusMinutes(11);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.Period period3 = period1.withWeeks((int) (short) 0);
        org.joda.time.Period period5 = period1.plusHours((int) (short) 100);
        org.joda.time.Period period7 = period5.withWeeks(0);
        org.joda.time.Period period9 = period5.withYears((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration10 = period9.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.Period period1 = org.joda.time.Period.hours(8);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds13 = period6.toStandardSeconds();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Period period16 = period14.plusSeconds((int) (byte) 1);
        org.joda.time.Duration duration17 = period14.toStandardDuration();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration17);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period10 = period4.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.Period period8 = new org.joda.time.Period((-100), (-100), 100, 0, (int) (byte) 1, (int) (short) 0, (int) (byte) -1, 8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = org.joda.time.Period.millis(1);
        org.joda.time.Period period5 = period3.withWeeks((int) (short) 0);
        org.joda.time.Period period6 = period1.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) readableInstant7, chronology9);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusDays((int) (short) 0);
        org.joda.time.Period period4 = period2.plusSeconds((int) (short) -1);
        org.joda.time.Period period6 = period4.withMillis((int) (short) 0);
        org.joda.time.Period period8 = period4.plusSeconds((int) 'a');
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '4');
        org.joda.time.Period period3 = period1.minusDays((int) (byte) 100);
        org.joda.time.Period period5 = period3.withMillis((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period3.toDurationTo(readableInstant6);
        int[] intArray8 = period3.getValues();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, -100, 52, 0, 0, 0]");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period10 = period4.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.Period period16 = period14.plusMonths((int) '4');
        org.joda.time.Period period17 = period8.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = period16.getPeriodType();
        org.joda.time.Period period19 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.Period period23 = period22.normalizedStandard();
        org.joda.time.Period period25 = period22.plusMinutes((int) ' ');
        org.joda.time.Period period26 = period25.normalizedStandard();
        org.joda.time.Period period28 = period26.plusMinutes((-1));
        org.joda.time.Period period30 = period28.plusYears(8);
        org.joda.time.Period period31 = period19.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology34);
        java.lang.String str36 = period35.toString();
        org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) str36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.Period period44 = period40.plusMonths(0);
        org.joda.time.Period period46 = period44.plusMonths((int) '#');
        org.joda.time.Period period48 = period44.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType49 = period44.getPeriodType();
        org.joda.time.Period period50 = new org.joda.time.Period((java.lang.Object) str36, periodType49);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) 'a', periodType52, chronology53);
        org.joda.time.Period period56 = period54.withMinutes(0);
        org.joda.time.Period period58 = period56.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod59 = period56.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant60, readableInstant61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationFrom(readableInstant63);
        org.joda.time.Period period66 = period62.plusMonths(0);
        org.joda.time.Period period68 = period66.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = period66.toDurationFrom(readableInstant69);
        org.joda.time.Period period72 = period66.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant73, readableInstant74, periodType75);
        org.joda.time.Period period78 = period76.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.PeriodType periodType81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period(readableInstant79, readableInstant80, periodType81);
        org.joda.time.Period period84 = period82.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.PeriodType periodType87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period(readableInstant85, readableInstant86, periodType87);
        org.joda.time.DurationFieldType durationFieldType90 = period88.getFieldType((int) (byte) 0);
        int int91 = period84.indexOf(durationFieldType90);
        int int92 = period76.get(durationFieldType90);
        org.joda.time.Period period94 = period66.withField(durationFieldType90, (int) (short) 0);
        int int95 = mutablePeriod59.indexOf(durationFieldType90);
        int int96 = period50.get(durationFieldType90);
        org.joda.time.Period period97 = period28.withFields((org.joda.time.ReadablePeriod) period50);
        org.joda.time.DurationFieldType[] durationFieldTypeArray98 = period50.getFieldTypes();
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT0.011S" + "'", str36, "PT0.011S");
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(mutablePeriod59);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(durationFieldType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(period97);
        org.junit.Assert.assertNotNull(durationFieldTypeArray98);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '4');
        org.joda.time.Period period3 = period1.minusDays((int) (byte) 100);
        org.joda.time.Period period5 = period3.withMillis((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period3.toDurationTo(readableInstant6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = period3.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period10.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period10.toDurationTo(readableInstant12);
        org.joda.time.Period period15 = period10.minusDays(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, (long) ' ', chronology15);
        org.joda.time.Period period18 = period16.plusHours(1);
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology22);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) str24);
        org.joda.time.Period period27 = period25.plusSeconds((int) 'a');
        org.joda.time.Period period29 = period25.plusYears((int) (byte) 0);
        org.joda.time.Period period31 = period25.withMonths(0);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Period period37 = period35.withMinutes(0);
        org.joda.time.Period period39 = period37.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod40 = period37.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period47.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period47.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.Period period59 = period57.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.DurationFieldType durationFieldType71 = period69.getFieldType((int) (byte) 0);
        int int72 = period65.indexOf(durationFieldType71);
        int int73 = period57.get(durationFieldType71);
        org.joda.time.Period period75 = period47.withField(durationFieldType71, (int) (short) 0);
        int int76 = mutablePeriod40.indexOf(durationFieldType71);
        int int77 = period31.get(durationFieldType71);
        org.joda.time.Period period79 = period18.withFieldAdded(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period81 = period2.withField(durationFieldType71, 0);
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((long) 'a', periodType83, chronology84);
        org.joda.time.Period period87 = period85.withMinutes(0);
        org.joda.time.Period period89 = period87.minusSeconds((int) (short) 100);
        org.joda.time.Period period91 = period87.minusMonths((int) 'a');
        org.joda.time.Period period92 = period2.withFields((org.joda.time.ReadablePeriod) period87);
        org.joda.time.Period period94 = period87.minusMinutes(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.011S" + "'", str24, "PT0.011S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period94);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        int int9 = period8.size();
        org.joda.time.Period period11 = period8.withYears((int) ' ');
        org.joda.time.Period period12 = period11.toPeriod();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Period period13 = period11.withMinutes(0);
        org.joda.time.Period period15 = period13.minusSeconds((int) (short) 100);
        org.joda.time.Period period17 = period15.withWeeks((int) (short) -1);
        org.joda.time.Period period18 = period7.minus((org.joda.time.ReadablePeriod) period17);
        int int19 = period17.getSeconds();
        int int20 = period17.getMinutes();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', periodType22, chronology23);
        org.joda.time.Period period26 = period24.withMinutes(0);
        org.joda.time.Period period28 = period26.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod29 = period26.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period36.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period36.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period36.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType45);
        org.joda.time.Period period48 = period46.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, readableInstant50, periodType51);
        org.joda.time.Period period54 = period52.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType57);
        org.joda.time.DurationFieldType durationFieldType60 = period58.getFieldType((int) (byte) 0);
        int int61 = period54.indexOf(durationFieldType60);
        int int62 = period46.get(durationFieldType60);
        org.joda.time.Period period64 = period36.withField(durationFieldType60, (int) (short) 0);
        int int65 = mutablePeriod29.indexOf(durationFieldType60);
        boolean boolean66 = period17.isSupported(durationFieldType60);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-100) + "'", int19 == (-100));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period2.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.Period period17 = period16.normalizedStandard();
        org.joda.time.Period period19 = period16.withWeeks(1);
        int int20 = period19.getWeeks();
        org.joda.time.Period period21 = period2.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period23 = period19.minusYears(98);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period8.toDurationFrom(readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.Period period22 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.Period period28 = period26.plusMonths((int) '4');
        org.joda.time.Period period29 = period20.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = period28.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 97, (long) (-1), periodType30, chronology32);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 'a', periodType35, chronology36);
        org.joda.time.Period period39 = period37.withMinutes(0);
        org.joda.time.Period period41 = period39.minusSeconds((int) (short) 100);
        org.joda.time.Period period43 = period41.minusMinutes(100);
        org.joda.time.Period period45 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period47 = period45.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType50);
        org.joda.time.Period period53 = period51.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.DurationFieldType durationFieldType59 = period57.getFieldType((int) (byte) 0);
        int int60 = period53.indexOf(durationFieldType59);
        org.joda.time.Period period62 = period45.withFieldAdded(durationFieldType59, 1);
        org.joda.time.Period period63 = period62.negated();
        org.joda.time.Period period64 = period43.plus((org.joda.time.ReadablePeriod) period62);
        org.joda.time.Period period66 = period43.plusMonths((int) (short) 10);
        org.joda.time.Period period68 = period43.plusMonths((int) (byte) 10);
        org.joda.time.Period period69 = period33.withFields((org.joda.time.ReadablePeriod) period68);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period69);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        org.joda.time.Period period5 = period4.negated();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.Period period11 = period9.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.DurationFieldType durationFieldType17 = period15.getFieldType((int) (byte) 0);
        int int18 = period11.indexOf(durationFieldType17);
        org.joda.time.Period period20 = period4.withField(durationFieldType17, 10);
        org.joda.time.Period period22 = period20.minusMinutes((int) (short) 0);
        org.joda.time.Period period24 = period22.plusMillis((int) (short) 10);
        org.joda.time.format.PeriodFormatter periodFormatter25 = null;
        java.lang.String str26 = period24.toString(periodFormatter25);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "P10YT0.009S" + "'", str26, "P10YT0.009S");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.joda.time.Period period11 = period5.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period5.withYears(10);
        org.joda.time.Period period14 = period13.toPeriod();
        org.joda.time.Period period16 = period13.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, periodType36, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration23, periodType36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 0, periodType36, chronology40);
        org.joda.time.Period period42 = period16.normalizedStandard(periodType36);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(0L, (long) 8, periodType36, chronology43);
        org.joda.time.Period period46 = period44.plusSeconds(10);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period46);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(100L, (long) ' ', chronology4);
        org.joda.time.Period period7 = period5.plusHours(1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.Period period22 = period18.plusMonths(0);
        org.joda.time.Period period24 = period22.plusMonths((int) '#');
        org.joda.time.Period period26 = period22.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType27 = period22.getPeriodType();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) -1, periodType27, chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration14, periodType27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (byte) 0, periodType27, chronology31);
        org.joda.time.Period period33 = period7.withPeriodType(periodType27);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType27);
        org.joda.time.Seconds seconds35 = period34.toStandardSeconds();
        int int36 = period34.size();
        org.joda.time.Period period38 = period34.withYears((int) (short) 1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 100, (long) 10);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 'a', periodType4, chronology5);
        org.joda.time.Hours hours7 = period6.toStandardHours();
        org.joda.time.Period period9 = period6.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        org.joda.time.Period period17 = period6.withField(durationFieldType15, 1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.Period period24 = period20.plusMonths(0);
        org.joda.time.Period period26 = period24.plusMonths((int) '#');
        org.joda.time.Period period28 = period24.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.Period period35 = period31.plusMonths(0);
        org.joda.time.Period period37 = period35.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period35.toDurationFrom(readableInstant38);
        org.joda.time.Period period41 = period35.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.Period period47 = period45.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType50);
        org.joda.time.Period period53 = period51.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.DurationFieldType durationFieldType59 = period57.getFieldType((int) (byte) 0);
        int int60 = period53.indexOf(durationFieldType59);
        int int61 = period45.get(durationFieldType59);
        org.joda.time.Period period63 = period35.withField(durationFieldType59, (int) (short) 0);
        boolean boolean64 = period28.isSupported(durationFieldType59);
        org.joda.time.Period period66 = period17.withFieldAdded(durationFieldType59, 1);
        org.joda.time.Period period68 = period2.withField(durationFieldType59, (-100));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes69 = period68.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.Period period12 = period8.minusWeeks((-3));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.Period period2 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 'a', periodType4, chronology5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = period6.get(durationFieldType7);
        org.joda.time.Period period9 = period2.withFields((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period11 = period9.multipliedBy((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.Period period15 = period14.normalizedStandard();
        org.joda.time.Period period17 = period14.plusMinutes((int) ' ');
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) period18);
        org.joda.time.format.PeriodFormatter periodFormatter20 = null;
        java.lang.String str21 = period19.toString(periodFormatter20);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.Period period44 = period40.plusMonths(0);
        org.joda.time.Period period46 = period44.plusMonths((int) '#');
        org.joda.time.Period period48 = period44.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType49 = period44.getPeriodType();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (short) -1, periodType49, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration36, periodType49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) 100, periodType49, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType49);
        org.joda.time.Period period56 = new org.joda.time.Period((java.lang.Object) str21, periodType49);
        org.joda.time.Period period57 = period11.withPeriodType(periodType49);
        org.joda.time.Period period58 = new org.joda.time.Period((long) (byte) -1, periodType49);
        org.joda.time.Weeks weeks59 = period58.toStandardWeeks();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT32M" + "'", str21, "PT32M");
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(weeks59);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.Period period19 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.Period period25 = period23.plusMonths((int) '4');
        org.joda.time.Period period26 = period17.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.PeriodType periodType27 = period25.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType27);
        org.joda.time.Period period29 = new org.joda.time.Period((long) 'a', (long) 10, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 100, 100L, periodType27);
        org.joda.time.Period period31 = period3.withPeriodType(periodType27);
        java.lang.String str32 = period31.toString();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 100, (long) (-1), chronology35);
        org.joda.time.Period period38 = period36.plusMinutes((int) (short) 10);
        org.joda.time.Period period40 = period38.plusMinutes((-1));
        int int41 = period40.getWeeks();
        org.joda.time.Period period43 = period40.withMinutes((int) (byte) 10);
        org.joda.time.Period period45 = period40.minusMillis(97);
        org.joda.time.Period period46 = period31.withFields((org.joda.time.ReadablePeriod) period40);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT0S" + "'", str32, "PT0S");
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period46);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, (long) (-1), chronology14);
        org.joda.time.Period period17 = period15.plusMinutes((int) (short) 10);
        org.joda.time.Period period19 = period17.plusMinutes((-1));
        int int20 = period19.getWeeks();
        org.joda.time.Period period22 = period19.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period40.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period40.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.Period period58 = period56.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant59, readableInstant60, periodType61);
        org.joda.time.DurationFieldType durationFieldType64 = period62.getFieldType((int) (byte) 0);
        int int65 = period58.indexOf(durationFieldType64);
        int int66 = period50.get(durationFieldType64);
        org.joda.time.Period period68 = period40.withField(durationFieldType64, (int) (short) 0);
        boolean boolean69 = period33.isSupported(durationFieldType64);
        org.joda.time.Period period71 = period22.withField(durationFieldType64, (int) ' ');
        org.joda.time.Period period73 = period11.withField(durationFieldType64, 100);
        org.joda.time.Period period75 = period73.plusWeeks((int) (byte) -1);
        org.joda.time.Period period77 = period75.withYears(0);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period5.plusYears((int) (byte) 0);
        org.joda.time.Period period11 = period5.withMonths(0);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 'a', periodType13, chronology14);
        org.joda.time.Period period17 = period15.withMinutes(0);
        org.joda.time.Period period19 = period17.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod20 = period17.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period27.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period27.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.Period period39 = period37.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType42);
        org.joda.time.Period period45 = period43.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.DurationFieldType durationFieldType51 = period49.getFieldType((int) (byte) 0);
        int int52 = period45.indexOf(durationFieldType51);
        int int53 = period37.get(durationFieldType51);
        org.joda.time.Period period55 = period27.withField(durationFieldType51, (int) (short) 0);
        int int56 = mutablePeriod20.indexOf(durationFieldType51);
        int int57 = period11.get(durationFieldType51);
        org.joda.time.Period period59 = period11.minusMinutes((-1));
        org.joda.time.Period period61 = period11.plusSeconds(97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.Period period4 = period2.withDays(1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period2.toDurationFrom(readableInstant5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration6);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = period7.get(durationFieldType8);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 97, chronology2);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.Period period18 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.Period period25 = period16.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType26 = period24.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', (long) 10, periodType26);
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) 100, 100L, periodType26);
        org.joda.time.Period period30 = period3.withPeriodType(periodType26);
        org.joda.time.Period period31 = new org.joda.time.Period((long) ' ', periodType26);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.Period period1 = org.joda.time.Period.years(100);
        org.joda.time.Period period2 = period1.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.plusMonths((int) (short) 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 1);
        org.joda.time.Period period2 = period1.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period14.plusMonths(0);
        org.joda.time.Period period20 = period18.plusMonths((int) '#');
        org.joda.time.Period period22 = period18.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, periodType23, chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType23);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) 10, periodType23);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) period27, periodType28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        int int37 = period32.getWeeks();
        int int38 = period32.size();
        org.joda.time.Period period40 = period32.minusDays((int) (byte) -1);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology43);
        java.lang.String str45 = period44.toString();
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) str45);
        org.joda.time.Period period48 = period46.plusSeconds((int) 'a');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableInstant53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationFrom(readableInstant55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant58, readableInstant59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = period60.toDurationFrom(readableInstant61);
        org.joda.time.Period period64 = period60.plusMonths(0);
        org.joda.time.Period period66 = period64.plusMonths((int) '#');
        org.joda.time.Period period68 = period64.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType69 = period64.getPeriodType();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (short) -1, periodType69, chronology70);
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant51, (org.joda.time.ReadableDuration) duration56, periodType69);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType69, chronology73);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((long) 100, (long) (-1), chronology77);
        org.joda.time.Period period80 = period78.plusMinutes((int) (short) 10);
        org.joda.time.Period period82 = period80.plusMinutes((-1));
        int int83 = period82.getWeeks();
        org.joda.time.Period period85 = period82.withMinutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType87 = period85.getFieldType(0);
        org.joda.time.Period period89 = period74.withFieldAdded(durationFieldType87, (int) (short) 100);
        org.joda.time.Period period91 = period48.withFieldAdded(durationFieldType87, 52);
        int int92 = period32.indexOf(durationFieldType87);
        org.joda.time.Period period94 = period29.withField(durationFieldType87, (int) (byte) 0);
        org.joda.time.PeriodType periodType95 = period94.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period96 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PT0.011S" + "'", str45, "PT0.011S");
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(periodType95);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 100, (long) 10);
        org.joda.time.PeriodType periodType3 = period2.getPeriodType();
        org.joda.time.Period period4 = period2.normalizedStandard();
        int int5 = period4.getSeconds();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType3);
        org.joda.time.Period period6 = period4.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period4.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.Period period20 = period14.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.Period period26 = period24.plusMonths((int) '4');
        org.joda.time.Period period27 = period18.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 'a', periodType31, chronology32);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 'a', periodType35, chronology36);
        org.joda.time.Hours hours38 = period37.toStandardHours();
        org.joda.time.Period period39 = period33.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period41 = period33.withYears(10);
        org.joda.time.Period period42 = period41.toPeriod();
        org.joda.time.Period period44 = period41.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationFrom(readableInstant56);
        org.joda.time.Period period59 = period55.plusMonths(0);
        org.joda.time.Period period61 = period59.plusMonths((int) '#');
        org.joda.time.Period period63 = period59.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType64 = period59.getPeriodType();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((long) (short) -1, periodType64, chronology65);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant46, (org.joda.time.ReadableDuration) duration51, periodType64);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) (byte) 0, periodType64, chronology68);
        org.joda.time.Period period70 = period44.normalizedStandard(periodType64);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(0L, (long) 8, periodType64, chronology71);
        org.joda.time.Period period73 = new org.joda.time.Period((java.lang.Object) period18, periodType64);
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant11, periodType64);
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration8);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period70);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds13 = period6.toStandardSeconds();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Period period16 = period14.plusSeconds((int) (byte) 1);
        org.joda.time.Period period18 = period16.plusMinutes(0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology9);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) str11);
        org.joda.time.Period period14 = period12.plusSeconds((int) 'a');
        org.joda.time.Period period16 = period12.plusYears((int) (byte) 0);
        org.joda.time.Period period18 = period12.withMonths(0);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Period period24 = period22.withMinutes(0);
        org.joda.time.Period period26 = period24.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod27 = period24.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period30.plusMonths(0);
        org.joda.time.Period period36 = period34.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period34.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period34.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.DurationFieldType durationFieldType58 = period56.getFieldType((int) (byte) 0);
        int int59 = period52.indexOf(durationFieldType58);
        int int60 = period44.get(durationFieldType58);
        org.joda.time.Period period62 = period34.withField(durationFieldType58, (int) (short) 0);
        int int63 = mutablePeriod27.indexOf(durationFieldType58);
        int int64 = period18.get(durationFieldType58);
        org.joda.time.Period period66 = period5.withFieldAdded(durationFieldType58, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Duration duration68 = period66.toDurationTo(readableInstant67);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks69 = period66.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0.011S" + "'", str11, "PT0.011S");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(duration68);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (short) 10, chronology18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.Period period25 = period24.normalizedStandard();
        org.joda.time.Period period27 = period24.plusMinutes((int) ' ');
        org.joda.time.Period period28 = period27.normalizedStandard();
        org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) period28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period33.toDurationFrom(readableInstant34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.Period period43 = period39.plusMonths(0);
        org.joda.time.Period period45 = period43.plusMonths((int) '#');
        org.joda.time.Period period47 = period43.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType48 = period43.getPeriodType();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (short) -1, periodType48, chronology49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant30, (org.joda.time.ReadableDuration) duration35, periodType48);
        org.joda.time.Period period52 = period29.withPeriodType(periodType48);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((java.lang.Object) period19, periodType48, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period((int) (byte) -1, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0, (int) (byte) 100, (int) ' ', 0, periodType48);
        org.joda.time.Period period56 = new org.joda.time.Period((long) 8, (long) (byte) 100, periodType48);
        org.joda.time.Period period57 = period6.normalizedStandard(periodType48);
        int int58 = period6.getYears();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        int int11 = period1.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.Period period18 = period16.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.DurationFieldType durationFieldType30 = period28.getFieldType((int) (byte) 0);
        int int31 = period24.indexOf(durationFieldType30);
        int int32 = period16.get(durationFieldType30);
        org.joda.time.Period period34 = period6.withField(durationFieldType30, (int) (short) 0);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(100L, (long) ' ', chronology37);
        org.joda.time.Period period40 = period38.plusHours(1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant49, readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        org.joda.time.Period period55 = period51.plusMonths(0);
        org.joda.time.Period period57 = period55.plusMonths((int) '#');
        org.joda.time.Period period59 = period55.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType60 = period55.getPeriodType();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) (short) -1, periodType60, chronology61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant42, (org.joda.time.ReadableDuration) duration47, periodType60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) (byte) 0, periodType60, chronology64);
        org.joda.time.Period period66 = period40.withPeriodType(periodType60);
        org.joda.time.Period period67 = period6.withPeriodType(periodType60);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant70, readableInstant71);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Duration duration74 = period72.toDurationFrom(readableInstant73);
        org.joda.time.Period period76 = period72.plusMonths(0);
        org.joda.time.Period period78 = period76.plusMonths((int) '#');
        org.joda.time.Period period80 = period76.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType81 = period76.getPeriodType();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType81, chronology82);
        org.joda.time.Seconds seconds84 = period83.toStandardSeconds();
        org.joda.time.Period period85 = period67.minus((org.joda.time.ReadablePeriod) seconds84);
        org.joda.time.Period period87 = period67.minusMonths((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant88 = null;
        org.joda.time.Duration duration89 = period87.toDurationFrom(readableInstant88);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(periodType81);
        org.junit.Assert.assertNotNull(seconds84);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(duration89);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 100, chronology1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', (long) (byte) 10);
        org.joda.time.Seconds seconds3 = period2.toStandardSeconds();
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        int int11 = period6.getMillis();
        int[] intArray12 = period6.getValues();
        int int13 = period6.getMinutes();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0.001S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.plusMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = period15.plusMonths(0);
        org.joda.time.Period period21 = period19.plusMonths((int) '#');
        org.joda.time.Period period23 = period19.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType24 = period19.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, periodType24, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration11, periodType24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) 100, periodType24, chronology28);
        org.joda.time.Period period30 = period4.withPeriodType(periodType24);
        org.joda.time.Period period32 = period30.plusMillis((int) (byte) 100);
        java.lang.Class<?> wildcardClass33 = period32.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.Period period4 = new org.joda.time.Period(98, 98, 98, 0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        int int10 = period9.getDays();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period9.toDurationTo(readableInstant11);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = org.joda.time.Period.millis(1);
        org.joda.time.Period period5 = period3.withWeeks((int) (short) 0);
        org.joda.time.Period period6 = period1.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology14);
        java.lang.String str16 = period15.toString();
        org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) str16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.Period period24 = period20.plusMonths(0);
        org.joda.time.Period period26 = period24.plusMonths((int) '#');
        org.joda.time.Period period28 = period24.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType29 = period24.getPeriodType();
        org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) str16, periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant11, periodType29);
        org.joda.time.Period period33 = period31.plusYears(97);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType35 = period31.getFieldType(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT0.011S" + "'", str16, "PT0.011S");
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period33);
    }
}

