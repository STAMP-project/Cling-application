import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = mutablePeriod10.indexOf(durationFieldType11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType21 = mutablePeriod10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType21);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 8, (long) ' ', periodType21);
        mutablePeriod24.setMillis((int) ' ');
        int int27 = mutablePeriod24.getWeeks();
        org.joda.time.ReadableInterval readableInterval28 = null;
        mutablePeriod24.setPeriod(readableInterval28);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        java.lang.Object obj31 = mutablePeriod30.clone();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "PT1M0.035S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "PT1M0.035S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "PT1M0.035S");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        int int10 = mutablePeriod4.getHours();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod4.toDurationTo(readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutablePeriod40.mergePeriod(readablePeriod41);
        mutablePeriod40.add((long) 'a');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
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
        org.joda.time.Chronology chronology80 = null;
        mutablePeriod47.setPeriod((org.joda.time.ReadableDuration) duration61, chronology80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(readableInstant45, (org.joda.time.ReadableDuration) duration61);
        mutablePeriod40.add((org.joda.time.ReadableDuration) duration61);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(periodType78);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        int int41 = mutablePeriod40.getYears();
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, 1, 52, 8);
        org.joda.time.format.PeriodFormatter periodFormatter5 = null;
        java.lang.String str6 = mutablePeriod4.toString(periodFormatter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT1M52.008S" + "'", str6, "PT1M52.008S");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        mutablePeriod2.add(97, (int) 'a', 0, (int) (short) 100, (int) (short) 100, (int) (short) 10, (int) ' ', 1);
        int[] intArray17 = mutablePeriod2.getValues();
        int int18 = mutablePeriod2.getYears();
        mutablePeriod2.addHours((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97, 0, 100, 100, 10, 32, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT52M0.003S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(periodType76);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(periodType76);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (short) 10, periodType35);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 1L, periodType35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 100, periodType35, chronology39);
        mutablePeriod40.add((long) '#');
        mutablePeriod40.addHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod40.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod40.toDurationTo(readableInstant47);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType54 = mutablePeriod53.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod59.addHours((-1));
        org.joda.time.Chronology chronology63 = null;
        mutablePeriod59.setPeriod((long) 100, chronology63);
        mutablePeriod59.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Duration duration68 = mutablePeriod59.toDurationFrom(readableInstant67);
        mutablePeriod59.addMinutes((int) (byte) 1);
        mutablePeriod53.add((org.joda.time.ReadablePeriod) mutablePeriod59);
        mutablePeriod53.addMillis((int) (short) 100);
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
        mutablePeriod53.add(durationFieldType90, (int) ' ');
        int int94 = mutablePeriod40.indexOf(durationFieldType90);
        int int95 = mutablePeriod40.getYears();
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(durationFieldType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod1.indexOf(durationFieldType5);
        int int7 = mutablePeriod1.getMinutes();
        mutablePeriod1.setSeconds((int) (byte) 0);
        mutablePeriod1.add((long) 37);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(197, (-1), 35, 4, 1, (int) '#', (int) ' ', 35);
        mutablePeriod8.setPeriod((int) (short) -1, 87, 87, (int) (short) 100, (int) (short) 100, 107, 97, 107);
        mutablePeriod8.addDays(4);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        mutablePeriod12.addMillis(0);
        int int17 = mutablePeriod12.size();
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod7.setPeriod(1L, chronology20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        int[] intArray77 = mutablePeriod74.getValues();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[52, 10, 10, 1, 0, 8, 8, 101]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        mutablePeriod3.addYears(10);
        java.lang.Object obj7 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType13 = mutablePeriod12.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod18.setPeriod((long) 100, chronology22);
        mutablePeriod18.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod18.toDurationFrom(readableInstant26);
        mutablePeriod18.addMinutes((int) (byte) 1);
        mutablePeriod12.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        java.lang.Object obj31 = mutablePeriod12.clone();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod36.addMinutes((int) (byte) -1);
        mutablePeriod36.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = mutablePeriod36.toDurationFrom(readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
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
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, readableInstant43, periodType77);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(obj31, periodType77, chronology82);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType77, chronology84);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "P10Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "P10Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "P10Y");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "PT97H2M0.197S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "PT97H2M0.197S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "PT97H2M0.197S");
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(periodType77);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.joda.time.MutablePeriod mutablePeriod27 = mutablePeriod4.toMutablePeriod();
        org.joda.time.format.PeriodFormatter periodFormatter28 = null;
        java.lang.String str29 = mutablePeriod27.toString(periodFormatter28);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P100M10W1DT10M0.948S" + "'", str29, "P100M10W1DT10M0.948S");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        org.joda.time.PeriodType periodType5 = mutablePeriod1.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(periodType5);
        mutablePeriod6.setPeriod((long) (short) -1);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        java.lang.String str75 = mutablePeriod72.toString();
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
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "P1Y4DT2H37M0.097S" + "'", str75, "P1Y4DT2H37M0.097S");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        org.joda.time.ReadableInstant readableInstant9 = null;
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
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = mutablePeriod12.toDurationTo(readableInstant39);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(10L, periodType45, chronology46);
        mutablePeriod47.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = mutablePeriod47.toDurationFrom(readableInstant51);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = mutablePeriod57.toDurationTo(readableInstant58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType70 = null;
        int int71 = mutablePeriod69.indexOf(durationFieldType70);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod76.addHours((-1));
        mutablePeriod69.add((org.joda.time.ReadablePeriod) mutablePeriod76);
        org.joda.time.PeriodType periodType80 = mutablePeriod69.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType80);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType80, chronology82);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration59, readableInstant60, periodType80);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(readableInstant43, (org.joda.time.ReadableDuration) duration52, periodType80);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((long) '#', 1L, periodType80, chronology86);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(readableInstant9, (org.joda.time.ReadableDuration) duration40, periodType80);
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration40);
        mutablePeriod2.setSeconds((int) '4');
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(periodType80);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod24.addMinutes((int) (byte) -1);
        mutablePeriod24.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod24.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod39.setPeriod((long) 100, chronology43);
        mutablePeriod39.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod39.toDurationFrom(readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType55 = null;
        int int56 = mutablePeriod54.indexOf(durationFieldType55);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod61.addHours((-1));
        mutablePeriod54.add((org.joda.time.ReadablePeriod) mutablePeriod61);
        org.joda.time.PeriodType periodType65 = mutablePeriod54.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration48, readableInstant49, periodType65);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) (short) 10, periodType65);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(0L, 1L, periodType65);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31, periodType65);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(periodType65);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod6, periodType65);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(periodType65);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) 107, (long) (byte) 1, periodType65, chronology73);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(periodType65);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod24, chronology72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        mutablePeriod24.setPeriod(readableInterval74);
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(10L, periodType4, chronology5);
        mutablePeriod6.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod6.toDurationFrom(readableInstant10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = mutablePeriod16.toDurationTo(readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType29 = null;
        int int30 = mutablePeriod28.indexOf(durationFieldType29);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod35.addHours((-1));
        mutablePeriod28.add((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.PeriodType periodType39 = mutablePeriod28.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType39, chronology41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, readableInstant19, periodType39);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration11, periodType39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (short) 10, (long) 52, periodType39);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod16.addHours((-1));
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod16.setPeriod((long) 100, chronology20);
        mutablePeriod16.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType24 = mutablePeriod16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(periodType24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 10, periodType24, chronology26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant9, readableInstant10, periodType24);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 107, periodType24, chronology29);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType24);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        org.joda.time.DurationFieldType durationFieldType7 = mutablePeriod3.getFieldType((int) (short) 1);
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
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 100, periodType43, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType43, chronology49);
        org.joda.time.MutablePeriod mutablePeriod51 = mutablePeriod50.copy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(mutablePeriod51);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 100, (long) (-1));
        int int3 = mutablePeriod2.getHours();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod8.addHours((-1));
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.setPeriod((long) 100, chronology12);
        mutablePeriod8.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod8.toDurationFrom(readableInstant16);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod26.setPeriod((long) 100, chronology30);
        mutablePeriod26.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType34 = mutablePeriod26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod39.setPeriod((long) 100, chronology43);
        mutablePeriod39.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod39.toDurationFrom(readableInstant47);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod26.setPeriod((org.joda.time.ReadableDuration) duration48, chronology49);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType60 = null;
        int int61 = mutablePeriod59.indexOf(durationFieldType60);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod66.addHours((-1));
        mutablePeriod59.add((org.joda.time.ReadablePeriod) mutablePeriod66);
        org.joda.time.PeriodType periodType70 = mutablePeriod59.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType70);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType70, chronology72);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant21, (org.joda.time.ReadableDuration) duration48, periodType70);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant20, periodType70);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant76);
        mutablePeriod77.setWeeks((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        mutablePeriod3.setWeeks(100);
        mutablePeriod3.setDays(100);
        mutablePeriod3.setMillis((int) (short) 10);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod17.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = mutablePeriod17.get(durationFieldType22);
        org.joda.time.DurationFieldType[] durationFieldTypeArray24 = mutablePeriod17.getFieldTypes();
        mutablePeriod17.setPeriod((long) (byte) 10, 10L);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        int int29 = mutablePeriod3.getDays();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType23 = mutablePeriod22.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType23);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9, periodType23);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((-41), 97, 197, 107, 100, (int) ' ', 107, (int) (byte) 100, periodType23);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod4.toString(periodFormatter9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod4.getFieldTypes();
        mutablePeriod4.setPeriod(1, (int) '4', (int) (byte) 10, 4, (int) 'a', 24, 107, (int) (short) 0);
        mutablePeriod4.setPeriod(197, (int) (short) 100, (int) (short) 1, 197, 24, 0, 0, 100);
        int int30 = mutablePeriod4.getMillis();
        org.joda.time.ReadableInterval readableInterval31 = null;
        mutablePeriod4.setPeriod(readableInterval31);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT97H1M0.097S" + "'", str10, "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.getMillis();
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = mutablePeriod3.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        mutablePeriod14.setMonths((int) ' ');
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 97, chronology21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod40.setPeriod((long) 100, chronology44);
        mutablePeriod40.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = mutablePeriod40.toDurationFrom(readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType56 = null;
        int int57 = mutablePeriod55.indexOf(durationFieldType56);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod62.addHours((-1));
        mutablePeriod55.add((org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.PeriodType periodType66 = mutablePeriod55.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration49, readableInstant50, periodType66);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) (short) 10, periodType66);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(0L, 1L, periodType66);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType66);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(readableInstant23, readableInstant24, periodType66);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((java.lang.Object) chronology21, periodType66);
        mutablePeriod14.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod72);
        org.joda.time.Chronology chronology75 = null;
        mutablePeriod72.setPeriod((long) (short) -1, chronology75);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType66);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod8.add(0L, chronology13);
        int int15 = mutablePeriod8.getYears();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        int int37 = mutablePeriod2.getMinutes();
        int int38 = mutablePeriod2.getMinutes();
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        mutablePeriod31.addMinutes((int) '4');
        mutablePeriod31.setMinutes((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = mutablePeriod6.indexOf(durationFieldType7);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        mutablePeriod6.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.PeriodType periodType17 = mutablePeriod6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(10L, periodType22, chronology23);
        mutablePeriod24.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = mutablePeriod24.toDurationFrom(readableInstant28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = mutablePeriod34.toDurationTo(readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType47 = null;
        int int48 = mutablePeriod46.indexOf(durationFieldType47);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod53.addHours((-1));
        mutablePeriod46.add((org.joda.time.ReadablePeriod) mutablePeriod53);
        org.joda.time.PeriodType periodType57 = mutablePeriod46.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType57, chronology59);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration36, readableInstant37, periodType57);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(readableInstant20, (org.joda.time.ReadableDuration) duration29, periodType57);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod();
        mutablePeriod65.setMillis((int) (byte) 10);
        mutablePeriod65.addMinutes((int) (byte) -1);
        mutablePeriod65.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType72 = mutablePeriod65.getPeriodType();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType72, chronology73);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, readableInstant63, periodType72);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(readableInstant19, (org.joda.time.ReadableDuration) duration29);
        mutablePeriod18.setPeriod((org.joda.time.ReadableDuration) duration29);
        java.lang.Object obj78 = mutablePeriod18.clone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "PT0.100S");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) (byte) 10);
        mutablePeriod4.setMonths((int) '4');
        int int14 = mutablePeriod4.size();
        mutablePeriod4.setPeriod((long) 97, (long) 1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod22.toDurationFrom(readableInstant23);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType32 = null;
        int int33 = mutablePeriod31.indexOf(durationFieldType32);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod38.addHours((-1));
        mutablePeriod31.add((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.PeriodType periodType42 = mutablePeriod31.getPeriodType();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType42, chronology43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(readableInstant18, (org.joda.time.ReadableDuration) duration24, periodType42);
        mutablePeriod45.setPeriod((long) (-1), 10L);
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodType42);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType21 = null;
        int int22 = mutablePeriod20.indexOf(durationFieldType21);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod27.addHours((-1));
        mutablePeriod20.add((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.PeriodType periodType31 = mutablePeriod20.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(52, (int) (byte) 1, 35, 1, (-1), 107, (int) (byte) 1, 0, periodType31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType31);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = mutablePeriod10.indexOf(durationFieldType11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType21 = mutablePeriod10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType21);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 8, (long) ' ', periodType21);
        mutablePeriod24.setMillis((int) ' ');
        int int27 = mutablePeriod24.getWeeks();
        java.lang.Object obj28 = null;
        boolean boolean29 = mutablePeriod24.equals(obj28);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        mutablePeriod37.setHours((-41));
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = mutablePeriod2.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        mutablePeriod3.addMillis(197);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (-98));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) ' ');
        mutablePeriod1.addYears((int) (short) -1);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        mutablePeriod2.addDays((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType12 = mutablePeriod2.getFieldType(0);
        mutablePeriod2.addYears(0);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) ' ', (int) 'a', (int) (byte) 10, 8, (int) ' ', (int) (short) 1, (int) (byte) 0, (int) (byte) -1, periodType31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) '4', periodType31, chronology35);
        int int37 = mutablePeriod36.getSeconds();
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        int int47 = mutablePeriod46.size();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8 + "'", int47 == 8);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0.098S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        mutablePeriod45.addDays(4);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) '#', (int) (short) -1, 35, 97, (int) (short) 0, (int) (short) 1, (int) ' ', (int) ' ');
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod8.add(readableInterval9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        mutablePeriod8.setPeriod(readableInstant11, readableInstant12);
        mutablePeriod8.addSeconds(107);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod4.toString(periodFormatter9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod4.getFieldTypes();
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod4.add((long) 0, chronology13);
        mutablePeriod4.setSeconds(197);
        java.lang.String str17 = mutablePeriod4.toString();
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
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(10L, periodType48, chronology49);
        mutablePeriod50.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = mutablePeriod50.toDurationFrom(readableInstant54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = mutablePeriod60.toDurationTo(readableInstant61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType73 = null;
        int int74 = mutablePeriod72.indexOf(durationFieldType73);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod79.addHours((-1));
        mutablePeriod72.add((org.joda.time.ReadablePeriod) mutablePeriod79);
        org.joda.time.PeriodType periodType83 = mutablePeriod72.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType83);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType83, chronology85);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration62, readableInstant63, periodType83);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(readableInstant46, (org.joda.time.ReadableDuration) duration55, periodType83);
        org.joda.time.Chronology chronology89 = null;
        mutablePeriod22.setPeriod((org.joda.time.ReadableDuration) duration55, chronology89);
        int int91 = mutablePeriod22.getMonths();
        org.joda.time.DurationFieldType[] durationFieldTypeArray92 = mutablePeriod22.getFieldTypes();
        int int93 = mutablePeriod22.getWeeks();
        mutablePeriod22.setValue(0, (-41));
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT97H1M0.097S" + "'", str10, "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT97H1M197.097S" + "'", str17, "PT97H1M197.097S");
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 34, 0L, chronology2);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.addHours((-1));
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod14.setPeriod((long) 100, chronology18);
        mutablePeriod14.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod14.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant24);
        mutablePeriod25.add((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 8, (int) (byte) 10, 1);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod39.setPeriod((long) 100, chronology43);
        mutablePeriod39.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod39.toDurationFrom(readableInstant47);
        mutablePeriod39.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter51 = null;
        java.lang.String str52 = mutablePeriod39.toString(periodFormatter51);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType68 = null;
        int int69 = mutablePeriod67.indexOf(durationFieldType68);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod74.addHours((-1));
        mutablePeriod67.add((org.joda.time.ReadablePeriod) mutablePeriod74);
        org.joda.time.PeriodType periodType78 = mutablePeriod67.getPeriodType();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType78, chronology79);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType78);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod39, periodType78, chronology82);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod25, periodType78);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(readableInstant8, readableInstant9, periodType78);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType78);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(periodType78);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PT1M0.100S" + "'", str52, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(periodType78);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) '4', (int) (short) 10, 100);
        mutablePeriod4.setMonths(1);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod7.setPeriod(0L, chronology9);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) chronology9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        mutablePeriod4.addWeeks((int) (byte) 1);
        int int26 = mutablePeriod4.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod27 = mutablePeriod4.copy();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = mutablePeriod4.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "P1WT97H2M0.197S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "P1WT97H2M0.197S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "P1WT97H2M0.197S");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod27);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.joda.time.MutablePeriod mutablePeriod33 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        mutablePeriod33.addMonths((int) '4');
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType43 = null;
        int int44 = mutablePeriod42.indexOf(durationFieldType43);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod49.addHours((-1));
        mutablePeriod42.add((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.joda.time.PeriodType periodType53 = mutablePeriod42.getPeriodType();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType53, chronology54);
        int int56 = mutablePeriod55.getYears();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = mutablePeriod61.toDurationFrom(readableInstant62);
        mutablePeriod61.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(10L, periodType67, chronology68);
        int int70 = mutablePeriod69.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod69);
        org.joda.time.DurationFieldType durationFieldType73 = mutablePeriod69.getFieldType((int) (short) 1);
        int int74 = mutablePeriod61.get(durationFieldType73);
        int int75 = mutablePeriod55.indexOf(durationFieldType73);
        int int76 = mutablePeriod33.get(durationFieldType73);
        int int77 = mutablePeriod24.indexOf(durationFieldType73);
        mutablePeriod24.setPeriod((int) (byte) 0, 0, (int) (short) 0, 35, (int) (byte) 10, 107, (int) (short) 1, 32);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 52 + "'", int76 == 52);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (-1));
        mutablePeriod1.setMinutes((-98));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        mutablePeriod3.clear();
        mutablePeriod3.setMinutes(0);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(10L, periodType28, chronology29);
        mutablePeriod30.setPeriod((long) (byte) 0, 100L);
        mutablePeriod30.addMinutes((int) (short) 1);
        int int36 = mutablePeriod30.getMinutes();
        mutablePeriod30.addMillis(0);
        boolean boolean39 = mutablePeriod3.equals((java.lang.Object) mutablePeriod30);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutablePeriod7.add(readablePeriod29);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (short) 100, 0, (int) (byte) 1, 52, 52, (int) (short) -1, (int) '4');
        int int40 = mutablePeriod39.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod41 = mutablePeriod39.copy();
        mutablePeriod41.addWeeks(97);
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(mutablePeriod41);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType4);
        int int6 = mutablePeriod5.size();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant7, readableInstant8, periodType9);
        int int11 = mutablePeriod10.size();
        mutablePeriod5.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod5.toDurationFrom(readableInstant13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = mutablePeriod27.toDurationFrom(readableInstant28);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType45 = null;
        int int46 = mutablePeriod44.indexOf(durationFieldType45);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod51.addHours((-1));
        mutablePeriod44.add((org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.PeriodType periodType55 = mutablePeriod44.getPeriodType();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType55, chronology56);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType55);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(readableInstant22, (org.joda.time.ReadableDuration) duration29, periodType55);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(readableInstant20, readableInstant21, periodType55);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) (short) -1, periodType55);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) 8, periodType55, chronology62);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant16, periodType55);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod71.addHours((-1));
        org.joda.time.Chronology chronology75 = null;
        mutablePeriod71.setPeriod((long) 100, chronology75);
        mutablePeriod71.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType79 = mutablePeriod71.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod(periodType79);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 10, periodType79, chronology81);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType79, chronology83);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration14, periodType79);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(periodType79);
        int int87 = mutablePeriod86.getMillis();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod4.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod4.getMinutes();
        int[] intArray9 = mutablePeriod4.getValues();
        int int10 = mutablePeriod4.getMonths();
        mutablePeriod4.setMillis(107);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97S");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod((long) (byte) 10, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.addMinutes((int) (byte) -1);
        mutablePeriod14.setMinutes((int) 'a');
        mutablePeriod14.addMonths((int) '#');
        int int21 = mutablePeriod14.getYears();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = mutablePeriod27.toDurationFrom(readableInstant28);
        mutablePeriod27.addMonths((int) (short) 0);
        mutablePeriod27.addMinutes((int) '#');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod39.setPeriod((long) 100, chronology43);
        mutablePeriod39.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod39.toDurationFrom(readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration48, readableInstant49);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(readableInstant34, (org.joda.time.ReadableDuration) duration48, periodType51);
        mutablePeriod27.setPeriod((org.joda.time.ReadableDuration) duration48);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableInstant22, (org.joda.time.ReadableDuration) duration48);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(readableInstant55, readableInstant56, periodType57);
        int int59 = mutablePeriod58.size();
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(readableInstant60, readableInstant61, periodType62);
        int int64 = mutablePeriod63.size();
        mutablePeriod58.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod63);
        org.joda.time.DurationFieldType[] durationFieldTypeArray66 = mutablePeriod58.getFieldTypes();
        org.joda.time.DurationFieldType durationFieldType68 = mutablePeriod58.getFieldType((int) (short) 0);
        mutablePeriod54.set(durationFieldType68, (int) '4');
        mutablePeriod14.set(durationFieldType68, (int) (short) 1);
        boolean boolean73 = mutablePeriod6.isSupported(durationFieldType68);
        mutablePeriod1.set(durationFieldType68, (int) '#');
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 8 + "'", int59 == 8);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 8 + "'", int64 == 8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray66);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration20);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = mutablePeriod21.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(10L, periodType45, chronology46);
        mutablePeriod47.addHours((int) (byte) 10);
        org.joda.time.PeriodType periodType50 = mutablePeriod47.getPeriodType();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 8, periodType50, chronology51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 0, periodType50, chronology53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod40, periodType50, chronology55);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(10L, periodType58, chronology59);
        int int61 = mutablePeriod60.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod60);
        org.joda.time.format.PeriodFormatter periodFormatter63 = null;
        java.lang.String str64 = mutablePeriod62.toString(periodFormatter63);
        org.joda.time.DurationFieldType[] durationFieldTypeArray65 = mutablePeriod62.getFieldTypes();
        boolean boolean66 = mutablePeriod40.equals((java.lang.Object) mutablePeriod62);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType68 = mutablePeriod62.getFieldType((-41));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "PT0.010S" + "'", str64, "PT0.010S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = mutablePeriod3.toDurationFrom(readableInstant4);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod3.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType12 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod17.setPeriod((long) 100, chronology21);
        mutablePeriod17.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod17.toDurationFrom(readableInstant25);
        mutablePeriod17.addMinutes((int) (byte) 1);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        mutablePeriod11.addMillis((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType37 = mutablePeriod36.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addHours((-1));
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod42.setPeriod((long) 100, chronology46);
        mutablePeriod42.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = mutablePeriod42.toDurationFrom(readableInstant50);
        mutablePeriod42.addMinutes((int) (byte) 1);
        mutablePeriod36.add((org.joda.time.ReadablePeriod) mutablePeriod42);
        mutablePeriod36.addMillis((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = mutablePeriod61.toDurationFrom(readableInstant62);
        mutablePeriod61.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(10L, periodType67, chronology68);
        int int70 = mutablePeriod69.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod69);
        org.joda.time.DurationFieldType durationFieldType73 = mutablePeriod69.getFieldType((int) (short) 1);
        int int74 = mutablePeriod61.get(durationFieldType73);
        mutablePeriod36.add(durationFieldType73, (int) ' ');
        int int77 = mutablePeriod11.indexOf(durationFieldType73);
        int int78 = mutablePeriod6.indexOf(durationFieldType73);
        int int79 = mutablePeriod6.getMinutes();
        mutablePeriod6.add((long) 8);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod2.getYears();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = mutablePeriod13.indexOf(durationFieldType14);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.PeriodType periodType24 = mutablePeriod13.getPeriodType();
        mutablePeriod13.setDays(100);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod28);
        mutablePeriod28.setPeriod(100L, (long) (byte) -1);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(periodType33);
        mutablePeriod34.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod44 = mutablePeriod34.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType45 = null;
        boolean boolean46 = mutablePeriod34.isSupported(durationFieldType45);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(periodType47);
        org.joda.time.Chronology chronology50 = null;
        mutablePeriod48.add(1L, chronology50);
        mutablePeriod48.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(readableInstant54, readableInstant55, periodType56);
        mutablePeriod57.setMinutes((int) (short) 100);
        org.joda.time.Period period60 = mutablePeriod57.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = mutablePeriod65.toDurationFrom(readableInstant66);
        mutablePeriod65.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(10L, periodType71, chronology72);
        int int74 = mutablePeriod73.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod73);
        org.joda.time.DurationFieldType durationFieldType77 = mutablePeriod73.getFieldType((int) (short) 1);
        int int78 = mutablePeriod65.get(durationFieldType77);
        boolean boolean79 = period60.isSupported(durationFieldType77);
        int int80 = mutablePeriod48.indexOf(durationFieldType77);
        int int81 = mutablePeriod34.indexOf(durationFieldType77);
        int int82 = mutablePeriod28.get(durationFieldType77);
        int int83 = mutablePeriod13.indexOf(durationFieldType77);
        boolean boolean84 = mutablePeriod2.isSupported(durationFieldType77);
        org.joda.time.DurationFieldType[] durationFieldTypeArray85 = mutablePeriod2.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(mutablePeriod44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(durationFieldType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(durationFieldTypeArray85);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.joda.time.Period period23 = mutablePeriod10.toPeriod();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant24, readableInstant25, periodType26);
        mutablePeriod27.setMinutes((int) (short) 100);
        org.joda.time.Period period30 = mutablePeriod27.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = mutablePeriod35.toDurationFrom(readableInstant36);
        mutablePeriod35.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(10L, periodType41, chronology42);
        int int44 = mutablePeriod43.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod43);
        org.joda.time.DurationFieldType durationFieldType47 = mutablePeriod43.getFieldType((int) (short) 1);
        int int48 = mutablePeriod35.get(durationFieldType47);
        boolean boolean49 = period30.isSupported(durationFieldType47);
        int int50 = mutablePeriod10.get(durationFieldType47);
        mutablePeriod10.setYears((-1));
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 8, 100L, chronology2);
        int int4 = mutablePeriod3.getMonths();
        int int5 = mutablePeriod3.size();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(10L, periodType7, chronology8);
        int int10 = mutablePeriod9.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod9);
        org.joda.time.DurationFieldType durationFieldType13 = mutablePeriod9.getFieldType((int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod23.setPeriod((long) 100, chronology27);
        mutablePeriod23.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = mutablePeriod23.toDurationFrom(readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType39 = null;
        int int40 = mutablePeriod38.indexOf(durationFieldType39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod45.addHours((-1));
        mutablePeriod38.add((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.PeriodType periodType49 = mutablePeriod38.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant33, periodType49);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) (short) 10, periodType49);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(0L, 1L, periodType49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 100, periodType49, chronology53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod9, periodType49, chronology55);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(periodType49);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType49);
        mutablePeriod58.setPeriod(0, 35, 32, 1, 97, (-48), (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(periodType49);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod4.get(durationFieldType9);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod26.setPeriod((long) 100, chronology30);
        mutablePeriod26.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType34 = mutablePeriod26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod39.setPeriod((long) 100, chronology43);
        mutablePeriod39.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod39.toDurationFrom(readableInstant47);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod26.setPeriod((org.joda.time.ReadableDuration) duration48, chronology49);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType60 = null;
        int int61 = mutablePeriod59.indexOf(durationFieldType60);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod66.addHours((-1));
        mutablePeriod59.add((org.joda.time.ReadablePeriod) mutablePeriod66);
        org.joda.time.PeriodType periodType70 = mutablePeriod59.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType70);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType70, chronology72);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant21, (org.joda.time.ReadableDuration) duration48, periodType70);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((-98), (int) (byte) 10, 4, (int) (short) 100, 87, (int) 'a', (int) 'a', 100, periodType70);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(0L, 0L, periodType70, chronology76);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((java.lang.Object) int10, periodType70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod7.toDurationFrom(readableInstant15);
        mutablePeriod7.setHours((int) (short) 0);
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
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod41.addMinutes((int) (byte) -1);
        mutablePeriod41.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = mutablePeriod41.toDurationFrom(readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod56.addHours((-1));
        org.joda.time.Chronology chronology60 = null;
        mutablePeriod56.setPeriod((long) 100, chronology60);
        mutablePeriod56.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = mutablePeriod56.toDurationFrom(readableInstant64);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType72 = null;
        int int73 = mutablePeriod71.indexOf(durationFieldType72);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod78.addHours((-1));
        mutablePeriod71.add((org.joda.time.ReadablePeriod) mutablePeriod78);
        org.joda.time.PeriodType periodType82 = mutablePeriod71.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration65, readableInstant66, periodType82);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) (short) 10, periodType82);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(0L, 1L, periodType82);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant48, periodType82);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(periodType82);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod23, periodType82);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod7, periodType82);
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod(periodType82);
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((long) 8, (long) (short) -1, periodType82, chronology91);
        org.joda.time.Chronology chronology93 = null;
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod((long) ' ', periodType82, chronology93);
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod(periodType82);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(periodType82);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, chronology15);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod21.setPeriod((long) 100, chronology25);
        mutablePeriod21.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType29 = mutablePeriod21.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(periodType29);
        mutablePeriod16.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod36.addHours((-1));
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod36.setPeriod((long) 100, chronology40);
        mutablePeriod36.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = mutablePeriod36.toDurationFrom(readableInstant44);
        mutablePeriod36.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter48 = null;
        java.lang.String str49 = mutablePeriod36.toString(periodFormatter48);
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
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod36, periodType75, chronology79);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod16, periodType75);
        int int82 = mutablePeriod81.getWeeks();
        org.joda.time.MutablePeriod mutablePeriod83 = mutablePeriod81.copy();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PT1M0.100S" + "'", str49, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod83);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod57.addHours((-1));
        org.joda.time.Chronology chronology61 = null;
        mutablePeriod57.setPeriod((long) 100, chronology61);
        mutablePeriod57.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType65 = mutablePeriod57.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(periodType65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 10, periodType65, chronology67);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType65, chronology69);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) (short) 100, (long) (byte) 0, periodType65);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1, periodType65);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration23, periodType65);
        int int74 = mutablePeriod73.getMillis();
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod8.addHours((-1));
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.setPeriod((long) 100, chronology12);
        mutablePeriod8.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod8.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 97, chronology24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        org.joda.time.Chronology chronology47 = null;
        mutablePeriod43.setPeriod((long) 100, chronology47);
        mutablePeriod43.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = mutablePeriod43.toDurationFrom(readableInstant51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType59 = null;
        int int60 = mutablePeriod58.indexOf(durationFieldType59);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod65.addHours((-1));
        mutablePeriod58.add((org.joda.time.ReadablePeriod) mutablePeriod65);
        org.joda.time.PeriodType periodType69 = mutablePeriod58.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration52, readableInstant53, periodType69);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) (short) 10, periodType69);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(0L, 1L, periodType69);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType69);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant26, readableInstant27, periodType69);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((java.lang.Object) chronology24, periodType69);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant22, periodType69);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType69);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) (-98), (long) (short) 100, periodType69, chronology78);
        mutablePeriod79.setYears(97);
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) 1, periodType83, chronology84);
        int int86 = mutablePeriod85.getHours();
        mutablePeriod85.clear();
        mutablePeriod79.add((org.joda.time.ReadablePeriod) mutablePeriod85);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod6.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = mutablePeriod18.indexOf(durationFieldType19);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod25.addHours((-1));
        mutablePeriod18.add((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.PeriodType periodType29 = mutablePeriod18.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType29, chronology31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType29);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType29);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant0, chronology35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod36.toDurationTo(readableInstant37);
        mutablePeriod36.setPeriod((long) ' ', (long) '#');
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(duration38);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        org.joda.time.DurationFieldType durationFieldType7 = mutablePeriod3.getFieldType((int) (short) 1);
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
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 100, periodType43, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType43, chronology49);
        mutablePeriod50.addWeeks(197);
        org.joda.time.Chronology chronology55 = null;
        mutablePeriod50.setPeriod((long) (short) 0, (long) (-98), chronology55);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod2.setPeriod(100L, chronology9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod19.setPeriod((long) 100, chronology23);
        mutablePeriod19.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType27 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(periodType27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 10, periodType27, chronology29);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableInstant12, readableInstant13, periodType27);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((java.lang.Object) "PT0.001S", periodType27, chronology32);
        mutablePeriod33.setMonths(8);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        mutablePeriod2.setHours((int) '4');
        mutablePeriod2.addMillis(8);
        org.joda.time.MutablePeriod mutablePeriod29 = mutablePeriod2.copy();
        mutablePeriod2.addMillis((-98));
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(mutablePeriod29);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int int8 = mutablePeriod7.getYears();
        mutablePeriod7.setPeriod((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod7.toDurationFrom(readableInstant11);
        mutablePeriod7.setSeconds((int) (byte) 10);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (short) 100, 0, (int) (byte) 1, 52, 52, (int) (short) -1, (int) '4');
        mutablePeriod8.addMinutes(0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod8, chronology13);
        int int15 = mutablePeriod14.getMonths();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod6.toDurationFrom(readableInstant7);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType24 = null;
        int int25 = mutablePeriod23.indexOf(durationFieldType24);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod30.addHours((-1));
        mutablePeriod23.add((org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.PeriodType periodType34 = mutablePeriod23.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType34, chronology35);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType34);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration8, periodType34);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = mutablePeriod45.toDurationTo(readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType58 = null;
        int int59 = mutablePeriod57.indexOf(durationFieldType58);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod64.addHours((-1));
        mutablePeriod57.add((org.joda.time.ReadablePeriod) mutablePeriod64);
        org.joda.time.PeriodType periodType68 = mutablePeriod57.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType68, chronology70);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant48, periodType68);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(readableInstant39, readableInstant40, periodType68);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(periodType68);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration8, periodType68);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(readableInstant55, readableInstant56, periodType57);
        int int59 = mutablePeriod58.size();
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(readableInstant60, readableInstant61, periodType62);
        int int64 = mutablePeriod63.size();
        mutablePeriod58.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod63);
        org.joda.time.DurationFieldType[] durationFieldTypeArray66 = mutablePeriod58.getFieldTypes();
        org.joda.time.DurationFieldType durationFieldType68 = mutablePeriod58.getFieldType((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType74 = null;
        int int75 = mutablePeriod73.indexOf(durationFieldType74);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod80.addHours((-1));
        mutablePeriod73.add((org.joda.time.ReadablePeriod) mutablePeriod80);
        mutablePeriod73.setMillis((int) 'a');
        mutablePeriod58.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod73);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod58);
        int int88 = mutablePeriod4.getSeconds();
        mutablePeriod4.setWeeks(97);
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 8 + "'", int59 == 8);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 8 + "'", int64 == 8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray66);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod7.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType23 = null;
        int int24 = mutablePeriod22.indexOf(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        mutablePeriod22.add((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.PeriodType periodType33 = mutablePeriod22.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, readableInstant17, periodType33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (short) 10, periodType33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (-41), (long) 107, periodType33, chronology36);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-48), 8, (-48), (int) (byte) 1, (int) (short) 0, (int) '#', (int) (byte) 1, 100);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod8.setPeriod(readableInstant9, readableInstant10);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod4.setPeriod(0L, chronology43);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT97H1M52.097S" + "'", str9, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        mutablePeriod1.add((int) (byte) -1, (int) (short) -1, 1, (int) '#', (int) 'a', (int) '4', 8, (int) (byte) 10);
        mutablePeriod1.addMonths((int) (short) 10);
        java.lang.Object obj22 = mutablePeriod1.clone();
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "P99Y109M101W35DT197H52M108.009S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "P99Y109M101W35DT197H52M108.009S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "P99Y109M101W35DT197H52M108.009S");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod24.toMutablePeriod();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(mutablePeriod36);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 0, (int) '#', (int) (short) 0, 0);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationTo(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray18 = mutablePeriod17.getValues();
        int int19 = mutablePeriod17.getHours();
        org.joda.time.MutablePeriod mutablePeriod20 = mutablePeriod17.toMutablePeriod();
        org.joda.time.PeriodType periodType21 = mutablePeriod17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(periodType21);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, readableInstant7, periodType21);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = mutablePeriod46.toDurationTo(readableInstant49);
        java.lang.Class<?> wildcardClass51 = duration50.getClass();
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (-1L), chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, chronology4);
        int int6 = mutablePeriod5.getHours();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        mutablePeriod2.add(97, (int) 'a', 0, (int) (short) 100, (int) (short) 100, (int) (short) 10, (int) ' ', 1);
        int[] intArray17 = mutablePeriod2.getValues();
        int int18 = mutablePeriod2.getDays();
        int int19 = mutablePeriod2.getHours();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97, 0, 100, 100, 10, 32, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 100, periodType1, chronology2);
        mutablePeriod3.addMillis(197);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        int int18 = mutablePeriod4.getMillis();
        mutablePeriod4.setWeeks((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod25.toDurationFrom(readableInstant26);
        mutablePeriod25.addMonths((int) (short) 0);
        int int30 = mutablePeriod25.getMonths();
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod25);
        mutablePeriod4.setSeconds(32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        java.lang.Class<?> wildcardClass21 = mutablePeriod4.getClass();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        org.joda.time.PeriodType periodType12 = mutablePeriod11.getPeriodType();
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod14.toDurationFrom(readableInstant15);
        mutablePeriod14.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(10L, periodType20, chronology21);
        int int23 = mutablePeriod22.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod22);
        org.joda.time.DurationFieldType durationFieldType26 = mutablePeriod22.getFieldType((int) (short) 1);
        int int27 = mutablePeriod14.get(durationFieldType26);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addMinutes((int) (byte) -1);
        mutablePeriod32.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod32.toDurationFrom(readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod47.addHours((-1));
        org.joda.time.Chronology chronology51 = null;
        mutablePeriod47.setPeriod((long) 100, chronology51);
        mutablePeriod47.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = mutablePeriod47.toDurationFrom(readableInstant55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType63 = null;
        int int64 = mutablePeriod62.indexOf(durationFieldType63);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod69.addHours((-1));
        mutablePeriod62.add((org.joda.time.ReadablePeriod) mutablePeriod69);
        org.joda.time.PeriodType periodType73 = mutablePeriod62.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration56, readableInstant57, periodType73);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) (short) 10, periodType73);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(0L, 1L, periodType73);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration38, readableInstant39, periodType73);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(periodType73);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod14, periodType73);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod(periodType73);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod(32, (int) (byte) -1, 197, (int) 'a', (int) '4', 197, 32, (int) (short) 100, periodType73);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(obj1, periodType73, chronology82);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(obj0, periodType73);
        mutablePeriod84.setDays((int) ' ');
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(periodType73);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod27, chronology30);
        mutablePeriod27.setHours(8);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod27.toDurationFrom(readableInstant34);
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod27.setPeriod((long) (byte) -1, (long) (-98), chronology38);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod6.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = mutablePeriod18.indexOf(durationFieldType19);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod25.addHours((-1));
        mutablePeriod18.add((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.PeriodType periodType29 = mutablePeriod18.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType29, chronology31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType29);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType29);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant0, chronology35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod36.toDurationTo(readableInstant37);
        mutablePeriod36.addYears((int) '4');
        int int41 = mutablePeriod36.getSeconds();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod2.add((long) (short) -1, chronology4);
        mutablePeriod2.clear();
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.addMinutes(4);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
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
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant9, readableInstant10, periodType38);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant9, chronology44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = mutablePeriod45.toDurationTo(readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant48);
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration47);
        mutablePeriod2.setPeriod((long) 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(duration47);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1);
        mutablePeriod1.setPeriod(100L, (long) (byte) -1);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(periodType6);
        mutablePeriod7.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod17 = mutablePeriod7.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        boolean boolean19 = mutablePeriod7.isSupported(durationFieldType18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(periodType20);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod21.add(1L, chronology23);
        mutablePeriod21.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(readableInstant27, readableInstant28, periodType29);
        mutablePeriod30.setMinutes((int) (short) 100);
        org.joda.time.Period period33 = mutablePeriod30.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = mutablePeriod38.toDurationFrom(readableInstant39);
        mutablePeriod38.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(10L, periodType44, chronology45);
        int int47 = mutablePeriod46.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod46);
        org.joda.time.DurationFieldType durationFieldType50 = mutablePeriod46.getFieldType((int) (short) 1);
        int int51 = mutablePeriod38.get(durationFieldType50);
        boolean boolean52 = period33.isSupported(durationFieldType50);
        int int53 = mutablePeriod21.indexOf(durationFieldType50);
        int int54 = mutablePeriod7.indexOf(durationFieldType50);
        int int55 = mutablePeriod1.get(durationFieldType50);
        int int56 = mutablePeriod1.getDays();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
            org.joda.time.DurationFieldType durationFieldType59 = mutablePeriod55.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType17 = mutablePeriod16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) '4', (long) (short) -1, periodType17, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (short) 0, (long) 34, periodType17, chronology21);
        mutablePeriod22.add(0L);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 1, (long) '4');
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod7.toDurationFrom(readableInstant15);
        mutablePeriod7.setHours((int) (short) 0);
        mutablePeriod7.setPeriod((long) 100, (long) (short) 1);
        boolean boolean22 = mutablePeriod2.equals((java.lang.Object) mutablePeriod7);
        int int23 = mutablePeriod2.getYears();
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', (int) 'a', 52, (int) '#');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod10.toDurationFrom(readableInstant11);
        mutablePeriod10.addMonths((int) (short) 0);
        mutablePeriod10.addMinutes((int) '#');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addHours((-1));
        org.joda.time.Chronology chronology26 = null;
        mutablePeriod22.setPeriod((long) 100, chronology26);
        mutablePeriod22.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod22.toDurationFrom(readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration31, readableInstant32);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant17, (org.joda.time.ReadableDuration) duration31, periodType34);
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration31);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(readableInstant5, (org.joda.time.ReadableDuration) duration31);
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray49 = mutablePeriod41.getFieldTypes();
        org.joda.time.DurationFieldType durationFieldType51 = mutablePeriod41.getFieldType((int) (short) 0);
        mutablePeriod37.set(durationFieldType51, (int) '4');
        int int54 = mutablePeriod4.get(durationFieldType51);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8 + "'", int47 == 8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray49);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod81);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(periodType76);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        mutablePeriod4.addDays(100);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        mutablePeriod4.setPeriod(readableInstant12, readableInstant13);
        mutablePeriod4.addHours((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod21.setPeriod((long) 100, chronology25);
        mutablePeriod21.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod21.toDurationFrom(readableInstant29);
        mutablePeriod21.setHours((int) (short) 0);
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
        boolean boolean44 = mutablePeriod21.equals((java.lang.Object) mutablePeriod41);
        mutablePeriod41.setMillis((int) '#');
        org.joda.time.ReadableInterval readableInterval47 = null;
        mutablePeriod41.setPeriod(readableInterval47);
        int int49 = mutablePeriod41.size();
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod41);
        mutablePeriod4.add((long) 0);
        mutablePeriod4.addHours((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod17.toDurationFrom(readableInstant18);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = mutablePeriod26.indexOf(durationFieldType27);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        mutablePeriod26.add((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.PeriodType periodType37 = mutablePeriod26.getPeriodType();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType37, chronology38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant13, (org.joda.time.ReadableDuration) duration19, periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType37, chronology41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant10, readableInstant11, periodType37);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(0L, (-1L), periodType37, chronology44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (short) 1, 24, 10, (int) '4', (int) (short) 0, (int) (byte) -1, 32, periodType37);
        mutablePeriod46.addMillis((-48));
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology2);
        int int4 = mutablePeriod3.getHours();
        mutablePeriod3.setValue(0, (int) '4');
        java.lang.Object obj8 = mutablePeriod3.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "P52YT0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "P52YT0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "P52YT0.001S");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 32, chronology1);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) 8, 100L, chronology6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod3.add((long) 8, chronology9);
        org.joda.time.DurationFieldType durationFieldType12 = mutablePeriod3.getFieldType(0);
        int int13 = mutablePeriod3.size();
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int5 = mutablePeriod3.getValue((int) (byte) 1);
        int int6 = mutablePeriod3.getDays();
        int int7 = mutablePeriod3.getMonths();
        org.joda.time.MutablePeriod mutablePeriod17 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray18 = mutablePeriod17.getValues();
        int int19 = mutablePeriod17.getHours();
        org.joda.time.MutablePeriod mutablePeriod20 = mutablePeriod17.toMutablePeriod();
        org.joda.time.PeriodType periodType21 = mutablePeriod17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        mutablePeriod22.setPeriod(readableInterval23);
        boolean boolean25 = mutablePeriod3.equals((java.lang.Object) mutablePeriod22);
        int[] intArray26 = mutablePeriod22.getValues();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        int int5 = mutablePeriod1.getDays();
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod1.add((long) ' ', chronology7);
        org.joda.time.DurationFieldType[] durationFieldTypeArray9 = mutablePeriod1.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.addHours((-1));
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod14.setPeriod((long) 100, chronology18);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = mutablePeriod24.indexOf(durationFieldType25);
        mutablePeriod14.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = mutablePeriod32.indexOf(durationFieldType33);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        mutablePeriod32.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        mutablePeriod32.setMillis((int) 'a');
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
        boolean boolean71 = mutablePeriod32.isSupported(durationFieldType68);
        int int72 = mutablePeriod24.get(durationFieldType68);
        boolean boolean73 = mutablePeriod1.isSupported(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        java.lang.Object obj2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = mutablePeriod9.indexOf(durationFieldType10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod16.addHours((-1));
        mutablePeriod9.add((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod9, chronology20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod26.setPeriod((long) 100, chronology30);
        mutablePeriod26.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType34 = mutablePeriod26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(periodType34);
        mutablePeriod21.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod41.addHours((-1));
        org.joda.time.Chronology chronology45 = null;
        mutablePeriod41.setPeriod((long) 100, chronology45);
        mutablePeriod41.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = mutablePeriod41.toDurationFrom(readableInstant49);
        mutablePeriod41.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter53 = null;
        java.lang.String str54 = mutablePeriod41.toString(periodFormatter53);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType70 = null;
        int int71 = mutablePeriod69.indexOf(durationFieldType70);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod76.addHours((-1));
        mutablePeriod69.add((org.joda.time.ReadablePeriod) mutablePeriod76);
        org.joda.time.PeriodType periodType80 = mutablePeriod69.getPeriodType();
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType80, chronology81);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType80);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod41, periodType80, chronology84);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod21, periodType80);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType80);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(periodType80);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod(obj2, periodType80);
        org.joda.time.PeriodType periodType90 = mutablePeriod89.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType90);
        mutablePeriod91.addDays(52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PT1M0.100S" + "'", str54, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(periodType90);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) '#', chronology2);
        mutablePeriod3.addWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant8, readableInstant9, periodType10);
        mutablePeriod11.setMinutes((int) (short) 100);
        org.joda.time.ReadableInterval readableInterval14 = null;
        mutablePeriod11.setPeriod(readableInterval14);
        org.joda.time.MutablePeriod mutablePeriod25 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray26 = mutablePeriod25.getValues();
        int int27 = mutablePeriod25.getHours();
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod25.toMutablePeriod();
        org.joda.time.PeriodType periodType29 = mutablePeriod25.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod11, periodType29, chronology31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) '#', (long) ' ', periodType29);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType29);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        org.joda.time.MutablePeriod mutablePeriod32 = mutablePeriod31.copy();
        int int33 = mutablePeriod31.getYears();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = mutablePeriod6.indexOf(durationFieldType7);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        mutablePeriod6.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.PeriodType periodType17 = mutablePeriod6.getPeriodType();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType17, chronology18);
        org.joda.time.PeriodType periodType20 = mutablePeriod19.getPeriodType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = mutablePeriod4.toDurationTo(readableInstant57);
        mutablePeriod4.addMonths(0);
        mutablePeriod4.addHours(100);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(duration58);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        int int8 = mutablePeriod7.getMinutes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        mutablePeriod4.addDays(100);
        int int12 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 10);
        java.lang.String str2 = mutablePeriod1.toString();
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod1.add((long) '4', chronology4);
        int int6 = mutablePeriod1.getDays();
        int int7 = mutablePeriod1.getMonths();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0.010S" + "'", str2, "PT0.010S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 0, periodType2, chronology3);
        int int5 = mutablePeriod4.getYears();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod10.toDurationFrom(readableInstant11);
        mutablePeriod10.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(10L, periodType16, chronology17);
        int int19 = mutablePeriod18.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod18);
        org.joda.time.DurationFieldType durationFieldType22 = mutablePeriod18.getFieldType((int) (short) 1);
        int int23 = mutablePeriod10.get(durationFieldType22);
        boolean boolean24 = mutablePeriod4.isSupported(durationFieldType22);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addMinutes((int) (byte) -1);
        mutablePeriod29.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod29.toDurationFrom(readableInstant34);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
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
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(readableInstant38, readableInstant39, periodType67);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant37, periodType67);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.MutablePeriod mutablePeriod75 = mutablePeriod74.copy();
        mutablePeriod74.addDays((int) '#');
        mutablePeriod74.addHours(96);
        org.joda.time.Chronology chronology81 = null;
        mutablePeriod74.setPeriod((long) (byte) 10, chronology81);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(mutablePeriod75);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(periodType26);
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod27.add(1L, chronology29);
        org.joda.time.PeriodType periodType31 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, periodType31);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    @Ignore
  public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = mutablePeriod70.toDurationFrom(readableInstant71);
        org.joda.time.format.PeriodFormatter periodFormatter73 = null;
        java.lang.String str74 = mutablePeriod70.toString(periodFormatter73);
        int int75 = mutablePeriod70.getMonths();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "P-4W-1DT-23H-51M-59.965S" + "'", str74, "P-4W-1DT-23H-51M-59.965S");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-48), 35, (-1), (int) (short) 0, 24, 1, (int) (short) 100, 197);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType4);
        int int6 = mutablePeriod5.size();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant7, readableInstant8, periodType9);
        int int11 = mutablePeriod10.size();
        mutablePeriod5.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        boolean boolean14 = mutablePeriod5.equals((java.lang.Object) 0.0d);
        org.joda.time.ReadableInterval readableInterval15 = null;
        mutablePeriod5.setPeriod(readableInterval15);
        org.joda.time.PeriodType periodType17 = mutablePeriod5.getPeriodType();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 10, (long) (short) -1, periodType17, chronology18);
        mutablePeriod19.setMinutes((int) (byte) -1);
        mutablePeriod19.setSeconds(0);
        org.joda.time.Chronology chronology26 = null;
        mutablePeriod19.setPeriod(0L, 100L, chronology26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, chronology1);
        mutablePeriod2.addMillis(8);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(10L, periodType2, chronology3);
        int int5 = mutablePeriod4.getMinutes();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod4.toDurationFrom(readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((java.lang.Object) duration7, chronology9);
        mutablePeriod10.setDays((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod3.setPeriod(readableInterval6);
        int int8 = mutablePeriod3.size();
        int int9 = mutablePeriod3.getMinutes();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(10L, periodType13, chronology14);
        mutablePeriod15.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod15.toDurationFrom(readableInstant19);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod25.toDurationTo(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType38 = null;
        int int39 = mutablePeriod37.indexOf(durationFieldType38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod44.addHours((-1));
        mutablePeriod37.add((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.PeriodType periodType48 = mutablePeriod37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType48, chronology50);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant28, periodType48);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableInstant11, (org.joda.time.ReadableDuration) duration20, periodType48);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod62.addHours((-1));
        org.joda.time.Chronology chronology66 = null;
        mutablePeriod62.setPeriod((long) 100, chronology66);
        mutablePeriod62.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Duration duration71 = mutablePeriod62.toDurationFrom(readableInstant70);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType78 = null;
        int int79 = mutablePeriod77.indexOf(durationFieldType78);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod84.addHours((-1));
        mutablePeriod77.add((org.joda.time.ReadablePeriod) mutablePeriod84);
        org.joda.time.PeriodType periodType88 = mutablePeriod77.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration71, readableInstant72, periodType88);
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 0, periodType88);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant55, periodType88);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType88);
        org.joda.time.Period period93 = mutablePeriod92.toPeriod();
        org.joda.time.ReadableInstant readableInstant94 = null;
        org.joda.time.Duration duration95 = period93.toDurationTo(readableInstant94);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(periodType88);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(duration95);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        mutablePeriod40.setPeriod((int) (short) 10, 24, (int) (byte) 10, 24, (int) '4', 96, 96, 4);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(obj0, periodType1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) '#', chronology4);
        mutablePeriod5.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        mutablePeriod5.setPeriod(readableInstant8, readableInstant9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod5.getFieldTypes();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(10L, periodType13, chronology14);
        int int16 = mutablePeriod15.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod15);
        org.joda.time.DurationFieldType durationFieldType19 = mutablePeriod15.getFieldType((int) (short) 1);
        mutablePeriod5.set(durationFieldType19, (int) '#');
        mutablePeriod2.add(durationFieldType19, 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(durationFieldType19);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        mutablePeriod11.setMonths((int) '4');
        mutablePeriod11.setPeriod((long) 0, (long) 96);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod23.setPeriod((long) 100, chronology27);
        mutablePeriod23.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType31 = mutablePeriod23.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(periodType31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 10, periodType31, chronology33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (short) 100, periodType31);
        mutablePeriod11.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        int int37 = mutablePeriod11.getWeeks();
        mutablePeriod11.addSeconds((-41));
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        int int59 = mutablePeriod56.getDays();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 10, (long) '4', chronology2);
        mutablePeriod3.addMillis((int) '#');
        org.joda.time.MutablePeriod mutablePeriod7 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray8 = mutablePeriod7.getValues();
        int int9 = mutablePeriod7.getHours();
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod7.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod10.toDurationTo(readableInstant11);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration12);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(100L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod10.toDurationFrom(readableInstant11);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod25.addHours((-1));
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod25.setPeriod((long) 100, chronology29);
        mutablePeriod25.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod25.toDurationFrom(readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType41 = null;
        int int42 = mutablePeriod40.indexOf(durationFieldType41);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod47.addHours((-1));
        mutablePeriod40.add((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.PeriodType periodType51 = mutablePeriod40.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant35, periodType51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) (byte) -1, (int) (short) 100, (int) (short) -1, 8, (int) (short) 1, 0, (int) (short) 100, periodType51);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableInstant8, (org.joda.time.ReadableDuration) duration12, periodType51);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) (short) 10, (int) '#', 37, 0, 4, 1, (int) (short) 10, (-48), periodType51);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int int8 = mutablePeriod7.getYears();
        mutablePeriod7.setPeriod((long) (byte) -1);
        int int11 = mutablePeriod7.getHours();
        mutablePeriod7.addMonths((int) (short) 10);
        mutablePeriod7.addDays(97);
        mutablePeriod7.addMonths((int) 'a');
        org.joda.time.format.PeriodFormatter periodFormatter18 = null;
        java.lang.String str19 = mutablePeriod7.toString(periodFormatter18);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P107M97DT0.001S" + "'", str19, "P107M97DT0.001S");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (short) 100, 0, (int) (byte) 1, 52, 52, (int) (short) -1, (int) '4');
        int int9 = mutablePeriod8.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.setValue((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        mutablePeriod3.setPeriod(1L, chronology12);
        mutablePeriod3.setSeconds(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M52.008S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod12.toDurationFrom(readableInstant13);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = mutablePeriod29.indexOf(durationFieldType30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod36.addHours((-1));
        mutablePeriod29.add((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.PeriodType periodType40 = mutablePeriod29.getPeriodType();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType40, chronology41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType40);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant7, (org.joda.time.ReadableDuration) duration14, periodType40);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType40);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (short) -1, periodType40);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(100L, 0L, periodType40);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(100L, (long) (short) 100, periodType40, chronology48);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(periodType40);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration7);
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
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (short) 10, periodType52);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(0L, 1L, periodType52);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType52);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 'a', (long) (short) -1, periodType52, chronology57);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(periodType52);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType52);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 197, (long) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (-1));
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
        mutablePeriod9.addMillis((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = mutablePeriod34.toDurationFrom(readableInstant35);
        mutablePeriod34.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(10L, periodType40, chronology41);
        int int43 = mutablePeriod42.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod42);
        org.joda.time.DurationFieldType durationFieldType46 = mutablePeriod42.getFieldType((int) (short) 1);
        int int47 = mutablePeriod34.get(durationFieldType46);
        mutablePeriod9.add(durationFieldType46, (int) ' ');
        mutablePeriod4.add(durationFieldType46, (int) 'a');
        mutablePeriod2.set(durationFieldType46, 0);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) (-1));
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) '#', (int) (short) 1, (int) (byte) 100, (int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType9 = mutablePeriod7.getFieldType(0);
        int int10 = mutablePeriod2.get(durationFieldType9);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        int int14 = mutablePeriod4.getMillis();
        mutablePeriod4.setDays(1);
        org.joda.time.DurationFieldType durationFieldType18 = mutablePeriod4.getFieldType(0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(durationFieldType18);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.setPeriod((long) (short) 0, chronology3);
        int int5 = mutablePeriod1.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod1.toMutablePeriod();
        int int7 = mutablePeriod6.getMillis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.Object obj3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(obj3);
        org.joda.time.PeriodType periodType5 = mutablePeriod4.getPeriodType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) ' ', periodType5, chronology6);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType5);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (byte) 10, (long) (byte) 100, periodType5);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        mutablePeriod3.addMinutes((int) (short) 1);
        int int9 = mutablePeriod3.getMinutes();
        mutablePeriod3.setPeriod((int) (byte) 10, 8, (int) (byte) -1, (int) (short) 100, (int) (byte) 0, 0, (int) (byte) 10, 1);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutablePeriod3.setPeriod(readablePeriod19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) '#', chronology22);
        mutablePeriod23.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = mutablePeriod32.indexOf(durationFieldType33);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        mutablePeriod32.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.PeriodType periodType43 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod23, periodType43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = mutablePeriod23.toDurationTo(readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant50);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration47);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(duration47);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        mutablePeriod45.setHours((-98));
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, chronology15);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod21.setPeriod((long) 100, chronology25);
        mutablePeriod21.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType29 = mutablePeriod21.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(periodType29);
        mutablePeriod16.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod36.addHours((-1));
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod36.setPeriod((long) 100, chronology40);
        mutablePeriod36.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = mutablePeriod36.toDurationFrom(readableInstant44);
        mutablePeriod36.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter48 = null;
        java.lang.String str49 = mutablePeriod36.toString(periodFormatter48);
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
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod36, periodType75, chronology79);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod16, periodType75);
        mutablePeriod16.addMinutes(10);
        int int84 = mutablePeriod16.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod85 = mutablePeriod16.copy();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PT1M0.100S" + "'", str49, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod85);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', 35, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', (int) (short) 1, (int) (byte) 100, (int) (byte) 0);
        org.joda.time.Period period5 = mutablePeriod4.toPeriod();
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        int int12 = mutablePeriod8.getDays();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType23, chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) '#', chronology27);
        mutablePeriod28.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType38 = null;
        int int39 = mutablePeriod37.indexOf(durationFieldType38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod44.addHours((-1));
        mutablePeriod37.add((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.PeriodType periodType48 = mutablePeriod37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod28, periodType48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((java.lang.Object) periodType23, periodType48, chronology51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) '#', (int) (short) 0, (-1), (int) (byte) -1, 10, (int) (short) 10, 8, periodType48);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 0, periodType55, chronology56);
        int int58 = mutablePeriod57.getYears();
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
        boolean boolean77 = mutablePeriod57.isSupported(durationFieldType75);
        mutablePeriod53.add(durationFieldType75, 97);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.Duration duration81 = mutablePeriod53.toDurationFrom(readableInstant80);
        org.joda.time.Chronology chronology82 = null;
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration81, chronology82);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(duration81);
    }
}

