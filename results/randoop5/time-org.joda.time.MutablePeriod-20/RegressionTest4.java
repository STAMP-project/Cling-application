import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        int int12 = mutablePeriod3.getWeeks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '#', chronology2);
        mutablePeriod3.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = mutablePeriod3.indexOf(durationFieldType6);
        mutablePeriod3.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType13, chronology14);
        mutablePeriod15.setSeconds(1);
        boolean boolean18 = mutablePeriod3.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod3.toDurationTo(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
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
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType64);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration20, periodType64);
        org.joda.time.DurationFieldType[] durationFieldTypeArray71 = mutablePeriod70.getFieldTypes();
        mutablePeriod70.addMillis(0);
        int int74 = mutablePeriod70.getDays();
        mutablePeriod70.setPeriod((long) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(durationFieldTypeArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType14 = mutablePeriod6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(periodType14);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType14);
        int int17 = mutablePeriod16.getMillis();
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod16.setPeriod((long) 'a', 10L, chronology20);
        mutablePeriod16.setValue((int) (byte) 1, (int) '4');
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = mutablePeriod36.indexOf(durationFieldType37);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        mutablePeriod36.add((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.PeriodType periodType47 = mutablePeriod36.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType47, chronology49);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 0, periodType47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 100, periodType47, chronology52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(100L, periodType47);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod16, periodType47, chronology55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 37, (long) 37, periodType47, chronology57);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(periodType47);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) '#');
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(97, (int) (short) 0, (-1), (int) (short) -1, (int) '#', 52, (int) ' ', (int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) '#', 100, 0);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(periodType16);
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod17.add(1L, chronology19);
        org.joda.time.DurationFieldType durationFieldType21 = null;
        int int22 = mutablePeriod17.indexOf(durationFieldType21);
        int int23 = mutablePeriod17.getMinutes();
        mutablePeriod17.setSeconds((int) (byte) 0);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(10L, periodType27, chronology28);
        int int30 = mutablePeriod29.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod29);
        org.joda.time.DurationFieldType durationFieldType33 = mutablePeriod29.getFieldType((int) (short) 1);
        int int34 = mutablePeriod17.indexOf(durationFieldType33);
        int int35 = mutablePeriod15.get(durationFieldType33);
        int int36 = mutablePeriod10.get(durationFieldType33);
        boolean boolean37 = mutablePeriod1.equals((java.lang.Object) mutablePeriod10);
        mutablePeriod10.setValue((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        int int29 = mutablePeriod7.getMillis();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod6.toDurationFrom(readableInstant7);
        mutablePeriod6.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(10L, periodType12, chronology13);
        int int15 = mutablePeriod14.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod14);
        org.joda.time.DurationFieldType durationFieldType18 = mutablePeriod14.getFieldType((int) (short) 1);
        int int19 = mutablePeriod6.get(durationFieldType18);
        int int20 = mutablePeriod1.get(durationFieldType18);
        org.joda.time.MutablePeriod mutablePeriod21 = mutablePeriod1.toMutablePeriod();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod21, chronology22);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod21);
    }
}

