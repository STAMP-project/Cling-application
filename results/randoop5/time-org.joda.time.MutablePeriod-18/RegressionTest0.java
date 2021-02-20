import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 0, periodType2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.PeriodType periodType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) 10, periodType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = mutablePeriod11.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) 'a', periodType1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.PeriodType periodType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) (short) 1, periodType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = mutablePeriod8.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = mutablePeriod3.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = mutablePeriod3.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = mutablePeriod3.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setValue((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = mutablePeriod11.indexOf(durationFieldType12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = mutablePeriod2.get(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) 0, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("P100M10W1DT10M0.948S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType6 = mutablePeriod5.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((java.lang.Object) 'a', periodType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod1.setValue((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        java.lang.Class<?> wildcardClass2 = mutablePeriod1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        mutablePeriod4.addMinutes((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setValue((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        java.lang.Class<?> wildcardClass6 = mutablePeriod3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        java.lang.String str18 = mutablePeriod14.toString();
        java.lang.Class<?> wildcardClass19 = mutablePeriod14.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT97H1M0.097S" + "'", str18, "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = mutablePeriod1.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.PeriodType periodType15 = mutablePeriod4.getPeriodType();
        int int16 = mutablePeriod4.getYears();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        mutablePeriod4.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        int int25 = mutablePeriod4.size();
        int int26 = mutablePeriod4.getMinutes();
        int int27 = mutablePeriod4.getHours();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 100, (int) '4', (int) '#', (int) (byte) 1, (int) (short) -1, (int) ' ', 10, (int) '#');
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) '#', chronology12);
        mutablePeriod13.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType23 = null;
        int int24 = mutablePeriod22.indexOf(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        mutablePeriod22.add((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.PeriodType periodType33 = mutablePeriod22.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod13, periodType33);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) '4', periodType33);
        org.joda.time.Chronology chronology37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((java.lang.Object) 10, periodType33, chronology37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType5 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod10.addHours((-1));
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod10.setPeriod((long) 100, chronology14);
        mutablePeriod10.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod10.toDurationFrom(readableInstant18);
        mutablePeriod10.addMinutes((int) (byte) 1);
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType24 = mutablePeriod4.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.addSeconds(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        java.lang.Class<?> wildcardClass6 = mutablePeriod5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        int int16 = mutablePeriod4.getHours();
        mutablePeriod4.setYears(8);
        java.lang.Class<?> wildcardClass19 = mutablePeriod4.getClass();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        int int5 = mutablePeriod1.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod2.getYears();
        mutablePeriod2.clear();
        int int10 = mutablePeriod2.getHours();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = mutablePeriod2.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        mutablePeriod4.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        int int25 = mutablePeriod4.size();
        org.joda.time.format.PeriodFormatter periodFormatter26 = null;
        java.lang.String str27 = mutablePeriod4.toString(periodFormatter26);
        int int28 = mutablePeriod4.getMinutes();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "P100M10W1DT10M0.948S" + "'", str27, "P100M10W1DT10M0.948S");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', (int) (short) 1, (int) (byte) 100, (int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = mutablePeriod9.indexOf(durationFieldType10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod16.addHours((-1));
        mutablePeriod9.add((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.PeriodType periodType20 = mutablePeriod9.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) (short) 1, periodType20, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType15 = mutablePeriod4.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 10);
        int int2 = mutablePeriod1.getMonths();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.DurationFieldType durationFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.set(durationFieldType14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'null'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod3.toDurationFrom(readableInstant7);
        java.lang.Class<?> wildcardClass9 = mutablePeriod3.getClass();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setPeriod((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setValue(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        mutablePeriod2.setMonths((int) ' ');
        org.junit.Assert.assertNotNull(mutablePeriod8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 0, (-1L));
        int[] intArray3 = mutablePeriod2.getValues();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType23 = null;
        int int24 = mutablePeriod22.indexOf(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        mutablePeriod22.add((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.PeriodType periodType33 = mutablePeriod22.getPeriodType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType33, chronology34);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType33);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType33);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = mutablePeriod37.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) -1, 0, (int) ' ');
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType12 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(periodType12);
        mutablePeriod13.setMinutes(10);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        mutablePeriod4.addMillis((int) ' ');
        int int14 = mutablePeriod4.getMinutes();
        mutablePeriod4.setYears(8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addMillis(1);
        java.lang.Class<?> wildcardClass3 = mutablePeriod0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType7);
        int int9 = mutablePeriod8.size();
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        mutablePeriod8.setMonths((int) (byte) 0);
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod8.setPeriod((long) (short) -1, (long) 0, chronology15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod8.indexOf(durationFieldType9);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod15.addHours((-1));
        mutablePeriod8.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.PeriodType periodType19 = mutablePeriod8.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType19, chronology21);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod38.addHours((-1));
        org.joda.time.Chronology chronology42 = null;
        mutablePeriod38.setPeriod((long) 100, chronology42);
        mutablePeriod38.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = mutablePeriod38.toDurationFrom(readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType54 = null;
        int int55 = mutablePeriod53.indexOf(durationFieldType54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod60.addHours((-1));
        mutablePeriod53.add((org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.PeriodType periodType64 = mutablePeriod53.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant48, periodType64);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) (short) 10, periodType64);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod(0L, 1L, periodType64);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType64);
        org.joda.time.Chronology chronology69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((java.lang.Object) '#', periodType64, chronology69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(periodType64);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        java.lang.String str18 = mutablePeriod14.toString();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = mutablePeriod14.indexOf(durationFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType22 = mutablePeriod14.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT97H1M0.097S" + "'", str18, "PT97H1M0.097S");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        mutablePeriod3.setMonths(97);
        int int9 = mutablePeriod3.getSeconds();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        int int5 = mutablePeriod1.getDays();
        mutablePeriod1.add((int) (short) 1, (int) '#', (int) (short) -1, (-1), (int) '#', 1, 8, 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = mutablePeriod11.indexOf(durationFieldType12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2, periodType22);
        mutablePeriod2.setYears(1);
        java.lang.Class<?> wildcardClass27 = mutablePeriod2.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setHours((int) 'a');
        int int6 = mutablePeriod3.getMillis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (-1), chronology1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType12 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(periodType12);
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod13.add((long) 0, chronology15);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod7.toDurationFrom(readableInstant8);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = mutablePeriod24.indexOf(durationFieldType25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addHours((-1));
        mutablePeriod24.add((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.PeriodType periodType35 = mutablePeriod24.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType35, chronology36);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType35);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration9, periodType35);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType35);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(periodType35);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) (short) 100, (int) '#', 97);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setValue((int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod7.toDurationFrom(readableInstant15);
        mutablePeriod7.setHours((int) (short) 0);
        mutablePeriod7.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod1.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod7);
        mutablePeriod7.setMinutes((int) (short) 10);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((java.lang.Object) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod7.toDurationFrom(readableInstant15);
        mutablePeriod7.setHours((int) (short) 0);
        mutablePeriod7.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod1.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod7);
        int int29 = mutablePeriod1.getWeeks();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) 8, 100L, chronology6);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod12.toDurationFrom(readableInstant13);
        mutablePeriod12.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(10L, periodType18, chronology19);
        int int21 = mutablePeriod20.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod20);
        org.joda.time.DurationFieldType durationFieldType24 = mutablePeriod20.getFieldType((int) (short) 1);
        int int25 = mutablePeriod12.get(durationFieldType24);
        boolean boolean26 = mutablePeriod3.isSupported(durationFieldType24);
        mutablePeriod3.addMonths((int) (short) 100);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = mutablePeriod11.indexOf(durationFieldType12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2, periodType22);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = mutablePeriod2.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        int int32 = mutablePeriod31.getMonths();
        int int33 = mutablePeriod31.getDays();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod6.toDurationFrom(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = mutablePeriod21.indexOf(durationFieldType22);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        mutablePeriod21.add((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.PeriodType periodType32 = mutablePeriod21.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType32);
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration15, chronology34);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod40.setPeriod((long) 100, chronology44);
        mutablePeriod40.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = mutablePeriod40.toDurationFrom(readableInstant48);
        mutablePeriod40.setHours((int) (short) 0);
        int int52 = mutablePeriod40.getHours();
        mutablePeriod40.setYears(8);
        int int55 = mutablePeriod40.getHours();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.Chronology chronology63 = null;
        mutablePeriod40.add((long) (short) 0, chronology63);
        mutablePeriod1.add((org.joda.time.ReadablePeriod) mutablePeriod40);
        int int66 = mutablePeriod1.getDays();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod4.toString(periodFormatter9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod4.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = mutablePeriod4.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT97H1M0.097S" + "'", str10, "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setHours((int) 'a');
        mutablePeriod3.addWeeks((int) (byte) 0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        mutablePeriod4.add((long) (byte) -1);
        mutablePeriod4.setSeconds(100);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        int int9 = mutablePeriod8.getWeeks();
        java.lang.Class<?> wildcardClass10 = mutablePeriod8.getClass();
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod4.get(durationFieldType9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod4.getFieldTypes();
        java.lang.Object obj12 = mutablePeriod4.clone();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "P-1MT96H1M0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "P-1MT96H1M0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "P-1MT96H1M0.097S");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addHours((-1));
        org.joda.time.Chronology chronology26 = null;
        mutablePeriod22.setPeriod((long) 100, chronology26);
        mutablePeriod22.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod22.toDurationFrom(readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType38 = null;
        int int39 = mutablePeriod37.indexOf(durationFieldType38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod44.addHours((-1));
        mutablePeriod37.add((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.PeriodType periodType48 = mutablePeriod37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration31, readableInstant32, periodType48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) (short) 10, periodType48);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(0L, 1L, periodType48);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType48);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((java.lang.Object) int4, periodType48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(periodType48);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        int int16 = mutablePeriod4.getHours();
        mutablePeriod4.setYears((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        int int5 = mutablePeriod1.getDays();
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod1.add((long) ' ', chronology7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = mutablePeriod6.indexOf(durationFieldType7);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        mutablePeriod6.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.PeriodType periodType17 = mutablePeriod6.getPeriodType();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType17, chronology18);
        int int20 = mutablePeriod19.getYears();
        mutablePeriod19.setSeconds(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.Period period5 = mutablePeriod3.toPeriod();
        int int6 = period5.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.PeriodType periodType15 = mutablePeriod4.getPeriodType();
        mutablePeriod4.setWeeks((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        org.joda.time.format.PeriodFormatter periodFormatter7 = null;
        java.lang.String str8 = period6.toString(periodFormatter7);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT100M" + "'", str8, "PT100M");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.setSeconds((int) '4');
        java.lang.String str9 = mutablePeriod4.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) '#', chronology11);
        mutablePeriod12.setMinutes(8);
        mutablePeriod12.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod21.setPeriod((long) 100, chronology25);
        mutablePeriod21.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod21.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration30, chronology33);
        mutablePeriod12.setHours((int) '4');
        mutablePeriod12.addMillis(8);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.DurationFieldType durationFieldType40 = null;
        int int41 = mutablePeriod4.get(durationFieldType40);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT97H1M52.097S" + "'", str9, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) '#');
        java.lang.Class<?> wildcardClass2 = mutablePeriod1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod3.setPeriod(readableInterval6);
        mutablePeriod3.setPeriod((int) (byte) 0, 8, (-1), 52, (-1), 52, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, chronology1);
        mutablePeriod2.setPeriod((long) ' ');
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod4.get(durationFieldType9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        mutablePeriod4.add(readableInterval11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = mutablePeriod2.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        mutablePeriod4.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        int int25 = mutablePeriod4.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType27 = mutablePeriod4.getFieldType(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        int int12 = mutablePeriod8.getDays();
        mutablePeriod8.add(100, 100, 0, (int) (short) 100, (int) (byte) 1, 100, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addMillis(1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        mutablePeriod0.setPeriod(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        mutablePeriod0.setPeriod(readableInstant6, readableInstant7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        mutablePeriod9.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(10L, periodType15, chronology16);
        int int18 = mutablePeriod17.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17);
        org.joda.time.DurationFieldType durationFieldType21 = mutablePeriod17.getFieldType((int) (short) 1);
        int int22 = mutablePeriod9.get(durationFieldType21);
        boolean boolean23 = mutablePeriod3.isSupported(durationFieldType21);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addMinutes((int) (byte) -1);
        mutablePeriod28.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod28.toDurationFrom(readableInstant33);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = mutablePeriod43.toDurationTo(readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType56 = null;
        int int57 = mutablePeriod55.indexOf(durationFieldType56);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod62.addHours((-1));
        mutablePeriod55.add((org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.PeriodType periodType66 = mutablePeriod55.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType66, chronology68);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration45, readableInstant46, periodType66);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(readableInstant37, readableInstant38, periodType66);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant36, periodType66);
        int int73 = mutablePeriod72.getSeconds();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 100, 1, 97, (int) (short) -1, (int) 'a', (int) (byte) 1, 97);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 10, 100L);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = mutablePeriod2.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = mutablePeriod16.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        int int16 = mutablePeriod4.getHours();
        mutablePeriod4.setYears(8);
        int int19 = mutablePeriod4.getYears();
        mutablePeriod4.setWeeks(8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        int int3 = mutablePeriod1.getHours();
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod1.toMutablePeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = mutablePeriod4.getFieldTypes();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) -1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod3.add((long) 'a', chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((java.lang.Object) chronology7, chronology9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setMillis((int) (byte) 10);
        mutablePeriod0.addMinutes((int) ' ');
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = mutablePeriod10.indexOf(durationFieldType11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType21 = mutablePeriod10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType21, chronology23);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 0, periodType21);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 100, periodType21, chronology26);
        mutablePeriod27.addMillis((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        mutablePeriod4.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        int int25 = mutablePeriod4.size();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        mutablePeriod4.setPeriod(readableInstant26, readableInstant27);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration20, chronology23);
        mutablePeriod2.setPeriod(97, 100, (int) (short) -1, (int) (short) 1, 1, (int) (short) 0, 1, (int) (byte) 10);
        mutablePeriod2.addHours(10);
        int int36 = mutablePeriod2.getWeeks();
        org.joda.time.DurationFieldType[] durationFieldTypeArray37 = mutablePeriod2.getFieldTypes();
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(durationFieldTypeArray37);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        int int9 = mutablePeriod4.getYears();
        mutablePeriod4.setHours(0);
        mutablePeriod4.addHours((int) (short) 10);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType5 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod10.addHours((-1));
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod10.setPeriod((long) 100, chronology14);
        mutablePeriod10.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod10.toDurationFrom(readableInstant18);
        mutablePeriod10.addMinutes((int) (byte) 1);
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod10);
        java.lang.Object obj23 = mutablePeriod4.clone();
        int int24 = mutablePeriod4.getHours();
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "PT97H2M0.197S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "PT97H2M0.197S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "PT97H2M0.197S");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        int int5 = mutablePeriod1.getDays();
        mutablePeriod1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        mutablePeriod4.setMillis((int) 'a');
        mutablePeriod4.clear();
        java.lang.Class<?> wildcardClass18 = mutablePeriod4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) (byte) 1, chronology2);
        java.lang.Class<?> wildcardClass4 = mutablePeriod3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        mutablePeriod4.setPeriod(8, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) 100, 0, (int) (byte) 0, (int) '#');
        java.lang.Object obj21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(obj21);
        org.joda.time.PeriodType periodType23 = mutablePeriod22.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) (short) -1, periodType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        mutablePeriod4.setYears((int) (byte) 10);
        mutablePeriod4.setMinutes(0);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod10.toDurationFrom(readableInstant11);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType38, chronology39);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType38);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant5, (org.joda.time.ReadableDuration) duration12, periodType38);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) (short) -1, periodType38);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) 8, periodType38, chronology45);
        mutablePeriod46.setMinutes(1);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationFrom(readableInstant12);
        mutablePeriod11.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(10L, periodType17, chronology18);
        int int20 = mutablePeriod19.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod19);
        org.joda.time.DurationFieldType durationFieldType23 = mutablePeriod19.getFieldType((int) (short) 1);
        int int24 = mutablePeriod11.get(durationFieldType23);
        boolean boolean25 = period6.isSupported(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod26 = period6.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period6.toDurationFrom(readableInstant27);
        int[] intArray29 = period6.getValues();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, 100, 0, 0]");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        mutablePeriod9.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(10L, periodType15, chronology16);
        int int18 = mutablePeriod17.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17);
        org.joda.time.DurationFieldType durationFieldType21 = mutablePeriod17.getFieldType((int) (short) 1);
        int int22 = mutablePeriod9.get(durationFieldType21);
        boolean boolean23 = mutablePeriod3.isSupported(durationFieldType21);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addMinutes((int) (byte) -1);
        mutablePeriod28.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod28.toDurationFrom(readableInstant33);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = mutablePeriod43.toDurationTo(readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType56 = null;
        int int57 = mutablePeriod55.indexOf(durationFieldType56);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod62.addHours((-1));
        mutablePeriod55.add((org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.PeriodType periodType66 = mutablePeriod55.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType66, chronology68);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration45, readableInstant46, periodType66);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(readableInstant37, readableInstant38, periodType66);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant36, periodType66);
        org.joda.time.Chronology chronology73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((java.lang.Object) periodType66, chronology73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType66);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', (int) (byte) 100, (int) (short) -1, (int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 100, chronology16);
        mutablePeriod12.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod12.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType38);
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod7.setPeriod((org.joda.time.ReadableDuration) duration21, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant5, (org.joda.time.ReadableDuration) duration21);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration21);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        mutablePeriod2.setMillis(1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        int int18 = mutablePeriod14.getMillis();
        mutablePeriod14.setYears((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        int int12 = mutablePeriod4.getMillis();
        mutablePeriod4.setWeeks((int) '4');
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = mutablePeriod3.toDurationFrom(readableInstant4);
        java.lang.String str6 = mutablePeriod3.toString();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.001S" + "'", str6, "PT0.001S");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = mutablePeriod11.indexOf(durationFieldType12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2, periodType22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod2.toDurationTo(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        mutablePeriod2.setPeriod(readableInstant27, readableInstant28);
        org.joda.time.Chronology chronology32 = null;
        mutablePeriod2.setPeriod(100L, (long) 'a', chronology32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationFrom(readableInstant12);
        mutablePeriod11.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(10L, periodType17, chronology18);
        int int20 = mutablePeriod19.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod19);
        org.joda.time.DurationFieldType durationFieldType23 = mutablePeriod19.getFieldType((int) (short) 1);
        int int24 = mutablePeriod11.get(durationFieldType23);
        boolean boolean25 = period6.isSupported(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod26 = period6.toMutablePeriod();
        int int27 = period6.size();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        java.lang.String str18 = mutablePeriod14.toString();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = mutablePeriod14.indexOf(durationFieldType19);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType36 = null;
        int int37 = mutablePeriod35.indexOf(durationFieldType36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addHours((-1));
        mutablePeriod35.add((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.PeriodType periodType46 = mutablePeriod35.getPeriodType();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType46, chronology47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((java.lang.Object) int20, periodType46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT97H1M0.097S" + "'", str18, "PT97H1M0.097S");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(periodType46);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        int int16 = mutablePeriod4.getHours();
        mutablePeriod4.setYears(8);
        int int19 = mutablePeriod4.getHours();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod4.add((long) (short) 0, chronology27);
        mutablePeriod4.setPeriod(10L);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        int int16 = mutablePeriod4.getHours();
        mutablePeriod4.setYears((int) '4');
        mutablePeriod4.setYears((int) '#');
        mutablePeriod4.setDays((int) '4');
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(10L, periodType3, chronology4);
        mutablePeriod5.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod5.toDurationFrom(readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationTo(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType38, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType38);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration10, periodType38);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration10, periodType44);
        mutablePeriod45.addHours(8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod4.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod4.getMinutes();
        int[] intArray9 = mutablePeriod4.getValues();
        int int10 = mutablePeriod4.getMonths();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod11.setValue((int) '4', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.Period period5 = mutablePeriod3.toPeriod();
        int int6 = mutablePeriod3.getSeconds();
        int int7 = mutablePeriod3.getMinutes();
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod3.setPeriod((long) (short) 1, chronology9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        mutablePeriod7.setDays((-1));
        int int10 = mutablePeriod7.getDays();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setYears((int) (short) -1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.add(1L, chronology10);
        mutablePeriod8.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant14, readableInstant15, periodType16);
        mutablePeriod17.setMinutes((int) (short) 100);
        org.joda.time.Period period20 = mutablePeriod17.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod25.toDurationFrom(readableInstant26);
        mutablePeriod25.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(10L, periodType31, chronology32);
        int int34 = mutablePeriod33.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod33);
        org.joda.time.DurationFieldType durationFieldType37 = mutablePeriod33.getFieldType((int) (short) 1);
        int int38 = mutablePeriod25.get(durationFieldType37);
        boolean boolean39 = period20.isSupported(durationFieldType37);
        int int40 = mutablePeriod8.indexOf(durationFieldType37);
        int int41 = mutablePeriod2.get(durationFieldType37);
        mutablePeriod2.setMonths((int) (byte) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray44 = mutablePeriod2.getFieldTypes();
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray44);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        mutablePeriod4.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        int int25 = mutablePeriod4.size();
        org.joda.time.MutablePeriod mutablePeriod26 = mutablePeriod4.toMutablePeriod();
        org.joda.time.format.PeriodFormatter periodFormatter27 = null;
        java.lang.String str28 = mutablePeriod4.toString(periodFormatter27);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "P100M10W1DT10M0.948S" + "'", str28, "P100M10W1DT10M0.948S");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        int int10 = mutablePeriod4.getHours();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod19.setPeriod((-1L), chronology21);
        int int23 = mutablePeriod19.getDays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray24 = mutablePeriod19.getFieldTypes();
        org.joda.time.Chronology chronology26 = null;
        mutablePeriod19.add((long) (short) 1, chronology26);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        mutablePeriod19.setDays(97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray24);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        int int12 = mutablePeriod8.getDays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = mutablePeriod8.getFieldTypes();
        mutablePeriod8.addHours((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod4.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod19.setPeriod((long) 100, chronology23);
        mutablePeriod19.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = mutablePeriod19.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType35 = null;
        int int36 = mutablePeriod34.indexOf(durationFieldType35);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod41.addHours((-1));
        mutablePeriod34.add((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.PeriodType periodType45 = mutablePeriod34.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant29, periodType45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (short) 10, periodType45);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(0L, 1L, periodType45);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType45);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(periodType45);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod50.setValue((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        mutablePeriod4.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant17, readableInstant18, periodType19);
        mutablePeriod20.setMinutes((int) (short) 100);
        org.joda.time.Period period23 = mutablePeriod20.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod28.toDurationFrom(readableInstant29);
        mutablePeriod28.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(10L, periodType34, chronology35);
        int int37 = mutablePeriod36.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod36);
        org.joda.time.DurationFieldType durationFieldType40 = mutablePeriod36.getFieldType((int) (short) 1);
        int int41 = mutablePeriod28.get(durationFieldType40);
        boolean boolean42 = period23.isSupported(durationFieldType40);
        boolean boolean43 = mutablePeriod4.isSupported(durationFieldType40);
        org.joda.time.ReadableInterval readableInterval44 = null;
        mutablePeriod4.setPeriod(readableInterval44);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) (byte) 10);
        mutablePeriod4.addYears(97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationFrom(readableInstant12);
        mutablePeriod11.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(10L, periodType17, chronology18);
        int int20 = mutablePeriod19.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod19);
        org.joda.time.DurationFieldType durationFieldType23 = mutablePeriod19.getFieldType((int) (short) 1);
        int int24 = mutablePeriod11.get(durationFieldType23);
        boolean boolean25 = period6.isSupported(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod26 = period6.toMutablePeriod();
        int int27 = mutablePeriod26.getMinutes();
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod26.setPeriod((long) (byte) -1, chronology29);
        mutablePeriod26.setPeriod(0L, (long) (short) 10);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod2.getYears();
        mutablePeriod2.clear();
        int int10 = mutablePeriod2.getMonths();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod6.toDurationFrom(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = mutablePeriod21.indexOf(durationFieldType22);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        mutablePeriod21.add((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.PeriodType periodType32 = mutablePeriod21.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType32);
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration15, chronology34);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod40.setPeriod((long) 100, chronology44);
        mutablePeriod40.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = mutablePeriod40.toDurationFrom(readableInstant48);
        mutablePeriod40.setHours((int) (short) 0);
        int int52 = mutablePeriod40.getHours();
        mutablePeriod40.setYears(8);
        int int55 = mutablePeriod40.getHours();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.Chronology chronology63 = null;
        mutablePeriod40.add((long) (short) 0, chronology63);
        mutablePeriod1.add((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.DurationFieldType[] durationFieldTypeArray66 = mutablePeriod40.getFieldTypes();
        org.joda.time.Chronology chronology69 = null;
        mutablePeriod40.setPeriod((long) 0, (long) 10, chronology69);
        org.joda.time.ReadableDuration readableDuration71 = null;
        mutablePeriod40.add(readableDuration71);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray66);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod38.addHours((-1));
        org.joda.time.Chronology chronology42 = null;
        mutablePeriod38.setPeriod((long) 100, chronology42);
        mutablePeriod38.addHours((int) '#');
        mutablePeriod38.setMillis(97);
        mutablePeriod33.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.ReadableInterval readableInterval49 = null;
        mutablePeriod38.setPeriod(readableInterval49);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 1, (int) '#', 1, (int) 'a', (int) (byte) 1, 10, 100, (int) (short) -1);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.DurationFieldType[] durationFieldTypeArray34 = mutablePeriod33.getFieldTypes();
        mutablePeriod33.setMillis((int) (short) -1);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(durationFieldTypeArray34);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        mutablePeriod3.addYears(10);
        int int7 = mutablePeriod3.getDays();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = mutablePeriod2.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        mutablePeriod1.addMonths((int) '4');
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = mutablePeriod10.indexOf(durationFieldType11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType21 = mutablePeriod10.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType21, chronology22);
        int int24 = mutablePeriod23.getYears();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod29.toDurationFrom(readableInstant30);
        mutablePeriod29.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(10L, periodType35, chronology36);
        int int38 = mutablePeriod37.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod37);
        org.joda.time.DurationFieldType durationFieldType41 = mutablePeriod37.getFieldType((int) (short) 1);
        int int42 = mutablePeriod29.get(durationFieldType41);
        int int43 = mutablePeriod23.indexOf(durationFieldType41);
        int int44 = mutablePeriod1.get(durationFieldType41);
        int int45 = mutablePeriod1.getYears();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod51.addHours((-1));
        org.joda.time.Chronology chronology55 = null;
        mutablePeriod51.setPeriod((long) 100, chronology55);
        mutablePeriod51.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType59 = mutablePeriod51.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(periodType59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 10, periodType59, chronology61);
        org.joda.time.Chronology chronology63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((java.lang.Object) int45, periodType59, chronology63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(periodType59);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, chronology15);
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod4.setPeriod((long) (-1), 10L, chronology19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        mutablePeriod4.addMillis((int) ' ');
        int int14 = mutablePeriod4.getMinutes();
        mutablePeriod4.add(8, (int) (byte) 0, (int) (byte) 1, 8, (int) (short) 10, (-1), 8, 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        mutablePeriod4.addMonths((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = mutablePeriod4.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        mutablePeriod14.add((long) 100);
        mutablePeriod14.addSeconds((int) '4');
        java.lang.Object obj22 = mutablePeriod14.clone();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "PT97H1M52.197S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "PT97H1M52.197S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "PT97H1M52.197S");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod7.toDurationFrom(readableInstant15);
        mutablePeriod7.setHours((int) (short) 0);
        mutablePeriod7.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod1.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType30 = mutablePeriod1.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod1.indexOf(durationFieldType5);
        mutablePeriod1.addHours((int) (byte) 10);
        int int9 = mutablePeriod1.getHours();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(10L, chronology1);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(10L, periodType10, chronology11);
        int int13 = mutablePeriod12.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod12);
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod12.getFieldType((int) (short) 1);
        int int17 = mutablePeriod4.get(durationFieldType16);
        int[] intArray18 = mutablePeriod4.getValues();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod25.addHours((-1));
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod25.setPeriod((long) 100, chronology29);
        mutablePeriod25.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType33 = mutablePeriod25.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, (long) (short) 100, periodType33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) intArray18, periodType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant7, readableInstant8, periodType9);
        int int11 = mutablePeriod10.size();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant12, readableInstant13, periodType14);
        int int16 = mutablePeriod15.size();
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod15);
        mutablePeriod15.setMonths((int) (byte) 0);
        boolean boolean20 = mutablePeriod4.equals((java.lang.Object) (byte) 0);
        mutablePeriod4.add((int) (byte) 0, (int) (byte) 0, 8, (int) (byte) 1, (int) (short) 1, 10, 10, (int) (short) 0);
        mutablePeriod4.addMonths((-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = mutablePeriod6.indexOf(durationFieldType7);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        mutablePeriod6.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.PeriodType periodType17 = mutablePeriod6.getPeriodType();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType17, chronology18);
        int int20 = mutablePeriod19.getYears();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod25.toDurationFrom(readableInstant26);
        mutablePeriod25.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(10L, periodType31, chronology32);
        int int34 = mutablePeriod33.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod33);
        org.joda.time.DurationFieldType durationFieldType37 = mutablePeriod33.getFieldType((int) (short) 1);
        int int38 = mutablePeriod25.get(durationFieldType37);
        int int39 = mutablePeriod19.indexOf(durationFieldType37);
        mutablePeriod19.addYears((int) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("hi!", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        mutablePeriod1.add((long) (byte) 100);
        int int13 = mutablePeriod1.getMinutes();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(10L, periodType3, chronology4);
        mutablePeriod5.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod5.toDurationFrom(readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationTo(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType38, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType38);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration10, periodType38);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration10, periodType44);
        mutablePeriod45.addYears((int) 'a');
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int[] intArray8 = mutablePeriod7.getValues();
        mutablePeriod7.setYears((int) (byte) 100);
        mutablePeriod7.add((int) '#', (int) (short) 0, (int) (byte) -1, (int) (short) -1, 8, (int) (short) 10, 0, (int) 'a');
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 97, 1, 0, 97]");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        int[] intArray3 = mutablePeriod2.getValues();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = mutablePeriod26.indexOf(durationFieldType27);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        mutablePeriod26.add((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.PeriodType periodType37 = mutablePeriod26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21, periodType37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (short) 10, periodType37);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(0L, 1L, periodType37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((java.lang.Object) intArray3, periodType37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod17.setPeriod((long) 100, chronology21);
        mutablePeriod17.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod17.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = mutablePeriod32.indexOf(durationFieldType33);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        mutablePeriod32.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.PeriodType periodType43 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (short) 10, periodType43);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 1L, periodType43);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType43);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 'a', (long) (short) -1, periodType43, chronology48);
        org.joda.time.Chronology chronology51 = null;
        mutablePeriod49.setPeriod((long) '#', chronology51);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        int int12 = mutablePeriod8.getDays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = mutablePeriod8.getFieldTypes();
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod8.add((long) (short) 1, chronology15);
        int int18 = mutablePeriod8.getValue(1);
        java.lang.Object obj19 = mutablePeriod8.clone();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "PT0S");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(52, (int) (byte) 10, (int) ' ', 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        int int3 = mutablePeriod1.getHours();
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod1.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationTo(readableInstant5);
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = mutablePeriod4.getFieldTypes();
        mutablePeriod4.add((int) (byte) 10, (int) ' ', 10, (int) (short) -1, 52, (int) (byte) 1, 0, 52);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(durationFieldTypeArray7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 10, (long) '4', chronology2);
        mutablePeriod3.addMillis((int) '#');
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        mutablePeriod3.addMillis((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod6.toDurationFrom(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = mutablePeriod21.indexOf(durationFieldType22);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        mutablePeriod21.add((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.PeriodType periodType32 = mutablePeriod21.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType32);
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration15, chronology34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = mutablePeriod1.toDurationFrom(readableInstant36);
        mutablePeriod1.setHours(97);
        java.lang.Class<?> wildcardClass40 = mutablePeriod1.getClass();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT0S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        int int25 = mutablePeriod24.size();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        boolean boolean27 = mutablePeriod4.equals((java.lang.Object) mutablePeriod24);
        mutablePeriod24.setMillis((int) '#');
        org.joda.time.ReadableInterval readableInterval30 = null;
        mutablePeriod24.setPeriod(readableInterval30);
        org.joda.time.MutablePeriod mutablePeriod32 = mutablePeriod24.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod33 = mutablePeriod24.toMutablePeriod();
        mutablePeriod24.addWeeks(0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(mutablePeriod33);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        java.lang.String str18 = mutablePeriod14.toString();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = mutablePeriod14.indexOf(durationFieldType19);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod14.setPeriod((long) (byte) 10, (long) (byte) 100, chronology23);
        java.lang.Class<?> wildcardClass25 = mutablePeriod14.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT97H1M0.097S" + "'", str18, "PT97H1M0.097S");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        int[] intArray14 = mutablePeriod4.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = mutablePeriod4.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 35, 0, 0, 97]");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) (byte) 10);
        mutablePeriod4.setMonths((int) '4');
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod18.setPeriod((long) 100, chronology22);
        mutablePeriod18.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod18.toDurationFrom(readableInstant26);
        mutablePeriod18.addMinutes((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = mutablePeriod18.indexOf(durationFieldType30);
        mutablePeriod18.setYears(0);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.Chronology chronology37 = null;
        mutablePeriod18.setPeriod((long) (byte) 1, (long) (short) 100, chronology37);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = mutablePeriod13.indexOf(durationFieldType14);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.PeriodType periodType24 = mutablePeriod13.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType24, chronology25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration6, periodType24);
        int int28 = mutablePeriod27.getDays();
        mutablePeriod27.clear();
        java.lang.Object obj30 = mutablePeriod27.clone();
        int int31 = mutablePeriod27.size();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "PT0S");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        java.lang.Object obj10 = mutablePeriod4.clone();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "P-1MT96H1M0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "P-1MT96H1M0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "P-1MT96H1M0.097S");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(10L, periodType2, chronology3);
        mutablePeriod4.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod4.toDurationFrom(readableInstant8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType15 = mutablePeriod14.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration9, periodType15);
        mutablePeriod16.addMinutes(52);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType14 = mutablePeriod6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(0L, (long) (short) 100, periodType14);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType14);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod16.setPeriod((long) (byte) 0, chronology18);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        int int8 = mutablePeriod3.getDays();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod3.toDurationTo(readableInstant9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod7.toDurationTo(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType30, chronology32);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, readableInstant10, periodType30);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (short) 10, periodType30);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        mutablePeriod1.addMinutes((int) (byte) 10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        mutablePeriod1.setMinutes((-1));
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        mutablePeriod15.add((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 8, (int) (byte) 10, 1);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod29.setPeriod((long) 100, chronology33);
        mutablePeriod29.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod29.toDurationFrom(readableInstant37);
        mutablePeriod29.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter41 = null;
        java.lang.String str42 = mutablePeriod29.toString(periodFormatter41);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType58 = null;
        int int59 = mutablePeriod57.indexOf(durationFieldType58);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod64.addHours((-1));
        mutablePeriod57.add((org.joda.time.ReadablePeriod) mutablePeriod64);
        org.joda.time.PeriodType periodType68 = mutablePeriod57.getPeriodType();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType68, chronology69);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod29, periodType68, chronology72);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod15, periodType68);
        mutablePeriod74.setSeconds(8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = mutablePeriod26.indexOf(durationFieldType27);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        mutablePeriod26.add((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.PeriodType periodType37 = mutablePeriod26.getPeriodType();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType37, chronology38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType37);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant4, (org.joda.time.ReadableDuration) duration11, periodType37);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = mutablePeriod48.toDurationFrom(readableInstant49);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType66 = null;
        int int67 = mutablePeriod65.indexOf(durationFieldType66);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod72.addHours((-1));
        mutablePeriod65.add((org.joda.time.ReadablePeriod) mutablePeriod72);
        org.joda.time.PeriodType periodType76 = mutablePeriod65.getPeriodType();
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType76, chronology77);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType76);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod(readableInstant43, (org.joda.time.ReadableDuration) duration50, periodType76);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, readableInstant42, periodType76);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType76);
        org.joda.time.Chronology chronology83 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((java.lang.Object) 0L, periodType76, chronology83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(periodType76);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.addMinutes((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        int int9 = mutablePeriod8.getWeeks();
        int int10 = mutablePeriod8.getMinutes();
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add(0L, chronology6);
        mutablePeriod2.setMillis((int) (byte) 10);
        int[] intArray10 = mutablePeriod2.getValues();
        mutablePeriod2.add((int) (short) -1, 8, 97, (int) '4', 10, (int) (short) 1, (int) (byte) 100, 0);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableDuration20, readableInstant21);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        int int24 = mutablePeriod2.size();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 8, 0, 10]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        int int5 = mutablePeriod1.getDays();
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod1.setPeriod(readableInterval6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setValue((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT100M", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 10, 0L, chronology2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 1, (int) ' ', 97, (int) (short) 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = mutablePeriod4.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = mutablePeriod4.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldTypeArray7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        mutablePeriod4.setPeriod(8, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) 100, 0, (int) (byte) 0, (int) '#');
        mutablePeriod4.setWeeks((int) '#');
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        int int17 = mutablePeriod4.indexOf(durationFieldType16);
        mutablePeriod4.addWeeks((int) '4');
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod4.add((long) 8, chronology21);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType12, chronology13);
        mutablePeriod14.setSeconds(1);
        boolean boolean17 = mutablePeriod2.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod2.toDurationTo(readableInstant18);
        mutablePeriod2.setValue(0, 10);
        org.joda.time.Period period23 = mutablePeriod2.toPeriod();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        int int25 = mutablePeriod24.size();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        boolean boolean27 = mutablePeriod4.equals((java.lang.Object) mutablePeriod24);
        int int28 = mutablePeriod4.getMonths();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        mutablePeriod9.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(10L, periodType15, chronology16);
        int int18 = mutablePeriod17.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17);
        org.joda.time.DurationFieldType durationFieldType21 = mutablePeriod17.getFieldType((int) (short) 1);
        int int22 = mutablePeriod9.get(durationFieldType21);
        boolean boolean23 = mutablePeriod3.isSupported(durationFieldType21);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addMinutes((int) (byte) -1);
        mutablePeriod28.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod28.toDurationFrom(readableInstant33);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        org.joda.time.Chronology chronology47 = null;
        mutablePeriod43.setPeriod((long) 100, chronology47);
        mutablePeriod43.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType51 = mutablePeriod43.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(0L, (long) (short) 100, periodType51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(periodType51);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant36, periodType51);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        mutablePeriod1.addMonths((int) '4');
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = mutablePeriod10.indexOf(durationFieldType11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType21 = mutablePeriod10.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType21, chronology22);
        int int24 = mutablePeriod23.getYears();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod29.toDurationFrom(readableInstant30);
        mutablePeriod29.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(10L, periodType35, chronology36);
        int int38 = mutablePeriod37.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod37);
        org.joda.time.DurationFieldType durationFieldType41 = mutablePeriod37.getFieldType((int) (short) 1);
        int int42 = mutablePeriod29.get(durationFieldType41);
        int int43 = mutablePeriod23.indexOf(durationFieldType41);
        int int44 = mutablePeriod1.get(durationFieldType41);
        int int45 = mutablePeriod1.getYears();
        int int46 = mutablePeriod1.getWeeks();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        mutablePeriod9.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(10L, periodType15, chronology16);
        int int18 = mutablePeriod17.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17);
        org.joda.time.DurationFieldType durationFieldType21 = mutablePeriod17.getFieldType((int) (short) 1);
        int int22 = mutablePeriod9.get(durationFieldType21);
        boolean boolean23 = mutablePeriod3.isSupported(durationFieldType21);
        int int24 = mutablePeriod3.getWeeks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType42 = null;
        int int43 = mutablePeriod41.indexOf(durationFieldType42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod48.addHours((-1));
        mutablePeriod41.add((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.PeriodType periodType52 = mutablePeriod41.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType52, chronology53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant34, periodType52);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod55);
        org.joda.time.Period period57 = mutablePeriod55.toPeriod();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period57);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.ReadableInterval readableInterval2 = null;
        mutablePeriod1.add(readableInterval2);
        mutablePeriod1.setWeeks(0);
        mutablePeriod1.addSeconds((int) '#');
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        mutablePeriod33.setMonths((int) (byte) 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        mutablePeriod4.addMonths((int) (short) 0);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) '#', chronology6);
        mutablePeriod7.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = mutablePeriod16.indexOf(durationFieldType17);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        mutablePeriod16.add((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.PeriodType periodType27 = mutablePeriod16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod7, periodType27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) chronology3, periodType27, chronology30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = mutablePeriod36.indexOf(durationFieldType37);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        mutablePeriod36.add((org.joda.time.ReadablePeriod) mutablePeriod43);
        mutablePeriod36.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(readableInstant49, readableInstant50, periodType51);
        mutablePeriod52.setMinutes((int) (short) 100);
        org.joda.time.Period period55 = mutablePeriod52.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = mutablePeriod60.toDurationFrom(readableInstant61);
        mutablePeriod60.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(10L, periodType66, chronology67);
        int int69 = mutablePeriod68.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod68);
        org.joda.time.DurationFieldType durationFieldType72 = mutablePeriod68.getFieldType((int) (short) 1);
        int int73 = mutablePeriod60.get(durationFieldType72);
        boolean boolean74 = period55.isSupported(durationFieldType72);
        boolean boolean75 = mutablePeriod36.isSupported(durationFieldType72);
        boolean boolean76 = mutablePeriod31.isSupported(durationFieldType72);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("P35DT97H0.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod3.add((long) 'a', chronology7);
        java.lang.String str9 = mutablePeriod3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0.107S" + "'", str9, "PT0.107S");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT0.101S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        mutablePeriod4.setMillis((int) 'a');
        mutablePeriod4.clear();
        int int18 = mutablePeriod4.size();
        mutablePeriod4.setPeriod((int) 'a', (int) 'a', (int) (byte) 100, 0, (-1), (int) (short) -1, 8, (int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        int int3 = mutablePeriod1.getHours();
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod1.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = mutablePeriod18.indexOf(durationFieldType19);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod25.addHours((-1));
        mutablePeriod18.add((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.PeriodType periodType29 = mutablePeriod18.getPeriodType();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType29, chronology30);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableInstant5, (org.joda.time.ReadableDuration) duration11, periodType29);
        mutablePeriod1.add((org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 97, chronology36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod55.addHours((-1));
        org.joda.time.Chronology chronology59 = null;
        mutablePeriod55.setPeriod((long) 100, chronology59);
        mutablePeriod55.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = mutablePeriod55.toDurationFrom(readableInstant63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType71 = null;
        int int72 = mutablePeriod70.indexOf(durationFieldType71);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod77.addHours((-1));
        mutablePeriod70.add((org.joda.time.ReadablePeriod) mutablePeriod77);
        org.joda.time.PeriodType periodType81 = mutablePeriod70.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration64, readableInstant65, periodType81);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((long) (short) 10, periodType81);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(0L, 1L, periodType81);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType81);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(readableInstant38, readableInstant39, periodType81);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((java.lang.Object) chronology36, periodType81);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, readableInstant34, periodType81);
        int int89 = mutablePeriod88.getHours();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(periodType81);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = mutablePeriod13.indexOf(durationFieldType14);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.PeriodType periodType24 = mutablePeriod13.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType24, chronology25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration6, periodType24);
        mutablePeriod27.setPeriod((long) (-1), 10L);
        mutablePeriod27.setMonths((-1));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod3.setPeriod(100L, 0L, chronology8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant10, readableInstant11, periodType12);
        int int14 = mutablePeriod13.size();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant15, readableInstant16, periodType17);
        int int19 = mutablePeriod18.size();
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod18);
        mutablePeriod18.setMonths((int) (byte) 0);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        mutablePeriod18.clear();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationFrom(readableInstant12);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType29 = null;
        int int30 = mutablePeriod28.indexOf(durationFieldType29);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod35.addHours((-1));
        mutablePeriod28.add((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.PeriodType periodType39 = mutablePeriod28.getPeriodType();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType39, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType39);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant6, (org.joda.time.ReadableDuration) duration13, periodType39);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant4, readableInstant5, periodType39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (short) -1, periodType39);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(100L, 0L, periodType39);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 'a', periodType39, chronology47);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        mutablePeriod14.add((long) 100);
        mutablePeriod14.addSeconds((int) '4');
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod26.setPeriod((long) 100, chronology30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = mutablePeriod36.indexOf(durationFieldType37);
        mutablePeriod26.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod36);
        mutablePeriod36.add((long) 100);
        boolean boolean42 = mutablePeriod14.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = mutablePeriod11.indexOf(durationFieldType12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2, periodType22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod2.toDurationTo(readableInstant25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) '#', chronology28);
        mutablePeriod29.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType39 = null;
        int int40 = mutablePeriod38.indexOf(durationFieldType39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod45.addHours((-1));
        mutablePeriod38.add((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.PeriodType periodType49 = mutablePeriod38.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType49);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod29, periodType49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = mutablePeriod29.toDurationTo(readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration53, readableInstant56);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType66 = null;
        int int67 = mutablePeriod65.indexOf(durationFieldType66);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod72.addHours((-1));
        mutablePeriod65.add((org.joda.time.ReadablePeriod) mutablePeriod72);
        org.joda.time.PeriodType periodType76 = mutablePeriod65.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType76);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration53, readableInstant58, periodType76);
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(periodType76);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("P1WT1M0.100S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod4.get(durationFieldType9);
        int int11 = mutablePeriod4.getDays();
        mutablePeriod4.setPeriod(97, (int) ' ', 8, (int) (short) -1, (int) (byte) 10, (int) (byte) -1, 97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        mutablePeriod4.addSeconds(1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (short) -1, (long) 10, chronology11);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.addHours(10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod12.toDurationTo(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = mutablePeriod24.indexOf(durationFieldType25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addHours((-1));
        mutablePeriod24.add((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.PeriodType periodType35 = mutablePeriod24.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType35, chronology37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType35);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant6, readableInstant7, periodType35);
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod3.setPeriod((long) 10, chronology43);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        int int12 = mutablePeriod4.getMillis();
        java.lang.Object obj13 = mutablePeriod4.clone();
        org.joda.time.MutablePeriod mutablePeriod14 = mutablePeriod4.copy();
        mutablePeriod14.setWeeks((int) '#');
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "P35W");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "P35W");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "P35W");
        org.junit.Assert.assertNotNull(mutablePeriod14);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        mutablePeriod5.addDays((int) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.addHours((-1));
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod14.setPeriod((long) 100, chronology18);
        mutablePeriod14.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod14.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = mutablePeriod29.indexOf(durationFieldType30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod36.addHours((-1));
        mutablePeriod29.add((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.PeriodType periodType40 = mutablePeriod29.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant24, periodType40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant44);
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration23);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType54 = null;
        int int55 = mutablePeriod53.indexOf(durationFieldType54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod60.addHours((-1));
        mutablePeriod53.add((org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.PeriodType periodType64 = mutablePeriod53.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType64);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration23, periodType64);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(periodType64);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 100, chronology1);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(97, 0, 52, (int) '4', (int) (byte) 10, 0, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = mutablePeriod26.indexOf(durationFieldType27);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        mutablePeriod26.add((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.PeriodType periodType37 = mutablePeriod26.getPeriodType();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType37, chronology38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType37);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant4, (org.joda.time.ReadableDuration) duration11, periodType37);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType37);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType37);
        org.joda.time.ReadableInterval readableInterval44 = null;
        mutablePeriod43.setPeriod(readableInterval44);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod2.getYears();
        mutablePeriod2.clear();
        int int11 = mutablePeriod2.getValue(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        int int25 = mutablePeriod24.size();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        boolean boolean27 = mutablePeriod4.equals((java.lang.Object) mutablePeriod24);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod32.setPeriod((long) 100, chronology36);
        mutablePeriod32.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = mutablePeriod32.toDurationFrom(readableInstant40);
        mutablePeriod24.setPeriod((org.joda.time.ReadableDuration) duration41);
        mutablePeriod24.setDays((int) '#');
        int int45 = mutablePeriod24.getWeeks();
        mutablePeriod24.add((int) (byte) 10, (int) '4', 100, (int) ' ', 100, 1, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 100, (int) '4', (int) '#', (int) (byte) 1, (int) (short) -1, (int) ' ', 10, (int) '#');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) '#', chronology10);
        mutablePeriod11.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType21 = null;
        int int22 = mutablePeriod20.indexOf(durationFieldType21);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod27.addHours((-1));
        mutablePeriod20.add((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.PeriodType periodType31 = mutablePeriod20.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod11, periodType31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod11.toDurationTo(readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant36);
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration35, chronology38);
        java.lang.Class<?> wildcardClass40 = duration35.getClass();
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationFrom(readableInstant12);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType29 = null;
        int int30 = mutablePeriod28.indexOf(durationFieldType29);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod35.addHours((-1));
        mutablePeriod28.add((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.PeriodType periodType39 = mutablePeriod28.getPeriodType();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType39, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType39);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant6, (org.joda.time.ReadableDuration) duration13, periodType39);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant4, readableInstant5, periodType39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType39);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) 100, periodType39);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod17.setPeriod((long) 100, chronology21);
        mutablePeriod17.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod17.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = mutablePeriod32.indexOf(durationFieldType33);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        mutablePeriod32.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.PeriodType periodType43 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (short) 10, periodType43);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 1L, periodType43);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType43);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 'a', (long) (short) -1, periodType43, chronology48);
        int int50 = mutablePeriod49.getDays();
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = mutablePeriod5.indexOf(durationFieldType6);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        mutablePeriod5.add((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod5, chronology16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addHours((-1));
        org.joda.time.Chronology chronology26 = null;
        mutablePeriod22.setPeriod((long) 100, chronology26);
        mutablePeriod22.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType30 = mutablePeriod22.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(periodType30);
        mutablePeriod17.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        mutablePeriod37.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod37.toDurationFrom(readableInstant45);
        mutablePeriod37.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter49 = null;
        java.lang.String str50 = mutablePeriod37.toString(periodFormatter49);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType66 = null;
        int int67 = mutablePeriod65.indexOf(durationFieldType66);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod72.addHours((-1));
        mutablePeriod65.add((org.joda.time.ReadablePeriod) mutablePeriod72);
        org.joda.time.PeriodType periodType76 = mutablePeriod65.getPeriodType();
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType76, chronology77);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType76);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod37, periodType76, chronology80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17, periodType76);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(10L, periodType76);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT1M0.100S" + "'", str50, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(periodType76);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration20, chronology23);
        mutablePeriod2.setPeriod(97, 100, (int) (short) -1, (int) (short) 1, 1, (int) (short) 0, 1, (int) (byte) 10);
        mutablePeriod2.addHours(10);
        int int36 = mutablePeriod2.getWeeks();
        mutablePeriod2.addSeconds((int) (short) 100);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 0, periodType40, chronology41);
        int int43 = mutablePeriod42.getYears();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = mutablePeriod48.toDurationFrom(readableInstant49);
        mutablePeriod48.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(10L, periodType54, chronology55);
        int int57 = mutablePeriod56.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod56);
        org.joda.time.DurationFieldType durationFieldType60 = mutablePeriod56.getFieldType((int) (short) 1);
        int int61 = mutablePeriod48.get(durationFieldType60);
        boolean boolean62 = mutablePeriod42.isSupported(durationFieldType60);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod67.addMinutes((int) (byte) -1);
        mutablePeriod67.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Duration duration73 = mutablePeriod67.toDurationFrom(readableInstant72);
        mutablePeriod42.add((org.joda.time.ReadableDuration) duration73);
        org.joda.time.Chronology chronology75 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration73, chronology75);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(duration73);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        mutablePeriod14.add((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.PeriodType periodType25 = mutablePeriod14.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType25, chronology26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType25);
        mutablePeriod28.addSeconds(0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 8, 100L, chronology2);
        int[] intArray4 = mutablePeriod3.getValues();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, 92]");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration20, chronology23);
        mutablePeriod2.setPeriod(97, 100, (int) (short) -1, (int) (short) 1, 1, (int) (short) 0, 1, (int) (byte) 10);
        mutablePeriod2.addHours(10);
        mutablePeriod2.setPeriod((long) '#', (long) (short) -1);
        int[] intArray39 = mutablePeriod2.getValues();
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 0, 0, 0, 0, 0, -36]");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '#', chronology2);
        mutablePeriod3.setMinutes(8);
        mutablePeriod3.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 100, chronology16);
        mutablePeriod12.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod12.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22);
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration21, chronology24);
        mutablePeriod3.setHours((int) '4');
        mutablePeriod3.addMillis(8);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod3.toDurationTo(readableInstant30);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(10L, periodType36, chronology37);
        mutablePeriod38.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = mutablePeriod38.toDurationFrom(readableInstant42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = mutablePeriod48.toDurationTo(readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType61 = null;
        int int62 = mutablePeriod60.indexOf(durationFieldType61);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod67.addHours((-1));
        mutablePeriod60.add((org.joda.time.ReadablePeriod) mutablePeriod67);
        org.joda.time.PeriodType periodType71 = mutablePeriod60.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType71);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType71, chronology73);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration50, readableInstant51, periodType71);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(readableInstant34, (org.joda.time.ReadableDuration) duration43, periodType71);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((long) '#', 1L, periodType71, chronology77);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration31, periodType71);
        java.lang.Class<?> wildcardClass80 = duration31.getClass();
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod3.toDurationFrom(readableInstant7);
        mutablePeriod3.setPeriod((long) '4', (long) (byte) 100);
        mutablePeriod3.addYears((int) (byte) 100);
        org.joda.time.ReadableInterval readableInterval14 = null;
        mutablePeriod3.setPeriod(readableInterval14);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod5.toDurationFrom(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType21 = null;
        int int22 = mutablePeriod20.indexOf(durationFieldType21);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod27.addHours((-1));
        mutablePeriod20.add((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.PeriodType periodType31 = mutablePeriod20.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant35);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        org.joda.time.Chronology chronology47 = null;
        mutablePeriod43.setPeriod((long) 100, chronology47);
        mutablePeriod43.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType51 = mutablePeriod43.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(periodType51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 10, periodType51, chronology53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType51, chronology55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant35, periodType51, chronology57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((java.lang.Object) 'a', periodType51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType1, chronology2);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object) (byte) -1, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration20, chronology23);
        mutablePeriod2.setPeriod(97, 100, (int) (short) -1, (int) (short) 1, 1, (int) (short) 0, 1, (int) (byte) 10);
        mutablePeriod2.addHours(10);
        int int36 = mutablePeriod2.getWeeks();
        mutablePeriod2.setMillis((int) ' ');
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        mutablePeriod3.addYears(10);
        java.lang.Object obj7 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod9 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray10 = mutablePeriod9.getValues();
        int int11 = mutablePeriod9.getHours();
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod9.toMutablePeriod();
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = mutablePeriod12.getFieldTypes();
        mutablePeriod12.addWeeks((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "PT97H1M0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "PT97H1M0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray14);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        mutablePeriod3.addMinutes((int) (short) 1);
        int int9 = mutablePeriod3.getMinutes();
        mutablePeriod3.addMillis(0);
        mutablePeriod3.addHours((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 100, chronology16);
        mutablePeriod12.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod12.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) (byte) -1, (int) (short) 100, (int) (short) -1, 8, (int) (short) 1, 0, (int) (short) 100, periodType38);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(periodType38);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod8.toDurationFrom(readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType26 = null;
        int int27 = mutablePeriod25.indexOf(durationFieldType26);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        mutablePeriod25.add((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.PeriodType periodType36 = mutablePeriod25.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType36, chronology37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType36);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant3, (org.joda.time.ReadableDuration) duration10, periodType36);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (short) -1, periodType36);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod42.toMutablePeriod();
        mutablePeriod43.addHours(1);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int int8 = mutablePeriod7.getYears();
        mutablePeriod7.setMillis((-1));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        mutablePeriod15.add((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 8, (int) (byte) 10, 1);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod29.setPeriod((long) 100, chronology33);
        mutablePeriod29.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod29.toDurationFrom(readableInstant37);
        mutablePeriod29.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter41 = null;
        java.lang.String str42 = mutablePeriod29.toString(periodFormatter41);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType58 = null;
        int int59 = mutablePeriod57.indexOf(durationFieldType58);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod64.addHours((-1));
        mutablePeriod57.add((org.joda.time.ReadablePeriod) mutablePeriod64);
        org.joda.time.PeriodType periodType68 = mutablePeriod57.getPeriodType();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType68, chronology69);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod29, periodType68, chronology72);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod15, periodType68);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod15, chronology75);
        int int77 = mutablePeriod15.size();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 8 + "'", int77 == 8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = mutablePeriod10.indexOf(durationFieldType11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType21 = mutablePeriod10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType21, chronology23);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 0, periodType21);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (short) 1, periodType21);
        mutablePeriod26.setPeriod(1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int int8 = mutablePeriod7.getYears();
        mutablePeriod7.setPeriod((long) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod12 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod17.setPeriod((long) 100, chronology21);
        mutablePeriod17.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod17.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = mutablePeriod32.indexOf(durationFieldType33);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        mutablePeriod32.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.PeriodType periodType43 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType43);
        org.joda.time.Chronology chronology45 = null;
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration26, chronology45);
        mutablePeriod7.setPeriod((org.joda.time.ReadableDuration) duration26);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod7.setValue(52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType23 = null;
        int int24 = mutablePeriod22.indexOf(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        mutablePeriod22.add((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.PeriodType periodType33 = mutablePeriod22.getPeriodType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType33, chronology34);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType33);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType39 = mutablePeriod37.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        mutablePeriod15.add((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 8, (int) (byte) 10, 1);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod29.setPeriod((long) 100, chronology33);
        mutablePeriod29.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod29.toDurationFrom(readableInstant37);
        mutablePeriod29.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter41 = null;
        java.lang.String str42 = mutablePeriod29.toString(periodFormatter41);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType58 = null;
        int int59 = mutablePeriod57.indexOf(durationFieldType58);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod64.addHours((-1));
        mutablePeriod57.add((org.joda.time.ReadablePeriod) mutablePeriod64);
        org.joda.time.PeriodType periodType68 = mutablePeriod57.getPeriodType();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType68, chronology69);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod29, periodType68, chronology72);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod15, periodType68);
        int int75 = mutablePeriod15.getMonths();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        java.lang.String str18 = mutablePeriod14.toString();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = mutablePeriod14.indexOf(durationFieldType19);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod25.addHours((-1));
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod25.setPeriod((long) 100, chronology29);
        mutablePeriod25.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod25.toDurationFrom(readableInstant33);
        mutablePeriod25.setHours((int) (short) 0);
        mutablePeriod25.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod25.clear();
        org.joda.time.DurationFieldType durationFieldType47 = null;
        boolean boolean48 = mutablePeriod25.isSupported(durationFieldType47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) '#', chronology50);
        mutablePeriod51.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        mutablePeriod51.setPeriod(readableInstant54, readableInstant55);
        org.joda.time.DurationFieldType[] durationFieldTypeArray57 = mutablePeriod51.getFieldTypes();
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(10L, periodType59, chronology60);
        int int62 = mutablePeriod61.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod61);
        org.joda.time.DurationFieldType durationFieldType65 = mutablePeriod61.getFieldType((int) (short) 1);
        mutablePeriod51.set(durationFieldType65, (int) '#');
        boolean boolean68 = mutablePeriod25.isSupported(durationFieldType65);
        int int69 = mutablePeriod14.get(durationFieldType65);
        mutablePeriod14.addSeconds((int) '#');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT97H1M0.097S" + "'", str18, "PT97H1M0.097S");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.addHours(10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod12.toDurationTo(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = mutablePeriod24.indexOf(durationFieldType25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addHours((-1));
        mutablePeriod24.add((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.PeriodType periodType35 = mutablePeriod24.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType35, chronology37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType35);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant6, readableInstant7, periodType35);
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod40);
        int[] intArray42 = mutablePeriod40.getValues();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addDays((int) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod13.setPeriod((long) 100, chronology17);
        mutablePeriod13.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = mutablePeriod13.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType29 = null;
        int int30 = mutablePeriod28.indexOf(durationFieldType29);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod35.addHours((-1));
        mutablePeriod28.add((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.PeriodType periodType39 = mutablePeriod28.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant23, periodType39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant43);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration22);
        int[] intArray46 = mutablePeriod4.getValues();
        mutablePeriod4.addDays((int) (short) 1);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod8.addHours((-1));
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.setPeriod((long) 100, chronology12);
        mutablePeriod8.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod8.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType24 = null;
        int int25 = mutablePeriod23.indexOf(durationFieldType24);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod30.addHours((-1));
        mutablePeriod23.add((org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.PeriodType periodType34 = mutablePeriod23.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType34);
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration17, chronology36);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        org.joda.time.Chronology chronology47 = null;
        mutablePeriod43.setPeriod((long) 100, chronology47);
        mutablePeriod43.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType51 = mutablePeriod43.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration17, periodType51);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 10, (long) (byte) -1, chronology2);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        mutablePeriod5.setHours((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 100, 100L, chronology2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, (long) ' ', chronology2);
        int int4 = mutablePeriod3.getHours();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        mutablePeriod3.setMonths(97);
        mutablePeriod3.setMinutes((-1));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod1.setValue((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType10, chronology11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) '#', chronology14);
        mutablePeriod15.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = mutablePeriod24.indexOf(durationFieldType25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addHours((-1));
        mutablePeriod24.add((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.PeriodType periodType35 = mutablePeriod24.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType35);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod15, periodType35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((java.lang.Object) periodType10, periodType35, chronology38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) '#', (int) (short) 0, (-1), (int) (byte) -1, 10, (int) (short) 10, 8, periodType35);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 0, periodType42, chronology43);
        int int45 = mutablePeriod44.getYears();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = mutablePeriod50.toDurationFrom(readableInstant51);
        mutablePeriod50.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(10L, periodType56, chronology57);
        int int59 = mutablePeriod58.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod58);
        org.joda.time.DurationFieldType durationFieldType62 = mutablePeriod58.getFieldType((int) (short) 1);
        int int63 = mutablePeriod50.get(durationFieldType62);
        boolean boolean64 = mutablePeriod44.isSupported(durationFieldType62);
        mutablePeriod40.add(durationFieldType62, 97);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Duration duration68 = mutablePeriod40.toDurationFrom(readableInstant67);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(duration68);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInterval readableInterval32 = null;
        mutablePeriod31.add(readableInterval32);
        int int34 = mutablePeriod31.size();
        java.lang.Object obj35 = mutablePeriod31.clone();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "PT0.100S");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        int[] intArray14 = mutablePeriod4.getValues();
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod4.getFieldType(1);
        mutablePeriod4.setMonths((int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 35, 0, 0, 97]");
        org.junit.Assert.assertNotNull(durationFieldType16);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant34);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addHours((-1));
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod42.setPeriod((long) 100, chronology46);
        mutablePeriod42.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType50 = mutablePeriod42.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(periodType50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 10, periodType50, chronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType50, chronology54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant34, periodType50, chronology56);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 0, periodType59, chronology60);
        int int62 = mutablePeriod61.getYears();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Duration duration69 = mutablePeriod67.toDurationFrom(readableInstant68);
        mutablePeriod67.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(10L, periodType73, chronology74);
        int int76 = mutablePeriod75.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod75);
        org.joda.time.DurationFieldType durationFieldType79 = mutablePeriod75.getFieldType((int) (short) 1);
        int int80 = mutablePeriod67.get(durationFieldType79);
        boolean boolean81 = mutablePeriod61.isSupported(durationFieldType79);
        int int82 = mutablePeriod57.get(durationFieldType79);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType84 = mutablePeriod57.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(durationFieldType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        mutablePeriod9.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(10L, periodType15, chronology16);
        int int18 = mutablePeriod17.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17);
        org.joda.time.DurationFieldType durationFieldType21 = mutablePeriod17.getFieldType((int) (short) 1);
        int int22 = mutablePeriod9.get(durationFieldType21);
        boolean boolean23 = mutablePeriod3.isSupported(durationFieldType21);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addMinutes((int) (byte) -1);
        mutablePeriod28.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod28.toDurationFrom(readableInstant33);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = mutablePeriod43.toDurationTo(readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType56 = null;
        int int57 = mutablePeriod55.indexOf(durationFieldType56);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod62.addHours((-1));
        mutablePeriod55.add((org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.PeriodType periodType66 = mutablePeriod55.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType66, chronology68);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration45, readableInstant46, periodType66);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(readableInstant37, readableInstant38, periodType66);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant36, periodType66);
        org.joda.time.DurationFieldType durationFieldType73 = null;
        boolean boolean74 = mutablePeriod72.isSupported(durationFieldType73);
        mutablePeriod72.addMillis((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 10, (long) (byte) 100, chronology2);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod2.setPeriod(100L, chronology9);
        mutablePeriod2.setPeriod((int) 'a', (int) ' ', (int) '4', (int) (byte) 100, (int) (short) 0, (int) ' ', (-1), (int) ' ');
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod24.addHours((-1));
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod24.setPeriod((long) 100, chronology28);
        mutablePeriod24.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = mutablePeriod24.toDurationFrom(readableInstant32);
        mutablePeriod24.setHours((int) (short) 0);
        mutablePeriod24.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod24.clear();
        org.joda.time.DurationFieldType durationFieldType46 = null;
        boolean boolean47 = mutablePeriod24.isSupported(durationFieldType46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) '#', chronology49);
        mutablePeriod50.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        mutablePeriod50.setPeriod(readableInstant53, readableInstant54);
        org.joda.time.DurationFieldType[] durationFieldTypeArray56 = mutablePeriod50.getFieldTypes();
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(10L, periodType58, chronology59);
        int int61 = mutablePeriod60.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod60);
        org.joda.time.DurationFieldType durationFieldType64 = mutablePeriod60.getFieldType((int) (short) 1);
        mutablePeriod50.set(durationFieldType64, (int) '#');
        boolean boolean67 = mutablePeriod24.isSupported(durationFieldType64);
        int int68 = mutablePeriod2.indexOf(durationFieldType64);
        mutablePeriod2.addDays((int) (short) -1);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        mutablePeriod4.add((long) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod14 = mutablePeriod4.toMutablePeriod();
        mutablePeriod4.addMonths((int) (short) 0);
        org.junit.Assert.assertNotNull(mutablePeriod14);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        mutablePeriod4.addMinutes((int) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod16.addHours((-1));
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod16.setPeriod((long) 100, chronology20);
        mutablePeriod16.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = mutablePeriod16.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration25, readableInstant26);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableInstant11, (org.joda.time.ReadableDuration) duration25, periodType28);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) '#', chronology32);
        mutablePeriod33.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType43 = null;
        int int44 = mutablePeriod42.indexOf(durationFieldType43);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod49.addHours((-1));
        mutablePeriod42.add((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.joda.time.PeriodType periodType53 = mutablePeriod42.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod33, periodType53);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = mutablePeriod33.toDurationTo(readableInstant56);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration57);
        int int59 = mutablePeriod4.getMonths();
        mutablePeriod4.add(100L);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration20, chronology23);
        mutablePeriod2.setPeriod(97, 100, (int) (short) -1, (int) (short) 1, 1, (int) (short) 0, 1, (int) (byte) 10);
        mutablePeriod2.addHours(10);
        int int36 = mutablePeriod2.getWeeks();
        mutablePeriod2.setWeeks((int) (byte) 1);
        int int39 = mutablePeriod2.getMillis();
        org.joda.time.ReadableInterval readableInterval40 = null;
        mutablePeriod2.add(readableInterval40);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod2.setPeriod(100L, chronology11);
        int int13 = mutablePeriod2.getMonths();
        mutablePeriod2.setYears((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod4.toString(periodFormatter9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod4.getFieldTypes();
        mutablePeriod4.setPeriod((-1), 0, (int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 8, (-1));
        mutablePeriod4.setWeeks((int) (byte) 10);
        java.lang.Object obj23 = mutablePeriod4.clone();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT97H1M0.097S" + "'", str10, "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "P-1Y10W100DT97H97M7.999S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "P-1Y10W100DT97H97M7.999S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "P-1Y10W100DT97H97M7.999S");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        mutablePeriod1.setPeriod((long) (byte) 10, (long) (short) 1);
        int int5 = mutablePeriod1.getHours();
        int int6 = mutablePeriod1.getMinutes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = mutablePeriod11.indexOf(durationFieldType12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2, periodType22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod2.toDurationTo(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType39 = null;
        int int40 = mutablePeriod38.indexOf(durationFieldType39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod45.addHours((-1));
        mutablePeriod38.add((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.PeriodType periodType49 = mutablePeriod38.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType49);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant31, periodType49);
        mutablePeriod51.setYears(10);
        org.joda.time.Period period54 = mutablePeriod51.toPeriod();
        int[] intArray55 = mutablePeriod51.getValues();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[10, 0, 0, 0, 0, 1, 0, 35]");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod8.toDurationFrom(readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType26 = null;
        int int27 = mutablePeriod25.indexOf(durationFieldType26);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        mutablePeriod25.add((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.PeriodType periodType36 = mutablePeriod25.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType36, chronology37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType36);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant3, (org.joda.time.ReadableDuration) duration10, periodType36);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (short) -1, periodType36);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod42.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType49 = mutablePeriod48.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod54.addHours((-1));
        org.joda.time.Chronology chronology58 = null;
        mutablePeriod54.setPeriod((long) 100, chronology58);
        mutablePeriod54.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = mutablePeriod54.toDurationFrom(readableInstant62);
        mutablePeriod54.addMinutes((int) (byte) 1);
        mutablePeriod48.add((org.joda.time.ReadablePeriod) mutablePeriod54);
        java.lang.Object obj67 = mutablePeriod48.clone();
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Duration duration69 = mutablePeriod48.toDurationTo(readableInstant68);
        mutablePeriod42.setPeriod((org.joda.time.ReadableDuration) duration69);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "PT97H2M0.197S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "PT97H2M0.197S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "PT97H2M0.197S");
        org.junit.Assert.assertNotNull(duration69);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', (int) (byte) 100, (int) (short) -1, (int) (byte) 100);
        mutablePeriod4.setMillis((int) (short) 1);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', (int) 'a', 52, (int) '#');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) '#', chronology6);
        mutablePeriod7.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = mutablePeriod7.indexOf(durationFieldType10);
        mutablePeriod7.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType17, chronology18);
        mutablePeriod19.setSeconds(1);
        boolean boolean22 = mutablePeriod7.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod7.toDurationTo(readableInstant23);
        boolean boolean25 = mutablePeriod4.equals((java.lang.Object) readableInstant23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType27 = mutablePeriod4.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) ' ');
        org.joda.time.format.PeriodFormatter periodFormatter2 = null;
        java.lang.String str3 = mutablePeriod1.toString(periodFormatter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0.032S" + "'", str3, "PT0.032S");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) 10.0f, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        mutablePeriod4.setPeriod(8, (int) (byte) 10, 0, (int) (short) -1, (int) (byte) 100, 0, (int) (byte) 0, (int) '#');
        int int21 = mutablePeriod4.getDays();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod6.toDurationFrom(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16);
        mutablePeriod17.add((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 8, (int) (byte) 10, 1);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addHours((-1));
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod31.setPeriod((long) 100, chronology35);
        mutablePeriod31.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = mutablePeriod31.toDurationFrom(readableInstant39);
        mutablePeriod31.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter43 = null;
        java.lang.String str44 = mutablePeriod31.toString(periodFormatter43);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType60 = null;
        int int61 = mutablePeriod59.indexOf(durationFieldType60);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod66.addHours((-1));
        mutablePeriod59.add((org.joda.time.ReadablePeriod) mutablePeriod66);
        org.joda.time.PeriodType periodType70 = mutablePeriod59.getPeriodType();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType70, chronology71);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType70);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod31, periodType70, chronology74);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17, periodType70);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType70);
        java.lang.Object obj78 = mutablePeriod77.clone();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod83.addMinutes((int) (byte) -1);
        int int86 = mutablePeriod83.getSeconds();
        org.joda.time.DurationFieldType durationFieldType87 = null;
        int int88 = mutablePeriod83.indexOf(durationFieldType87);
        mutablePeriod83.addDays(100);
        mutablePeriod83.setDays((int) '#');
        java.lang.String str93 = mutablePeriod83.toString();
        mutablePeriod77.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod83);
        mutablePeriod83.addDays(8);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT1M0.100S" + "'", str44, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "P35DT97H0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "P35DT97H0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "P35DT97H0.097S");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "P35DT97H0.097S" + "'", str93, "P35DT97H0.097S");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType23 = null;
        int int24 = mutablePeriod22.indexOf(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        mutablePeriod22.add((org.joda.time.ReadablePeriod) mutablePeriod29);
        mutablePeriod22.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant35, readableInstant36, periodType37);
        mutablePeriod38.setMinutes((int) (short) 100);
        org.joda.time.Period period41 = mutablePeriod38.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod46.toDurationFrom(readableInstant47);
        mutablePeriod46.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(10L, periodType52, chronology53);
        int int55 = mutablePeriod54.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod54);
        org.joda.time.DurationFieldType durationFieldType58 = mutablePeriod54.getFieldType((int) (short) 1);
        int int59 = mutablePeriod46.get(durationFieldType58);
        boolean boolean60 = period41.isSupported(durationFieldType58);
        boolean boolean61 = mutablePeriod22.isSupported(durationFieldType58);
        int int62 = mutablePeriod14.get(durationFieldType58);
        org.joda.time.PeriodType periodType63 = mutablePeriod14.getPeriodType();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(periodType63);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType12 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(periodType12);
        java.lang.Class<?> wildcardClass14 = mutablePeriod13.getClass();
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType14 = mutablePeriod13.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) '#', periodType14, chronology16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addHours((-1));
        org.joda.time.Chronology chronology26 = null;
        mutablePeriod22.setPeriod((long) 100, chronology26);
        mutablePeriod22.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod22.toDurationFrom(readableInstant30);
        mutablePeriod22.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(readableInstant34, readableInstant35, periodType36);
        int int38 = mutablePeriod37.size();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant39, readableInstant40, periodType41);
        int int43 = mutablePeriod42.size();
        mutablePeriod37.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod42);
        boolean boolean45 = mutablePeriod22.equals((java.lang.Object) mutablePeriod42);
        mutablePeriod42.setMillis((int) '#');
        org.joda.time.ReadableInterval readableInterval48 = null;
        mutablePeriod42.setPeriod(readableInterval48);
        org.joda.time.MutablePeriod mutablePeriod51 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        mutablePeriod51.addMonths((int) '4');
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType61 = null;
        int int62 = mutablePeriod60.indexOf(durationFieldType61);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod67.addHours((-1));
        mutablePeriod60.add((org.joda.time.ReadablePeriod) mutablePeriod67);
        org.joda.time.PeriodType periodType71 = mutablePeriod60.getPeriodType();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType71, chronology72);
        int int74 = mutablePeriod73.getYears();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.Duration duration81 = mutablePeriod79.toDurationFrom(readableInstant80);
        mutablePeriod79.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType85 = null;
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(10L, periodType85, chronology86);
        int int88 = mutablePeriod87.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod87);
        org.joda.time.DurationFieldType durationFieldType91 = mutablePeriod87.getFieldType((int) (short) 1);
        int int92 = mutablePeriod79.get(durationFieldType91);
        int int93 = mutablePeriod73.indexOf(durationFieldType91);
        int int94 = mutablePeriod51.get(durationFieldType91);
        int int95 = mutablePeriod42.indexOf(durationFieldType91);
        int int96 = mutablePeriod17.get(durationFieldType91);
        int int97 = mutablePeriod17.size();
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(durationFieldType91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 52 + "'", int94 == 52);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 8 + "'", int97 == 8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (short) 0, (int) (short) 100, (int) '4');
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod4.setPeriod((long) ' ', 10L, chronology7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        int int12 = mutablePeriod8.getDays();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod8.toDurationTo(readableInstant13);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(duration14);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) '#');
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) '#', chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType12, chronology13);
        mutablePeriod14.setSeconds(1);
        boolean boolean17 = mutablePeriod2.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod2.toDurationTo(readableInstant18);
        int int20 = mutablePeriod2.getMinutes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (-1));
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType12, chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) '#', chronology16);
        mutablePeriod17.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = mutablePeriod26.indexOf(durationFieldType27);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        mutablePeriod26.add((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.PeriodType periodType37 = mutablePeriod26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17, periodType37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((java.lang.Object) periodType12, periodType37, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) '#', (int) (short) 0, (-1), (int) (byte) -1, 10, (int) (short) 10, 8, periodType37);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 0, periodType44, chronology45);
        int int47 = mutablePeriod46.getYears();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = mutablePeriod52.toDurationFrom(readableInstant53);
        mutablePeriod52.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(10L, periodType58, chronology59);
        int int61 = mutablePeriod60.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod60);
        org.joda.time.DurationFieldType durationFieldType64 = mutablePeriod60.getFieldType((int) (short) 1);
        int int65 = mutablePeriod52.get(durationFieldType64);
        boolean boolean66 = mutablePeriod46.isSupported(durationFieldType64);
        mutablePeriod42.add(durationFieldType64, 97);
        int int69 = mutablePeriod1.get(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        int int12 = mutablePeriod4.getMillis();
        mutablePeriod4.setMillis(97);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = mutablePeriod4.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) '#', chronology5);
        mutablePeriod6.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType16 = null;
        int int17 = mutablePeriod15.indexOf(durationFieldType16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addHours((-1));
        mutablePeriod15.add((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.PeriodType periodType26 = mutablePeriod15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod6, periodType26);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(1L, (long) '4', periodType26);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(10L, (long) ' ', periodType26, chronology30);
        int int32 = mutablePeriod31.getYears();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(10L, periodType3, chronology4);
        mutablePeriod5.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod5.toDurationFrom(readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationTo(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType38, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType38);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration10, periodType38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod52.addHours((-1));
        org.joda.time.Chronology chronology56 = null;
        mutablePeriod52.setPeriod((long) 100, chronology56);
        mutablePeriod52.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = mutablePeriod52.toDurationFrom(readableInstant60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType68 = null;
        int int69 = mutablePeriod67.indexOf(durationFieldType68);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod74.addHours((-1));
        mutablePeriod67.add((org.joda.time.ReadablePeriod) mutablePeriod74);
        org.joda.time.PeriodType periodType78 = mutablePeriod67.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration61, readableInstant62, periodType78);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 0, periodType78);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant45, periodType78);
        mutablePeriod81.setDays((int) 'a');
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(periodType78);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType42 = null;
        int int43 = mutablePeriod41.indexOf(durationFieldType42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod48.addHours((-1));
        mutablePeriod41.add((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.PeriodType periodType52 = mutablePeriod41.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType52, chronology53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant34, periodType52);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod55);
        org.joda.time.format.PeriodFormatter periodFormatter57 = null;
        java.lang.String str58 = mutablePeriod55.toString(periodFormatter57);
        mutablePeriod55.setYears((int) (short) 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0.100S" + "'", str58, "PT0.100S");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        int int10 = mutablePeriod4.getHours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = mutablePeriod4.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = mutablePeriod2.indexOf(durationFieldType3);
        mutablePeriod2.addYears((int) (short) 1);
        mutablePeriod2.setDays((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod13.setPeriod((long) 100, chronology17);
        mutablePeriod13.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = mutablePeriod13.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant25);
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(duration22);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant34);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addHours((-1));
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod42.setPeriod((long) 100, chronology46);
        mutablePeriod42.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType50 = mutablePeriod42.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(periodType50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 10, periodType50, chronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType50, chronology54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant34, periodType50, chronology56);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 0, periodType59, chronology60);
        int int62 = mutablePeriod61.getYears();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Duration duration69 = mutablePeriod67.toDurationFrom(readableInstant68);
        mutablePeriod67.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(10L, periodType73, chronology74);
        int int76 = mutablePeriod75.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod75);
        org.joda.time.DurationFieldType durationFieldType79 = mutablePeriod75.getFieldType((int) (short) 1);
        int int80 = mutablePeriod67.get(durationFieldType79);
        boolean boolean81 = mutablePeriod61.isSupported(durationFieldType79);
        int int82 = mutablePeriod57.get(durationFieldType79);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) 97, chronology84);
        boolean boolean86 = mutablePeriod57.equals((java.lang.Object) chronology84);
        mutablePeriod57.setHours((int) (byte) 100);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(durationFieldType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        java.lang.Object obj6 = mutablePeriod3.clone();
        org.joda.time.ReadableInterval readableInterval7 = null;
        mutablePeriod3.setPeriod(readableInterval7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "PT0S");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M52.097S");
        int int2 = mutablePeriod1.getMillis();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod18.setPeriod((long) 100, chronology22);
        mutablePeriod18.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod18.toDurationFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType34 = null;
        int int35 = mutablePeriod33.indexOf(durationFieldType34);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        mutablePeriod33.add((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.PeriodType periodType44 = mutablePeriod33.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant28, periodType44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (short) 10, periodType44);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0L, 1L, periodType44);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((java.lang.Object) int2, periodType44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(periodType44);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(10L, periodType2, chronology3);
        mutablePeriod4.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod4.toDurationFrom(readableInstant8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod14.toDurationTo(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = mutablePeriod26.indexOf(durationFieldType27);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        mutablePeriod26.add((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.PeriodType periodType37 = mutablePeriod26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType37, chronology39);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, readableInstant17, periodType37);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration9, periodType37);
        mutablePeriod42.setMinutes((int) 'a');
        int int45 = mutablePeriod42.getMillis();
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.setPeriod((long) 0, (long) (short) 1);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.PeriodType periodType15 = mutablePeriod4.getPeriodType();
        java.lang.Class<?> wildcardClass16 = periodType15.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType3);
        int int5 = mutablePeriod4.size();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant6, readableInstant7, periodType8);
        int int10 = mutablePeriod9.size();
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration13);
        mutablePeriod14.addHours(4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        int int12 = mutablePeriod4.getMillis();
        mutablePeriod4.setSeconds(1);
        mutablePeriod4.add(1L);
        mutablePeriod4.setPeriod((long) (byte) 1, (long) (short) 10);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) '#', chronology9);
        mutablePeriod10.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType30);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod10, periodType30);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) ' ', (int) 'a', (int) (byte) 10, 8, (int) ' ', (int) (short) 1, (int) (byte) 0, (int) (byte) -1, periodType30);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = mutablePeriod38.toDurationFrom(readableInstant39);
        org.joda.time.MutablePeriod mutablePeriod41 = mutablePeriod38.toMutablePeriod();
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod38.setPeriod((long) 1, chronology43);
        mutablePeriod33.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType47 = mutablePeriod33.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(mutablePeriod41);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod17.setPeriod((long) 100, chronology21);
        mutablePeriod17.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod17.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = mutablePeriod32.indexOf(durationFieldType33);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        mutablePeriod32.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.PeriodType periodType43 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType43);
        org.joda.time.Chronology chronology45 = null;
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration26, chronology45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration26);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration26);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        int int16 = mutablePeriod4.getHours();
        mutablePeriod4.setYears(8);
        int int19 = mutablePeriod4.getHours();
        mutablePeriod4.addYears((int) (byte) 0);
        mutablePeriod4.setMillis(0);
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod4.add((long) (byte) 0, chronology25);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration20, chronology23);
        mutablePeriod2.setPeriod(97, 100, (int) (short) -1, (int) (short) 1, 1, (int) (short) 0, 1, (int) (byte) 10);
        mutablePeriod2.addHours(10);
        int int36 = mutablePeriod2.size();
        java.lang.Class<?> wildcardClass37 = mutablePeriod2.getClass();
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 100, (long) (-1));
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = mutablePeriod2.toString(periodFormatter3);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod2.setPeriod((long) '#', (long) (byte) 0, chronology7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.101S" + "'", str4, "PT0.101S");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod9.addHours((-1));
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod9.setPeriod((long) 100, chronology13);
        mutablePeriod9.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = mutablePeriod9.toDurationFrom(readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = mutablePeriod24.indexOf(durationFieldType25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addHours((-1));
        mutablePeriod24.add((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.PeriodType periodType35 = mutablePeriod24.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, readableInstant19, periodType35);
        mutablePeriod36.setPeriod((long) 8, 1L);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod45.addHours((-1));
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod45.setPeriod((long) 100, chronology49);
        mutablePeriod45.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = mutablePeriod45.toDurationFrom(readableInstant53);
        mutablePeriod45.setHours((int) (short) 0);
        mutablePeriod45.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        int int66 = mutablePeriod45.size();
        mutablePeriod45.setPeriod((long) 'a', (long) (-1));
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.format.PeriodFormatter periodFormatter71 = null;
        java.lang.String str72 = mutablePeriod3.toString(periodFormatter71);
        mutablePeriod3.setPeriod((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 8 + "'", int66 == 8);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PT0.105S" + "'", str72, "PT0.105S");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        int int25 = mutablePeriod24.size();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        boolean boolean27 = mutablePeriod4.equals((java.lang.Object) mutablePeriod24);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod32.setPeriod((long) 100, chronology36);
        mutablePeriod32.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = mutablePeriod32.toDurationFrom(readableInstant40);
        mutablePeriod24.setPeriod((org.joda.time.ReadableDuration) duration41);
        mutablePeriod24.setPeriod((int) (short) 1, (int) (byte) 100, 97, (int) '#', 1, (int) (short) 100, (int) (byte) -1, 97);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = mutablePeriod56.toDurationFrom(readableInstant57);
        mutablePeriod56.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(10L, periodType62, chronology63);
        int int65 = mutablePeriod64.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod64);
        org.joda.time.DurationFieldType durationFieldType68 = mutablePeriod64.getFieldType((int) (short) 1);
        int int69 = mutablePeriod56.get(durationFieldType68);
        mutablePeriod24.set(durationFieldType68, (int) (byte) 0);
        org.joda.time.Chronology chronology73 = null;
        mutablePeriod24.add((long) (byte) 10, chronology73);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod10.toDurationFrom(readableInstant11);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType38, chronology39);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType38);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant5, (org.joda.time.ReadableDuration) duration12, periodType38);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) (short) -1, periodType38);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) 8, periodType38, chronology45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(periodType38);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod52.addHours((-1));
        org.joda.time.Chronology chronology56 = null;
        mutablePeriod52.setPeriod((long) 100, chronology56);
        mutablePeriod52.addHours((int) '#');
        mutablePeriod52.setMillis(97);
        int int62 = mutablePeriod52.getMillis();
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod68.addHours((-1));
        org.joda.time.Chronology chronology72 = null;
        mutablePeriod68.setPeriod((long) 100, chronology72);
        mutablePeriod68.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Duration duration77 = mutablePeriod68.toDurationFrom(readableInstant76);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration77, readableInstant78);
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod(readableInstant63, (org.joda.time.ReadableDuration) duration77, periodType80);
        org.joda.time.Chronology chronology82 = null;
        mutablePeriod52.setPeriod((org.joda.time.ReadableDuration) duration77, chronology82);
        mutablePeriod47.add((org.joda.time.ReadableDuration) duration77);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertNotNull(duration77);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = mutablePeriod1.isSupported(durationFieldType12);
        java.lang.Object obj14 = mutablePeriod1.clone();
        mutablePeriod1.add(0, (int) (short) 100, 10, 97, (int) '4', (int) '4', (int) '4', (int) (byte) 1);
        mutablePeriod1.setHours((int) 'a');
        mutablePeriod1.addMinutes((-1));
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "P100Y200M110W97DT97H51M152S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "P100Y200M110W97DT97H51M152S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "P100Y200M110W97DT97H51M152S");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationFrom(readableInstant12);
        mutablePeriod11.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(10L, periodType17, chronology18);
        int int20 = mutablePeriod19.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod19);
        org.joda.time.DurationFieldType durationFieldType23 = mutablePeriod19.getFieldType((int) (short) 1);
        int int24 = mutablePeriod11.get(durationFieldType23);
        boolean boolean25 = period6.isSupported(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod26 = period6.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod27 = period6.toMutablePeriod();
        mutablePeriod27.addDays((int) ' ');
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, (-1), (int) '#', (int) '4');
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 0, 8, 1, 0, 100, 97, (int) ' ', 1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = mutablePeriod3.toDurationFrom(readableInstant4);
        mutablePeriod3.addHours((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addDays((int) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod13.setPeriod((long) 100, chronology17);
        mutablePeriod13.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = mutablePeriod13.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType29 = null;
        int int30 = mutablePeriod28.indexOf(durationFieldType29);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod35.addHours((-1));
        mutablePeriod28.add((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.PeriodType periodType39 = mutablePeriod28.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant23, periodType39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant43);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration22);
        int[] intArray46 = mutablePeriod4.getValues();
        mutablePeriod4.setMinutes(10);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addMillis(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant12, readableInstant13, periodType14);
        mutablePeriod15.setMinutes((int) (short) 100);
        org.joda.time.Period period18 = mutablePeriod15.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = mutablePeriod23.toDurationFrom(readableInstant24);
        mutablePeriod23.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(10L, periodType29, chronology30);
        int int32 = mutablePeriod31.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod31);
        org.joda.time.DurationFieldType durationFieldType35 = mutablePeriod31.getFieldType((int) (short) 1);
        int int36 = mutablePeriod23.get(durationFieldType35);
        boolean boolean37 = period18.isSupported(durationFieldType35);
        org.joda.time.MutablePeriod mutablePeriod38 = period18.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod39 = mutablePeriod38.copy();
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        mutablePeriod38.addMinutes((int) '#');
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(mutablePeriod38);
        org.junit.Assert.assertNotNull(mutablePeriod39);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = mutablePeriod2.indexOf(durationFieldType3);
        mutablePeriod2.addYears((int) (short) 1);
        mutablePeriod2.setDays((int) (short) 0);
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod2.setPeriod(readableInterval9);
        int[] intArray11 = mutablePeriod2.getValues();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) '#', chronology2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setValue((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        java.lang.Object obj6 = mutablePeriod3.clone();
        int int7 = mutablePeriod3.getWeeks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "PT0S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        int int17 = mutablePeriod4.indexOf(durationFieldType16);
        mutablePeriod4.addWeeks((int) '4');
        mutablePeriod4.add((long) 97);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod26.setPeriod((long) 100, chronology30);
        mutablePeriod26.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod26.toDurationFrom(readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType42 = null;
        int int43 = mutablePeriod41.indexOf(durationFieldType42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod48.addHours((-1));
        mutablePeriod41.add((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.PeriodType periodType52 = mutablePeriod41.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant36, periodType52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant54);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration35);
        int[] intArray57 = mutablePeriod4.getValues();
        mutablePeriod4.addDays(10);
        mutablePeriod4.setMillis(0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 52, 0, 0, 1, 0, 297]");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod();
        mutablePeriod1.setMillis((int) (byte) 10);
        mutablePeriod1.addMinutes((int) (byte) -1);
        mutablePeriod1.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType8 = mutablePeriod1.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType8, chronology9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = mutablePeriod10.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addMinutes((int) (byte) -1);
        int int8 = mutablePeriod5.getSeconds();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod5.indexOf(durationFieldType9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = mutablePeriod16.toDurationFrom(readableInstant17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant11, (org.joda.time.ReadableDuration) duration18);
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration18);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration18);
        mutablePeriod21.setYears((int) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(duration18);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, (long) 'a');
        java.lang.String str3 = mutablePeriod2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0.098S" + "'", str3, "PT0.098S");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) (byte) 10);
        mutablePeriod4.setMonths((int) '4');
        int int14 = mutablePeriod4.size();
        mutablePeriod4.setPeriod((long) 97, (long) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        int int10 = mutablePeriod4.getHours();
        int int11 = mutablePeriod4.getMonths();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod8.toDurationFrom(readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType26 = null;
        int int27 = mutablePeriod25.indexOf(durationFieldType26);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        mutablePeriod25.add((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.PeriodType periodType36 = mutablePeriod25.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType36, chronology37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType36);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant3, (org.joda.time.ReadableDuration) duration10, periodType36);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = mutablePeriod47.toDurationFrom(readableInstant48);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType65 = null;
        int int66 = mutablePeriod64.indexOf(durationFieldType65);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod71.addHours((-1));
        mutablePeriod64.add((org.joda.time.ReadablePeriod) mutablePeriod71);
        org.joda.time.PeriodType periodType75 = mutablePeriod64.getPeriodType();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType75, chronology76);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType75);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod(readableInstant42, (org.joda.time.ReadableDuration) duration49, periodType75);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant41, periodType75);
        org.joda.time.Chronology chronology81 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration10, chronology81);
        int int83 = mutablePeriod2.getDays();
        int int84 = mutablePeriod2.size();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 4 + "'", int83 == 4);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 8 + "'", int84 == 8);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType7);
        int int9 = mutablePeriod8.size();
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        boolean boolean12 = mutablePeriod3.equals((java.lang.Object) 0.0d);
        org.joda.time.ReadableInterval readableInterval13 = null;
        mutablePeriod3.setPeriod(readableInterval13);
        org.joda.time.PeriodType periodType15 = mutablePeriod3.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = mutablePeriod20.toDurationFrom(readableInstant21);
        mutablePeriod20.setSeconds((int) '4');
        java.lang.String str25 = mutablePeriod20.toString();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) '#', chronology27);
        mutablePeriod28.setMinutes(8);
        mutablePeriod28.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        mutablePeriod37.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod37.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration46, chronology49);
        mutablePeriod28.setHours((int) '4');
        mutablePeriod28.addMillis(8);
        mutablePeriod20.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod28);
        mutablePeriod28.clear();
        int int58 = mutablePeriod28.getValue((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = mutablePeriod63.toDurationFrom(readableInstant64);
        mutablePeriod63.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(10L, periodType69, chronology70);
        int int72 = mutablePeriod71.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod71);
        org.joda.time.DurationFieldType durationFieldType75 = mutablePeriod71.getFieldType((int) (short) 1);
        int int76 = mutablePeriod63.get(durationFieldType75);
        mutablePeriod28.add(durationFieldType75, (int) (short) 1);
        mutablePeriod3.add(durationFieldType75, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT97H1M52.097S" + "'", str25, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) '4', (int) (short) 10, 100);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod2.setPeriod(100L, chronology11);
        int int13 = mutablePeriod2.getMonths();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.add(durationFieldType14, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'null'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMillis((int) (byte) -1);
        mutablePeriod4.setSeconds(100);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(periodType18);
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod19.add(1L, chronology21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) '#', chronology24);
        mutablePeriod25.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType35 = null;
        int int36 = mutablePeriod34.indexOf(durationFieldType35);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod41.addHours((-1));
        mutablePeriod34.add((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.PeriodType periodType45 = mutablePeriod34.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod25, periodType45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((java.lang.Object) chronology21, periodType45, chronology48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((java.lang.Object) 100, periodType45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = mutablePeriod13.indexOf(durationFieldType14);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.PeriodType periodType24 = mutablePeriod13.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType24, chronology25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration6, periodType24);
        int int28 = mutablePeriod27.getYears();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        mutablePeriod15.add((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 8, (int) (byte) 10, 1);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod29.setPeriod((long) 100, chronology33);
        mutablePeriod29.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod29.toDurationFrom(readableInstant37);
        mutablePeriod29.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter41 = null;
        java.lang.String str42 = mutablePeriod29.toString(periodFormatter41);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType58 = null;
        int int59 = mutablePeriod57.indexOf(durationFieldType58);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod64.addHours((-1));
        mutablePeriod57.add((org.joda.time.ReadablePeriod) mutablePeriod64);
        org.joda.time.PeriodType periodType68 = mutablePeriod57.getPeriodType();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType68, chronology69);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod29, periodType68, chronology72);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod15, periodType68);
        int int75 = mutablePeriod74.size();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 8 + "'", int75 == 8);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationTo(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = mutablePeriod16.indexOf(durationFieldType17);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        mutablePeriod16.add((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.PeriodType periodType27 = mutablePeriod16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType27, chronology29);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, readableInstant7, periodType27);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        mutablePeriod31.setPeriod(readableInstant32, readableInstant33);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod4.toString(periodFormatter9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod4.getFieldTypes();
        mutablePeriod4.setPeriod((-1), 0, (int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 8, (-1));
        mutablePeriod4.setWeeks((int) (byte) 10);
        mutablePeriod4.setSeconds((int) (short) 100);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT97H1M0.097S" + "'", str10, "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationFrom(readableInstant12);
        mutablePeriod11.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(10L, periodType17, chronology18);
        int int20 = mutablePeriod19.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod19);
        org.joda.time.DurationFieldType durationFieldType23 = mutablePeriod19.getFieldType((int) (short) 1);
        int int24 = mutablePeriod11.get(durationFieldType23);
        boolean boolean25 = period6.isSupported(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod26 = period6.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod27 = mutablePeriod26.copy();
        int int28 = mutablePeriod27.getSeconds();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.addHours((int) (byte) 10);
        mutablePeriod3.setMinutes((int) (short) 1);
        mutablePeriod3.setMinutes(0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        mutablePeriod2.addDays((int) (short) 0);
        mutablePeriod2.setPeriod(97, 0, (int) (byte) 0, 0, (int) 'a', (int) (short) 0, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertNotNull(mutablePeriod8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        mutablePeriod4.setYears((int) (short) 10);
        java.lang.Object obj18 = mutablePeriod4.clone();
        int int19 = mutablePeriod4.size();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "P10YT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "P10YT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "P10YT0.100S");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 0, (-1L));
        mutablePeriod2.clear();
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod6.toDurationFrom(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = mutablePeriod21.indexOf(durationFieldType22);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        mutablePeriod21.add((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.PeriodType periodType32 = mutablePeriod21.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType32);
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration15, chronology34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = mutablePeriod1.toDurationFrom(readableInstant36);
        mutablePeriod1.setHours((int) (short) 10);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration37);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod4.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod19.setPeriod((long) 100, chronology23);
        mutablePeriod19.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = mutablePeriod19.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType35 = null;
        int int36 = mutablePeriod34.indexOf(durationFieldType35);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod41.addHours((-1));
        mutablePeriod34.add((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.PeriodType periodType45 = mutablePeriod34.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant29, periodType45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (short) 10, periodType45);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(0L, 1L, periodType45);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType45);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(periodType45);
        mutablePeriod50.addHours((int) (byte) 10);
        int int53 = mutablePeriod50.size();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod15.addHours((-1));
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod15.setPeriod((long) 100, chronology19);
        mutablePeriod15.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod15.toDurationFrom(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType31 = null;
        int int32 = mutablePeriod30.indexOf(durationFieldType31);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        mutablePeriod30.add((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.PeriodType periodType41 = mutablePeriod30.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant25, periodType41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (short) 10, periodType41);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(0L, 1L, periodType41);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType41);
        int int46 = mutablePeriod45.size();
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(10L, periodType3, chronology4);
        mutablePeriod5.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod5.toDurationFrom(readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationTo(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType38, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType38);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration10, periodType38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod44.setPeriod((long) ' ', chronology46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = mutablePeriod57.toDurationFrom(readableInstant58);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType75 = null;
        int int76 = mutablePeriod74.indexOf(durationFieldType75);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod81.addHours((-1));
        mutablePeriod74.add((org.joda.time.ReadablePeriod) mutablePeriod81);
        org.joda.time.PeriodType periodType85 = mutablePeriod74.getPeriodType();
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType85, chronology86);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType85);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod(readableInstant52, (org.joda.time.ReadableDuration) duration59, periodType85);
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod(readableInstant50, readableInstant51, periodType85);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod(readableInstant48, readableInstant49, periodType85);
        boolean boolean92 = mutablePeriod44.equals((java.lang.Object) readableInstant48);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = mutablePeriod13.indexOf(durationFieldType14);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.PeriodType periodType24 = mutablePeriod13.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType24, chronology25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration6, periodType24);
        int int28 = mutablePeriod27.getDays();
        mutablePeriod27.setYears(0);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant7, readableInstant8, periodType9);
        int int11 = mutablePeriod10.size();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant12, readableInstant13, periodType14);
        int int16 = mutablePeriod15.size();
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod15);
        mutablePeriod15.setMonths((int) (byte) 0);
        boolean boolean20 = mutablePeriod4.equals((java.lang.Object) (byte) 0);
        mutablePeriod4.add(8, 10, (int) (short) 10, (-1), (int) ' ', (int) (byte) 1, 100, (int) (short) 100);
        mutablePeriod4.add((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        java.lang.Object obj12 = mutablePeriod1.clone();
        mutablePeriod1.setHours((int) '4');
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "P100Y100M100WT52H99.999S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "P100Y100M100WT52H99.999S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "P100Y100M100WT52H99.999S");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        mutablePeriod1.add((int) (byte) -1, (int) (short) -1, 1, (int) '#', (int) 'a', (int) '4', 8, (int) (byte) 10);
        mutablePeriod1.addMonths((int) (short) 10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.DurationFieldType[] durationFieldTypeArray34 = mutablePeriod33.getFieldTypes();
        org.joda.time.DurationFieldType[] durationFieldTypeArray35 = mutablePeriod33.getFieldTypes();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(durationFieldTypeArray34);
        org.junit.Assert.assertNotNull(durationFieldTypeArray35);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod2.getYears();
        mutablePeriod2.clear();
        int int10 = mutablePeriod2.getHours();
        mutablePeriod2.setPeriod((long) (short) 1);
        java.lang.String str13 = mutablePeriod2.toString();
        mutablePeriod2.setMinutes(97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0.001S" + "'", str13, "PT0.001S");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        mutablePeriod9.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(10L, periodType15, chronology16);
        int int18 = mutablePeriod17.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17);
        org.joda.time.DurationFieldType durationFieldType21 = mutablePeriod17.getFieldType((int) (short) 1);
        int int22 = mutablePeriod9.get(durationFieldType21);
        boolean boolean23 = mutablePeriod3.isSupported(durationFieldType21);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addMinutes((int) (byte) -1);
        mutablePeriod28.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod28.toDurationFrom(readableInstant33);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = mutablePeriod43.toDurationTo(readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType56 = null;
        int int57 = mutablePeriod55.indexOf(durationFieldType56);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod62.addHours((-1));
        mutablePeriod55.add((org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.PeriodType periodType66 = mutablePeriod55.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType66, chronology68);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration45, readableInstant46, periodType66);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(readableInstant37, readableInstant38, periodType66);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant36, periodType66);
        mutablePeriod72.addYears((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.Duration duration76 = mutablePeriod72.toDurationTo(readableInstant75);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(duration76);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = mutablePeriod13.indexOf(durationFieldType14);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.PeriodType periodType24 = mutablePeriod13.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType24, chronology25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration6, periodType24);
        int int28 = mutablePeriod27.getDays();
        int int29 = mutablePeriod27.getSeconds();
        mutablePeriod27.addDays((int) (byte) 0);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1L, chronology1);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        mutablePeriod4.addMonths((int) '#');
        int int11 = mutablePeriod4.getSeconds();
        int int12 = mutablePeriod4.getDays();
        org.joda.time.Chronology chronology13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) int12, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        mutablePeriod9.addMonths((int) (short) 0);
        mutablePeriod9.setYears((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = mutablePeriod20.toDurationFrom(readableInstant21);
        mutablePeriod20.setSeconds((int) '4');
        java.lang.String str25 = mutablePeriod20.toString();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) '#', chronology27);
        mutablePeriod28.setMinutes(8);
        mutablePeriod28.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        mutablePeriod37.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod37.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration46, chronology49);
        mutablePeriod28.setHours((int) '4');
        mutablePeriod28.addMillis(8);
        mutablePeriod20.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod28);
        mutablePeriod28.clear();
        int int58 = mutablePeriod28.getValue((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = mutablePeriod63.toDurationFrom(readableInstant64);
        mutablePeriod63.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(10L, periodType69, chronology70);
        int int72 = mutablePeriod71.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod71);
        org.joda.time.DurationFieldType durationFieldType75 = mutablePeriod71.getFieldType((int) (short) 1);
        int int76 = mutablePeriod63.get(durationFieldType75);
        mutablePeriod28.add(durationFieldType75, (int) (short) 1);
        mutablePeriod9.add(durationFieldType75, 8);
        int int81 = mutablePeriod3.get(durationFieldType75);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT97H1M52.097S" + "'", str25, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod7.toDurationFrom(readableInstant8);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = mutablePeriod24.indexOf(durationFieldType25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addHours((-1));
        mutablePeriod24.add((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.PeriodType periodType35 = mutablePeriod24.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType35, chronology36);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType35);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration9, periodType35);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType35);
        org.joda.time.PeriodType periodType41 = mutablePeriod40.getPeriodType();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod40, chronology42);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = mutablePeriod2.toString(periodFormatter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.035S" + "'", str4, "PT0.035S");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '4', (long) 'a', chronology2);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod8.addHours((-1));
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.setPeriod((long) 100, chronology12);
        mutablePeriod8.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod8.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration17);
        org.junit.Assert.assertNotNull(duration17);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        int int12 = mutablePeriod8.getDays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = mutablePeriod8.getFieldTypes();
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod8.add((long) (short) 1, chronology15);
        mutablePeriod8.addSeconds(100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (-1), 8, (-1), (int) ' ', (int) (short) 0, 10, (-1), periodType8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        mutablePeriod14.add((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod14, chronology25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addHours((-1));
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod31.setPeriod((long) 100, chronology35);
        mutablePeriod31.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType39 = mutablePeriod31.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(periodType39);
        mutablePeriod26.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod46.addHours((-1));
        org.joda.time.Chronology chronology50 = null;
        mutablePeriod46.setPeriod((long) 100, chronology50);
        mutablePeriod46.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = mutablePeriod46.toDurationFrom(readableInstant54);
        mutablePeriod46.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter58 = null;
        java.lang.String str59 = mutablePeriod46.toString(periodFormatter58);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType75 = null;
        int int76 = mutablePeriod74.indexOf(durationFieldType75);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod81.addHours((-1));
        mutablePeriod74.add((org.joda.time.ReadablePeriod) mutablePeriod81);
        org.joda.time.PeriodType periodType85 = mutablePeriod74.getPeriodType();
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType85, chronology86);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType85);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod46, periodType85, chronology89);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod26, periodType85);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((java.lang.Object) 8, periodType85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT1M0.100S" + "'", str59, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(periodType85);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod6.toDurationFrom(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = mutablePeriod21.indexOf(durationFieldType22);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        mutablePeriod21.add((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.PeriodType periodType32 = mutablePeriod21.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType32);
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration15, chronology34);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod40.setPeriod((long) 100, chronology44);
        mutablePeriod40.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = mutablePeriod40.toDurationFrom(readableInstant48);
        mutablePeriod40.setHours((int) (short) 0);
        int int52 = mutablePeriod40.getHours();
        mutablePeriod40.setYears(8);
        int int55 = mutablePeriod40.getHours();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.Chronology chronology63 = null;
        mutablePeriod40.add((long) (short) 0, chronology63);
        mutablePeriod1.add((org.joda.time.ReadablePeriod) mutablePeriod40);
        mutablePeriod40.addYears((int) (byte) 100);
        int int68 = mutablePeriod40.getHours();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        mutablePeriod4.setMillis((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.ReadableInterval readableInterval34 = null;
        mutablePeriod33.setPeriod(readableInterval34);
        mutablePeriod33.addWeeks((int) '#');
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod45.addHours((-1));
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod45.setPeriod((long) 100, chronology49);
        mutablePeriod45.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = mutablePeriod45.toDurationFrom(readableInstant53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType61 = null;
        int int62 = mutablePeriod60.indexOf(durationFieldType61);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod67.addHours((-1));
        mutablePeriod60.add((org.joda.time.ReadablePeriod) mutablePeriod67);
        org.joda.time.PeriodType periodType71 = mutablePeriod60.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration54, readableInstant55, periodType71);
        org.joda.time.Chronology chronology73 = null;
        mutablePeriod40.setPeriod((org.joda.time.ReadableDuration) duration54, chronology73);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(readableInstant38, (org.joda.time.ReadableDuration) duration54);
        org.joda.time.Chronology chronology76 = null;
        mutablePeriod33.setPeriod((org.joda.time.ReadableDuration) duration54, chronology76);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(periodType71);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        mutablePeriod4.addMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        int int12 = mutablePeriod4.getSeconds();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setSeconds(8);
        int int12 = mutablePeriod4.getMonths();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType42 = null;
        int int43 = mutablePeriod41.indexOf(durationFieldType42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod48.addHours((-1));
        mutablePeriod41.add((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.PeriodType periodType52 = mutablePeriod41.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType52, chronology53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant34, periodType52);
        mutablePeriod55.setPeriod((long) (byte) 1, 10L);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) '#', chronology61);
        mutablePeriod62.setMinutes(8);
        mutablePeriod62.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod71.addHours((-1));
        org.joda.time.Chronology chronology75 = null;
        mutablePeriod71.setPeriod((long) 100, chronology75);
        mutablePeriod71.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Duration duration80 = mutablePeriod71.toDurationFrom(readableInstant79);
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration80, readableInstant81);
        org.joda.time.Chronology chronology83 = null;
        mutablePeriod62.setPeriod((org.joda.time.ReadableDuration) duration80, chronology83);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(readableInstant59, (org.joda.time.ReadableDuration) duration80);
        mutablePeriod55.setPeriod((org.joda.time.ReadableDuration) duration80);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(duration80);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.setDays((int) (byte) 1);
        mutablePeriod3.setHours((int) 'a');
        int int12 = mutablePeriod3.getMinutes();
        int int13 = mutablePeriod3.getWeeks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(10L, periodType2, chronology3);
        mutablePeriod4.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod4.toDurationFrom(readableInstant8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType15 = mutablePeriod14.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration9, periodType15);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod21.toDurationFrom(readableInstant22);
        mutablePeriod21.addMonths((int) (short) 0);
        int int26 = mutablePeriod21.getYears();
        mutablePeriod21.setHours(0);
        mutablePeriod21.addYears(97);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType33, chronology34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        mutablePeriod35.setPeriod(readableInstant36, readableInstant37);
        int int39 = mutablePeriod35.getMinutes();
        int[] intArray40 = mutablePeriod35.getValues();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod45.addHours((-1));
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod45.setPeriod((long) 100, chronology49);
        mutablePeriod45.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = mutablePeriod45.toDurationFrom(readableInstant53);
        mutablePeriod45.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(readableInstant57, readableInstant58, periodType59);
        int int61 = mutablePeriod60.size();
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(readableInstant62, readableInstant63, periodType64);
        int int66 = mutablePeriod65.size();
        mutablePeriod60.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod65);
        boolean boolean68 = mutablePeriod45.equals((java.lang.Object) mutablePeriod65);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod73.addHours((-1));
        org.joda.time.Chronology chronology77 = null;
        mutablePeriod73.setPeriod((long) 100, chronology77);
        mutablePeriod73.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.Duration duration82 = mutablePeriod73.toDurationFrom(readableInstant81);
        mutablePeriod65.setPeriod((org.joda.time.ReadableDuration) duration82);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration82, readableInstant84);
        org.joda.time.Chronology chronology86 = null;
        mutablePeriod35.setPeriod((org.joda.time.ReadableDuration) duration82, chronology86);
        org.joda.time.Chronology chronology88 = null;
        mutablePeriod21.setPeriod((org.joda.time.ReadableDuration) duration82, chronology88);
        org.joda.time.Chronology chronology90 = null;
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration82, chronology90);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8 + "'", int61 == 8);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 8 + "'", int66 == 8);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(duration82);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology2);
        mutablePeriod3.setMillis(4);
        int int6 = mutablePeriod3.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add(0L, chronology6);
        mutablePeriod2.setMillis((int) (byte) 10);
        int[] intArray10 = mutablePeriod2.getValues();
        mutablePeriod2.add((int) (short) -1, 8, 97, (int) '4', 10, (int) (short) 1, (int) (byte) 100, 0);
        java.lang.String str20 = mutablePeriod2.toString();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 8, 0, 10]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P-1Y8M97W52DT10H9M100.010S" + "'", str20, "P-1Y8M97W52DT10H9M100.010S");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.addMillis((int) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.addHours((-1));
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod14.setPeriod((long) 100, chronology18);
        mutablePeriod14.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod14.toDurationFrom(readableInstant22);
        mutablePeriod14.setHours((int) (short) 0);
        int int26 = mutablePeriod14.getHours();
        mutablePeriod14.setYears(8);
        int int29 = mutablePeriod14.getHours();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType41 = null;
        int int42 = mutablePeriod40.indexOf(durationFieldType41);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod47.addHours((-1));
        mutablePeriod40.add((org.joda.time.ReadablePeriod) mutablePeriod47);
        mutablePeriod40.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(readableInstant53, readableInstant54, periodType55);
        mutablePeriod56.setMinutes((int) (short) 100);
        org.joda.time.Period period59 = mutablePeriod56.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = mutablePeriod64.toDurationFrom(readableInstant65);
        mutablePeriod64.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(10L, periodType70, chronology71);
        int int73 = mutablePeriod72.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod72);
        org.joda.time.DurationFieldType durationFieldType76 = mutablePeriod72.getFieldType((int) (short) 1);
        int int77 = mutablePeriod64.get(durationFieldType76);
        boolean boolean78 = period59.isSupported(durationFieldType76);
        boolean boolean79 = mutablePeriod40.isSupported(durationFieldType76);
        mutablePeriod34.set(durationFieldType76, (int) '4');
        int int82 = mutablePeriod3.indexOf(durationFieldType76);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((java.lang.Object) durationFieldType76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(durationFieldType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType42 = null;
        int int43 = mutablePeriod41.indexOf(durationFieldType42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod48.addHours((-1));
        mutablePeriod41.add((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.PeriodType periodType52 = mutablePeriod41.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType52, chronology53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant34, periodType52);
        mutablePeriod55.setWeeks(10);
        org.joda.time.MutablePeriod mutablePeriod58 = mutablePeriod55.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType60 = mutablePeriod58.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(mutablePeriod58);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(10L, periodType10, chronology11);
        int int13 = mutablePeriod12.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod12);
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod12.getFieldType((int) (short) 1);
        int int17 = mutablePeriod4.get(durationFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setValue(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationFrom(readableInstant12);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType29 = null;
        int int30 = mutablePeriod28.indexOf(durationFieldType29);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod35.addHours((-1));
        mutablePeriod28.add((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.PeriodType periodType39 = mutablePeriod28.getPeriodType();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType39, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType39);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant6, (org.joda.time.ReadableDuration) duration13, periodType39);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant4, readableInstant5, periodType39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType39);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((java.lang.Object) 4, periodType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration20, chronology23);
        mutablePeriod2.setPeriod(97, 100, (int) (short) -1, (int) (short) 1, 1, (int) (short) 0, 1, (int) (byte) 10);
        mutablePeriod2.addHours(10);
        int int36 = mutablePeriod2.getWeeks();
        mutablePeriod2.clear();
        org.joda.time.format.PeriodFormatter periodFormatter38 = null;
        java.lang.String str39 = mutablePeriod2.toString(periodFormatter38);
        org.joda.time.ReadableInterval readableInterval40 = null;
        mutablePeriod2.add(readableInterval40);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PT0S" + "'", str39, "PT0S");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType13 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod18.setPeriod((long) 100, chronology22);
        mutablePeriod18.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod18.toDurationFrom(readableInstant26);
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration27, chronology28);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType39 = null;
        int int40 = mutablePeriod38.indexOf(durationFieldType39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod45.addHours((-1));
        mutablePeriod38.add((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.PeriodType periodType49 = mutablePeriod38.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType49, chronology51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration27, periodType49);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(10L, periodType55, chronology56);
        int int58 = mutablePeriod57.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod57);
        org.joda.time.DurationFieldType durationFieldType61 = mutablePeriod57.getFieldType((int) (short) 1);
        mutablePeriod53.add(durationFieldType61, (-1));
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(durationFieldType61);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (-1));
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType7 = mutablePeriod6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 100, chronology16);
        mutablePeriod12.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod12.toDurationFrom(readableInstant20);
        mutablePeriod12.addMinutes((int) (byte) 1);
        mutablePeriod6.add((org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod6.addMillis((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = mutablePeriod31.toDurationFrom(readableInstant32);
        mutablePeriod31.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(10L, periodType37, chronology38);
        int int40 = mutablePeriod39.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod39);
        org.joda.time.DurationFieldType durationFieldType43 = mutablePeriod39.getFieldType((int) (short) 1);
        int int44 = mutablePeriod31.get(durationFieldType43);
        mutablePeriod6.add(durationFieldType43, (int) ' ');
        mutablePeriod1.add(durationFieldType43, (int) 'a');
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addMinutes((int) (byte) -1);
        mutablePeriod5.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod5.toDurationFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod20.setPeriod((long) 100, chronology24);
        mutablePeriod20.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = mutablePeriod20.toDurationFrom(readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType36 = null;
        int int37 = mutablePeriod35.indexOf(durationFieldType36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addHours((-1));
        mutablePeriod35.add((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.PeriodType periodType46 = mutablePeriod35.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, readableInstant30, periodType46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (short) 10, periodType46);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(0L, 1L, periodType46);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, readableInstant12, periodType46);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) '#', chronology55);
        mutablePeriod56.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType66 = null;
        int int67 = mutablePeriod65.indexOf(durationFieldType66);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod72.addHours((-1));
        mutablePeriod65.add((org.joda.time.ReadablePeriod) mutablePeriod72);
        org.joda.time.PeriodType periodType76 = mutablePeriod65.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType76);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod56, periodType76);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod(1L, (long) '4', periodType76);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, readableInstant51, periodType76);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType76);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(periodType76);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        mutablePeriod3.setWeeks(100);
        int int9 = mutablePeriod3.getMillis();
        mutablePeriod3.setWeeks(8);
        int int12 = mutablePeriod3.size();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '4', (long) (short) 1, chronology2);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType7 = mutablePeriod6.getPeriodType();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 8, (long) 10, periodType7, chronology8);
        mutablePeriod9.addHours(97);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.setSeconds((int) '4');
        java.lang.String str9 = mutablePeriod4.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) '#', chronology11);
        mutablePeriod12.setMinutes(8);
        mutablePeriod12.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod21.setPeriod((long) 100, chronology25);
        mutablePeriod21.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod21.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration30, chronology33);
        mutablePeriod12.setHours((int) '4');
        mutablePeriod12.addMillis(8);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.MutablePeriod mutablePeriod40 = mutablePeriod4.toMutablePeriod();
        int int41 = mutablePeriod4.getHours();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT97H1M52.097S" + "'", str9, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType12, chronology13);
        mutablePeriod14.setSeconds(1);
        boolean boolean17 = mutablePeriod2.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod2.toDurationTo(readableInstant18);
        int int21 = mutablePeriod2.getValue((int) (byte) 1);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod26.setPeriod((long) 100, chronology30);
        mutablePeriod26.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod26.toDurationFrom(readableInstant34);
        mutablePeriod26.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant38, readableInstant39, periodType40);
        int int42 = mutablePeriod41.size();
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableInstant43, readableInstant44, periodType45);
        int int47 = mutablePeriod46.size();
        mutablePeriod41.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod46);
        boolean boolean49 = mutablePeriod26.equals((java.lang.Object) mutablePeriod46);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod54.addHours((-1));
        org.joda.time.Chronology chronology58 = null;
        mutablePeriod54.setPeriod((long) 100, chronology58);
        mutablePeriod54.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = mutablePeriod54.toDurationFrom(readableInstant62);
        mutablePeriod46.setPeriod((org.joda.time.ReadableDuration) duration63);
        mutablePeriod46.setPeriod((int) (short) 1, (int) (byte) 100, 97, (int) '#', 1, (int) (short) 100, (int) (byte) -1, 97);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Duration duration80 = mutablePeriod78.toDurationFrom(readableInstant79);
        mutablePeriod78.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType84 = null;
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(10L, periodType84, chronology85);
        int int87 = mutablePeriod86.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod86);
        org.joda.time.DurationFieldType durationFieldType90 = mutablePeriod86.getFieldType((int) (short) 1);
        int int91 = mutablePeriod78.get(durationFieldType90);
        mutablePeriod46.set(durationFieldType90, (int) (byte) 0);
        mutablePeriod2.set(durationFieldType90, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8 + "'", int47 == 8);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(durationFieldType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, 1L, periodType2);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration20, chronology23);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = mutablePeriod2.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType7);
        int int9 = mutablePeriod8.size();
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        mutablePeriod8.addMonths(97);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) '#', chronology15);
        mutablePeriod16.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = mutablePeriod16.indexOf(durationFieldType19);
        mutablePeriod16.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType26, chronology27);
        mutablePeriod28.setSeconds(1);
        boolean boolean31 = mutablePeriod16.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = mutablePeriod16.toDurationTo(readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod51.addHours((-1));
        org.joda.time.Chronology chronology55 = null;
        mutablePeriod51.setPeriod((long) 100, chronology55);
        mutablePeriod51.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = mutablePeriod51.toDurationFrom(readableInstant59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType67 = null;
        int int68 = mutablePeriod66.indexOf(durationFieldType67);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod73.addHours((-1));
        mutablePeriod66.add((org.joda.time.ReadablePeriod) mutablePeriod73);
        org.joda.time.PeriodType periodType77 = mutablePeriod66.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration60, readableInstant61, periodType77);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) (short) 10, periodType77);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod(0L, 1L, periodType77);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType77);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(readableInstant34, readableInstant35, periodType77);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(readableInstant13, (org.joda.time.ReadableDuration) duration33, periodType77);
        org.joda.time.Chronology chronology84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((java.lang.Object) 97, periodType77, chronology84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(periodType77);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 52, 8, 10, 1, 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("P52WT1M0.197S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        int int17 = mutablePeriod4.indexOf(durationFieldType16);
        mutablePeriod4.setYears(0);
        int int20 = mutablePeriod4.getMonths();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = mutablePeriod2.indexOf(durationFieldType3);
        mutablePeriod2.addYears((int) (short) 1);
        mutablePeriod2.setDays((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod13.setPeriod((long) 100, chronology17);
        mutablePeriod13.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = mutablePeriod13.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant25);
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant28);
        int int30 = mutablePeriod29.getDays();
        org.joda.time.Chronology chronology32 = null;
        mutablePeriod29.add((long) '4', chronology32);
        mutablePeriod29.setValue((int) (byte) 0, 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.ReadableInterval readableInterval34 = null;
        mutablePeriod33.setPeriod(readableInterval34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod33, chronology36);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        mutablePeriod4.addMinutes((int) '#');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        mutablePeriod4.setPeriod(readableInstant11, readableInstant12);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(100L, (long) ' ');
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 97);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) -1, 100, 10, (int) (byte) 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-1), (long) 1, chronology2);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType15 = mutablePeriod7.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((-1L), periodType15, chronology17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1, periodType15);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod1.setValue(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) 8, 100L, chronology6);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 100, chronology16);
        mutablePeriod12.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod12.toDurationFrom(readableInstant20);
        mutablePeriod12.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant24, readableInstant25, periodType26);
        int int28 = mutablePeriod27.size();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableInstant29, readableInstant30, periodType31);
        int int33 = mutablePeriod32.size();
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        boolean boolean35 = mutablePeriod12.equals((java.lang.Object) mutablePeriod32);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod40.setPeriod((long) 100, chronology44);
        mutablePeriod40.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = mutablePeriod40.toDurationFrom(readableInstant48);
        mutablePeriod32.setPeriod((org.joda.time.ReadableDuration) duration49);
        mutablePeriod32.setDays((int) '#');
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        mutablePeriod32.addMonths((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration49);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.PeriodType periodType15 = mutablePeriod4.getPeriodType();
        mutablePeriod4.setDays(100);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod19);
        mutablePeriod19.setPeriod(100L, (long) (byte) -1);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(periodType24);
        mutablePeriod25.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod35 = mutablePeriod25.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType36 = null;
        boolean boolean37 = mutablePeriod25.isSupported(durationFieldType36);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(periodType38);
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod39.add(1L, chronology41);
        mutablePeriod39.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(readableInstant45, readableInstant46, periodType47);
        mutablePeriod48.setMinutes((int) (short) 100);
        org.joda.time.Period period51 = mutablePeriod48.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = mutablePeriod56.toDurationFrom(readableInstant57);
        mutablePeriod56.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(10L, periodType62, chronology63);
        int int65 = mutablePeriod64.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod64);
        org.joda.time.DurationFieldType durationFieldType68 = mutablePeriod64.getFieldType((int) (short) 1);
        int int69 = mutablePeriod56.get(durationFieldType68);
        boolean boolean70 = period51.isSupported(durationFieldType68);
        int int71 = mutablePeriod39.indexOf(durationFieldType68);
        int int72 = mutablePeriod25.indexOf(durationFieldType68);
        int int73 = mutablePeriod19.get(durationFieldType68);
        int int74 = mutablePeriod4.indexOf(durationFieldType68);
        int int75 = mutablePeriod4.getYears();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(mutablePeriod35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        mutablePeriod1.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant7, readableInstant8, periodType9);
        mutablePeriod10.setMinutes((int) (short) 100);
        org.joda.time.Period period13 = mutablePeriod10.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod18.toDurationFrom(readableInstant19);
        mutablePeriod18.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(10L, periodType24, chronology25);
        int int27 = mutablePeriod26.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod26);
        org.joda.time.DurationFieldType durationFieldType30 = mutablePeriod26.getFieldType((int) (short) 1);
        int int31 = mutablePeriod18.get(durationFieldType30);
        boolean boolean32 = period13.isSupported(durationFieldType30);
        int int33 = mutablePeriod1.indexOf(durationFieldType30);
        org.joda.time.ReadableInterval readableInterval34 = null;
        mutablePeriod1.setPeriod(readableInterval34);
        org.joda.time.ReadableInterval readableInterval36 = null;
        mutablePeriod1.setPeriod(readableInterval36);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '#', chronology2);
        mutablePeriod3.setMinutes(8);
        mutablePeriod3.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 100, chronology16);
        mutablePeriod12.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod12.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22);
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration21, chronology24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration21);
        mutablePeriod26.add((-1L));
        org.junit.Assert.assertNotNull(duration21);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod8.toDurationFrom(readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType26 = null;
        int int27 = mutablePeriod25.indexOf(durationFieldType26);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        mutablePeriod25.add((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.PeriodType periodType36 = mutablePeriod25.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType36, chronology37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType36);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant3, (org.joda.time.ReadableDuration) duration10, periodType36);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (short) -1, periodType36);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod42.copy();
        java.lang.Class<?> wildcardClass44 = mutablePeriod42.getClass();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(10L, periodType46, chronology47);
        mutablePeriod48.setPeriod((long) (byte) 0, 100L);
        org.joda.time.PeriodType periodType52 = mutablePeriod48.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod42, periodType52);
        org.joda.time.Chronology chronology56 = null;
        mutablePeriod42.setPeriod((long) (short) -1, 10L, chronology56);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod10.addHours((-1));
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod10.setPeriod((long) 100, chronology14);
        mutablePeriod10.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType18 = mutablePeriod10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(periodType18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 10, periodType18, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType18, chronology22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (short) 100, (long) (byte) 0, periodType18);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1, periodType18);
        int int26 = mutablePeriod25.getMonths();
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) 0);
        int int2 = mutablePeriod1.getMillis();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1, chronology2);
        int int4 = mutablePeriod3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod2.setPeriod(100L, chronology9);
        int[] intArray11 = mutablePeriod2.getValues();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(periodType12);
        mutablePeriod13.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod23 = mutablePeriod13.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType24 = null;
        boolean boolean25 = mutablePeriod13.isSupported(durationFieldType24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(periodType26);
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod27.add(1L, chronology29);
        mutablePeriod27.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(readableInstant33, readableInstant34, periodType35);
        mutablePeriod36.setMinutes((int) (short) 100);
        org.joda.time.Period period39 = mutablePeriod36.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod44.toDurationFrom(readableInstant45);
        mutablePeriod44.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(10L, periodType50, chronology51);
        int int53 = mutablePeriod52.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod52);
        org.joda.time.DurationFieldType durationFieldType56 = mutablePeriod52.getFieldType((int) (short) 1);
        int int57 = mutablePeriod44.get(durationFieldType56);
        boolean boolean58 = period39.isSupported(durationFieldType56);
        int int59 = mutablePeriod27.indexOf(durationFieldType56);
        int int60 = mutablePeriod13.indexOf(durationFieldType56);
        int int61 = mutablePeriod2.get(durationFieldType56);
        int[] intArray62 = mutablePeriod2.getValues();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        mutablePeriod4.addMonths((int) '#');
        mutablePeriod4.setDays((-1));
        mutablePeriod4.setMonths((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod16 = org.joda.time.MutablePeriod.parse("PT97H1M52.097S");
        java.lang.Object obj17 = null;
        boolean boolean18 = mutablePeriod16.equals(obj17);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(10L, periodType21, chronology22);
        int int24 = mutablePeriod23.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod23);
        org.joda.time.DurationFieldType durationFieldType27 = mutablePeriod23.getFieldType((int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        mutablePeriod37.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod37.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType53 = null;
        int int54 = mutablePeriod52.indexOf(durationFieldType53);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod59.addHours((-1));
        mutablePeriod52.add((org.joda.time.ReadablePeriod) mutablePeriod59);
        org.joda.time.PeriodType periodType63 = mutablePeriod52.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47, periodType63);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (short) 10, periodType63);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(0L, 1L, periodType63);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 100, periodType63, chronology67);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod23, periodType63, chronology69);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(periodType63);
        mutablePeriod16.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod71);
        mutablePeriod16.setWeeks(97);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(periodType63);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod8.indexOf(durationFieldType9);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod15.addHours((-1));
        mutablePeriod8.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.PeriodType periodType19 = mutablePeriod8.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (short) -1, 0L, periodType19, chronology21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        mutablePeriod22.add(readableInterval23);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (-1), 8, (-1), (int) ' ', (int) (short) 0, 10, (-1), periodType8);
        mutablePeriod9.setHours((int) (byte) 100);
        mutablePeriod9.addWeeks((int) (byte) 100);
        int int14 = mutablePeriod9.getDays();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) 97, chronology2);
        mutablePeriod3.addSeconds((int) (short) -1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (-1L), chronology2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setValue((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(10L, periodType3, chronology4);
        mutablePeriod5.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod5.toDurationFrom(readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationTo(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType38, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType38);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration10, periodType38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod52.addHours((-1));
        org.joda.time.Chronology chronology56 = null;
        mutablePeriod52.setPeriod((long) 100, chronology56);
        mutablePeriod52.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = mutablePeriod52.toDurationFrom(readableInstant60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType68 = null;
        int int69 = mutablePeriod67.indexOf(durationFieldType68);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod74.addHours((-1));
        mutablePeriod67.add((org.joda.time.ReadablePeriod) mutablePeriod74);
        org.joda.time.PeriodType periodType78 = mutablePeriod67.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration61, readableInstant62, periodType78);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 0, periodType78);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant45, periodType78);
        org.joda.time.ReadableInterval readableInterval82 = null;
        mutablePeriod81.setPeriod(readableInterval82);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(periodType78);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(4, (int) (short) 1, 8, 0);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod4.add(0L, chronology6);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 8, 100L, chronology2);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) '#', (int) (byte) 100, (int) (short) -1, (int) (byte) 100);
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod14.toDurationFrom(readableInstant15);
        mutablePeriod14.addMonths((int) (short) 0);
        mutablePeriod14.setYears((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod25.toDurationFrom(readableInstant26);
        mutablePeriod25.setSeconds((int) '4');
        java.lang.String str30 = mutablePeriod25.toString();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) '#', chronology32);
        mutablePeriod33.setMinutes(8);
        mutablePeriod33.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addHours((-1));
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod42.setPeriod((long) 100, chronology46);
        mutablePeriod42.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = mutablePeriod42.toDurationFrom(readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration51, readableInstant52);
        org.joda.time.Chronology chronology54 = null;
        mutablePeriod33.setPeriod((org.joda.time.ReadableDuration) duration51, chronology54);
        mutablePeriod33.setHours((int) '4');
        mutablePeriod33.addMillis(8);
        mutablePeriod25.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        mutablePeriod33.clear();
        int int63 = mutablePeriod33.getValue((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = mutablePeriod68.toDurationFrom(readableInstant69);
        mutablePeriod68.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(10L, periodType74, chronology75);
        int int77 = mutablePeriod76.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod76);
        org.joda.time.DurationFieldType durationFieldType80 = mutablePeriod76.getFieldType((int) (short) 1);
        int int81 = mutablePeriod68.get(durationFieldType80);
        mutablePeriod33.add(durationFieldType80, (int) (short) 1);
        mutablePeriod14.add(durationFieldType80, 8);
        mutablePeriod3.add(durationFieldType80, 1);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT97H1M52.097S" + "'", str30, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(durationFieldType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        int int7 = mutablePeriod4.size();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = mutablePeriod4.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        int[] intArray14 = mutablePeriod4.getValues();
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod4.getFieldType(1);
        int[] intArray17 = mutablePeriod4.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter18 = null;
        java.lang.String str19 = mutablePeriod4.toString(periodFormatter18);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 35, 0, 0, 97]");
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 35, 0, 0, 97]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT35H0.097S" + "'", str19, "PT35H0.097S");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType42 = null;
        int int43 = mutablePeriod41.indexOf(durationFieldType42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod48.addHours((-1));
        mutablePeriod41.add((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.PeriodType periodType52 = mutablePeriod41.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType52, chronology53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant34, periodType52);
        mutablePeriod55.addSeconds((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType59 = mutablePeriod55.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) '#', chronology6);
        mutablePeriod7.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = mutablePeriod16.indexOf(durationFieldType17);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        mutablePeriod16.add((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.PeriodType periodType27 = mutablePeriod16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod7, periodType27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) periodType2, periodType27, chronology30);
        mutablePeriod31.setSeconds(97);
        org.joda.time.format.PeriodFormatter periodFormatter34 = null;
        java.lang.String str35 = mutablePeriod31.toString(periodFormatter34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT97S" + "'", str35, "PT97S");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 100, (long) (-1));
        int int3 = mutablePeriod2.getHours();
        int int4 = mutablePeriod2.getHours();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod4.get(durationFieldType9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod4.getFieldTypes();
        int int12 = mutablePeriod4.getMillis();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.Period period5 = mutablePeriod3.toPeriod();
        int[] intArray6 = period5.getValues();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod4.get(durationFieldType9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) '#', chronology13);
        mutablePeriod14.setMinutes(8);
        mutablePeriod14.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod23.setPeriod((long) 100, chronology27);
        mutablePeriod23.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = mutablePeriod23.toDurationFrom(readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration32, chronology35);
        mutablePeriod14.setHours((int) '4');
        mutablePeriod14.addMillis(8);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = mutablePeriod14.toDurationTo(readableInstant41);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(10L, periodType47, chronology48);
        mutablePeriod49.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = mutablePeriod49.toDurationFrom(readableInstant53);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = mutablePeriod59.toDurationTo(readableInstant60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType72 = null;
        int int73 = mutablePeriod71.indexOf(durationFieldType72);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod78.addHours((-1));
        mutablePeriod71.add((org.joda.time.ReadablePeriod) mutablePeriod78);
        org.joda.time.PeriodType periodType82 = mutablePeriod71.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType82);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType82, chronology84);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration61, readableInstant62, periodType82);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(readableInstant45, (org.joda.time.ReadableDuration) duration54, periodType82);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) '#', 1L, periodType82, chronology88);
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod(readableInstant11, (org.joda.time.ReadableDuration) duration42, periodType82);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((java.lang.Object) int10, periodType82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(periodType82);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(obj0, periodType1);
        mutablePeriod2.addDays((int) 'a');
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology2);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(10L, (long) ' ', chronology8);
        org.joda.time.PeriodType periodType10 = mutablePeriod9.getPeriodType();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (byte) 10, 100L, periodType10, chronology11);
        org.joda.time.Chronology chronology13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) 1, periodType10, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        org.joda.time.Chronology chronology5 = null;
        mutablePeriod2.setPeriod((long) ' ', 0L, chronology5);
        mutablePeriod2.addMinutes((int) ' ');
        mutablePeriod2.addSeconds(97);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) (short) 0, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.setPeriod((long) (short) 0, chronology3);
        int int5 = mutablePeriod1.getSeconds();
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod1.setPeriod((long) (short) 1, chronology7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 10, chronology1);
        java.lang.String str3 = mutablePeriod2.toString();
        java.lang.String str4 = mutablePeriod2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0.010S" + "'", str3, "PT0.010S");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.010S" + "'", str4, "PT0.010S");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(10L);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (short) -1, chronology19);
        mutablePeriod20.setHours((int) (short) -1);
        boolean boolean23 = mutablePeriod4.equals((java.lang.Object) (short) -1);
        mutablePeriod4.addMinutes(4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) '#', chronology6);
        mutablePeriod7.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = mutablePeriod16.indexOf(durationFieldType17);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        mutablePeriod16.add((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.PeriodType periodType27 = mutablePeriod16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod7, periodType27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) chronology3, periodType27, chronology30);
        int int32 = mutablePeriod31.getWeeks();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        mutablePeriod2.add(97, (int) 'a', 0, (int) (short) 100, (int) (short) 100, (int) (short) 10, (int) ' ', 1);
        int[] intArray17 = mutablePeriod2.getValues();
        int int18 = mutablePeriod2.getYears();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97, 0, 100, 100, 10, 32, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        mutablePeriod4.addMonths((int) '#');
        mutablePeriod4.setDays((-1));
        mutablePeriod4.setMonths((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = mutablePeriod4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(10L, periodType4, chronology5);
        mutablePeriod6.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod6.toDurationFrom(readableInstant10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType17 = mutablePeriod16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration11, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType17);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(periodType17);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod13.toDurationFrom(readableInstant14);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType23 = null;
        int int24 = mutablePeriod22.indexOf(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        mutablePeriod22.add((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.PeriodType periodType33 = mutablePeriod22.getPeriodType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType33, chronology34);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(readableInstant9, (org.joda.time.ReadableDuration) duration15, periodType33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType33, chronology37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) 0, 1, (int) ' ', (int) '#', (int) (short) 10, (int) ' ', (int) (short) 0, 0, periodType33);
        java.lang.Object obj40 = mutablePeriod39.clone();
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "P1M32W35DT10H32M");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "P1M32W35DT10H32M");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "P1M32W35DT10H32M");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        mutablePeriod4.addDays(10);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType42 = null;
        int int43 = mutablePeriod41.indexOf(durationFieldType42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod48.addHours((-1));
        mutablePeriod41.add((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.PeriodType periodType52 = mutablePeriod41.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType52, chronology53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant34, periodType52);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod55);
        mutablePeriod56.addSeconds((int) (byte) 0);
        java.lang.Object obj59 = mutablePeriod56.clone();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod56.setValue(97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "PT0.100S");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray14 = mutablePeriod13.getValues();
        int int15 = mutablePeriod13.getHours();
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod13.toMutablePeriod();
        org.joda.time.PeriodType periodType17 = mutablePeriod13.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableDuration2, readableInstant3, periodType17);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (byte) 1, 100L, periodType17);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = mutablePeriod11.indexOf(durationFieldType12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType22, chronology24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 0, periodType22);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType22);
        mutablePeriod27.setMinutes((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        int int25 = mutablePeriod24.size();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        boolean boolean27 = mutablePeriod4.equals((java.lang.Object) mutablePeriod24);
        mutablePeriod24.setMillis((int) '#');
        org.joda.time.ReadableInterval readableInterval30 = null;
        mutablePeriod24.setPeriod(readableInterval30);
        org.joda.time.MutablePeriod mutablePeriod32 = mutablePeriod24.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod33 = mutablePeriod24.toMutablePeriod();
        mutablePeriod24.addWeeks((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType37 = mutablePeriod24.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(mutablePeriod33);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        mutablePeriod12.addMillis(0);
        int int17 = mutablePeriod12.size();
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) '#', chronology3);
        mutablePeriod4.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = mutablePeriod13.indexOf(durationFieldType14);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.PeriodType periodType24 = mutablePeriod13.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, periodType24);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(1L, (long) '4', periodType24);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(periodType24);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType5 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod10.addHours((-1));
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod10.setPeriod((long) 100, chronology14);
        mutablePeriod10.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod10.toDurationFrom(readableInstant18);
        mutablePeriod10.addMinutes((int) (byte) 1);
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod10);
        java.lang.Object obj23 = mutablePeriod4.clone();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = mutablePeriod4.toDurationTo(readableInstant24);
        mutablePeriod4.setPeriod(35, (int) (byte) 0, 97, (int) '#', (int) 'a', (int) 'a', 4, (int) (short) 0);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "P35Y97W35DT97H97M4S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "P35Y97W35DT97H97M4S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "P35Y97W35DT97H97M4S");
        org.junit.Assert.assertNotNull(duration25);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) '#', chronology2);
        mutablePeriod3.addWeeks((int) ' ');
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.setDays((int) (byte) 1);
        int int10 = mutablePeriod3.getWeeks();
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod3.add((long) 'a', chronology12);
        mutablePeriod3.addYears((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 10, (long) '4', chronology2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = mutablePeriod3.getFieldTypes();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, chronology5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = mutablePeriod6.getFieldType(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationTo(readableInstant12);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setValue(35, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType15 = mutablePeriod7.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((-1L), periodType15, chronology17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1, periodType15);
        mutablePeriod1.setPeriod((long) (-1));
        java.lang.String str22 = mutablePeriod1.toString();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT0.001S" + "'", str22, "PT0.001S");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, (int) ' ', 52, (int) ' ');
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.MutablePeriod mutablePeriod9 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray10 = mutablePeriod9.getValues();
        int int11 = mutablePeriod9.getHours();
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod9.toMutablePeriod();
        org.joda.time.PeriodType periodType13 = mutablePeriod9.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType13);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod24.toDurationFrom(readableInstant25);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType42 = null;
        int int43 = mutablePeriod41.indexOf(durationFieldType42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod48.addHours((-1));
        mutablePeriod41.add((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.PeriodType periodType52 = mutablePeriod41.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType52, chronology53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType52);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(readableInstant19, (org.joda.time.ReadableDuration) duration26, periodType52);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(readableInstant17, readableInstant18, periodType52);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) (short) -1, periodType52);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType52, chronology59);
        org.joda.time.Chronology chronology61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((java.lang.Object) periodType13, periodType52, chronology61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod8.toDurationFrom(readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType26 = null;
        int int27 = mutablePeriod25.indexOf(durationFieldType26);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        mutablePeriod25.add((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.PeriodType periodType36 = mutablePeriod25.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType36, chronology37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType36);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant3, (org.joda.time.ReadableDuration) duration10, periodType36);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (short) -1, periodType36);
        int int43 = mutablePeriod42.getSeconds();
        java.lang.Object obj44 = mutablePeriod42.clone();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "PT0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "PT0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "PT0.001S");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod7.toDurationFrom(readableInstant8);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = mutablePeriod24.indexOf(durationFieldType25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addHours((-1));
        mutablePeriod24.add((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.PeriodType periodType35 = mutablePeriod24.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType35, chronology36);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType35);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration9, periodType35);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod46.toDurationFrom(readableInstant47);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType64 = null;
        int int65 = mutablePeriod63.indexOf(durationFieldType64);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod70.addHours((-1));
        mutablePeriod63.add((org.joda.time.ReadablePeriod) mutablePeriod70);
        org.joda.time.PeriodType periodType74 = mutablePeriod63.getPeriodType();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType74, chronology75);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType74);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(readableInstant41, (org.joda.time.ReadableDuration) duration48, periodType74);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, readableInstant40, periodType74);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType74);
        mutablePeriod80.addWeeks((int) (short) -1);
        int int83 = mutablePeriod80.getMinutes();
        int int84 = mutablePeriod80.getMonths();
        java.lang.String str85 = mutablePeriod80.toString();
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "P-1W" + "'", str85, "P-1W");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType12 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod17.setPeriod((long) 100, chronology21);
        mutablePeriod17.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod17.toDurationFrom(readableInstant25);
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration26, chronology27);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType34 = mutablePeriod33.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod39.setPeriod((long) 100, chronology43);
        mutablePeriod39.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod39.toDurationFrom(readableInstant47);
        mutablePeriod39.addMinutes((int) (byte) 1);
        mutablePeriod33.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        mutablePeriod33.addMillis((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = mutablePeriod58.toDurationFrom(readableInstant59);
        mutablePeriod58.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(10L, periodType64, chronology65);
        int int67 = mutablePeriod66.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod66);
        org.joda.time.DurationFieldType durationFieldType70 = mutablePeriod66.getFieldType((int) (short) 1);
        int int71 = mutablePeriod58.get(durationFieldType70);
        mutablePeriod33.add(durationFieldType70, (int) ' ');
        int int74 = mutablePeriod4.get(durationFieldType70);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        int int10 = mutablePeriod4.getHours();
        mutablePeriod4.setMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod4.setPeriod((long) (byte) 10, chronology14);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.addMinutes(4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-1), 52, 8, (int) ' ', (int) 'a', (int) (short) 10, (int) (byte) 1, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant9, readableInstant10, periodType11);
        int int13 = mutablePeriod12.size();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant14, readableInstant15, periodType16);
        int int18 = mutablePeriod17.size();
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        mutablePeriod17.addMonths(97);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17, chronology22);
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, chronology1);
        int int3 = mutablePeriod2.getMonths();
        int int4 = mutablePeriod2.getMinutes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationTo(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addMinutes((int) (byte) -1);
        mutablePeriod12.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = mutablePeriod12.toDurationFrom(readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod27.addHours((-1));
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod27.setPeriod((long) 100, chronology31);
        mutablePeriod27.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = mutablePeriod27.toDurationFrom(readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType43 = null;
        int int44 = mutablePeriod42.indexOf(durationFieldType43);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod49.addHours((-1));
        mutablePeriod42.add((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.joda.time.PeriodType periodType53 = mutablePeriod42.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration36, readableInstant37, periodType53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (short) 10, periodType53);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(0L, 1L, periodType53);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, readableInstant19, periodType53);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(periodType53);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, readableInstant7, periodType53);
        mutablePeriod59.setPeriod(4, (int) (byte) -1, 35, (int) (byte) 1, 0, (int) ' ', (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(periodType53);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        int int12 = mutablePeriod4.getMillis();
        mutablePeriod4.setMillis(97);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setValue((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        int int25 = mutablePeriod24.size();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        boolean boolean27 = mutablePeriod4.equals((java.lang.Object) mutablePeriod24);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod32.setPeriod((long) 100, chronology36);
        mutablePeriod32.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = mutablePeriod32.toDurationFrom(readableInstant40);
        mutablePeriod24.setPeriod((org.joda.time.ReadableDuration) duration41);
        mutablePeriod24.setPeriod((int) (short) 1, (int) (byte) 100, 97, (int) '#', 1, (int) (short) 100, (int) (byte) -1, 97);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = mutablePeriod56.toDurationFrom(readableInstant57);
        mutablePeriod56.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(10L, periodType62, chronology63);
        int int65 = mutablePeriod64.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod64);
        org.joda.time.DurationFieldType durationFieldType68 = mutablePeriod64.getFieldType((int) (short) 1);
        int int69 = mutablePeriod56.get(durationFieldType68);
        mutablePeriod24.set(durationFieldType68, (int) (byte) 0);
        int[] intArray72 = mutablePeriod24.getValues();
        mutablePeriod24.addMillis((int) (byte) 10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 0, 97, 35, 1, 100, -1, 97]");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(97, (int) (short) -1, (int) ' ', 97, 4, (-1), (int) (byte) 1, (int) '#');
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addMinutes(0);
        mutablePeriod0.setSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod0.setPeriod(readableDuration5, chronology6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        int int16 = mutablePeriod4.getHours();
        mutablePeriod4.setYears((int) '4');
        org.joda.time.MutablePeriod mutablePeriod19 = mutablePeriod4.copy();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod19);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        int int14 = mutablePeriod4.getMillis();
        java.lang.String str15 = mutablePeriod4.toString();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT35H0.097S" + "'", str15, "PT35H0.097S");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) (short) 100, (int) '#', 97);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType10 = mutablePeriod9.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod15.addHours((-1));
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod15.setPeriod((long) 100, chronology19);
        mutablePeriod15.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod15.toDurationFrom(readableInstant23);
        mutablePeriod15.addMinutes((int) (byte) 1);
        mutablePeriod9.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType38, chronology39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) '#', chronology42);
        mutablePeriod43.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType53 = null;
        int int54 = mutablePeriod52.indexOf(durationFieldType53);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod59.addHours((-1));
        mutablePeriod52.add((org.joda.time.ReadablePeriod) mutablePeriod59);
        org.joda.time.PeriodType periodType63 = mutablePeriod52.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType63);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod43, periodType63);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((java.lang.Object) periodType38, periodType63, chronology66);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) '#', (int) (short) 0, (-1), (int) (byte) -1, 10, (int) (short) 10, 8, periodType63);
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 0, periodType70, chronology71);
        int int73 = mutablePeriod72.getYears();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Duration duration80 = mutablePeriod78.toDurationFrom(readableInstant79);
        mutablePeriod78.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType84 = null;
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(10L, periodType84, chronology85);
        int int87 = mutablePeriod86.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod86);
        org.joda.time.DurationFieldType durationFieldType90 = mutablePeriod86.getFieldType((int) (short) 1);
        int int91 = mutablePeriod78.get(durationFieldType90);
        boolean boolean92 = mutablePeriod72.isSupported(durationFieldType90);
        mutablePeriod68.add(durationFieldType90, 97);
        int int95 = mutablePeriod15.indexOf(durationFieldType90);
        boolean boolean96 = mutablePeriod4.isSupported(durationFieldType90);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(durationFieldType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        mutablePeriod3.addYears(10);
        java.lang.Object obj7 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod9 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray10 = mutablePeriod9.getValues();
        int int11 = mutablePeriod9.getHours();
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod9.toMutablePeriod();
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod3.addYears((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "P100YT97H1M0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "P100YT97H1M0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "P100YT97H1M0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add(0L, chronology6);
        mutablePeriod2.setMillis((int) (byte) 10);
        int[] intArray10 = mutablePeriod2.getValues();
        mutablePeriod2.add((int) (short) -1, 8, 97, (int) '4', 10, (int) (short) 1, (int) (byte) 100, 0);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableDuration20, readableInstant21);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        mutablePeriod22.setMonths(10);
        mutablePeriod22.addWeeks((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 8, 0, 10]");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType3);
        mutablePeriod4.setMinutes((int) (short) 100);
        org.joda.time.ReadableInterval readableInterval7 = null;
        mutablePeriod4.setPeriod(readableInterval7);
        int int9 = mutablePeriod4.size();
        int int10 = mutablePeriod4.getMinutes();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) '#', chronology12);
        mutablePeriod13.setMinutes(8);
        mutablePeriod13.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addHours((-1));
        org.joda.time.Chronology chronology26 = null;
        mutablePeriod22.setPeriod((long) 100, chronology26);
        mutablePeriod22.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod22.toDurationFrom(readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration31, readableInstant32);
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration31, chronology34);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration31);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(duration31);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) (short) 100, (int) '#', 97);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod4.setPeriod((long) 35, (long) (byte) -1, chronology7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        mutablePeriod5.addMonths((int) (short) 0);
        mutablePeriod5.addMinutes((int) '#');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod17.setPeriod((long) 100, chronology21);
        mutablePeriod17.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod17.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(readableInstant12, (org.joda.time.ReadableDuration) duration26, periodType29);
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration26);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(readableInstant33, readableInstant34, periodType35);
        int int37 = mutablePeriod36.size();
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant38, readableInstant39, periodType40);
        int int42 = mutablePeriod41.size();
        mutablePeriod36.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.DurationFieldType[] durationFieldTypeArray44 = mutablePeriod36.getFieldTypes();
        org.joda.time.DurationFieldType durationFieldType46 = mutablePeriod36.getFieldType((int) (short) 0);
        mutablePeriod32.set(durationFieldType46, (int) '4');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        mutablePeriod32.setPeriod(readableInstant49, readableInstant50);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray44);
        org.junit.Assert.assertNotNull(durationFieldType46);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, 4, 4, 97, 8, 8, 0, (int) 'a');
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        int int16 = mutablePeriod4.getHours();
        mutablePeriod4.setYears(8);
        int int19 = mutablePeriod4.getHours();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType31 = null;
        int int32 = mutablePeriod30.indexOf(durationFieldType31);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        mutablePeriod30.add((org.joda.time.ReadablePeriod) mutablePeriod37);
        mutablePeriod30.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableInstant43, readableInstant44, periodType45);
        mutablePeriod46.setMinutes((int) (short) 100);
        org.joda.time.Period period49 = mutablePeriod46.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = mutablePeriod54.toDurationFrom(readableInstant55);
        mutablePeriod54.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(10L, periodType60, chronology61);
        int int63 = mutablePeriod62.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod62);
        org.joda.time.DurationFieldType durationFieldType66 = mutablePeriod62.getFieldType((int) (short) 1);
        int int67 = mutablePeriod54.get(durationFieldType66);
        boolean boolean68 = period49.isSupported(durationFieldType66);
        boolean boolean69 = mutablePeriod30.isSupported(durationFieldType66);
        mutablePeriod24.set(durationFieldType66, (int) '4');
        mutablePeriod24.setPeriod((int) (byte) 0, 100, 0, (int) 'a', (int) (byte) 100, (int) (short) 100, 4, 35);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(97, 35, 10, (int) (short) 10);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod6.toDurationFrom(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration15, periodType18);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(10L, periodType32, chronology33);
        mutablePeriod34.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = mutablePeriod34.toDurationFrom(readableInstant38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod44.toDurationTo(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType57 = null;
        int int58 = mutablePeriod56.indexOf(durationFieldType57);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod63.addHours((-1));
        mutablePeriod56.add((org.joda.time.ReadablePeriod) mutablePeriod63);
        org.joda.time.PeriodType periodType67 = mutablePeriod56.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType67);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType67, chronology69);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47, periodType67);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(readableInstant30, (org.joda.time.ReadableDuration) duration39, periodType67);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(97, (int) 'a', (int) (byte) 0, 100, (-1), 100, (int) (short) 0, 1, periodType67);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant21, periodType67);
        int int75 = mutablePeriod74.getWeeks();
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT35H0.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod19.setPeriod((long) 100, chronology23);
        mutablePeriod19.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = mutablePeriod19.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType35 = null;
        int int36 = mutablePeriod34.indexOf(durationFieldType35);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod41.addHours((-1));
        mutablePeriod34.add((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.PeriodType periodType45 = mutablePeriod34.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant29, periodType45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (short) 10, periodType45);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(0L, 1L, periodType45);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType45);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType45);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType45);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        int int10 = mutablePeriod4.getHours();
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod4.setPeriod((long) 0, chronology12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add(0L, chronology6);
        mutablePeriod2.setMillis((int) (byte) 10);
        int[] intArray10 = mutablePeriod2.getValues();
        mutablePeriod2.add((int) (short) -1, 8, 97, (int) '4', 10, (int) (short) 1, (int) (byte) 100, 0);
        mutablePeriod2.setPeriod((long) (byte) 100);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 8, 0, 10]");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) '#', 100, 0);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(periodType5);
        mutablePeriod6.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod6.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType17 = null;
        boolean boolean18 = mutablePeriod6.isSupported(durationFieldType17);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(periodType19);
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod20.add(1L, chronology22);
        mutablePeriod20.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableInstant26, readableInstant27, periodType28);
        mutablePeriod29.setMinutes((int) (short) 100);
        org.joda.time.Period period32 = mutablePeriod29.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = mutablePeriod37.toDurationFrom(readableInstant38);
        mutablePeriod37.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(10L, periodType43, chronology44);
        int int46 = mutablePeriod45.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod45);
        org.joda.time.DurationFieldType durationFieldType49 = mutablePeriod45.getFieldType((int) (short) 1);
        int int50 = mutablePeriod37.get(durationFieldType49);
        boolean boolean51 = period32.isSupported(durationFieldType49);
        int int52 = mutablePeriod20.indexOf(durationFieldType49);
        int int53 = mutablePeriod6.indexOf(durationFieldType49);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod6);
        int int55 = mutablePeriod4.getMillis();
        org.joda.time.ReadableInterval readableInterval56 = null;
        mutablePeriod4.add(readableInterval56);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.setDays((int) (byte) 1);
        org.joda.time.ReadableInterval readableInterval10 = null;
        mutablePeriod3.setPeriod(readableInterval10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setPeriod((long) (short) 100);
        mutablePeriod3.setPeriod(97, 4, 10, 97, (int) (short) -1, (int) (short) 100, (int) (byte) 0, (-1));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType7);
        int int9 = mutablePeriod8.size();
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod3.getFieldTypes();
        java.lang.Object obj12 = mutablePeriod3.clone();
        int int13 = mutablePeriod3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "PT0S");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.PeriodType periodType7 = mutablePeriod3.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setValue((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1);
        int int3 = mutablePeriod2.getYears();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        int int25 = mutablePeriod24.size();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        boolean boolean27 = mutablePeriod4.equals((java.lang.Object) mutablePeriod24);
        mutablePeriod24.setMillis((int) '#');
        org.joda.time.ReadableInterval readableInterval30 = null;
        mutablePeriod24.setPeriod(readableInterval30);
        org.joda.time.MutablePeriod mutablePeriod32 = mutablePeriod24.toMutablePeriod();
        org.joda.time.PeriodType periodType33 = mutablePeriod24.getPeriodType();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        mutablePeriod4.addMonths((int) '#');
        mutablePeriod4.setDays((-1));
        mutablePeriod4.setMonths((int) (short) 0);
        mutablePeriod4.setMonths((int) (short) -1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        mutablePeriod2.setHours((int) (short) -1);
        int int5 = mutablePeriod2.getMinutes();
        mutablePeriod2.add((int) (byte) 10, (int) (short) 1, (int) (short) 10, (int) (byte) 10, 100, 100, (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        mutablePeriod4.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod4.clear();
        java.lang.String str26 = mutablePeriod4.toString();
        mutablePeriod4.add((int) (byte) -1, 8, (int) '4', 0, 52, (int) '#', (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0S" + "'", str26, "PT0S");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 10, chronology1);
        java.lang.String str3 = mutablePeriod2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = mutablePeriod2.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0.010S" + "'", str3, "PT0.010S");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(10L, periodType10, chronology11);
        int int13 = mutablePeriod12.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod12);
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod12.getFieldType((int) (short) 1);
        int int17 = mutablePeriod4.get(durationFieldType16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addMinutes((int) (byte) -1);
        mutablePeriod22.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = mutablePeriod22.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        mutablePeriod37.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod37.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType53 = null;
        int int54 = mutablePeriod52.indexOf(durationFieldType53);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod59.addHours((-1));
        mutablePeriod52.add((org.joda.time.ReadablePeriod) mutablePeriod59);
        org.joda.time.PeriodType periodType63 = mutablePeriod52.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47, periodType63);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (short) 10, periodType63);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(0L, 1L, periodType63);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant29, periodType63);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(periodType63);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, periodType63);
        int[] intArray70 = mutablePeriod4.getValues();
        mutablePeriod4.addMonths(1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 0, 0, 97, 1, 0, 97]");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) ' ', (long) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.toMutablePeriod();
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        mutablePeriod4.setPeriod((long) 100, (long) (short) 1);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType38, chronology39);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableDuration19, readableInstant20, periodType38);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod41);
        mutablePeriod4.setHours((int) (short) 100);
        int int45 = mutablePeriod4.getMillis();
        mutablePeriod4.setMonths(0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT100M");
        int int2 = mutablePeriod1.getWeeks();
        mutablePeriod1.setDays(100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationTo(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType24 = null;
        int int25 = mutablePeriod23.indexOf(durationFieldType24);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod30.addHours((-1));
        mutablePeriod23.add((org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.PeriodType periodType34 = mutablePeriod23.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType34, chronology36);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType34);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType34);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant5, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = mutablePeriod41.copy();
        mutablePeriod1.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(mutablePeriod42);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration20, chronology23);
        mutablePeriod2.setPeriod(97, 100, (int) (short) -1, (int) (short) 1, 1, (int) (short) 0, 1, (int) (byte) 10);
        mutablePeriod2.addHours(10);
        int int36 = mutablePeriod2.getWeeks();
        mutablePeriod2.setWeeks((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType40 = mutablePeriod2.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant9);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, (long) (byte) 0, chronology2);
        mutablePeriod3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = mutablePeriod3.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        mutablePeriod4.addMonths((int) '#');
        java.lang.Object obj11 = mutablePeriod4.clone();
        org.joda.time.format.PeriodFormatter periodFormatter12 = null;
        java.lang.String str13 = mutablePeriod4.toString(periodFormatter12);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "P35MT97H97M0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "P35MT97H97M0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "P35MT97H97M0.097S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P35MT97H97M0.097S" + "'", str13, "P35MT97H97M0.097S");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = mutablePeriod26.indexOf(durationFieldType27);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        mutablePeriod26.add((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.PeriodType periodType37 = mutablePeriod26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant18, readableInstant19, periodType37);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 8, (long) ' ', periodType37);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((java.lang.Object) duration13, periodType37);
        mutablePeriod41.setMonths(8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = mutablePeriod2.indexOf(durationFieldType3);
        mutablePeriod2.addYears((int) (short) 1);
        org.joda.time.PeriodType periodType7 = mutablePeriod2.getPeriodType();
        mutablePeriod2.setSeconds((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 'a', 0L, chronology2);
        mutablePeriod3.setMillis((int) (short) 10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        mutablePeriod3.addYears(10);
        int int7 = mutablePeriod3.getWeeks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) '#', chronology2);
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = mutablePeriod3.toString(periodFormatter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.065S" + "'", str5, "PT0.065S");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 10, chronology1);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.toMutablePeriod();
        int int4 = mutablePeriod3.getMonths();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P35MT97H97M0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }
}

