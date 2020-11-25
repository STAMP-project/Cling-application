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
        org.joda.time.ReadableDuration readableDuration0 = null;
        long long1 = org.joda.time.DateTimeUtils.getDurationMillis(readableDuration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormatSymbols dateFormatSymbols1 = org.joda.time.DateTimeUtils.getDateFormatSymbols(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.DateTimeUtils.setCurrentMillisSystem();
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The MillisProvider must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (short) 1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (-1));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.ReadablePartial readablePartial0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.joda.time.DateTimeUtils.isContiguous(readablePartial0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass3 = readableInterval2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 100);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (byte) 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        long long0 = org.joda.time.DateTimeUtils.currentTimeMillis();
// flaky:         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1606271214588L + "'", long0 == 1606271214588L);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        java.lang.Class<?> wildcardClass2 = chronology1.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (-1));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        java.lang.Class<?> wildcardClass5 = periodType4.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (byte) 10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 100);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((-1L));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (byte) -1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        java.lang.Class<?> wildcardClass5 = periodType2.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.ReadableInstant readableInstant0 = null;
        long long1 = org.joda.time.DateTimeUtils.getInstantMillis(readableInstant0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1606271216005L + "'", long1 == 1606271216005L);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (byte) 100);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass3 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        java.lang.Class<?> wildcardClass2 = periodType1.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) ' ');
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        java.lang.Class<?> wildcardClass3 = chronology1.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        java.lang.Class<?> wildcardClass6 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass4 = chronology3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        java.lang.Class<?> wildcardClass3 = periodType2.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (short) 100);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1606271216005L);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        java.lang.Class<?> wildcardClass3 = readableInterval2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(100L);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(10L);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (short) -1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (byte) 1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1606271214588L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        java.lang.Class<?> wildcardClass5 = periodType3.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (short) 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass5 = chronology2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 1);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass3 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((-1L));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) ' ');
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) '4');
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (byte) 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(0L);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        java.lang.Class<?> wildcardClass6 = periodType3.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (byte) -1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (short) 100);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (byte) 100);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (byte) 10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(0L);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass6 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(100L);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass5 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass4 = readableInterval3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass5 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass4 = chronology3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(1L);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 'a');
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 'a');
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass7 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass6 = chronology2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (short) 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass6 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (short) 1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (short) 10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1606271216005L);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        java.lang.Class<?> wildcardClass2 = chronology1.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        java.lang.Class<?> wildcardClass6 = readableInterval2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass5 = chronology3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass7 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1606271214588L);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (short) 10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        java.lang.Class<?> wildcardClass3 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        java.lang.Class<?> wildcardClass5 = periodType4.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (byte) 1);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) '#');
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        java.lang.Class<?> wildcardClass7 = periodType3.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        java.lang.Class<?> wildcardClass4 = periodType3.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) '4');
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        java.lang.Class<?> wildcardClass6 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        java.lang.Class<?> wildcardClass6 = readableInterval2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(1L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass5 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass6 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass10 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) (short) -1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) '#');
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        java.lang.Class<?> wildcardClass4 = periodType2.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        java.lang.Class<?> wildcardClass4 = periodType1.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass7 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        java.lang.Class<?> wildcardClass6 = periodType3.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass6 = periodType4.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass7 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass4 = chronology3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass7 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass10 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass9 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass7 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        java.lang.Class<?> wildcardClass5 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(10L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass6 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) 10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass10 = periodType9.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass7 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass8 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass9 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        java.lang.Class<?> wildcardClass8 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass7 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass9 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass8 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass8 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass6 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        java.lang.Class<?> wildcardClass8 = readableInterval2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        java.lang.Class<?> wildcardClass8 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        java.lang.Class<?> wildcardClass5 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass4 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        java.lang.Class<?> wildcardClass14 = chronology13.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass7 = periodType4.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass8 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass7 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass7 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        java.lang.Class<?> wildcardClass3 = chronology1.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        java.lang.Class<?> wildcardClass10 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.Class<?> wildcardClass11 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass7 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass7 = periodType4.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass10 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass8 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        java.lang.Class<?> wildcardClass5 = periodType4.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass7 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        java.lang.Class<?> wildcardClass10 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        java.lang.Class<?> wildcardClass10 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass9 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        java.lang.Class<?> wildcardClass13 = periodType12.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass9 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        java.lang.Class<?> wildcardClass8 = periodType2.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass8 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass11 = readableInterval10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass6 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass12 = chronology11.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass8 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        java.lang.Class<?> wildcardClass14 = chronology12.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        java.lang.Class<?> wildcardClass9 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass8 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass9 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        java.lang.Class<?> wildcardClass11 = readableInterval8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass11 = readableInterval10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        java.lang.Class<?> wildcardClass7 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        java.lang.Class<?> wildcardClass4 = chronology3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        java.lang.Class<?> wildcardClass11 = readableInterval10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass8 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass10 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        java.lang.Class<?> wildcardClass10 = periodType9.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass9 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass8 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        java.lang.Class<?> wildcardClass10 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass9 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass10 = periodType9.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        java.lang.Class<?> wildcardClass12 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass9 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass9 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass9 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        java.lang.Class<?> wildcardClass12 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass7 = periodType4.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        java.lang.Class<?> wildcardClass12 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        java.lang.Class<?> wildcardClass12 = periodType11.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass7 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass5 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass9 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass9 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        java.lang.Class<?> wildcardClass10 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass5 = chronology2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        java.lang.Class<?> wildcardClass5 = periodType4.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        java.lang.Class<?> wildcardClass14 = chronology13.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass9 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology4.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        java.lang.Class<?> wildcardClass5 = readableInterval2.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass11 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        java.lang.Class<?> wildcardClass8 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass7 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        java.lang.Class<?> wildcardClass10 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology14);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass9 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        java.lang.Class<?> wildcardClass5 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass11 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        java.lang.Class<?> wildcardClass11 = periodType10.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass8 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass11 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        java.lang.Class<?> wildcardClass13 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass10 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        java.lang.Class<?> wildcardClass9 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass7 = chronology3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass7 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        java.lang.Class<?> wildcardClass6 = readableInterval3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass10 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeUtils.getZone(dateTimeZone13);
        java.lang.Class<?> wildcardClass15 = dateTimeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        java.lang.Class<?> wildcardClass10 = readableInterval8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        java.lang.Class<?> wildcardClass8 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass13 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass14 = chronology13.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass10 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        java.lang.Class<?> wildcardClass8 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval13);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass9 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass7 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass14 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        java.lang.Class<?> wildcardClass7 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass7 = periodType6.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        java.lang.Class<?> wildcardClass12 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass9 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        java.lang.Class<?> wildcardClass11 = readableInterval8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        java.lang.Class<?> wildcardClass6 = periodType3.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass9 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        java.lang.Class<?> wildcardClass8 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass9 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        java.lang.Class<?> wildcardClass11 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        java.lang.Class<?> wildcardClass11 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        java.lang.Class<?> wildcardClass12 = readableInterval10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass10 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        java.lang.Class<?> wildcardClass3 = periodType2.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        java.lang.Class<?> wildcardClass10 = readableInterval8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType10);
        java.lang.Class<?> wildcardClass12 = periodType10.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass9 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        java.lang.Class<?> wildcardClass10 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass9 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        java.lang.Class<?> wildcardClass13 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass11 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass9 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass8 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass7 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        java.lang.Class<?> wildcardClass11 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass10 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.Class<?> wildcardClass12 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        java.lang.Class<?> wildcardClass11 = periodType9.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass7 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        java.lang.Class<?> wildcardClass6 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass10 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        java.lang.Class<?> wildcardClass13 = chronology11.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass6 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass7 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass5 = chronology3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        java.lang.Class<?> wildcardClass11 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        java.lang.Class<?> wildcardClass12 = readableInterval11.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        java.lang.Class<?> wildcardClass12 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass7 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        java.lang.Class<?> wildcardClass13 = periodType12.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        java.lang.Class<?> wildcardClass6 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        java.lang.Class<?> wildcardClass4 = chronology3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass14 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        java.lang.Class<?> wildcardClass6 = chronology3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        java.lang.Class<?> wildcardClass7 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass6 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        java.lang.Class<?> wildcardClass6 = readableInterval3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass4 = readableInterval3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        java.lang.Class<?> wildcardClass11 = readableInterval9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass7 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        java.lang.Class<?> wildcardClass14 = readableInterval11.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology14);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        java.lang.Class<?> wildcardClass9 = chronology7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        java.lang.Class<?> wildcardClass9 = readableInterval8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass10 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        java.lang.Class<?> wildcardClass13 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass15 = readableInterval14.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.Class<?> wildcardClass11 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass10 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass8 = periodType7.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        java.lang.Class<?> wildcardClass12 = periodType11.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass8 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass12 = chronology11.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        java.lang.Class<?> wildcardClass9 = readableInterval5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass11 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        java.lang.Class<?> wildcardClass7 = periodType5.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeUtils.getZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeUtils.getZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeUtils.getZone(dateTimeZone12);
        java.lang.Class<?> wildcardClass17 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass12 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval12);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval12);
        java.lang.Class<?> wildcardClass16 = readableInterval12.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass6 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        java.lang.Class<?> wildcardClass9 = chronology5.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass8 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        java.lang.Class<?> wildcardClass9 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        java.lang.Class<?> wildcardClass8 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass13 = readableInterval12.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass12 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Class<?> wildcardClass5 = readableInterval1.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        java.lang.Class<?> wildcardClass12 = readableInterval10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        java.lang.Class<?> wildcardClass11 = periodType9.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        java.lang.Class<?> wildcardClass8 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass8 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        java.lang.Class<?> wildcardClass13 = readableInterval12.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        java.lang.Class<?> wildcardClass11 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInstant0, readableInstant1);
        java.lang.Class<?> wildcardClass3 = chronology2.getClass();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        java.lang.Class<?> wildcardClass5 = periodType1.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        java.lang.Class<?> wildcardClass13 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass13 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getChronology(chronology9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getChronology(chronology12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology(chronology13);
        java.lang.Class<?> wildcardClass15 = chronology14.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        java.lang.Class<?> wildcardClass6 = readableInterval3.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        java.lang.Class<?> wildcardClass10 = readableInterval4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getChronology(chronology14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getChronology(chronology15);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(readableInterval13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        java.lang.Class<?> wildcardClass13 = readableInterval12.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        java.lang.Class<?> wildcardClass8 = chronology6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        java.lang.Class<?> wildcardClass16 = chronology15.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        java.lang.Class<?> wildcardClass9 = chronology4.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology3);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        java.lang.Class<?> wildcardClass12 = readableInterval10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass9 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        java.lang.Class<?> wildcardClass9 = readableInterval6.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass11 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass11 = chronology10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getChronology(chronology8);
        java.lang.Class<?> wildcardClass10 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        java.lang.Class<?> wildcardClass13 = readableInterval11.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.PeriodType periodType11 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        java.lang.Class<?> wildcardClass12 = periodType9.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass9 = readableInterval7.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        java.lang.Class<?> wildcardClass12 = chronology11.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass9 = periodType8.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        java.lang.Class<?> wildcardClass14 = readableInterval13.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass7 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInstant0, readableInstant1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        java.lang.Class<?> wildcardClass5 = chronology2.getClass();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeUtils.getZone(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeUtils.getZone(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(readableInterval16);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeUtils.getZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeUtils.getZone(dateTimeZone4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        java.lang.Class<?> wildcardClass13 = readableInterval10.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType5);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        java.lang.Class<?> wildcardClass10 = periodType9.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        java.lang.Class<?> wildcardClass9 = readableInterval8.getClass();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology(chronology10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.PeriodType periodType2 = org.joda.time.DateTimeUtils.getPeriodType(periodType1);
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.PeriodType periodType4 = org.joda.time.DateTimeUtils.getPeriodType(periodType3);
        org.joda.time.PeriodType periodType5 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType6 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType4);
        java.lang.Class<?> wildcardClass8 = periodType4.getClass();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getChronology(chronology2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology(chronology4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getChronology(chronology5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology7);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }
}
