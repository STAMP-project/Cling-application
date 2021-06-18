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
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) '#', chronology2);
        mutablePeriod3.setPeriod((int) (short) 0, 0, 0, (int) (short) 100, (int) (byte) 10, (int) (short) -1, 4, 1);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        mutablePeriod3.setPeriod(readableInstant13, readableInstant14);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 0, periodType18, chronology19);
        int int21 = mutablePeriod20.getYears();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = mutablePeriod26.toDurationFrom(readableInstant27);
        mutablePeriod26.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(10L, periodType32, chronology33);
        int int35 = mutablePeriod34.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod34);
        org.joda.time.DurationFieldType durationFieldType38 = mutablePeriod34.getFieldType((int) (short) 1);
        int int39 = mutablePeriod26.get(durationFieldType38);
        boolean boolean40 = mutablePeriod20.isSupported(durationFieldType38);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod45.addMinutes((int) (byte) -1);
        mutablePeriod45.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = mutablePeriod45.toDurationFrom(readableInstant50);
        mutablePeriod20.add((org.joda.time.ReadableDuration) duration51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
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
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(readableInstant54, readableInstant55, periodType83);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration51, readableInstant53, periodType83);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((long) 'a', 0L, periodType83, chronology90);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod14, periodType83);
        mutablePeriod14.setMillis((int) (short) 1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0.001S");
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(periodType83);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, (long) 'a');
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod7.toDurationFrom(readableInstant15);
        mutablePeriod7.setHours((int) (short) 0);
        mutablePeriod7.setPeriod((long) 100, (long) (short) 1);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType31 = null;
        int int32 = mutablePeriod30.indexOf(durationFieldType31);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        mutablePeriod30.add((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.PeriodType periodType41 = mutablePeriod30.getPeriodType();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType41, chronology42);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableDuration22, readableInstant23, periodType41);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod44, chronology46);
        mutablePeriod47.setHours((int) (byte) 100);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod58.addHours((-1));
        org.joda.time.Chronology chronology62 = null;
        mutablePeriod58.setPeriod((long) 100, chronology62);
        mutablePeriod58.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = mutablePeriod58.toDurationFrom(readableInstant66);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType74 = null;
        int int75 = mutablePeriod73.indexOf(durationFieldType74);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod80.addHours((-1));
        mutablePeriod73.add((org.joda.time.ReadablePeriod) mutablePeriod80);
        org.joda.time.PeriodType periodType84 = mutablePeriod73.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration67, readableInstant68, periodType84);
        org.joda.time.Chronology chronology86 = null;
        mutablePeriod53.setPeriod((org.joda.time.ReadableDuration) duration67, chronology86);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(readableInstant51, (org.joda.time.ReadableDuration) duration67);
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration67);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(mutablePeriod53);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(periodType84);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.joda.time.Period period55 = mutablePeriod51.toPeriod();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period55);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod8, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod14.setValue(96, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod2.setPeriod(100L, chronology9);
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
        mutablePeriod2.add((org.joda.time.ReadablePeriod) mutablePeriod12);
        int int49 = mutablePeriod2.getValue((int) (byte) 1);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        int int12 = mutablePeriod4.getMillis();
        mutablePeriod4.clear();
        org.joda.time.ReadableInterval readableInterval14 = null;
        mutablePeriod4.add(readableInterval14);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationTo(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) '#', chronology16);
        mutablePeriod17.setMinutes(8);
        mutablePeriod17.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod26.setPeriod((long) 100, chronology30);
        mutablePeriod26.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod26.toDurationFrom(readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant36);
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod17.setPeriod((org.joda.time.ReadableDuration) duration35, chronology38);
        mutablePeriod17.setDays((int) 'a');
        mutablePeriod17.setPeriod((long) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod44 = mutablePeriod17.copy();
        org.joda.time.PeriodType periodType45 = mutablePeriod17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(periodType45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType45);
        mutablePeriod47.addMinutes((int) (byte) -1);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(mutablePeriod44);
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        mutablePeriod4.addSeconds((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod4.toDurationFrom(readableInstant20);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(duration21);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 197, (long) (-1), periodType37);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(87, 10, 24, 35);
        int int5 = mutablePeriod4.getDays();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType13 = null;
        int int14 = mutablePeriod12.indexOf(durationFieldType13);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        mutablePeriod12.add((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.PeriodType periodType23 = mutablePeriod12.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(52, (int) (byte) 1, 35, 1, (-1), 107, (int) (byte) 1, 0, periodType23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        mutablePeriod24.add(readableInterval25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        mutablePeriod14.add(35, (int) '#', (int) (byte) 1, (int) (byte) 10, 32, (int) (byte) 1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97S");
        org.joda.time.DurationFieldType[] durationFieldTypeArray2 = mutablePeriod1.getFieldTypes();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray2);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray24 = mutablePeriod22.getFieldTypes();
        java.lang.Class<?> wildcardClass25 = mutablePeriod22.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 8, 0, 10]");
        org.junit.Assert.assertNotNull(durationFieldTypeArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType13 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(periodType13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 10, periodType13, chronology15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        mutablePeriod16.add(readableInterval17);
        mutablePeriod16.setSeconds((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType21 = null;
        int int22 = mutablePeriod16.get(durationFieldType21);
        mutablePeriod16.setPeriod((long) 8);
        int int25 = mutablePeriod16.getYears();
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PT1M0.100S" + "'", str49, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (short) 100, 1, (int) (short) 1, (int) (byte) 100, (int) (byte) 0, 0, (int) (short) 1);
        mutablePeriod8.addDays((int) (short) 100);
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod8.setPeriod((long) 10, (long) (short) 10, chronology13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod8.toDurationTo(readableInstant15);
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-41), (long) (short) 10, chronology2);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) '#', (int) (short) -1, 35, 97, (int) (short) 0, (int) (short) 1, (int) ' ', (int) ' ');
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod8.add(readableInterval9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        mutablePeriod8.setPeriod(readableInstant11, readableInstant12);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
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
        org.joda.time.Period period42 = mutablePeriod41.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) (byte) 100, (int) '4', (int) '#', (int) (byte) 1, (int) (short) -1, (int) ' ', 10, (int) '#');
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) '#', chronology53);
        mutablePeriod54.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType64 = null;
        int int65 = mutablePeriod63.indexOf(durationFieldType64);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod70.addHours((-1));
        mutablePeriod63.add((org.joda.time.ReadablePeriod) mutablePeriod70);
        org.joda.time.PeriodType periodType74 = mutablePeriod63.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType74);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod54, periodType74);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.Duration duration78 = mutablePeriod54.toDurationTo(readableInstant77);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration78, readableInstant79);
        org.joda.time.Chronology chronology81 = null;
        mutablePeriod51.setPeriod((org.joda.time.ReadableDuration) duration78, chronology81);
        mutablePeriod41.setPeriod((org.joda.time.ReadableDuration) duration78);
        boolean boolean84 = mutablePeriod4.equals((java.lang.Object) mutablePeriod41);
        org.joda.time.DurationFieldType[] durationFieldTypeArray85 = mutablePeriod41.getFieldTypes();
        int int86 = mutablePeriod41.getMinutes();
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(duration78);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) 8, 100L, chronology6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod3.add((long) 8, chronology9);
        mutablePeriod3.setPeriod((long) '4', (long) 4);
        int int14 = mutablePeriod3.getMillis();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-48) + "'", int14 == (-48));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, (long) 10, chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        mutablePeriod3.setPeriod(readableInstant4, readableInstant5);
        mutablePeriod3.addHours((int) (short) -1);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P100M10W1DT10M0.948S");
        mutablePeriod1.setSeconds((int) (byte) 1);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod8.addHours((-1));
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.setPeriod((long) 100, chronology12);
        mutablePeriod8.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType16 = mutablePeriod8.getPeriodType();
        mutablePeriod1.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        int int18 = mutablePeriod1.getWeeks();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) '#', chronology20);
        mutablePeriod21.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        mutablePeriod21.setPeriod(readableInstant24, readableInstant25);
        org.joda.time.DurationFieldType[] durationFieldTypeArray27 = mutablePeriod21.getFieldTypes();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(10L, periodType29, chronology30);
        int int32 = mutablePeriod31.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod31);
        org.joda.time.DurationFieldType durationFieldType35 = mutablePeriod31.getFieldType((int) (short) 1);
        mutablePeriod21.set(durationFieldType35, (int) '#');
        int int38 = mutablePeriod1.get(durationFieldType35);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-48), 8, (-48), (int) (byte) 1, (int) (short) 0, (int) '#', (int) (byte) 1, 100);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((java.lang.Object) int4, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT97H1M0.097S" + "'", str10, "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M0.009S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod10.toDurationTo(readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType47 = null;
        int int48 = mutablePeriod46.indexOf(durationFieldType47);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod53.addHours((-1));
        mutablePeriod46.add((org.joda.time.ReadablePeriod) mutablePeriod53);
        org.joda.time.PeriodType periodType57 = mutablePeriod46.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType57);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant39, periodType57);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) (byte) 100, (int) (short) 0, 35, 52, (int) (byte) -1, (int) (short) -1, (int) (byte) -1, (int) (byte) 10, periodType57);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(periodType57);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        mutablePeriod4.setPeriod((long) 100, (long) (short) 1);
        java.lang.String str19 = mutablePeriod4.toString();
        org.joda.time.PeriodType periodType20 = mutablePeriod4.getPeriodType();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0.099S" + "'", str19, "PT0.099S");
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        java.lang.String str7 = mutablePeriod3.toString();
        mutablePeriod3.addHours((int) (byte) 0);
        mutablePeriod3.setSeconds(35);
        mutablePeriod3.addMinutes(0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT100M" + "'", str7, "PT100M");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT97H1M0.097S" + "'", str10, "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT97H1M197.097S" + "'", str17, "PT97H1M197.097S");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', 0, 52, 52, 8, (int) (byte) 10, (int) '#', 1);
        mutablePeriod8.addSeconds(0);
        mutablePeriod8.setHours(0);
        mutablePeriod8.setPeriod(10L);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod8.add((long) (short) 0, chronology16);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(35, 0, (int) (byte) -1, (-1));
        int int5 = mutablePeriod4.getMonths();
        mutablePeriod4.addMinutes((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setMillis((int) (byte) 10);
        mutablePeriod0.addMinutes((int) (byte) -1);
        mutablePeriod0.setMonths((int) (byte) 1);
        mutablePeriod0.addMonths(1);
        mutablePeriod0.addDays(0);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        mutablePeriod14.setHours((int) (byte) 10);
        mutablePeriod14.add((long) 8);
        org.joda.time.Chronology chronology69 = null;
        mutablePeriod14.setPeriod((long) (short) -1, (long) (short) 10, chronology69);
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
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.setPeriod((long) 0, (long) (short) 1);
        mutablePeriod4.addMinutes(87);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) periodType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 100, periodType37, chronology41);
        mutablePeriod42.add((long) '#');
        mutablePeriod42.addHours((int) (short) 0);
        int int47 = mutablePeriod42.getHours();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod42, chronology48);
        org.joda.time.PeriodType periodType50 = mutablePeriod42.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType50);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(periodType50);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.MutablePeriod mutablePeriod9 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray10 = mutablePeriod9.getValues();
        int int11 = mutablePeriod9.getHours();
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod9.toMutablePeriod();
        org.joda.time.PeriodType periodType13 = mutablePeriod9.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType13);
        org.joda.time.ReadableInterval readableInterval15 = null;
        mutablePeriod14.setPeriod(readableInterval15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        mutablePeriod14.setPeriod(readableInstant17, readableInstant18);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        int int12 = mutablePeriod4.getYears();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(0L, (long) (short) 1);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        mutablePeriod4.setDays((int) (short) 10);
        int int22 = mutablePeriod4.getMonths();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.Object obj1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(obj1);
        org.joda.time.PeriodType periodType3 = mutablePeriod2.getPeriodType();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) ' ', periodType3, chronology4);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(periodType3);
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object) periodType3, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
    }
}

