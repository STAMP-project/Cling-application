import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        mutablePeriod15.clear();
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = mutablePeriod1.isSupported(durationFieldType12);
        mutablePeriod1.addMillis(10);
        mutablePeriod1.setPeriod((-1L));
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.joda.time.MutablePeriod mutablePeriod9 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray10 = mutablePeriod9.getValues();
        int int11 = mutablePeriod9.getHours();
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod9.toMutablePeriod();
        org.joda.time.PeriodType periodType13 = mutablePeriod9.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType13);
        org.joda.time.ReadableInterval readableInterval15 = null;
        mutablePeriod14.setPeriod(readableInterval15);
        int int17 = mutablePeriod14.size();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod14.toDurationTo(readableInstant18);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        mutablePeriod31.setPeriod((long) 8, 1L);
        mutablePeriod31.setPeriod(1L);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) '#', chronology47);
        mutablePeriod48.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        mutablePeriod48.setPeriod(readableInstant51, readableInstant52);
        mutablePeriod48.add(97, (int) 'a', 0, (int) (short) 100, (int) (short) 100, (int) (short) 10, (int) ' ', 1);
        int[] intArray63 = mutablePeriod48.getValues();
        boolean boolean64 = mutablePeriod1.equals((java.lang.Object) intArray63);
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
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[97, 97, 0, 100, 100, 10, 32, 1]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (short) -1, chronology25);
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = mutablePeriod26.indexOf(durationFieldType27);
        mutablePeriod26.addYears((int) (short) 1);
        mutablePeriod26.setDays((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        mutablePeriod37.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod37.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant49);
        mutablePeriod26.setPeriod((org.joda.time.ReadableDuration) duration46);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant52);
        mutablePeriod22.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod53);
        org.joda.time.MutablePeriod mutablePeriod55 = mutablePeriod53.copy();
        org.joda.time.DurationFieldType[] durationFieldTypeArray56 = mutablePeriod53.getFieldTypes();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 8, 0, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(durationFieldTypeArray56);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', (int) 'a', 52, (int) '#');
        org.joda.time.ReadableInterval readableInterval5 = null;
        mutablePeriod4.setPeriod(readableInterval5);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) 0);
        mutablePeriod1.setMonths(0);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.addHours((int) '#');
        mutablePeriod5.setMillis(97);
        int int15 = mutablePeriod5.getMillis();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod21.setPeriod((long) 100, chronology25);
        mutablePeriod21.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod21.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableInstant16, (org.joda.time.ReadableDuration) duration30, periodType33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration30, chronology35);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod();
        mutablePeriod37.setMillis((int) (byte) 10);
        mutablePeriod37.addMinutes((int) (byte) -1);
        mutablePeriod37.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType44 = mutablePeriod37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration30, periodType44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(periodType44);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod4.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant8, readableInstant9, periodType10);
        mutablePeriod11.setMinutes((int) (short) 100);
        org.joda.time.Period period14 = mutablePeriod11.toPeriod();
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) period14);
        mutablePeriod4.setHours(10);
        mutablePeriod4.setPeriod((long) (-98), (long) 32);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        mutablePeriod14.add((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.PeriodType periodType25 = mutablePeriod14.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType25, chronology26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration7, periodType25);
        mutablePeriod28.setPeriod((long) (-1), 10L);
        org.joda.time.PeriodType periodType32 = mutablePeriod28.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType32);
        mutablePeriod33.add((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(10L, periodType38, chronology39);
        mutablePeriod40.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = mutablePeriod40.toDurationFrom(readableInstant44);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = mutablePeriod50.toDurationTo(readableInstant51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType63 = null;
        int int64 = mutablePeriod62.indexOf(durationFieldType63);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod69.addHours((-1));
        mutablePeriod62.add((org.joda.time.ReadablePeriod) mutablePeriod69);
        org.joda.time.PeriodType periodType73 = mutablePeriod62.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType73);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType73, chronology75);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration52, readableInstant53, periodType73);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(readableInstant36, (org.joda.time.ReadableDuration) duration45, periodType73);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod();
        mutablePeriod81.setMillis((int) (byte) 10);
        mutablePeriod81.addMinutes((int) (byte) -1);
        mutablePeriod81.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType88 = mutablePeriod81.getPeriodType();
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType88, chronology89);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration45, readableInstant79, periodType88);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((java.lang.Object) (byte) 10, periodType88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(periodType88);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-41), (long) 52, chronology2);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.lang.Object obj1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(obj1);
        org.joda.time.PeriodType periodType3 = mutablePeriod2.getPeriodType();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) ' ', periodType3, chronology4);
        mutablePeriod5.addYears(52);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        mutablePeriod4.setSeconds((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType48 = null;
        int int49 = mutablePeriod47.indexOf(durationFieldType48);
        mutablePeriod37.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType56 = null;
        int int57 = mutablePeriod55.indexOf(durationFieldType56);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod62.addHours((-1));
        mutablePeriod55.add((org.joda.time.ReadablePeriod) mutablePeriod62);
        mutablePeriod55.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(readableInstant68, readableInstant69, periodType70);
        mutablePeriod71.setMinutes((int) (short) 100);
        org.joda.time.Period period74 = mutablePeriod71.toPeriod();
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
        boolean boolean93 = period74.isSupported(durationFieldType91);
        boolean boolean94 = mutablePeriod55.isSupported(durationFieldType91);
        int int95 = mutablePeriod47.get(durationFieldType91);
        int int96 = mutablePeriod4.indexOf(durationFieldType91);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(durationFieldType91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod2.getYears();
        mutablePeriod2.clear();
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod2.add((long) (-1), chronology11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) '#', chronology14);
        mutablePeriod15.setMinutes(8);
        mutablePeriod15.setYears((int) (short) -1);
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
        int int54 = mutablePeriod15.get(durationFieldType50);
        mutablePeriod15.setMonths((int) (byte) 0);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        mutablePeriod32.addMinutes(96);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray44);
        org.junit.Assert.assertNotNull(durationFieldType46);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT0.100S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        // The following exception was thrown during execution in test generation
        try {
            int int27 = mutablePeriod4.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.setSeconds((int) '4');
        java.lang.String str9 = mutablePeriod4.toString();
        int int10 = mutablePeriod4.getMillis();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT97H1M52.097S" + "'", str9, "PT97H1M52.097S");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-1), (int) (byte) -1, 8, 52, 1, 0, 97, (int) (short) 1);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-98), (long) '#', chronology2);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (short) -1, periodType37);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType37, chronology44);
        java.lang.Class<?> wildcardClass46 = periodType37.getClass();
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        mutablePeriod4.setMinutes((int) (byte) 0);
        mutablePeriod4.addWeeks((int) '#');
        org.joda.time.ReadableDuration readableDuration62 = null;
        mutablePeriod4.add(readableDuration62);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 52, 0, 0, 1, 0, 297]");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        mutablePeriod4.addYears((int) 'a');
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 10, chronology22);
        org.joda.time.MutablePeriod mutablePeriod24 = mutablePeriod23.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod24.toDurationTo(readableInstant25);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration26);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod24);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod40.setPeriod((long) '4', chronology46);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod3.toDurationFrom(readableInstant7);
        mutablePeriod3.setPeriod((long) '4', (long) (byte) 100);
        mutablePeriod3.setPeriod((long) 10);
        mutablePeriod3.setMonths(100);
        mutablePeriod3.addSeconds(97);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = mutablePeriod27.toDurationFrom(readableInstant28);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = mutablePeriod36.indexOf(durationFieldType37);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        mutablePeriod36.add((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.PeriodType periodType47 = mutablePeriod36.getPeriodType();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType47, chronology48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(readableInstant23, (org.joda.time.ReadableDuration) duration29, periodType47);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType47, chronology51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableInstant20, readableInstant21, periodType47);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(0L, (-1L), periodType47, chronology54);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType47);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(periodType47);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        mutablePeriod4.add(35, 0, 1, 107, 197, (int) '4', 8, 4);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        mutablePeriod25.addWeeks((int) (byte) -1);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        int[] intArray14 = mutablePeriod4.getValues();
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod4.getFieldType(1);
        int[] intArray17 = mutablePeriod4.getValues();
        mutablePeriod4.add(10L);
        int int20 = mutablePeriod4.size();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 35, 0, 0, 97]");
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 35, 0, 0, 97]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod2.add((long) (short) -1, chronology4);
        mutablePeriod2.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod12.toDurationFrom(readableInstant13);
        mutablePeriod12.addMonths((int) (short) 0);
        mutablePeriod12.setYears((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = mutablePeriod23.toDurationFrom(readableInstant24);
        mutablePeriod23.setSeconds((int) '4');
        java.lang.String str28 = mutablePeriod23.toString();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) '#', chronology30);
        mutablePeriod31.setMinutes(8);
        mutablePeriod31.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod40.setPeriod((long) 100, chronology44);
        mutablePeriod40.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = mutablePeriod40.toDurationFrom(readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration49, readableInstant50);
        org.joda.time.Chronology chronology52 = null;
        mutablePeriod31.setPeriod((org.joda.time.ReadableDuration) duration49, chronology52);
        mutablePeriod31.setHours((int) '4');
        mutablePeriod31.addMillis(8);
        mutablePeriod23.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod31);
        mutablePeriod31.clear();
        int int61 = mutablePeriod31.getValue((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Duration duration68 = mutablePeriod66.toDurationFrom(readableInstant67);
        mutablePeriod66.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(10L, periodType72, chronology73);
        int int75 = mutablePeriod74.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod74);
        org.joda.time.DurationFieldType durationFieldType78 = mutablePeriod74.getFieldType((int) (short) 1);
        int int79 = mutablePeriod66.get(durationFieldType78);
        mutablePeriod31.add(durationFieldType78, (int) (short) 1);
        mutablePeriod12.add(durationFieldType78, 8);
        int int84 = mutablePeriod2.get(durationFieldType78);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT97H1M52.097S" + "'", str28, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        mutablePeriod2.add(readableInterval8);
        mutablePeriod2.setYears(52);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) 8, 100L, chronology6);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod3.indexOf(durationFieldType8);
        mutablePeriod3.setSeconds((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod10.toDurationFrom(readableInstant11);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType30, chronology31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant6, (org.joda.time.ReadableDuration) duration12, periodType30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType30, chronology34);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType30);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, (-1L), periodType30, chronology37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 87, periodType30);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        int int28 = mutablePeriod4.getMillis();
        org.joda.time.Chronology chronology29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((java.lang.Object) int28, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        mutablePeriod3.setPeriod(0L);
        mutablePeriod3.setPeriod(100, 35, (int) (byte) 10, 96, (-41), (int) (byte) -1, 24, 87);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        mutablePeriod72.addMillis(96);
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) (byte) 10);
        mutablePeriod4.setMonths((int) '4');
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
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 0, periodType35);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) 1, periodType35);
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod40);
        int int42 = mutablePeriod4.getSeconds();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType13 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 0, periodType13);
        org.joda.time.ReadableInterval readableInterval16 = null;
        mutablePeriod15.add(readableInterval16);
        java.lang.Object obj18 = mutablePeriod15.clone();
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "PT0S");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        mutablePeriod4.setHours((int) (short) -1);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.Object obj1 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(10L, periodType12, chronology13);
        mutablePeriod14.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod14.toDurationFrom(readableInstant18);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod24.toDurationTo(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
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
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType47);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration19, periodType47);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(97, (int) 'a', (int) (byte) 0, 100, (-1), 100, (int) (short) 0, 1, periodType47);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(periodType47);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(obj1, periodType47);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(periodType47);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) (short) 10, periodType47);
        mutablePeriod57.setSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod57.setValue((int) '4', 107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(periodType47);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        mutablePeriod24.setDays((int) '#');
        org.joda.time.ReadableInterval readableInterval48 = null;
        mutablePeriod24.setPeriod(readableInterval48);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod54.addHours((-1));
        mutablePeriod54.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType59 = null;
        int int60 = mutablePeriod54.get(durationFieldType59);
        org.joda.time.ReadableInterval readableInterval61 = null;
        mutablePeriod54.setPeriod(readableInterval61);
        boolean boolean63 = mutablePeriod24.equals((java.lang.Object) mutablePeriod54);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        mutablePeriod2.add(readableInterval8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(10L, periodType14, chronology15);
        mutablePeriod16.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod16.toDurationFrom(readableInstant20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType27 = mutablePeriod26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant12, (org.joda.time.ReadableDuration) duration21, periodType27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableInstant10, readableInstant11, periodType27);
        mutablePeriod2.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.MutablePeriod mutablePeriod31 = mutablePeriod2.copy();
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(mutablePeriod31);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        mutablePeriod49.clear();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        int int27 = mutablePeriod4.getValue(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = mutablePeriod4.toDurationTo(readableInstant28);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(duration29);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        mutablePeriod2.setWeeks(0);
        mutablePeriod2.addHours((int) (short) -1);
        org.junit.Assert.assertNotNull(mutablePeriod8);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType12 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(periodType12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutablePeriod13.setPeriod(readableInstant14, readableInstant15);
        int int17 = mutablePeriod13.getMinutes();
        mutablePeriod13.setYears((int) ' ');
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (short) 100, 1, (int) (short) 1, (int) (byte) 100, (int) (byte) 0, 0, (int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod40 = mutablePeriod39.copy();
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod39);
        mutablePeriod27.setMillis((int) 'a');
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "P10Y100M1W1DT100H0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "P10Y100M1W1DT100H0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "P10Y100M1W1DT100H0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod40);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M52.097S");
        java.lang.Object obj2 = null;
        boolean boolean3 = mutablePeriod1.equals(obj2);
        mutablePeriod1.setDays(0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        int int18 = mutablePeriod2.getMinutes();
        mutablePeriod2.setMonths(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', 8, 100, (int) (short) 1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod4.setPeriod(readableInstant5, readableInstant6);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 24);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        mutablePeriod6.setMillis(1);
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
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod3.add((long) 'a', chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod3.setPeriod(readableInstant9, readableInstant10);
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod3.toMutablePeriod();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod12);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod5.toDurationFrom(readableInstant13);
        mutablePeriod5.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant17, readableInstant18, periodType19);
        int int21 = mutablePeriod20.size();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant22, readableInstant23, periodType24);
        int int26 = mutablePeriod25.size();
        mutablePeriod20.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod25);
        boolean boolean28 = mutablePeriod5.equals((java.lang.Object) mutablePeriod25);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(10L, periodType31, chronology32);
        mutablePeriod33.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod33.toDurationFrom(readableInstant37);
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
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(readableInstant29, (org.joda.time.ReadableDuration) duration38, periodType66);
        org.joda.time.Chronology chronology72 = null;
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration38, chronology72);
        int int74 = mutablePeriod5.getMonths();
        org.joda.time.DurationFieldType[] durationFieldTypeArray75 = mutablePeriod5.getFieldTypes();
        int int76 = mutablePeriod5.getWeeks();
        int int77 = mutablePeriod5.size();
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Duration duration79 = mutablePeriod5.toDurationFrom(readableInstant78);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration79);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 8 + "'", int77 == 8);
        org.junit.Assert.assertNotNull(duration79);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (short) -1, chronology25);
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = mutablePeriod26.indexOf(durationFieldType27);
        mutablePeriod26.addYears((int) (short) 1);
        mutablePeriod26.setDays((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        mutablePeriod37.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod37.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant49);
        mutablePeriod26.setPeriod((org.joda.time.ReadableDuration) duration46);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant52);
        mutablePeriod22.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod53);
        mutablePeriod22.setMillis(87);
        org.joda.time.format.PeriodFormatter periodFormatter57 = null;
        java.lang.String str58 = mutablePeriod22.toString(periodFormatter57);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 8, 0, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0.087S" + "'", str58, "PT0.087S");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) (byte) 10);
        int int3 = mutablePeriod2.getHours();
        java.lang.Class<?> wildcardClass4 = mutablePeriod2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 52, (long) (-1));
        int int3 = mutablePeriod2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, (long) (byte) 10, chronology2);
        mutablePeriod3.addHours((int) ' ');
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod40.setPeriod((long) 100, chronology44);
        mutablePeriod40.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = mutablePeriod40.toDurationFrom(readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration49, readableInstant50);
        mutablePeriod51.setPeriod((long) 8, 10L);
        mutablePeriod24.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.Period period56 = mutablePeriod24.toPeriod();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period56);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        mutablePeriod2.setWeeks(0);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod14.toDurationFrom(readableInstant15);
        org.joda.time.MutablePeriod mutablePeriod17 = mutablePeriod14.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType23 = mutablePeriod22.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        org.joda.time.Chronology chronology32 = null;
        mutablePeriod28.setPeriod((long) 100, chronology32);
        mutablePeriod28.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = mutablePeriod28.toDurationFrom(readableInstant36);
        mutablePeriod28.addMinutes((int) (byte) 1);
        mutablePeriod22.add((org.joda.time.ReadablePeriod) mutablePeriod28);
        mutablePeriod22.addMillis((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType48 = mutablePeriod47.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod53.addHours((-1));
        org.joda.time.Chronology chronology57 = null;
        mutablePeriod53.setPeriod((long) 100, chronology57);
        mutablePeriod53.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = mutablePeriod53.toDurationFrom(readableInstant61);
        mutablePeriod53.addMinutes((int) (byte) 1);
        mutablePeriod47.add((org.joda.time.ReadablePeriod) mutablePeriod53);
        mutablePeriod47.addMillis((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Duration duration74 = mutablePeriod72.toDurationFrom(readableInstant73);
        mutablePeriod72.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod(10L, periodType78, chronology79);
        int int81 = mutablePeriod80.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod80);
        org.joda.time.DurationFieldType durationFieldType84 = mutablePeriod80.getFieldType((int) (short) 1);
        int int85 = mutablePeriod72.get(durationFieldType84);
        mutablePeriod47.add(durationFieldType84, (int) ' ');
        int int88 = mutablePeriod22.indexOf(durationFieldType84);
        int int89 = mutablePeriod17.indexOf(durationFieldType84);
        int int90 = mutablePeriod2.get(durationFieldType84);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '4', 100L, chronology2);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        int[] intArray14 = mutablePeriod4.getValues();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod20.setPeriod((long) 100, chronology24);
        mutablePeriod20.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = mutablePeriod20.toDurationFrom(readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, readableInstant30);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant15, (org.joda.time.ReadableDuration) duration29, periodType32);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration29);
        int int35 = mutablePeriod4.getHours();
        int int36 = mutablePeriod4.getSeconds();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 35, 0, 0, 97]");
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType13 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 0, periodType13);
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
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) '#', chronology72);
        mutablePeriod73.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType83 = null;
        int int84 = mutablePeriod82.indexOf(durationFieldType83);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod89.addHours((-1));
        mutablePeriod82.add((org.joda.time.ReadablePeriod) mutablePeriod89);
        org.joda.time.PeriodType periodType93 = mutablePeriod82.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType93);
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod73, periodType93);
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod(1L, (long) '4', periodType93);
        org.joda.time.MutablePeriod mutablePeriod97 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant68, periodType93);
        org.joda.time.MutablePeriod mutablePeriod98 = new org.joda.time.MutablePeriod((long) (short) 10, (long) (short) 10, periodType93);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod99 = new org.joda.time.MutablePeriod((java.lang.Object) periodType13, periodType93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(periodType93);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = mutablePeriod1.toDurationFrom(readableInstant2);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod8.addHours((-1));
        mutablePeriod8.addMonths((int) (byte) -1);
        int int13 = mutablePeriod8.getMinutes();
        mutablePeriod8.add((long) (byte) 10);
        mutablePeriod1.add((org.joda.time.ReadablePeriod) mutablePeriod8);
        mutablePeriod8.addMillis((int) '#');
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType24 = mutablePeriod23.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod29.setPeriod((long) 100, chronology33);
        mutablePeriod29.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod29.toDurationFrom(readableInstant37);
        mutablePeriod29.addMinutes((int) (byte) 1);
        mutablePeriod23.add((org.joda.time.ReadablePeriod) mutablePeriod29);
        mutablePeriod23.addMillis((int) (short) 100);
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
        mutablePeriod23.add(durationFieldType60, (int) ' ');
        int int64 = mutablePeriod8.indexOf(durationFieldType60);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod37);
        mutablePeriod37.setPeriod(100L, (long) (byte) -1);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(periodType42);
        mutablePeriod43.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod53 = mutablePeriod43.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType54 = null;
        boolean boolean55 = mutablePeriod43.isSupported(durationFieldType54);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(periodType56);
        org.joda.time.Chronology chronology59 = null;
        mutablePeriod57.add(1L, chronology59);
        mutablePeriod57.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(readableInstant63, readableInstant64, periodType65);
        mutablePeriod66.setMinutes((int) (short) 100);
        org.joda.time.Period period69 = mutablePeriod66.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.Duration duration76 = mutablePeriod74.toDurationFrom(readableInstant75);
        mutablePeriod74.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(10L, periodType80, chronology81);
        int int83 = mutablePeriod82.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod82);
        org.joda.time.DurationFieldType durationFieldType86 = mutablePeriod82.getFieldType((int) (short) 1);
        int int87 = mutablePeriod74.get(durationFieldType86);
        boolean boolean88 = period69.isSupported(durationFieldType86);
        int int89 = mutablePeriod57.indexOf(durationFieldType86);
        int int90 = mutablePeriod43.indexOf(durationFieldType86);
        int int91 = mutablePeriod37.get(durationFieldType86);
        mutablePeriod35.set(durationFieldType86, 8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(mutablePeriod53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        java.lang.String str35 = mutablePeriod4.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT1M0.100S" + "'", str35, "PT1M0.100S");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        org.joda.time.PeriodType periodType31 = mutablePeriod27.getPeriodType();
        mutablePeriod27.setSeconds((int) (byte) 100);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        int int9 = mutablePeriod4.getYears();
        mutablePeriod4.setHours(0);
        mutablePeriod4.addYears(97);
        int int14 = mutablePeriod4.getMillis();
        org.joda.time.Period period15 = mutablePeriod4.toPeriod();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        int[] intArray14 = mutablePeriod4.getValues();
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod4.getFieldType(1);
        org.joda.time.Period period17 = mutablePeriod4.toPeriod();
        int int18 = mutablePeriod4.getYears();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 35, 0, 0, 97]");
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType14 = mutablePeriod6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(0L, (long) (short) 100, periodType14);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType14);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod();
        mutablePeriod17.addMillis(1);
        mutablePeriod16.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        java.lang.Class<?> wildcardClass21 = mutablePeriod17.getClass();
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType33, chronology34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        mutablePeriod35.setPeriod(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant39, readableInstant40, periodType41);
        mutablePeriod42.setMinutes((int) (short) 100);
        org.joda.time.Period period45 = mutablePeriod42.toPeriod();
        mutablePeriod35.setPeriod((org.joda.time.ReadablePeriod) period45);
        boolean boolean47 = mutablePeriod30.equals((java.lang.Object) mutablePeriod35);
        int[] intArray48 = mutablePeriod35.getValues();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 0, 0, 0, 100, 0, 0]");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        mutablePeriod7.setDays((-1));
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = mutablePeriod7.get(durationFieldType10);
        org.joda.time.Chronology chronology12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((java.lang.Object) int11, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod8.indexOf(durationFieldType9);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod15.addHours((-1));
        mutablePeriod8.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.PeriodType periodType19 = mutablePeriod8.getPeriodType();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType19, chronology20);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType19);
        mutablePeriod22.addMillis((-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = mutablePeriod3.toDurationFrom(readableInstant54);
        mutablePeriod3.setMinutes(0);
        org.joda.time.Chronology chronology59 = null;
        mutablePeriod3.add((long) 107, chronology59);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration55);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 10, 8, (int) (short) 100, (int) (byte) -1);
        int int5 = mutablePeriod4.getMonths();
        int int6 = mutablePeriod4.getWeeks();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        mutablePeriod27.setDays((int) (byte) 1);
        int int31 = mutablePeriod27.getMinutes();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-1), (int) (short) 10, 100, 97);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType7);
        mutablePeriod8.setMinutes((int) (short) 100);
        org.joda.time.Period period11 = mutablePeriod8.toPeriod();
        java.lang.String str12 = mutablePeriod8.toString();
        mutablePeriod8.addHours((int) (byte) 0);
        mutablePeriod8.addMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = mutablePeriod8.toDurationFrom(readableInstant17);
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration18, chronology19);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT100M" + "'", str12, "PT100M");
        org.junit.Assert.assertNotNull(duration18);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(52, 24, (int) '#', (-98), 32, 100, 96, 24);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, chronology1);
        org.joda.time.ReadableInterval readableInterval3 = null;
        mutablePeriod2.setPeriod(readableInterval3);
        java.lang.Object obj5 = mutablePeriod2.clone();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "PT0S");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 100, chronology1);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        int int3 = mutablePeriod1.getHours();
        mutablePeriod1.addMinutes((int) (byte) 100);
        java.lang.Object obj6 = mutablePeriod1.clone();
        mutablePeriod1.addDays((int) (byte) 1);
        mutablePeriod1.setDays(96);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "P96DT97H101M0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "P96DT97H101M0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "P96DT97H101M0.097S");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '4', (long) (byte) -1, chronology2);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 100, periodType22, chronology27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(100L, periodType22);
        mutablePeriod29.addSeconds(52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        org.joda.time.DurationFieldType durationFieldType13 = mutablePeriod3.getFieldType((int) (short) 0);
        mutablePeriod3.addDays((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(durationFieldType13);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 10, chronology1);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.toMutablePeriod();
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) (byte) 100, (long) 35, chronology6);
        java.lang.Class<?> wildcardClass8 = mutablePeriod3.getClass();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        int int71 = mutablePeriod4.getWeeks();
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod2.getYears();
        mutablePeriod2.clear();
        int int10 = mutablePeriod2.getHours();
        mutablePeriod2.setSeconds((int) (short) -1);
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod2.add(10L, chronology14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        mutablePeriod22.setPeriod((int) (byte) -1, (int) (byte) 1, 100, 87, 87, (int) ' ', 197, 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 8, 0, 10]");
        org.junit.Assert.assertNotNull(durationFieldTypeArray24);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 0, (-1L));
        mutablePeriod2.setYears((int) ' ');
        int int5 = mutablePeriod2.getDays();
        mutablePeriod2.setYears((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant25, chronology27);
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod10.setPeriod((-1L), chronology12);
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod10.add(0L, chronology15);
        org.joda.time.PeriodType periodType17 = mutablePeriod10.getPeriodType();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) (short) 0, periodType17, chronology18);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        mutablePeriod4.clear();
        int int10 = mutablePeriod4.getMinutes();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        org.joda.time.DurationFieldType durationFieldType7 = mutablePeriod3.getFieldType((int) (short) 1);
        org.joda.time.ReadableInterval readableInterval8 = null;
        mutablePeriod3.add(readableInterval8);
        mutablePeriod3.addMinutes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("P52W32DT1M0.197S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType15 = mutablePeriod7.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) '4', periodType15, chronology17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType15);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        org.joda.time.MutablePeriod mutablePeriod17 = mutablePeriod4.copy();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(mutablePeriod17);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType7 = mutablePeriod6.getPeriodType();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 8, (long) 10, periodType7, chronology8);
        mutablePeriod9.addMonths(32);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.lang.Object obj8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType16 = null;
        int int17 = mutablePeriod15.indexOf(durationFieldType16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addHours((-1));
        mutablePeriod15.add((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod15, chronology26);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod32.setPeriod((long) 100, chronology36);
        mutablePeriod32.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType40 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(periodType40);
        mutablePeriod27.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod47.addHours((-1));
        org.joda.time.Chronology chronology51 = null;
        mutablePeriod47.setPeriod((long) 100, chronology51);
        mutablePeriod47.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = mutablePeriod47.toDurationFrom(readableInstant55);
        mutablePeriod47.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter59 = null;
        java.lang.String str60 = mutablePeriod47.toString(periodFormatter59);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType76 = null;
        int int77 = mutablePeriod75.indexOf(durationFieldType76);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod82.addHours((-1));
        mutablePeriod75.add((org.joda.time.ReadablePeriod) mutablePeriod82);
        org.joda.time.PeriodType periodType86 = mutablePeriod75.getPeriodType();
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType86, chronology87);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType86);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod47, periodType86, chronology90);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod27, periodType86);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod(readableInstant9, readableInstant10, periodType86);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod(periodType86);
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod(obj8, periodType86);
        org.joda.time.PeriodType periodType96 = mutablePeriod95.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod97 = new org.joda.time.MutablePeriod(10, 10, 0, (int) ' ', 52, (int) ' ', (int) '#', (-41), periodType96);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT1M0.100S" + "'", str60, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(periodType86);
        org.junit.Assert.assertNotNull(periodType96);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setSeconds(8);
        org.joda.time.PeriodType periodType12 = mutablePeriod4.getPeriodType();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 0, periodType15, chronology16);
        int int18 = mutablePeriod17.getYears();
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
        boolean boolean37 = mutablePeriod17.isSupported(durationFieldType35);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addMinutes((int) (byte) -1);
        mutablePeriod42.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod42.toDurationFrom(readableInstant47);
        mutablePeriod17.add((org.joda.time.ReadableDuration) duration48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
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
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(readableInstant51, readableInstant52, periodType80);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration48, readableInstant50, periodType80);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(readableInstant13, (org.joda.time.ReadableDuration) duration48);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration48);
        mutablePeriod4.addMillis(1);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(periodType80);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        int[] intArray59 = mutablePeriod55.getValues();
        org.joda.time.ReadableInterval readableInterval60 = null;
        mutablePeriod55.setPeriod(readableInterval60);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0, 0, 0, 0, 0, 9]");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        java.lang.String str7 = mutablePeriod3.toString();
        mutablePeriod3.addHours((int) (byte) 0);
        mutablePeriod3.addMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutablePeriod3.setPeriod(readableInstant14, readableInstant15);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT100M" + "'", str7, "PT100M");
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', (int) (short) 1, (int) (byte) 100, (int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = mutablePeriod9.indexOf(durationFieldType10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod16.addHours((-1));
        mutablePeriod9.add((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod9, chronology20);
        boolean boolean22 = mutablePeriod4.equals((java.lang.Object) mutablePeriod21);
        mutablePeriod21.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 100, (long) (-1));
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        mutablePeriod2.setPeriod(readablePeriod3);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        int int9 = mutablePeriod2.getValue((int) (short) 0);
        mutablePeriod2.clear();
        mutablePeriod2.addHours((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        mutablePeriod4.add((int) (short) 1, 0, (-1), (int) ' ', (int) 'a', (-1), 8, (int) (byte) -1);
        mutablePeriod4.setMillis(8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) 1);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 1, 10L, chronology2);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P-1Y8M97W52DT10H9M100.010S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray34 = mutablePeriod1.getFieldTypes();
        mutablePeriod1.setHours((int) (short) 10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray34);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT97H1M52.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(periodType4);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod5.add(1L, chronology7);
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
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) chronology7, periodType31, chronology34);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 'a', (long) 8, periodType31);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 100, (long) ' ', periodType31, chronology37);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        mutablePeriod77.setPeriod((long) 4);
        mutablePeriod77.addDays((int) (short) 10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT1M0.100S" + "'", str44, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "P10DT0.004S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "P10DT0.004S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "P10DT0.004S");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "P35DT97H0.097S" + "'", str93, "P35DT97H0.097S");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        java.lang.String str7 = mutablePeriod3.toString();
        org.joda.time.PeriodType periodType8 = mutablePeriod3.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod3.toString(periodFormatter9);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT100M" + "'", str7, "PT100M");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT100M" + "'", str10, "PT100M");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod13.setPeriod((long) 100, chronology17);
        mutablePeriod13.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = mutablePeriod13.toDurationFrom(readableInstant21);
        mutablePeriod13.setHours((int) (short) 0);
        int int25 = mutablePeriod13.getHours();
        mutablePeriod13.setYears(8);
        int int28 = mutablePeriod13.getHours();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType40 = null;
        int int41 = mutablePeriod39.indexOf(durationFieldType40);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod46.addHours((-1));
        mutablePeriod39.add((org.joda.time.ReadablePeriod) mutablePeriod46);
        mutablePeriod39.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(readableInstant52, readableInstant53, periodType54);
        mutablePeriod55.setMinutes((int) (short) 100);
        org.joda.time.Period period58 = mutablePeriod55.toPeriod();
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
        boolean boolean77 = period58.isSupported(durationFieldType75);
        boolean boolean78 = mutablePeriod39.isSupported(durationFieldType75);
        mutablePeriod33.set(durationFieldType75, (int) '4');
        int int81 = mutablePeriod2.indexOf(durationFieldType75);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        org.joda.time.DurationFieldType durationFieldType46 = mutablePeriod42.getFieldType(0);
        org.joda.time.MutablePeriod mutablePeriod47 = mutablePeriod42.toMutablePeriod();
        mutablePeriod47.addMonths((int) (short) 100);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(mutablePeriod47);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        mutablePeriod25.setPeriod((long) (short) 100, (long) 97);
        int int29 = mutablePeriod25.size();
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 8, (long) (short) 0, chronology2);
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = mutablePeriod3.toString(periodFormatter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.008S" + "'", str5, "PT0.008S");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        int int33 = mutablePeriod31.getMillis();
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod31.setPeriod((long) (byte) 100, (long) 32, chronology36);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, chronology15);
        java.lang.Class<?> wildcardClass17 = mutablePeriod4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        mutablePeriod4.addDays(100);
        mutablePeriod4.setDays((int) '#');
        java.lang.String str14 = mutablePeriod4.toString();
        int int15 = mutablePeriod4.getWeeks();
        org.joda.time.MutablePeriod mutablePeriod17 = org.joda.time.MutablePeriod.parse("PT97H1M52.097S");
        java.lang.Object obj18 = null;
        boolean boolean19 = mutablePeriod17.equals(obj18);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        mutablePeriod17.addSeconds(87);
        int int23 = mutablePeriod17.getDays();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P35DT97H0.097S" + "'", str14, "P35DT97H0.097S");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        int int76 = mutablePeriod74.getYears();
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', (int) (short) 100, (int) (byte) 1, 97, (int) (short) 1, (int) '#', (int) (short) 0, 100);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod8.toString(periodFormatter9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        mutablePeriod8.setPeriod(readableInterval11);
        org.joda.time.PeriodType periodType13 = mutablePeriod8.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod18.setPeriod((long) 100, chronology22);
        mutablePeriod18.addHours((int) '#');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod18.toDurationTo(readableInstant26);
        boolean boolean28 = mutablePeriod8.equals((java.lang.Object) duration27);
        mutablePeriod8.setHours((int) ' ');
        org.joda.time.Period period31 = mutablePeriod8.toPeriod();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P32Y100M1W97DT1H35M0.100S" + "'", str10, "P32Y100M1W97DT1H35M0.100S");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 10, (long) '4', chronology2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = mutablePeriod3.getFieldTypes();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, chronology5);
        mutablePeriod3.setYears((int) (byte) -1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0.008S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(32, (int) (short) 1, 96, (int) (byte) -1);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(duration58);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(1L);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(100L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = mutablePeriod2.toDurationFrom(readableInstant3);
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
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) (byte) -1, (int) (short) 100, (int) (short) -1, 8, (int) (short) 1, 0, (int) (short) 100, periodType43);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration4, periodType43);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod4.get(durationFieldType9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        mutablePeriod4.setPeriod(readableInterval11);
        int int13 = mutablePeriod4.getMinutes();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        int int73 = mutablePeriod24.getWeeks();
        mutablePeriod24.addMinutes(52);
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
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        mutablePeriod26.setMillis((int) (short) 100);
        mutablePeriod26.addDays(24);
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0.101S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationTo(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = mutablePeriod17.indexOf(durationFieldType18);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod24.addHours((-1));
        mutablePeriod17.add((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.PeriodType periodType28 = mutablePeriod17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType28, chronology30);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType28);
        org.joda.time.Period period33 = mutablePeriod32.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (byte) 100, (int) '4', (int) '#', (int) (byte) 1, (int) (short) -1, (int) ' ', 10, (int) '#');
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) '#', chronology44);
        mutablePeriod45.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType55 = null;
        int int56 = mutablePeriod54.indexOf(durationFieldType55);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod61.addHours((-1));
        mutablePeriod54.add((org.joda.time.ReadablePeriod) mutablePeriod61);
        org.joda.time.PeriodType periodType65 = mutablePeriod54.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType65);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod45, periodType65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Duration duration69 = mutablePeriod45.toDurationTo(readableInstant68);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration69, readableInstant70);
        org.joda.time.Chronology chronology72 = null;
        mutablePeriod42.setPeriod((org.joda.time.ReadableDuration) duration69, chronology72);
        mutablePeriod32.setPeriod((org.joda.time.ReadableDuration) duration69);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration69);
        int int76 = mutablePeriod75.getMillis();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.Period period7 = mutablePeriod3.toPeriod();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationTo(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant14, readableInstant15, periodType16);
        int int18 = mutablePeriod17.size();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableInstant19, readableInstant20, periodType21);
        int int23 = mutablePeriod22.size();
        mutablePeriod17.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod17.toDurationFrom(readableInstant25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant13, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = mutablePeriod39.toDurationFrom(readableInstant40);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType57 = null;
        int int58 = mutablePeriod56.indexOf(durationFieldType57);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod63.addHours((-1));
        mutablePeriod56.add((org.joda.time.ReadablePeriod) mutablePeriod63);
        org.joda.time.PeriodType periodType67 = mutablePeriod56.getPeriodType();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType67, chronology68);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType67);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(readableInstant34, (org.joda.time.ReadableDuration) duration41, periodType67);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(readableInstant32, readableInstant33, periodType67);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) (short) -1, periodType67);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) 8, periodType67, chronology74);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant28, periodType67);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(readableInstant11, readableInstant12, periodType67);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, readableInstant10, periodType67);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(periodType67);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationTo(readableInstant12);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        mutablePeriod4.setPeriod((int) ' ', (int) ' ', (-1), (int) (byte) 100, 8, (int) '#', 1, (int) '4');
        mutablePeriod4.addMillis((int) (short) 1);
        mutablePeriod4.clear();
        int int27 = mutablePeriod4.size();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0.087S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        org.joda.time.PeriodType periodType31 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod36.addHours((-1));
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod36.setPeriod((long) 100, chronology40);
        mutablePeriod36.addHours((int) '#');
        mutablePeriod36.setMillis(97);
        int int46 = mutablePeriod36.getMillis();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 0, periodType48, chronology49);
        int int51 = mutablePeriod50.getYears();
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
        boolean boolean70 = mutablePeriod50.isSupported(durationFieldType68);
        mutablePeriod36.set(durationFieldType68, (int) '4');
        boolean boolean73 = mutablePeriod27.isSupported(durationFieldType68);
        int[] intArray74 = mutablePeriod27.getValues();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 0, 0, 0, 0, 0, 0, 11]");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        int int54 = mutablePeriod3.getSeconds();
        int int55 = mutablePeriod3.getWeeks();
        org.joda.time.Chronology chronology58 = null;
        mutablePeriod3.setPeriod(0L, (long) 8, chronology58);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.addMillis((int) (short) 10);
        int int10 = mutablePeriod3.getMonths();
        mutablePeriod3.addDays((int) (byte) 0);
        int int13 = mutablePeriod3.getHours();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType14 = mutablePeriod6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(0L, (long) (short) 100, periodType14);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addMinutes((int) (byte) -1);
        mutablePeriod20.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod20.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod35.addHours((-1));
        org.joda.time.Chronology chronology39 = null;
        mutablePeriod35.setPeriod((long) 100, chronology39);
        mutablePeriod35.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = mutablePeriod35.toDurationFrom(readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType51 = null;
        int int52 = mutablePeriod50.indexOf(durationFieldType51);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod57.addHours((-1));
        mutablePeriod50.add((org.joda.time.ReadablePeriod) mutablePeriod57);
        org.joda.time.PeriodType periodType61 = mutablePeriod50.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration44, readableInstant45, periodType61);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) (short) 10, periodType61);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(0L, 1L, periodType61);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType61);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) '#', chronology70);
        mutablePeriod71.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType81 = null;
        int int82 = mutablePeriod80.indexOf(durationFieldType81);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod87.addHours((-1));
        mutablePeriod80.add((org.joda.time.ReadablePeriod) mutablePeriod87);
        org.joda.time.PeriodType periodType91 = mutablePeriod80.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType91);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod71, periodType91);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod(1L, (long) '4', periodType91);
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant66, periodType91);
        org.joda.time.Chronology chronology96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod97 = new org.joda.time.MutablePeriod((java.lang.Object) periodType14, periodType91, chronology96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(periodType91);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 100, 96, (-1), 1);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod40.setPeriod((long) 100, chronology44);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType51 = null;
        int int52 = mutablePeriod50.indexOf(durationFieldType51);
        mutablePeriod40.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType59 = null;
        int int60 = mutablePeriod58.indexOf(durationFieldType59);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod65.addHours((-1));
        mutablePeriod58.add((org.joda.time.ReadablePeriod) mutablePeriod65);
        mutablePeriod58.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant71, readableInstant72, periodType73);
        mutablePeriod74.setMinutes((int) (short) 100);
        org.joda.time.Period period77 = mutablePeriod74.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.Duration duration84 = mutablePeriod82.toDurationFrom(readableInstant83);
        mutablePeriod82.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType88 = null;
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod(10L, periodType88, chronology89);
        int int91 = mutablePeriod90.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod90);
        org.joda.time.DurationFieldType durationFieldType94 = mutablePeriod90.getFieldType((int) (short) 1);
        int int95 = mutablePeriod82.get(durationFieldType94);
        boolean boolean96 = period77.isSupported(durationFieldType94);
        boolean boolean97 = mutablePeriod58.isSupported(durationFieldType94);
        int int98 = mutablePeriod50.get(durationFieldType94);
        int int99 = mutablePeriod24.get(durationFieldType94);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(durationFieldType94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        int int12 = mutablePeriod4.getDays();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 0, periodType14, chronology15);
        int int17 = mutablePeriod16.getYears();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod22.toDurationFrom(readableInstant23);
        mutablePeriod22.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(10L, periodType28, chronology29);
        int int31 = mutablePeriod30.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod30);
        org.joda.time.DurationFieldType durationFieldType34 = mutablePeriod30.getFieldType((int) (short) 1);
        int int35 = mutablePeriod22.get(durationFieldType34);
        boolean boolean36 = mutablePeriod16.isSupported(durationFieldType34);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(10L, periodType38, chronology39);
        int int41 = mutablePeriod40.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod40);
        org.joda.time.DurationFieldType durationFieldType44 = mutablePeriod40.getFieldType((int) (short) 1);
        int int45 = mutablePeriod16.get(durationFieldType44);
        mutablePeriod4.set(durationFieldType44, 52);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(10L, periodType49, chronology50);
        int int52 = mutablePeriod51.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod51);
        org.joda.time.DurationFieldType durationFieldType55 = mutablePeriod51.getFieldType((int) (short) 1);
        mutablePeriod4.set(durationFieldType55, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(durationFieldType55);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        mutablePeriod53.setMonths((int) ' ');
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', 0, 52, 52, 8, (int) (byte) 10, (int) '#', 1);
        mutablePeriod8.addSeconds((int) '4');
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod15.addHours((-1));
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod15.setPeriod((long) 100, chronology19);
        mutablePeriod15.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod15.toDurationFrom(readableInstant23);
        mutablePeriod15.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(readableInstant27, readableInstant28, periodType29);
        int int31 = mutablePeriod30.size();
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant32, readableInstant33, periodType34);
        int int36 = mutablePeriod35.size();
        mutablePeriod30.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        boolean boolean38 = mutablePeriod15.equals((java.lang.Object) mutablePeriod35);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        org.joda.time.Chronology chronology47 = null;
        mutablePeriod43.setPeriod((long) 100, chronology47);
        mutablePeriod43.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = mutablePeriod43.toDurationFrom(readableInstant51);
        mutablePeriod35.setPeriod((org.joda.time.ReadableDuration) duration52);
        mutablePeriod35.setPeriod((int) (short) 1, (int) (byte) 100, 97, (int) '#', 1, (int) (short) 100, (int) (byte) -1, 97);
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
        mutablePeriod35.set(durationFieldType79, (int) (byte) 0);
        mutablePeriod8.add(durationFieldType79, (int) (short) 10);
        mutablePeriod8.setMillis((int) (short) -1);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(durationFieldType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
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
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType38);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 4, periodType38);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        java.lang.String str3 = mutablePeriod2.toString();
        mutablePeriod2.setHours((int) '#');
        mutablePeriod2.setPeriod((long) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        mutablePeriod8.setPeriod((long) 'a');
        mutablePeriod8.setHours((int) (short) 10);
        int int13 = mutablePeriod8.getSeconds();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.setPeriod((long) (short) 0, chronology3);
        int int5 = mutablePeriod1.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod1.toMutablePeriod();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        mutablePeriod4.setYears((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationFrom(readableInstant16);
        mutablePeriod15.setSeconds((int) '4');
        java.lang.String str20 = mutablePeriod15.toString();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) '#', chronology22);
        mutablePeriod23.setMinutes(8);
        mutablePeriod23.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod32.setPeriod((long) 100, chronology36);
        mutablePeriod32.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = mutablePeriod32.toDurationFrom(readableInstant40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, readableInstant42);
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration41, chronology44);
        mutablePeriod23.setHours((int) '4');
        mutablePeriod23.addMillis(8);
        mutablePeriod15.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod23);
        mutablePeriod23.clear();
        int int53 = mutablePeriod23.getValue((int) (byte) 0);
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
        mutablePeriod23.add(durationFieldType70, (int) (short) 1);
        mutablePeriod4.add(durationFieldType70, 8);
        mutablePeriod4.addYears(32);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT97H1M52.097S" + "'", str20, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 1, 100, (int) ' ', (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) '#', chronology6);
        mutablePeriod7.setMinutes(8);
        mutablePeriod7.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod16.addHours((-1));
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod16.setPeriod((long) 100, chronology20);
        mutablePeriod16.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = mutablePeriod16.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration25, readableInstant26);
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod7.setPeriod((org.joda.time.ReadableDuration) duration25, chronology28);
        mutablePeriod7.setHours((int) '4');
        mutablePeriod7.addMillis(8);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod7.toDurationTo(readableInstant34);
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration35, chronology36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant38);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        int int14 = mutablePeriod12.getHours();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.ReadableInterval readableInterval2 = null;
        mutablePeriod1.add(readableInterval2);
        mutablePeriod1.setMonths((int) (byte) -1);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        mutablePeriod31.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod31.toDurationFrom(readableInstant34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = mutablePeriod21.indexOf(durationFieldType22);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        mutablePeriod21.add((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.PeriodType periodType32 = mutablePeriod21.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant16, periodType32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType44 = null;
        int int45 = mutablePeriod43.indexOf(durationFieldType44);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod50.addHours((-1));
        mutablePeriod43.add((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.PeriodType periodType54 = mutablePeriod43.getPeriodType();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType54, chronology55);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant36, periodType54);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType54);
        mutablePeriod58.addSeconds((int) (byte) -1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(periodType54);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        org.joda.time.PeriodType periodType35 = mutablePeriod18.getPeriodType();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H35M100S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        mutablePeriod14.addMonths((int) (short) 1);
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod14.add(0L, chronology25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        int int28 = mutablePeriod26.getYears();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod33.toDurationFrom(readableInstant34);
        mutablePeriod33.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        mutablePeriod33.setPeriod(readableInstant38, readableInstant39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod45.addMinutes((int) (byte) -1);
        int int48 = mutablePeriod45.getSeconds();
        org.joda.time.DurationFieldType durationFieldType49 = null;
        int int50 = mutablePeriod45.indexOf(durationFieldType49);
        mutablePeriod45.addDays(100);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        mutablePeriod45.setPeriod(readableInstant53, readableInstant54);
        mutablePeriod33.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.DurationFieldType[] durationFieldTypeArray57 = mutablePeriod45.getFieldTypes();
        boolean boolean58 = mutablePeriod26.equals((java.lang.Object) durationFieldTypeArray57);
        java.lang.Class<?> wildcardClass59 = durationFieldTypeArray57.getClass();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(durationFieldTypeArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMillis((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod4.toDurationFrom(readableInstant16);
        int int18 = mutablePeriod4.size();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        mutablePeriod31.addWeeks(8);
        mutablePeriod31.setWeeks((int) (short) -1);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        int int24 = mutablePeriod18.getWeeks();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addMillis(1);
        int int3 = mutablePeriod0.getWeeks();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType36);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = mutablePeriod51.toDurationFrom(readableInstant52);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType69 = null;
        int int70 = mutablePeriod68.indexOf(durationFieldType69);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod75.addHours((-1));
        mutablePeriod68.add((org.joda.time.ReadablePeriod) mutablePeriod75);
        org.joda.time.PeriodType periodType79 = mutablePeriod68.getPeriodType();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType79, chronology80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType79);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(readableInstant46, (org.joda.time.ReadableDuration) duration53, periodType79);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(readableInstant44, readableInstant45, periodType79);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(readableInstant42, readableInstant43, periodType79);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType79);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod40, periodType79, chronology87);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) ' ', (long) '4', periodType79);
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod(197, 100, 4, (int) (byte) 100, 0, 0, (int) (short) 1, (-98), periodType79);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(periodType79);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(10L, 10L);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(4, (int) (byte) 10, 0, (int) (byte) -1, 100, (int) (byte) 1, (int) (short) 10, (int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod8.toDurationTo(readableInstant9);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        mutablePeriod50.setPeriod((long) 1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (byte) 1);
        mutablePeriod2.addYears((int) (short) -1);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType50 = mutablePeriod38.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType5, chronology6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod7.toDurationFrom(readableInstant8);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = mutablePeriod16.indexOf(durationFieldType17);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        mutablePeriod16.add((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.PeriodType periodType27 = mutablePeriod16.getPeriodType();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType27, chronology28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(readableInstant3, (org.joda.time.ReadableDuration) duration9, periodType27);
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType33 = mutablePeriod1.getFieldType((-98));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 197, (long) (byte) -1);
        org.joda.time.PeriodType periodType3 = mutablePeriod2.getPeriodType();
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        mutablePeriod92.setPeriod((long) (-41), (long) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(periodType88);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(periodType31);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (-1), periodType31, chronology36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType40, chronology41);
        mutablePeriod42.setSeconds(1);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = mutablePeriod49.toDurationTo(readableInstant50);
        mutablePeriod42.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod49);
        mutablePeriod42.setPeriod((int) ' ', (int) ' ', (-1), (int) (byte) 100, 8, (int) '#', 1, (int) '4');
        mutablePeriod42.addMillis((int) (short) 1);
        mutablePeriod37.add((org.joda.time.ReadablePeriod) mutablePeriod42);
        mutablePeriod37.setSeconds(107);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(duration51);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.getMillis();
        int int5 = mutablePeriod3.getDays();
        mutablePeriod3.setPeriod((long) (byte) 10, (long) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(10L, periodType12, chronology13);
        mutablePeriod14.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod14.toDurationFrom(readableInstant18);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod24.toDurationTo(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
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
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType47);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration19, periodType47);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod();
        mutablePeriod55.setMillis((int) (byte) 10);
        mutablePeriod55.addMinutes((int) (byte) -1);
        mutablePeriod55.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType62 = mutablePeriod55.getPeriodType();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType62, chronology63);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, readableInstant53, periodType62);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(readableInstant9, (org.joda.time.ReadableDuration) duration19);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType62);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = mutablePeriod3.toDurationFrom(readableInstant54);
        mutablePeriod3.setHours((int) 'a');
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration55);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        mutablePeriod25.setPeriod((long) (short) 100, (long) 97);
        mutablePeriod25.setPeriod((long) 87);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        mutablePeriod4.addDays(100);
        mutablePeriod4.setDays((int) '#');
        java.lang.String str14 = mutablePeriod4.toString();
        int int15 = mutablePeriod4.getWeeks();
        org.joda.time.MutablePeriod mutablePeriod17 = org.joda.time.MutablePeriod.parse("PT97H1M52.097S");
        java.lang.Object obj18 = null;
        boolean boolean19 = mutablePeriod17.equals(obj18);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(10L, periodType22, chronology23);
        mutablePeriod24.setPeriod((long) (byte) 0, 100L);
        org.joda.time.PeriodType periodType28 = mutablePeriod24.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, periodType28);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P35DT97H0.097S" + "'", str14, "P35DT97H0.097S");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        // The following exception was thrown during execution in test generation
        try {
            int int35 = mutablePeriod24.getValue(87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 87");
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        java.lang.String str7 = mutablePeriod3.toString();
        org.joda.time.PeriodType periodType8 = mutablePeriod3.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod21.setPeriod((long) 100, chronology25);
        mutablePeriod21.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod21.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = mutablePeriod36.indexOf(durationFieldType37);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        mutablePeriod36.add((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.PeriodType periodType47 = mutablePeriod36.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31, periodType47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) (byte) -1, (int) (short) 100, (int) (short) -1, 8, (int) (short) 1, 0, (int) (short) 100, periodType47);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType47);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT100M" + "'", str7, "PT100M");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(periodType47);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(10L, periodType24, chronology25);
        mutablePeriod26.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod26.toDurationFrom(readableInstant30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType37 = mutablePeriod36.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant22, (org.joda.time.ReadableDuration) duration31, periodType37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 'a', (long) (byte) 10, periodType37, chronology39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((java.lang.Object) periodType17, periodType37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) (byte) 10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        mutablePeriod4.add(readableInterval12);
        mutablePeriod4.add((long) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("P100Y100M100WT100H99.999S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(35, (-1), 35, 10, 10, 0, 32, 8, periodType8);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod3.toDurationFrom(readableInstant7);
        mutablePeriod3.setPeriod((long) '4', (long) (byte) 100);
        mutablePeriod3.setPeriod((long) 10);
        mutablePeriod3.setMonths(100);
        mutablePeriod3.addSeconds(97);
        org.joda.time.MutablePeriod mutablePeriod18 = mutablePeriod3.toMutablePeriod();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, chronology19);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(mutablePeriod18);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        mutablePeriod22.addSeconds(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (byte) -1);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = mutablePeriod10.indexOf(durationFieldType11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType21 = mutablePeriod10.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType21, chronology22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableDuration2, readableInstant3, periodType21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(1L, (long) '4', periodType21, chronology25);
        java.lang.Class<?> wildcardClass27 = periodType21.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        int int45 = mutablePeriod40.getHours();
        int int46 = mutablePeriod40.getYears();
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, chronology15);
        mutablePeriod4.setMinutes((int) (short) 1);
        mutablePeriod4.setHours((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        int int12 = mutablePeriod4.getMillis();
        java.lang.Object obj13 = mutablePeriod4.clone();
        java.lang.String str14 = mutablePeriod4.toString();
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod4.getFieldType((int) (short) 0);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod4.setPeriod((long) (short) 1, chronology18);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0.001S");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0S" + "'", str14, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType16);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (short) 100, 0, (int) (byte) 1, 52, 52, (int) (short) -1, (int) '4');
        int int9 = mutablePeriod8.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod8.copy();
        mutablePeriod10.addWeeks(97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(mutablePeriod10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        mutablePeriod14.add((long) 100);
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod14.add(100L, chronology21);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod8.toDurationFrom(readableInstant13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = mutablePeriod8.getValue((-98));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(duration14);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 97, (long) (byte) 0, chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = mutablePeriod3.toDurationFrom(readableInstant4);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod15.addHours((-1));
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod15.setPeriod((long) 100, chronology19);
        mutablePeriod15.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod15.toDurationFrom(readableInstant23);
        mutablePeriod15.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter27 = null;
        java.lang.String str28 = mutablePeriod15.toString(periodFormatter27);
        mutablePeriod15.setWeeks((int) (short) 1);
        mutablePeriod15.setPeriod((long) 10, (long) (short) 10);
        org.joda.time.DurationFieldType durationFieldType35 = mutablePeriod15.getFieldType((int) (byte) 0);
        boolean boolean36 = mutablePeriod3.isSupported(durationFieldType35);
        org.joda.time.MutablePeriod mutablePeriod37 = mutablePeriod3.toMutablePeriod();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT1M0.100S" + "'", str28, "PT1M0.100S");
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(mutablePeriod37);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationTo(readableInstant12);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        mutablePeriod4.setPeriod((int) ' ', (int) ' ', (-1), (int) (byte) 100, 8, (int) '#', 1, (int) '4');
        mutablePeriod4.addMillis((int) (short) 1);
        mutablePeriod4.clear();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType29, chronology30);
        mutablePeriod31.setSeconds(1);
        org.joda.time.DurationFieldType[] durationFieldTypeArray34 = mutablePeriod31.getFieldTypes();
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod4.setPeriod(0L, 10L, chronology38);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(durationFieldTypeArray34);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        mutablePeriod3.addMinutes((int) (short) 1);
        int int9 = mutablePeriod3.getMinutes();
        mutablePeriod3.setPeriod((int) (byte) 10, 8, (int) (byte) -1, (int) (short) 100, (int) (byte) 0, 0, (int) (byte) 10, 1);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(10L, periodType20, chronology21);
        mutablePeriod22.setPeriod((long) (byte) 0, 100L);
        mutablePeriod22.addMinutes((int) (short) 1);
        int int28 = mutablePeriod22.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType44 = null;
        int int45 = mutablePeriod43.indexOf(durationFieldType44);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod50.addHours((-1));
        mutablePeriod43.add((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.PeriodType periodType54 = mutablePeriod43.getPeriodType();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType54, chronology55);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType54);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = mutablePeriod62.toDurationFrom(readableInstant63);
        org.joda.time.Chronology chronology65 = null;
        mutablePeriod57.setPeriod((org.joda.time.ReadableDuration) duration64, chronology65);
        org.joda.time.Chronology chronology67 = null;
        mutablePeriod22.setPeriod((org.joda.time.ReadableDuration) duration64, chronology67);
        org.joda.time.Chronology chronology69 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration64, chronology69);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(duration64);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        mutablePeriod12.clear();
        int int42 = mutablePeriod12.getValue((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = mutablePeriod47.toDurationFrom(readableInstant48);
        mutablePeriod47.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(10L, periodType53, chronology54);
        int int56 = mutablePeriod55.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod55);
        org.joda.time.DurationFieldType durationFieldType59 = mutablePeriod55.getFieldType((int) (short) 1);
        int int60 = mutablePeriod47.get(durationFieldType59);
        mutablePeriod12.add(durationFieldType59, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((java.lang.Object) durationFieldType59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT97H1M52.097S" + "'", str9, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        mutablePeriod4.addSeconds(1);
        int[] intArray9 = mutablePeriod4.getValues();
        mutablePeriod4.addSeconds(4);
        mutablePeriod4.setPeriod((long) 'a');
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
        mutablePeriod18.addWeeks((int) '4');
        mutablePeriod18.add((long) 97);
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
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration49, readableInstant68);
        mutablePeriod18.add((org.joda.time.ReadableDuration) duration49);
        org.joda.time.Chronology chronology71 = null;
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration49, chronology71);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 97, 1, 1, 97]");
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType66);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P35DT97H0.097S");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1, chronology2);
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = mutablePeriod40.toDurationFrom(readableInstant42);
        org.joda.time.format.PeriodFormatter periodFormatter44 = null;
        java.lang.String str45 = mutablePeriod40.toString(periodFormatter44);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PT0S" + "'", str45, "PT0S");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, (int) (short) 10, (int) (short) 0, 52);
        mutablePeriod4.addDays(97);
        mutablePeriod4.setSeconds((-41));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        int int3 = mutablePeriod1.getHours();
        int int4 = mutablePeriod1.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod1.setValue(107, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 107");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        int int12 = mutablePeriod8.getDays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = mutablePeriod8.getFieldTypes();
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod8.add((long) (short) 1, chronology15);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType33 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) '#', periodType33, chronology35);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) ' ', (long) (byte) 1, periodType33);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((java.lang.Object) chronology15, periodType33, chronology38);
        mutablePeriod39.setDays((int) (byte) 100);
        int int42 = mutablePeriod39.size();
        mutablePeriod39.setPeriod((int) 'a', (int) (short) 10, 197, 87, (-98), (int) '#', (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        mutablePeriod2.addWeeks((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod24.toDurationFrom(readableInstant25);
        mutablePeriod24.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        mutablePeriod24.setPeriod(readableInstant29, readableInstant30);
        int int32 = mutablePeriod24.getMillis();
        mutablePeriod24.setSeconds(1);
        mutablePeriod24.add(1L);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant37, readableInstant38, periodType39);
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod40.setPeriod((long) 8, 100L, chronology43);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = mutablePeriod49.toDurationFrom(readableInstant50);
        mutablePeriod49.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(10L, periodType55, chronology56);
        int int58 = mutablePeriod57.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod57);
        org.joda.time.DurationFieldType durationFieldType61 = mutablePeriod57.getFieldType((int) (short) 1);
        int int62 = mutablePeriod49.get(durationFieldType61);
        boolean boolean63 = mutablePeriod40.isSupported(durationFieldType61);
        int int64 = mutablePeriod24.indexOf(durationFieldType61);
        mutablePeriod2.add(durationFieldType61, 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-1), (-98), 4, (int) (byte) 10);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod27.toMutablePeriod();
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "P1WT97H2M0.197S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "P1WT97H2M0.197S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "P1WT97H2M0.197S");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(mutablePeriod28);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        mutablePeriod14.addMonths((int) (short) 1);
        int[] intArray24 = mutablePeriod14.getValues();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 1, 0, 0, 97, 1, 52, 197]");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        mutablePeriod2.add(97, (int) 'a', 0, (int) (short) 100, (int) (short) 100, (int) (short) 10, (int) ' ', 1);
        int[] intArray17 = mutablePeriod2.getValues();
        int int18 = mutablePeriod2.getDays();
        mutablePeriod2.add((int) (byte) 0, (int) '#', 52, (int) (byte) 0, (int) '4', (int) (short) 0, 1, (int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod2.get(durationFieldType28);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97, 0, 100, 100, 10, 32, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        mutablePeriod1.add((long) 197);
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray9 = mutablePeriod4.getFieldTypes();
        mutablePeriod4.setYears(0);
        mutablePeriod4.addSeconds((int) '#');
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(durationFieldTypeArray9);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.clear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod4.toDurationTo(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, readableInstant10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant10, chronology12);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add(0L, chronology6);
        mutablePeriod2.setMillis((int) (byte) 10);
        int[] intArray10 = mutablePeriod2.getValues();
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod2.toMutablePeriod();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 8, 0, 10]");
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod4.setPeriod((long) (byte) 10, chronology6);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addMinutes((int) (byte) -1);
        mutablePeriod12.setMinutes((int) 'a');
        mutablePeriod12.addMonths((int) '#');
        int int19 = mutablePeriod12.getYears();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod25.toDurationFrom(readableInstant26);
        mutablePeriod25.addMonths((int) (short) 0);
        mutablePeriod25.addMinutes((int) '#');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        mutablePeriod37.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod37.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(readableInstant32, (org.joda.time.ReadableDuration) duration46, periodType49);
        mutablePeriod25.setPeriod((org.joda.time.ReadableDuration) duration46);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(readableInstant20, (org.joda.time.ReadableDuration) duration46);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(readableInstant53, readableInstant54, periodType55);
        int int57 = mutablePeriod56.size();
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableInstant58, readableInstant59, periodType60);
        int int62 = mutablePeriod61.size();
        mutablePeriod56.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod61);
        org.joda.time.DurationFieldType[] durationFieldTypeArray64 = mutablePeriod56.getFieldTypes();
        org.joda.time.DurationFieldType durationFieldType66 = mutablePeriod56.getFieldType((int) (short) 0);
        mutablePeriod52.set(durationFieldType66, (int) '4');
        mutablePeriod12.set(durationFieldType66, (int) (short) 1);
        boolean boolean71 = mutablePeriod4.isSupported(durationFieldType66);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 8 + "'", int57 == 8);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 8 + "'", int62 == 8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray64);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod3.toDurationFrom(readableInstant7);
        mutablePeriod3.setPeriod((long) '4', (long) (byte) 100);
        mutablePeriod3.setPeriod((long) 10);
        mutablePeriod3.setMonths(100);
        mutablePeriod3.addSeconds(97);
        org.joda.time.MutablePeriod mutablePeriod18 = mutablePeriod3.toMutablePeriod();
        int int19 = mutablePeriod18.getSeconds();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = mutablePeriod6.indexOf(durationFieldType7);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        mutablePeriod6.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        mutablePeriod1.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        mutablePeriod1.addMinutes(8);
        mutablePeriod1.addDays((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant26);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType33 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod38.addHours((-1));
        org.joda.time.Chronology chronology42 = null;
        mutablePeriod38.setPeriod((long) 100, chronology42);
        mutablePeriod38.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = mutablePeriod38.toDurationFrom(readableInstant46);
        mutablePeriod38.addMinutes((int) (byte) 1);
        mutablePeriod32.add((org.joda.time.ReadablePeriod) mutablePeriod38);
        mutablePeriod32.addMillis((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        mutablePeriod32.setPeriod(readableInstant53, readableInstant54);
        org.joda.time.PeriodType periodType56 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration21, periodType56);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(periodType56);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod8.addHours((-1));
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.setPeriod((long) 100, chronology12);
        mutablePeriod8.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType16 = mutablePeriod8.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(periodType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 10, periodType16, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType16, chronology20);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (short) 100, (long) (byte) 0, periodType16);
        int int23 = mutablePeriod22.getYears();
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.setSeconds((int) '4');
        mutablePeriod4.setWeeks((int) (short) -1);
        mutablePeriod4.addWeeks(100);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.lang.Object obj2 = null;
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
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(97, (int) 'a', (int) (byte) 0, 100, (-1), 100, (int) (short) 0, 1, periodType48);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(periodType48);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(obj2, periodType48);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(periodType48);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(100L, (long) 8, periodType48);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(periodType48);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        mutablePeriod3.setWeeks(100);
        int int9 = mutablePeriod3.getMillis();
        int int10 = mutablePeriod3.getSeconds();
        mutablePeriod3.clear();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        org.joda.time.Period period32 = mutablePeriod31.toPeriod();
        int int33 = mutablePeriod31.getWeeks();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT0.008S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 0, (long) 'a');
        mutablePeriod2.setMillis((int) (short) -1);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = mutablePeriod3.getFieldTypes();
        mutablePeriod3.add((int) '4', (int) (byte) -1, (int) (byte) 10, (-1), (int) (byte) 0, 0, (int) 'a', (int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addMinutes((int) (byte) -1);
        mutablePeriod18.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod18.toDurationFrom(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        org.joda.time.Chronology chronology37 = null;
        mutablePeriod33.setPeriod((long) 100, chronology37);
        mutablePeriod33.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = mutablePeriod33.toDurationFrom(readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType49 = null;
        int int50 = mutablePeriod48.indexOf(durationFieldType49);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod55.addHours((-1));
        mutablePeriod48.add((org.joda.time.ReadablePeriod) mutablePeriod55);
        org.joda.time.PeriodType periodType59 = mutablePeriod48.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, readableInstant43, periodType59);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) (short) 10, periodType59);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(0L, 1L, periodType59);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant25, periodType59);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(periodType59);
        mutablePeriod64.addHours((int) (byte) 10);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod64);
        int[] intArray68 = mutablePeriod3.getValues();
        mutablePeriod3.setMinutes(100);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 0, 0, 0, 10, 0, 0, 0]");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        org.joda.time.MutablePeriod mutablePeriod44 = mutablePeriod43.toMutablePeriod();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(mutablePeriod44);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        org.joda.time.format.PeriodFormatter periodFormatter59 = null;
        java.lang.String str60 = mutablePeriod55.toString(periodFormatter59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = mutablePeriod55.toDurationFrom(readableInstant61);
        mutablePeriod55.setMinutes(87);
        mutablePeriod55.add((int) (byte) 0, 10, 96, (int) (short) -1, 0, 0, (-98), (-98));
        mutablePeriod55.setPeriod(0, (int) (byte) 0, 97, 8, (int) (short) 1, 0, (int) (short) 10, 10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(mutablePeriod58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "P10WT0.100S" + "'", str60, "P10WT0.100S");
        org.junit.Assert.assertNotNull(duration62);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        int int7 = mutablePeriod4.size();
        org.joda.time.MutablePeriod mutablePeriod9 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray10 = mutablePeriod9.getValues();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationFrom(readableInstant16);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = mutablePeriod24.indexOf(durationFieldType25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addHours((-1));
        mutablePeriod24.add((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.PeriodType periodType35 = mutablePeriod24.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType35, chronology36);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant11, (org.joda.time.ReadableDuration) duration17, periodType35);
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration17, chronology40);
        java.lang.String str42 = mutablePeriod4.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT0.001S" + "'", str42, "PT0.001S");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        mutablePeriod77.setHours((int) (byte) 0);
        int int81 = mutablePeriod77.getMillis();
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT1M0.100S" + "'", str44, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "PT0S");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        int[] intArray14 = mutablePeriod4.getValues();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod20.setPeriod((long) 100, chronology24);
        mutablePeriod20.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = mutablePeriod20.toDurationFrom(readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, readableInstant30);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant15, (org.joda.time.ReadableDuration) duration29, periodType32);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod40.setPeriod((long) 100, chronology44);
        mutablePeriod40.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType48 = mutablePeriod40.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod53.addHours((-1));
        org.joda.time.Chronology chronology57 = null;
        mutablePeriod53.setPeriod((long) 100, chronology57);
        mutablePeriod53.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = mutablePeriod53.toDurationFrom(readableInstant61);
        org.joda.time.Chronology chronology63 = null;
        mutablePeriod40.setPeriod((org.joda.time.ReadableDuration) duration62, chronology63);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType74 = null;
        int int75 = mutablePeriod73.indexOf(durationFieldType74);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod80.addHours((-1));
        mutablePeriod73.add((org.joda.time.ReadablePeriod) mutablePeriod80);
        org.joda.time.PeriodType periodType84 = mutablePeriod73.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType84);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType84, chronology86);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(readableInstant35, (org.joda.time.ReadableDuration) duration62, periodType84);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration62);
        int int90 = mutablePeriod4.size();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 35, 0, 0, 97]");
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(periodType84);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 8 + "'", int90 == 8);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationTo(readableInstant12);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.format.PeriodFormatter periodFormatter15 = null;
        java.lang.String str16 = mutablePeriod11.toString(periodFormatter15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 8, chronology18);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType22 = mutablePeriod11.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT97H1M0.097S" + "'", str16, "PT97H1M0.097S");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (short) 0, (long) 'a', periodType2, chronology3);
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod4.copy();
        org.junit.Assert.assertNotNull(mutablePeriod5);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1);
        java.lang.Object obj3 = mutablePeriod1.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "PT0.010S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "PT0.010S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "PT0.010S");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, 0L);
        mutablePeriod2.clear();
        int int4 = mutablePeriod2.size();
        org.joda.time.PeriodType periodType5 = mutablePeriod2.getPeriodType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        mutablePeriod1.addHours((int) (byte) 10);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        int int7 = mutablePeriod4.size();
        mutablePeriod4.setPeriod((int) (byte) 10, 0, 8, (int) (byte) -1, (int) (short) 100, 0, 1, (int) '4');
        int int17 = mutablePeriod4.getWeeks();
        mutablePeriod4.setMonths((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, readableInstant43);
        mutablePeriod44.add((int) (byte) 0, 8, 4, 8, (int) (byte) 0, 8, (-1), 24);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(10L, (long) (byte) -1, periodType29, chronology34);
        mutablePeriod35.clear();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = mutablePeriod2.toDurationFrom(readableInstant3);
        mutablePeriod2.setPeriod((long) 10, (long) (-41));
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) '4', 1, (int) (byte) 0, (int) (byte) 1, 8, 52, (int) (short) 1, (int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray9 = mutablePeriod8.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldTypeArray9);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        mutablePeriod41.setPeriod(readableInstant43, readableInstant44);
        mutablePeriod41.addWeeks(97);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        mutablePeriod41.setPeriod(readableInstant48, readableInstant49);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType41 = null;
        int int42 = mutablePeriod40.indexOf(durationFieldType41);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod47.addHours((-1));
        mutablePeriod40.add((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.PeriodType periodType51 = mutablePeriod40.getPeriodType();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType51, chronology52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType51);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType51);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((java.lang.Object) chronology23, periodType51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT97H1M0.097S" + "'", str18, "PT97H1M0.097S");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(0, 1, 52, 8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) (byte) 100, (int) '4', (int) '#', (int) (byte) 1, (int) (short) -1, (int) ' ', 10, (int) '#');
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
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = mutablePeriod17.toDurationTo(readableInstant40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, readableInstant42);
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration41, chronology44);
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration41, chronology46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration41);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(duration41);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(100, 96, (int) (byte) 100, (int) (byte) -1, (int) (short) -1, 4, 87, 197);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        mutablePeriod26.setMillis(0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        org.joda.time.MutablePeriod mutablePeriod25 = mutablePeriod22.copy();
        org.joda.time.format.PeriodFormatter periodFormatter26 = null;
        java.lang.String str27 = mutablePeriod25.toString(periodFormatter26);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 8, 0, 10]");
        org.junit.Assert.assertNotNull(durationFieldTypeArray24);
        org.junit.Assert.assertNotNull(mutablePeriod25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT0S" + "'", str27, "PT0S");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(periodType21);
        java.lang.Class<?> wildcardClass26 = mutablePeriod25.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        int int73 = mutablePeriod71.getMillis();
        mutablePeriod71.setPeriod((long) 1, (long) (short) 0);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        mutablePeriod10.setValue(1, (int) (short) -1);
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
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        mutablePeriod24.addWeeks(32);
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod15.addHours((-1));
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod15.setPeriod((long) 100, chronology19);
        mutablePeriod15.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType23 = mutablePeriod15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        org.joda.time.Chronology chronology32 = null;
        mutablePeriod28.setPeriod((long) 100, chronology32);
        mutablePeriod28.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = mutablePeriod28.toDurationFrom(readableInstant36);
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod15.setPeriod((org.joda.time.ReadableDuration) duration37, chronology38);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType49 = null;
        int int50 = mutablePeriod48.indexOf(durationFieldType49);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod55.addHours((-1));
        mutablePeriod48.add((org.joda.time.ReadablePeriod) mutablePeriod55);
        org.joda.time.PeriodType periodType59 = mutablePeriod48.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType59, chronology61);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration37, periodType59);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((-98), (int) (byte) 10, 4, (int) (short) 100, 87, (int) 'a', (int) 'a', 100, periodType59);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(0L, 0L, periodType59, chronology65);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(periodType59);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', 0, 52, 52, 8, (int) (byte) 10, (int) '#', 1);
        mutablePeriod8.addSeconds((int) '4');
        mutablePeriod8.setDays(52);
        int int13 = mutablePeriod8.getMillis();
        java.lang.String str14 = mutablePeriod8.toString();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P32Y52W52DT8H10M87.001S" + "'", str14, "P32Y52W52DT8H10M87.001S");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 10, (long) (byte) 100, chronology2);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 10, (int) ' ', 0, (int) (short) 1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod10.addHours((-1));
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod10.setPeriod((long) 100, chronology14);
        mutablePeriod10.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType18 = mutablePeriod10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod23.setPeriod((long) 100, chronology27);
        mutablePeriod23.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = mutablePeriod23.toDurationFrom(readableInstant31);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType44 = null;
        int int45 = mutablePeriod43.indexOf(durationFieldType44);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod50.addHours((-1));
        mutablePeriod43.add((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.PeriodType periodType54 = mutablePeriod43.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType54, chronology56);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(readableInstant5, (org.joda.time.ReadableDuration) duration32, periodType54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((java.lang.Object) (short) 1, periodType54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(periodType54);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1, chronology2);
        int int4 = mutablePeriod3.getHours();
        int int5 = mutablePeriod3.getMonths();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) 8);
        mutablePeriod4.setDays(197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 100, (int) '4', (int) (byte) 1, (int) (short) 0, (int) (byte) 1, (int) (short) 1, 97, (int) (byte) 1);
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
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType42, chronology46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) (short) 0, 1, (int) ' ', (int) '#', (int) (short) 10, (int) ' ', (int) (short) 0, 0, periodType42);
        org.joda.time.Chronology chronology51 = null;
        mutablePeriod48.setPeriod((long) 1, (long) 100, chronology51);
        org.joda.time.Chronology chronology54 = null;
        mutablePeriod48.add(0L, chronology54);
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod48);
        mutablePeriod48.setPeriod((int) (short) 100, (int) (byte) 1, (int) (byte) 10, (int) (byte) -1, (int) (short) 0, (int) ' ', 0, (int) (short) 10);
        mutablePeriod48.setMonths((-1));
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodType42);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, chronology15);
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod4.setPeriod((long) '4', (long) '4', chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType22 = mutablePeriod4.getFieldType(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        int int41 = mutablePeriod40.getDays();
        mutablePeriod40.addMillis((-1));
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod40.setPeriod((long) (-1), (long) 35, chronology46);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, (long) 100);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 1, (int) '#', (int) (byte) 1, (int) (byte) 100, 87, (int) (byte) 100, (int) (short) 0, (-41));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = mutablePeriod6.indexOf(durationFieldType7);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        mutablePeriod6.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        mutablePeriod1.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        int int18 = mutablePeriod1.getMinutes();
        int int19 = mutablePeriod1.getMonths();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P-1W");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        int int46 = mutablePeriod4.getMonths();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = mutablePeriod3.getFieldTypes();
        mutablePeriod3.add((int) '4', (int) (byte) -1, (int) (byte) 10, (-1), (int) (byte) 0, 0, (int) 'a', (int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addMinutes((int) (byte) -1);
        mutablePeriod18.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod18.toDurationFrom(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        org.joda.time.Chronology chronology37 = null;
        mutablePeriod33.setPeriod((long) 100, chronology37);
        mutablePeriod33.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = mutablePeriod33.toDurationFrom(readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType49 = null;
        int int50 = mutablePeriod48.indexOf(durationFieldType49);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod55.addHours((-1));
        mutablePeriod48.add((org.joda.time.ReadablePeriod) mutablePeriod55);
        org.joda.time.PeriodType periodType59 = mutablePeriod48.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, readableInstant43, periodType59);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) (short) 10, periodType59);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(0L, 1L, periodType59);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant25, periodType59);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(periodType59);
        mutablePeriod64.addHours((int) (byte) 10);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod64);
        int[] intArray68 = mutablePeriod3.getValues();
        org.joda.time.Chronology chronology70 = null;
        mutablePeriod3.add((long) (byte) 1, chronology70);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 0, 0, 0, 10, 0, 0, 0]");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 100, chronology16);
        mutablePeriod12.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod12.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType41 = mutablePeriod40.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27, periodType41);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant24, periodType41);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(35, (int) (short) 100, (int) (byte) 100, (int) (byte) 100, (int) (byte) -1, 0, 107, (int) '#', periodType41);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod3.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod3.toDurationTo(readableInstant7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        org.joda.time.Chronology chronology81 = null;
        mutablePeriod77.setPeriod((long) (byte) 10, (long) 'a', chronology81);
        mutablePeriod77.setDays((int) (short) -1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT1M0.100S" + "'", str44, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "P-1DT0.087S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "P-1DT0.087S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "P-1DT0.087S");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        mutablePeriod1.setPeriod((long) (byte) 10, (long) (short) 1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod1.toDurationTo(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(10L, periodType11, chronology12);
        mutablePeriod13.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = mutablePeriod13.toDurationFrom(readableInstant17);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType24 = mutablePeriod23.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant9, (org.joda.time.ReadableDuration) duration18, periodType24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableInstant7, readableInstant8, periodType24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((java.lang.Object) duration6, periodType24, chronology27);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        boolean boolean14 = mutablePeriod5.equals((java.lang.Object) 0.0d);
        org.joda.time.ReadableInterval readableInterval15 = null;
        mutablePeriod5.setPeriod(readableInterval15);
        org.joda.time.PeriodType periodType17 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType17);
        int int19 = mutablePeriod18.getWeeks();
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod18.setPeriod(1L, (long) (byte) 100, chronology22);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        mutablePeriod45.setMillis(0);
        java.lang.Object obj48 = mutablePeriod45.clone();
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "P100WT52H-1M");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "P100WT52H-1M");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "P100WT52H-1M");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) 8, chronology2);
        mutablePeriod3.add((long) 96);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod3.toMutablePeriod();
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        int int7 = mutablePeriod4.size();
        int int8 = mutablePeriod4.getMinutes();
        mutablePeriod4.addHours((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 100, (int) '4', (int) (byte) 1, (int) (short) 0, (int) (byte) 1, (int) (short) 1, 97, (int) (byte) 1);
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
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType42, chronology46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) (short) 0, 1, (int) ' ', (int) '#', (int) (short) 10, (int) ' ', (int) (short) 0, 0, periodType42);
        org.joda.time.Chronology chronology51 = null;
        mutablePeriod48.setPeriod((long) 1, (long) 100, chronology51);
        org.joda.time.Chronology chronology54 = null;
        mutablePeriod48.add(0L, chronology54);
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod48);
        int int57 = mutablePeriod48.getSeconds();
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) '#', (int) (short) -1, 35, 97, (int) (short) 0, (int) (short) 1, (int) ' ', (int) ' ');
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod8.add(readableInterval9);
        int int11 = mutablePeriod8.getMonths();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        mutablePeriod1.addYears((int) (short) 10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray42 = mutablePeriod1.getFieldTypes();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(durationFieldTypeArray42);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (byte) 0, chronology2);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (byte) 100, (int) ' ', 32, (int) (byte) 10, (-1), 1, (-1), (-1), periodType33);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = mutablePeriod2.indexOf(durationFieldType3);
        mutablePeriod2.addYears((int) (short) 1);
        mutablePeriod2.setDays((int) (short) 0);
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod2.setPeriod(readableInterval9);
        mutablePeriod2.add((-1L));
        mutablePeriod2.addMillis(96);
        org.joda.time.MutablePeriod mutablePeriod15 = mutablePeriod2.copy();
        mutablePeriod2.setYears(4);
        org.joda.time.ReadableInterval readableInterval18 = null;
        mutablePeriod2.setPeriod(readableInterval18);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(mutablePeriod15);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int int8 = mutablePeriod7.getYears();
        mutablePeriod7.setPeriod((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = mutablePeriod16.toDurationFrom(readableInstant17);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType34 = null;
        int int35 = mutablePeriod33.indexOf(durationFieldType34);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        mutablePeriod33.add((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.PeriodType periodType44 = mutablePeriod33.getPeriodType();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType44, chronology45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType44);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(readableInstant11, (org.joda.time.ReadableDuration) duration18, periodType44);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (byte) 1, 10L, chronology51);
        mutablePeriod48.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod52);
        mutablePeriod7.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(periodType44);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1, chronology2);
        mutablePeriod3.addWeeks(35);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        int int12 = mutablePeriod8.getDays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = mutablePeriod8.getFieldTypes();
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod8.add((long) (short) 1, chronology15);
        mutablePeriod8.setDays((int) (byte) 0);
        mutablePeriod8.setSeconds((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod5.toDurationFrom(readableInstant13);
        mutablePeriod5.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter17 = null;
        java.lang.String str18 = mutablePeriod5.toString(periodFormatter17);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType34 = null;
        int int35 = mutablePeriod33.indexOf(durationFieldType34);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod40.addHours((-1));
        mutablePeriod33.add((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.PeriodType periodType44 = mutablePeriod33.getPeriodType();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType44, chronology45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType44);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod5, periodType44, chronology48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((-1L), periodType44, chronology50);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT1M0.100S" + "'", str18, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(periodType44);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod7.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, readableInstant17);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration16, periodType19);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration16);
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod3.setPeriod(readableInterval6);
        org.joda.time.MutablePeriod mutablePeriod17 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray18 = mutablePeriod17.getValues();
        int int19 = mutablePeriod17.getHours();
        org.joda.time.MutablePeriod mutablePeriod20 = mutablePeriod17.toMutablePeriod();
        org.joda.time.PeriodType periodType21 = mutablePeriod17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType21, chronology23);
        int int25 = mutablePeriod24.size();
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        java.lang.String str58 = mutablePeriod56.toString(periodFormatter57);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0.100S" + "'", str58, "PT0.100S");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        int int41 = mutablePeriod3.getHours();
        mutablePeriod3.addMonths((-98));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        org.joda.time.DurationFieldType durationFieldType26 = null;
        boolean boolean27 = mutablePeriod4.isSupported(durationFieldType26);
        int int28 = mutablePeriod4.getMillis();
        int int29 = mutablePeriod4.getMonths();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod34.setPeriod((long) 100, chronology38);
        mutablePeriod34.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = mutablePeriod34.toDurationFrom(readableInstant42);
        mutablePeriod34.setHours((int) (short) 0);
        mutablePeriod34.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod34.clear();
        org.joda.time.DurationFieldType durationFieldType56 = null;
        boolean boolean57 = mutablePeriod34.isSupported(durationFieldType56);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) '#', chronology59);
        mutablePeriod60.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        mutablePeriod60.setPeriod(readableInstant63, readableInstant64);
        org.joda.time.DurationFieldType[] durationFieldTypeArray66 = mutablePeriod60.getFieldTypes();
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(10L, periodType68, chronology69);
        int int71 = mutablePeriod70.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod70);
        org.joda.time.DurationFieldType durationFieldType74 = mutablePeriod70.getFieldType((int) (short) 1);
        mutablePeriod60.set(durationFieldType74, (int) '#');
        boolean boolean77 = mutablePeriod34.isSupported(durationFieldType74);
        int int78 = mutablePeriod4.get(durationFieldType74);
        java.lang.Object obj79 = mutablePeriod4.clone();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj79), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "PT0S");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 100, (long) (-1));
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = mutablePeriod17.indexOf(durationFieldType18);
        mutablePeriod7.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (short) -1, chronology22);
        mutablePeriod23.setHours((int) (short) -1);
        boolean boolean26 = mutablePeriod7.equals((java.lang.Object) (short) -1);
        mutablePeriod7.setWeeks((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType30 = mutablePeriod7.getFieldType((int) (byte) 1);
        mutablePeriod2.add(durationFieldType30, 97);
        org.joda.time.format.PeriodFormatter periodFormatter33 = null;
        java.lang.String str34 = mutablePeriod2.toString(periodFormatter33);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P97MT0.101S" + "'", str34, "P97MT0.101S");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(10L, (long) 97);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod2.setPeriod(100L, chronology9);
        mutablePeriod2.setPeriod((int) 'a', (int) ' ', (int) '4', (int) (byte) 100, (int) (short) 0, (int) ' ', (-1), (int) ' ');
        mutablePeriod2.setDays((int) (short) 100);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod2.add((long) 'a', chronology23);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) ' ', (int) (short) 0, (int) (short) -1);
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((java.lang.Object) (short) -1, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod4.toString(periodFormatter9);
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
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant45);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod53.addHours((-1));
        org.joda.time.Chronology chronology57 = null;
        mutablePeriod53.setPeriod((long) 100, chronology57);
        mutablePeriod53.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType61 = mutablePeriod53.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(periodType61);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 10, periodType61, chronology63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType61, chronology65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant45, periodType61, chronology67);
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
        int int93 = mutablePeriod68.get(durationFieldType90);
        int int94 = mutablePeriod4.get(durationFieldType90);
        mutablePeriod4.add((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant97 = null;
        org.joda.time.ReadableInstant readableInstant98 = null;
        mutablePeriod4.setPeriod(readableInstant97, readableInstant98);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT97H1M0.097S" + "'", str10, "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(durationFieldType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        org.joda.time.Chronology chronology52 = null;
        mutablePeriod10.setPeriod(0L, chronology52);
        mutablePeriod10.add((long) 8);
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        mutablePeriod7.setDays((-1));
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = mutablePeriod7.get(durationFieldType10);
        int int12 = mutablePeriod7.getMinutes();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType15 = mutablePeriod14.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType15, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) '#', chronology23);
        mutablePeriod24.setPeriod((int) (short) 0, 0, 0, (int) (short) 100, (int) (byte) 10, (int) (short) -1, 4, 1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod24.toDurationTo(readableInstant34);
        mutablePeriod20.setPeriod((org.joda.time.ReadableDuration) duration35);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(10L, periodType7, chronology8);
        mutablePeriod9.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod9.toDurationFrom(readableInstant13);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod19.toDurationTo(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType32 = null;
        int int33 = mutablePeriod31.indexOf(durationFieldType32);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod38.addHours((-1));
        mutablePeriod31.add((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.PeriodType periodType42 = mutablePeriod31.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType42, chronology44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType42);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(readableInstant5, (org.joda.time.ReadableDuration) duration14, periodType42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(readableInstant4, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant49 = null;
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
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 0, periodType82);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant49, periodType82);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType82);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType82);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(periodType82);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod19.setPeriod((long) 100, chronology23);
        mutablePeriod19.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType27 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod32.setPeriod((long) 100, chronology36);
        mutablePeriod32.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = mutablePeriod32.toDurationFrom(readableInstant40);
        org.joda.time.Chronology chronology42 = null;
        mutablePeriod19.setPeriod((org.joda.time.ReadableDuration) duration41, chronology42);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType53 = null;
        int int54 = mutablePeriod52.indexOf(durationFieldType53);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod59.addHours((-1));
        mutablePeriod52.add((org.joda.time.ReadablePeriod) mutablePeriod59);
        org.joda.time.PeriodType periodType63 = mutablePeriod52.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType63, chronology65);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod(readableInstant14, (org.joda.time.ReadableDuration) duration41, periodType63);
        mutablePeriod67.setSeconds(0);
        mutablePeriod12.add((org.joda.time.ReadablePeriod) mutablePeriod67);
        mutablePeriod67.setSeconds((int) (short) 0);
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
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(periodType63);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod4.toString(periodFormatter9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod4.getFieldTypes();
        mutablePeriod4.addWeeks(52);
        mutablePeriod4.addSeconds(197);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT97H1M0.097S" + "'", str10, "PT97H1M0.097S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        mutablePeriod4.addMonths((int) '#');
        java.lang.Object obj11 = mutablePeriod4.clone();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = mutablePeriod16.toDurationFrom(readableInstant17);
        mutablePeriod16.addMonths((int) (short) 0);
        int int21 = mutablePeriod16.getYears();
        mutablePeriod16.setHours(0);
        boolean boolean24 = mutablePeriod4.equals((java.lang.Object) mutablePeriod16);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "P35MT97H97M0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "P35MT97H97M0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "P35MT97H97M0.097S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 52, (long) (byte) 10);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        org.joda.time.ReadableInterval readableInterval27 = null;
        mutablePeriod26.setPeriod(readableInterval27);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addMinutes((int) (byte) -1);
        int int36 = mutablePeriod33.getSeconds();
        int int37 = mutablePeriod33.getWeeks();
        mutablePeriod33.add((long) ' ');
        boolean boolean40 = mutablePeriod26.equals((java.lang.Object) mutablePeriod33);
        mutablePeriod33.setMinutes(32);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod51.addHours((-1));
        org.joda.time.Chronology chronology55 = null;
        mutablePeriod51.setPeriod((long) 100, chronology55);
        mutablePeriod51.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType59 = mutablePeriod51.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(periodType59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 10, periodType59, chronology61);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(readableInstant44, readableInstant45, periodType59);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, readableInstant43, periodType59);
        java.lang.Class<?> wildcardClass65 = periodType59.getClass();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType34, chronology35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        mutablePeriod36.setPeriod(readableInstant37, readableInstant38);
        int int40 = mutablePeriod36.getMinutes();
        int[] intArray41 = mutablePeriod36.getValues();
        mutablePeriod36.clear();
        mutablePeriod31.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        mutablePeriod4.setPeriod((long) 1);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "PT0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "PT0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "PT0.001S");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.joda.time.MutablePeriod mutablePeriod9 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray10 = mutablePeriod9.getValues();
        int int11 = mutablePeriod9.getHours();
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod9.toMutablePeriod();
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
        mutablePeriod9.add((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 97, chronology44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod63.addHours((-1));
        org.joda.time.Chronology chronology67 = null;
        mutablePeriod63.setPeriod((long) 100, chronology67);
        mutablePeriod63.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = mutablePeriod63.toDurationFrom(readableInstant71);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType79 = null;
        int int80 = mutablePeriod78.indexOf(durationFieldType79);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod85.addHours((-1));
        mutablePeriod78.add((org.joda.time.ReadablePeriod) mutablePeriod85);
        org.joda.time.PeriodType periodType89 = mutablePeriod78.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration72, readableInstant73, periodType89);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((long) (short) 10, periodType89);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod(0L, 1L, periodType89);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType89);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod(readableInstant46, readableInstant47, periodType89);
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod((java.lang.Object) chronology44, periodType89);
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, readableInstant42, periodType89);
        org.joda.time.MutablePeriod mutablePeriod97 = new org.joda.time.MutablePeriod(10, 97, 96, 107, (int) '4', (int) 'a', (int) (short) 1, (int) '4', periodType89);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(periodType89);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        int int1 = mutablePeriod0.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod6.toDurationFrom(readableInstant14);
        mutablePeriod6.setHours((int) (short) 0);
        mutablePeriod6.setPeriod((long) 100, (long) (short) 1);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = mutablePeriod29.indexOf(durationFieldType30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod36.addHours((-1));
        mutablePeriod29.add((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.PeriodType periodType40 = mutablePeriod29.getPeriodType();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType40, chronology41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableDuration21, readableInstant22, periodType40);
        mutablePeriod6.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod43, chronology45);
        boolean boolean47 = mutablePeriod0.equals((java.lang.Object) mutablePeriod43);
        mutablePeriod43.setSeconds(197);
        org.joda.time.Period period50 = mutablePeriod43.toPeriod();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(period50);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        boolean boolean14 = mutablePeriod5.equals((java.lang.Object) 0.0d);
        org.joda.time.ReadableInterval readableInterval15 = null;
        mutablePeriod5.setPeriod(readableInterval15);
        org.joda.time.PeriodType periodType17 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType17);
        int int19 = mutablePeriod18.getWeeks();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod26.setPeriod((long) 100, chronology30);
        mutablePeriod26.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType34 = mutablePeriod26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(periodType34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) (short) -1, (long) 97, periodType34, chronology36);
        org.joda.time.Chronology chronology38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((java.lang.Object) int19, periodType34, chronology38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(periodType34);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType5, chronology6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod7.toDurationFrom(readableInstant8);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = mutablePeriod16.indexOf(durationFieldType17);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        mutablePeriod16.add((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.PeriodType periodType27 = mutablePeriod16.getPeriodType();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType27, chronology28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(readableInstant3, (org.joda.time.ReadableDuration) duration9, periodType27);
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration9);
        org.joda.time.DurationFieldType[] durationFieldTypeArray32 = mutablePeriod1.getFieldTypes();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(durationFieldTypeArray32);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 10, (long) '4', chronology2);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod8.addHours((-1));
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.setPeriod((long) 100, chronology12);
        mutablePeriod8.setSeconds(8);
        org.joda.time.PeriodType periodType16 = mutablePeriod8.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) ' ', (int) (short) 100, (int) (byte) 1, 97, (int) (short) 1, (int) '#', (int) (short) 0, 100);
        org.joda.time.format.PeriodFormatter periodFormatter26 = null;
        java.lang.String str27 = mutablePeriod25.toString(periodFormatter26);
        org.joda.time.ReadableInterval readableInterval28 = null;
        mutablePeriod25.setPeriod(readableInterval28);
        mutablePeriod25.addMillis(0);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) mutablePeriod25);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = mutablePeriod38.toDurationFrom(readableInstant39);
        mutablePeriod38.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        mutablePeriod38.setPeriod(readableInstant43, readableInstant44);
        int int46 = mutablePeriod38.getMillis();
        mutablePeriod38.clear();
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(10, (-1), (int) (byte) -1, (-1));
        mutablePeriod53.addDays(0);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(readableInstant56, readableInstant57, periodType58);
        org.joda.time.Chronology chronology62 = null;
        mutablePeriod59.setPeriod((long) 8, 100L, chronology62);
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
        boolean boolean82 = mutablePeriod59.isSupported(durationFieldType80);
        mutablePeriod53.set(durationFieldType80, 0);
        boolean boolean85 = mutablePeriod8.isSupported(durationFieldType80);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "P32Y100M1W97DT1H35M0.100S" + "'", str27, "P32Y100M1W97DT1H35M0.100S");
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(durationFieldType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, 0L, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, chronology4);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 32, (long) 32, chronology2);
        org.joda.time.MutablePeriod mutablePeriod5 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        mutablePeriod5.addDays(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod5.toDurationTo(readableInstant8);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration9);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.getMillis();
        int int5 = mutablePeriod3.getDays();
        mutablePeriod3.setPeriod((long) (byte) 10, (long) 0);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) -1, chronology10);
        mutablePeriod11.setHours((int) (short) -1);
        int int14 = mutablePeriod11.getMinutes();
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        mutablePeriod3.addWeeks(107);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod2.toDurationTo(readableInstant30);
        java.lang.String str32 = mutablePeriod2.toString();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT0S" + "'", str32, "PT0S");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod7.toDurationFrom(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
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
        mutablePeriod27.add((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 8, (int) (byte) 10, 1);
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
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod27, periodType80);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(readableInstant10, readableInstant11, periodType80);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration9, periodType80);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) 107, (-1L), periodType80);
        org.joda.time.ReadableInterval readableInterval90 = null;
        mutablePeriod89.setPeriod(readableInterval90);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PT1M0.100S" + "'", str54, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(periodType80);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        mutablePeriod1.setPeriod(0L, (long) '#');
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
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 52, (long) (-1));
        int int3 = mutablePeriod2.getYears();
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = mutablePeriod2.toString(periodFormatter4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.053S" + "'", str5, "PT0.053S");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        org.joda.time.format.PeriodFormatter periodFormatter71 = null;
        java.lang.String str72 = mutablePeriod4.toString(periodFormatter71);
        mutablePeriod4.addMillis(96);
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PT97H1M0.097S" + "'", str72, "PT97H1M0.097S");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType16 = null;
        int int17 = mutablePeriod15.indexOf(durationFieldType16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addHours((-1));
        mutablePeriod15.add((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.PeriodType periodType26 = mutablePeriod15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType26, chronology28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 0, periodType26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 100, periodType26, chronology31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(100L, periodType26);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType26);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 97, (long) (short) 10, periodType26);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant36, readableInstant37, periodType38);
        int int40 = mutablePeriod39.size();
        mutablePeriod39.addYears(10);
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
        int int69 = mutablePeriod39.get(durationFieldType66);
        mutablePeriod35.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        mutablePeriod39.addMinutes((-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        mutablePeriod7.setPeriod(100, 1, (int) 'a', (int) (byte) 100, (int) (short) 0, 1, (int) ' ', (int) '#');
        mutablePeriod7.addMonths(100);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(periodType69);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.addMinutes(1);
        int int5 = mutablePeriod2.getMillis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, (long) (-98));
        mutablePeriod2.setWeeks(0);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 197, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = mutablePeriod2.getValue(107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 107");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        org.joda.time.Period period8 = mutablePeriod4.toPeriod();
        mutablePeriod4.add((-41), (-1), (int) (byte) -1, (int) 'a', (int) (short) 0, (int) (byte) 1, 35, (-41));
        int int19 = mutablePeriod4.getValue(0);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-41) + "'", int19 == (-41));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        mutablePeriod1.addWeeks((int) (short) 100);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        int int22 = mutablePeriod3.getValue((int) (byte) 1);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod27.addHours((-1));
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod27.setPeriod((long) 100, chronology31);
        mutablePeriod27.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = mutablePeriod27.toDurationFrom(readableInstant35);
        mutablePeriod27.addMinutes((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType39 = null;
        int int40 = mutablePeriod27.indexOf(durationFieldType39);
        mutablePeriod27.addWeeks((int) '4');
        mutablePeriod27.add((long) 97);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod49.addHours((-1));
        org.joda.time.Chronology chronology53 = null;
        mutablePeriod49.setPeriod((long) 100, chronology53);
        mutablePeriod49.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = mutablePeriod49.toDurationFrom(readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType65 = null;
        int int66 = mutablePeriod64.indexOf(durationFieldType65);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod71.addHours((-1));
        mutablePeriod64.add((org.joda.time.ReadablePeriod) mutablePeriod71);
        org.joda.time.PeriodType periodType75 = mutablePeriod64.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration58, readableInstant59, periodType75);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration58, readableInstant77);
        mutablePeriod27.add((org.joda.time.ReadableDuration) duration58);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration58);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration58);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(periodType75);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        mutablePeriod4.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        int int25 = mutablePeriod4.getMinutes();
        org.joda.time.DurationFieldType[] durationFieldTypeArray26 = mutablePeriod4.getFieldTypes();
        int int27 = mutablePeriod4.getWeeks();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, (long) (short) 0, chronology2);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(10L, (long) (byte) -1, periodType29, chronology34);
        int int36 = mutablePeriod35.getYears();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (short) -1, periodType37);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType37, chronology44);
        org.joda.time.format.PeriodFormatter periodFormatter46 = null;
        java.lang.String str47 = mutablePeriod45.toString(periodFormatter46);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PT0.100S" + "'", str47, "PT0.100S");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        mutablePeriod72.addMillis((int) '#');
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
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 0, (int) '#', (int) (short) 0, 0);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationTo(readableInstant5);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant38);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) (short) 10, periodType31);
        mutablePeriod33.addHours(24);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, chronology2);
        int[] intArray4 = mutablePeriod3.getValues();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod3.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration6);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int int8 = mutablePeriod7.getYears();
        mutablePeriod7.setPeriod((long) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod15.addHours((-1));
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod15.setPeriod((long) 100, chronology19);
        mutablePeriod15.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod15.toDurationFrom(readableInstant23);
        mutablePeriod15.setHours((int) (short) 0);
        mutablePeriod15.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod15.clear();
        org.joda.time.DurationFieldType durationFieldType37 = null;
        boolean boolean38 = mutablePeriod15.isSupported(durationFieldType37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) '#', chronology40);
        mutablePeriod41.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        mutablePeriod41.setPeriod(readableInstant44, readableInstant45);
        org.joda.time.DurationFieldType[] durationFieldTypeArray47 = mutablePeriod41.getFieldTypes();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(10L, periodType49, chronology50);
        int int52 = mutablePeriod51.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod51);
        org.joda.time.DurationFieldType durationFieldType55 = mutablePeriod51.getFieldType((int) (short) 1);
        mutablePeriod41.set(durationFieldType55, (int) '#');
        boolean boolean58 = mutablePeriod15.isSupported(durationFieldType55);
        boolean boolean59 = mutablePeriod7.isSupported(durationFieldType55);
        int int60 = mutablePeriod7.getSeconds();
        mutablePeriod7.setPeriod((long) 96);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 1, (long) (byte) 100, chronology2);
        int int5 = mutablePeriod3.getValue(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = mutablePeriod1.isSupported(durationFieldType12);
        java.lang.Object obj14 = mutablePeriod1.clone();
        mutablePeriod1.add(0, (int) (short) 100, 10, 97, (int) '4', (int) '4', (int) '4', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = mutablePeriod1.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "P100Y200M110W97DT152H52M152S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "P100Y200M110W97DT152H52M152S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "P100Y200M110W97DT152H52M152S");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 197, (long) (byte) -1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod2.setPeriod(readableDuration3, chronology4);
        mutablePeriod2.setHours((int) (short) 0);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        mutablePeriod72.addMinutes((int) (short) 0);
        org.joda.time.ReadableInterval readableInterval77 = null;
        mutablePeriod72.setPeriod(readableInterval77);
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
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, (long) 8, chronology2);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        int int12 = mutablePeriod4.getMillis();
        java.lang.Object obj13 = mutablePeriod4.clone();
        int int14 = mutablePeriod4.getMillis();
        mutablePeriod4.clear();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "PT0S");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        mutablePeriod32.setPeriod((long) (byte) 0, (long) (-98));
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(mutablePeriod32);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) (-41), periodType46);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(periodType46);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        mutablePeriod16.addMinutes(0);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = mutablePeriod30.toDurationFrom(readableInstant31);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType40 = null;
        int int41 = mutablePeriod39.indexOf(durationFieldType40);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod46.addHours((-1));
        mutablePeriod39.add((org.joda.time.ReadablePeriod) mutablePeriod46);
        org.joda.time.PeriodType periodType50 = mutablePeriod39.getPeriodType();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType50, chronology51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableInstant26, (org.joda.time.ReadableDuration) duration32, periodType50);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType50, chronology54);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod55);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(periodType50);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        mutablePeriod4.addSeconds(1);
        int[] intArray9 = mutablePeriod4.getValues();
        mutablePeriod4.addSeconds(4);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant12, readableInstant13, periodType14);
        int int16 = mutablePeriod15.size();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod22.toDurationFrom(readableInstant23);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType40 = null;
        int int41 = mutablePeriod39.indexOf(durationFieldType40);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod46.addHours((-1));
        mutablePeriod39.add((org.joda.time.ReadablePeriod) mutablePeriod46);
        org.joda.time.PeriodType periodType50 = mutablePeriod39.getPeriodType();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType50, chronology51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType50);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableInstant17, (org.joda.time.ReadableDuration) duration24, periodType50);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = mutablePeriod61.toDurationFrom(readableInstant62);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType79 = null;
        int int80 = mutablePeriod78.indexOf(durationFieldType79);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod85.addHours((-1));
        mutablePeriod78.add((org.joda.time.ReadablePeriod) mutablePeriod85);
        org.joda.time.PeriodType periodType89 = mutablePeriod78.getPeriodType();
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType89, chronology90);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType89);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod(readableInstant56, (org.joda.time.ReadableDuration) duration63, periodType89);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant55, periodType89);
        boolean boolean95 = mutablePeriod15.equals((java.lang.Object) periodType89);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod15);
        mutablePeriod4.setPeriod((long) 24);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 97, 1, 1, 97]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(periodType89);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        mutablePeriod1.add((long) (byte) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod1.toDurationFrom(readableInstant13);
        org.junit.Assert.assertNotNull(duration14);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = mutablePeriod2.indexOf(durationFieldType3);
        mutablePeriod2.addYears((int) (short) 1);
        mutablePeriod2.add((int) '#', (int) (byte) 10, 8, (int) 'a', 100, (int) (short) 0, (int) (short) 1, (int) (short) 1);
        java.lang.String str16 = mutablePeriod2.toString();
        org.joda.time.Period period17 = mutablePeriod2.toPeriod();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P36Y10M8W97DT100H1S" + "'", str16, "P36Y10M8W97DT100H1S");
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        mutablePeriod8.setSeconds(197);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', 8, 100, (int) (short) 1);
        int int5 = mutablePeriod4.getWeeks();
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod4.copy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) ' ');
        int int2 = mutablePeriod1.size();
        mutablePeriod1.add((int) (short) 1, (-1), (int) (byte) 100, (int) '#', (int) (byte) 0, 35, (int) (byte) 1, (int) 'a');
        int[] intArray12 = mutablePeriod1.getValues();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 100, 35, 0, 35, 1, 129]");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        mutablePeriod4.addDays(100);
        mutablePeriod4.setDays((int) '#');
        mutablePeriod4.setPeriod(35, 35, 197, (int) (byte) -1, (int) (byte) 1, 52, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 1, 4, 10, (int) (short) 10, (int) 'a', 0, (int) (short) 10, (int) '#');
        int int9 = mutablePeriod8.getMillis();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant17, readableInstant18, periodType19);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod20.setPeriod((long) 8, 100L, chronology23);
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
        boolean boolean43 = mutablePeriod20.isSupported(durationFieldType41);
        int int44 = mutablePeriod4.indexOf(durationFieldType41);
        int int45 = mutablePeriod4.size();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(97, (int) (short) 0, (-1), (int) (short) -1, (int) '#', 52, (int) ' ', (int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) '#', 100, 0);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(periodType60);
        org.joda.time.Chronology chronology63 = null;
        mutablePeriod61.add(1L, chronology63);
        org.joda.time.DurationFieldType durationFieldType65 = null;
        int int66 = mutablePeriod61.indexOf(durationFieldType65);
        int int67 = mutablePeriod61.getMinutes();
        mutablePeriod61.setSeconds((int) (byte) 0);
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(10L, periodType71, chronology72);
        int int74 = mutablePeriod73.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod73);
        org.joda.time.DurationFieldType durationFieldType77 = mutablePeriod73.getFieldType((int) (short) 1);
        int int78 = mutablePeriod61.indexOf(durationFieldType77);
        int int79 = mutablePeriod59.get(durationFieldType77);
        int int80 = mutablePeriod54.get(durationFieldType77);
        int int81 = mutablePeriod4.indexOf(durationFieldType77);
        org.joda.time.MutablePeriod mutablePeriod82 = mutablePeriod4.copy();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(durationFieldType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(mutablePeriod82);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.joda.time.MutablePeriod mutablePeriod75 = mutablePeriod15.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval76 = null;
        mutablePeriod15.add(readableInterval76);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(mutablePeriod75);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', 0, 52, 52, 8, (int) (byte) 10, (int) '#', 1);
        mutablePeriod8.addSeconds((int) '4');
        int int11 = mutablePeriod8.getSeconds();
        int[] intArray12 = mutablePeriod8.getValues();
        mutablePeriod8.setMinutes(1);
        org.joda.time.PeriodType periodType15 = mutablePeriod8.getPeriodType();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 87 + "'", int11 == 87);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, 52, 52, 8, 10, 87, 1]");
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        org.joda.time.MutablePeriod mutablePeriod45 = mutablePeriod4.copy();
        org.joda.time.MutablePeriod mutablePeriod46 = mutablePeriod4.toMutablePeriod();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertNotNull(mutablePeriod46);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType33, chronology34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) '#', chronology37);
        mutablePeriod38.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType48 = null;
        int int49 = mutablePeriod47.indexOf(durationFieldType48);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod54.addHours((-1));
        mutablePeriod47.add((org.joda.time.ReadablePeriod) mutablePeriod54);
        org.joda.time.PeriodType periodType58 = mutablePeriod47.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType58);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod38, periodType58);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((java.lang.Object) periodType33, periodType58, chronology61);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) '#', (int) (short) 0, (-1), (int) (byte) -1, 10, (int) (short) 10, 8, periodType58);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant22, periodType58);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant65);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(periodType58);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(197, (-1), 35, 4, 1, (int) '#', (int) ' ', 35);
        mutablePeriod8.setPeriod((int) (short) -1, 87, 87, (int) (short) 100, (int) (short) 100, 107, 97, 107);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setSeconds(8);
        org.joda.time.PeriodType periodType13 = mutablePeriod5.getPeriodType();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 0, periodType16, chronology17);
        int int19 = mutablePeriod18.getYears();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod24.toDurationFrom(readableInstant25);
        mutablePeriod24.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(10L, periodType30, chronology31);
        int int33 = mutablePeriod32.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod32);
        org.joda.time.DurationFieldType durationFieldType36 = mutablePeriod32.getFieldType((int) (short) 1);
        int int37 = mutablePeriod24.get(durationFieldType36);
        boolean boolean38 = mutablePeriod18.isSupported(durationFieldType36);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addMinutes((int) (byte) -1);
        mutablePeriod43.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = mutablePeriod43.toDurationFrom(readableInstant48);
        mutablePeriod18.add((org.joda.time.ReadableDuration) duration49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = mutablePeriod58.toDurationTo(readableInstant59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType71 = null;
        int int72 = mutablePeriod70.indexOf(durationFieldType71);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod77.addHours((-1));
        mutablePeriod70.add((org.joda.time.ReadablePeriod) mutablePeriod77);
        org.joda.time.PeriodType periodType81 = mutablePeriod70.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType81);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType81, chronology83);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration60, readableInstant61, periodType81);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(readableInstant52, readableInstant53, periodType81);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration49, readableInstant51, periodType81);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(readableInstant14, (org.joda.time.ReadableDuration) duration49);
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration49);
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration49);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(periodType81);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 100, chronology16);
        mutablePeriod12.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod12.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType41 = mutablePeriod40.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27, periodType41);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant24, periodType41);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(97, 107, 0, (int) (short) -1, (int) (byte) -1, 4, (int) (short) 1, (int) '4', periodType41);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.lang.Object obj3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(obj3);
        org.joda.time.PeriodType periodType5 = mutablePeriod4.getPeriodType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) ' ', periodType5, chronology6);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 107, (long) 96, periodType5);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        int int75 = mutablePeriod74.getMinutes();
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 37 + "'", int75 == 37);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) '#', chronology4);
        mutablePeriod5.setMinutes(8);
        mutablePeriod5.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.addHours((-1));
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod14.setPeriod((long) 100, chronology18);
        mutablePeriod14.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod14.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant24);
        org.joda.time.Chronology chronology26 = null;
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration23, chronology26);
        mutablePeriod5.setHours((int) '4');
        mutablePeriod5.addMillis(8);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = mutablePeriod5.toDurationTo(readableInstant32);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(10L, periodType38, chronology39);
        mutablePeriod40.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = mutablePeriod40.toDurationFrom(readableInstant44);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = mutablePeriod50.toDurationTo(readableInstant51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType63 = null;
        int int64 = mutablePeriod62.indexOf(durationFieldType63);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod69.addHours((-1));
        mutablePeriod62.add((org.joda.time.ReadablePeriod) mutablePeriod69);
        org.joda.time.PeriodType periodType73 = mutablePeriod62.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType73);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType73, chronology75);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration52, readableInstant53, periodType73);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(readableInstant36, (org.joda.time.ReadableDuration) duration45, periodType73);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) '#', 1L, periodType73, chronology79);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration33, periodType73);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 35, (long) '#', periodType73);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(periodType73);
        int int84 = mutablePeriod83.getYears();
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType15 = mutablePeriod7.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 10, periodType15, chronology17);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 24, (long) (short) 10, periodType15);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, (long) 10, chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        mutablePeriod3.setPeriod(readableInstant4, readableInstant5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        mutablePeriod3.setPeriod(readableInterval7);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = mutablePeriod13.indexOf(durationFieldType14);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod13, chronology24);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) '#', 100, 0);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(periodType31);
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod32.add(1L, chronology34);
        org.joda.time.DurationFieldType durationFieldType36 = null;
        int int37 = mutablePeriod32.indexOf(durationFieldType36);
        int int38 = mutablePeriod32.getMinutes();
        mutablePeriod32.setSeconds((int) (byte) 0);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(10L, periodType42, chronology43);
        int int45 = mutablePeriod44.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod44);
        org.joda.time.DurationFieldType durationFieldType48 = mutablePeriod44.getFieldType((int) (short) 1);
        int int49 = mutablePeriod32.indexOf(durationFieldType48);
        int int50 = mutablePeriod30.get(durationFieldType48);
        boolean boolean51 = mutablePeriod13.isSupported(durationFieldType48);
        int int52 = mutablePeriod3.indexOf(durationFieldType48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMillis((int) (byte) -1);
        int int16 = mutablePeriod4.getWeeks();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod4.add((long) 197, chronology19);
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod4.add((long) (byte) -1, chronology22);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        mutablePeriod4.setMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        mutablePeriod4.setPeriod(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableInstant27, readableDuration28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(10L, periodType33, chronology34);
        mutablePeriod35.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = mutablePeriod35.toDurationFrom(readableInstant39);
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
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(readableInstant31, (org.joda.time.ReadableDuration) duration40, periodType68);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant30, (org.joda.time.ReadableDuration) duration40);
        org.joda.time.Chronology chronology75 = null;
        mutablePeriod29.setPeriod((org.joda.time.ReadableDuration) duration40, chronology75);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration40);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.addMillis((int) (short) 10);
        org.joda.time.format.PeriodFormatter periodFormatter10 = null;
        java.lang.String str11 = mutablePeriod3.toString(periodFormatter10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = mutablePeriod3.getFieldType(107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 107");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0.110S" + "'", str11, "PT0.110S");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        mutablePeriod2.setWeeks((int) '#');
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(periodType80);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(100L, (long) (byte) -1);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addMillis(1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        mutablePeriod0.setPeriod(readableInstant3, readableInstant4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(10L, periodType7, chronology8);
        int int10 = mutablePeriod9.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod9);
        org.joda.time.DurationFieldType durationFieldType13 = mutablePeriod9.getFieldType((int) (short) 1);
        int int14 = mutablePeriod0.get(durationFieldType13);
        java.lang.String str15 = mutablePeriod0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType17 = mutablePeriod0.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0S" + "'", str15, "PT0S");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = mutablePeriod10.indexOf(durationFieldType11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType21 = mutablePeriod10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (short) -1, 0L, periodType21, chronology23);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 100, (long) (byte) 10, periodType21);
        mutablePeriod25.setMonths((int) ' ');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(0L, (long) (byte) 10, chronology2);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod33.toDurationFrom(readableInstant34);
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration35, chronology36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant40);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod2.toDurationTo(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31);
        mutablePeriod32.setMonths(52);
        mutablePeriod32.setPeriod((int) (short) 1, 97, (int) ' ', 87, (int) (short) 100, (int) (byte) -1, 107, (int) (short) 1);
        mutablePeriod32.setSeconds((int) (byte) 0);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration30);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 197, (long) (byte) -1);
        mutablePeriod2.addMinutes((int) 'a');
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(periodType43);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = mutablePeriod51.toDurationFrom(readableInstant52);
        org.joda.time.format.PeriodFormatter periodFormatter54 = null;
        java.lang.String str55 = mutablePeriod51.toString(periodFormatter54);
        org.joda.time.MutablePeriod mutablePeriod56 = mutablePeriod51.copy();
        mutablePeriod51.addMonths((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PT0S" + "'", str55, "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod56);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(periodType29);
        mutablePeriod35.addYears(10);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType5 = mutablePeriod4.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setValue((int) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        int int26 = mutablePeriod24.size();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        int int12 = mutablePeriod8.getDays();
        java.lang.Object obj13 = null;
        boolean boolean14 = mutablePeriod8.equals(obj13);
        int int15 = mutablePeriod8.getYears();
        int int16 = mutablePeriod8.getSeconds();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.addHours((int) (byte) 10);
        org.joda.time.PeriodType periodType6 = mutablePeriod3.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add(durationFieldType7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'null'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT0.001S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, (int) (short) 10, (int) (short) 0, 52);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod4.setPeriod((long) (short) 10, chronology6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant8, readableInstant9, periodType10);
        int int12 = mutablePeriod11.size();
        mutablePeriod11.addYears(10);
        java.lang.Object obj15 = mutablePeriod11.clone();
        org.joda.time.MutablePeriod mutablePeriod17 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray18 = mutablePeriod17.getValues();
        int int19 = mutablePeriod17.getHours();
        org.joda.time.MutablePeriod mutablePeriod20 = mutablePeriod17.toMutablePeriod();
        mutablePeriod11.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        mutablePeriod11.addWeeks((int) '#');
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "P35WT97H1M0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "P35WT97H1M0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "P35WT97H1M0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod20);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray34 = mutablePeriod1.getFieldTypes();
        int int35 = mutablePeriod1.getSeconds();
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '4', 100L);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(0L, (long) (short) -1);
        int int3 = mutablePeriod2.getYears();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        org.joda.time.MutablePeriod mutablePeriod72 = mutablePeriod24.toMutablePeriod();
        mutablePeriod72.addSeconds(10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod72);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        mutablePeriod1.addSeconds((int) '4');
        int int31 = mutablePeriod1.getHours();
        int int32 = mutablePeriod1.size();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod4.setPeriod((long) (byte) -1, (long) ' ', chronology16);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 0);
        mutablePeriod1.addMinutes((-1));
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) '#', chronology5);
        mutablePeriod6.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod6.setPeriod(readableInstant9, readableInstant10);
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod6.setPeriod(100L, chronology13);
        mutablePeriod6.setPeriod((int) 'a', (int) ' ', (int) '4', (int) (byte) 100, (int) (short) 0, (int) ' ', (-1), (int) ' ');
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        org.joda.time.Chronology chronology32 = null;
        mutablePeriod28.setPeriod((long) 100, chronology32);
        mutablePeriod28.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = mutablePeriod28.toDurationFrom(readableInstant36);
        mutablePeriod28.setHours((int) (short) 0);
        mutablePeriod28.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod28.clear();
        org.joda.time.DurationFieldType durationFieldType50 = null;
        boolean boolean51 = mutablePeriod28.isSupported(durationFieldType50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) '#', chronology53);
        mutablePeriod54.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        mutablePeriod54.setPeriod(readableInstant57, readableInstant58);
        org.joda.time.DurationFieldType[] durationFieldTypeArray60 = mutablePeriod54.getFieldTypes();
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(10L, periodType62, chronology63);
        int int65 = mutablePeriod64.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod64);
        org.joda.time.DurationFieldType durationFieldType68 = mutablePeriod64.getFieldType((int) (short) 1);
        mutablePeriod54.set(durationFieldType68, (int) '#');
        boolean boolean71 = mutablePeriod28.isSupported(durationFieldType68);
        int int72 = mutablePeriod6.indexOf(durationFieldType68);
        mutablePeriod1.add(durationFieldType68, 8);
        mutablePeriod1.add((long) ' ');
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        java.lang.String str3 = mutablePeriod2.toString();
        mutablePeriod2.setHours((int) '#');
        mutablePeriod2.setPeriod((long) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        mutablePeriod8.setPeriod((long) 'a');
        org.joda.time.format.PeriodFormatter periodFormatter11 = null;
        java.lang.String str12 = mutablePeriod8.toString(periodFormatter11);
        mutablePeriod8.setDays((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0.097S" + "'", str12, "PT0.097S");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        int int33 = mutablePeriod31.getHours();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.lang.Object obj0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(obj0);
        mutablePeriod1.addHours((int) (byte) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = mutablePeriod1.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        int int3 = mutablePeriod1.getHours();
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod1.toMutablePeriod();
        org.joda.time.PeriodType periodType5 = mutablePeriod1.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod1.copy();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = mutablePeriod2.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod7.toDurationFrom(readableInstant8);
        mutablePeriod7.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(10L, periodType13, chronology14);
        int int16 = mutablePeriod15.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod15);
        org.joda.time.DurationFieldType durationFieldType19 = mutablePeriod15.getFieldType((int) (short) 1);
        int int20 = mutablePeriod7.get(durationFieldType19);
        int[] intArray21 = mutablePeriod7.getValues();
        mutablePeriod2.add((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0, 0, 97, 1, 0, 97]");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod2.setPeriod(100L, chronology11);
        java.lang.Class<?> wildcardClass13 = mutablePeriod2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) '#', chronology54);
        mutablePeriod55.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType65 = null;
        int int66 = mutablePeriod64.indexOf(durationFieldType65);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod71.addHours((-1));
        mutablePeriod64.add((org.joda.time.ReadablePeriod) mutablePeriod71);
        org.joda.time.PeriodType periodType75 = mutablePeriod64.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType75);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod55, periodType75);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(1L, (long) '4', periodType75);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant50, periodType75);
        mutablePeriod79.setPeriod((long) 32, 0L);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(periodType75);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        mutablePeriod3.setWeeks(100);
        int int9 = mutablePeriod3.getMillis();
        int int10 = mutablePeriod3.getSeconds();
        java.lang.String str11 = mutablePeriod3.toString();
        mutablePeriod3.setYears(0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P100WT100M" + "'", str11, "P100WT100M");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        org.joda.time.DurationFieldType durationFieldType7 = mutablePeriod3.getFieldType((int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod3.copy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (byte) 1);
        mutablePeriod2.clear();
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        mutablePeriod3.setWeeks(100);
        int int9 = mutablePeriod3.getMillis();
        mutablePeriod3.setWeeks(8);
        mutablePeriod3.addYears(4);
        mutablePeriod3.addDays((int) '4');
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        org.joda.time.Period period74 = mutablePeriod14.toPeriod();
        java.lang.String str75 = mutablePeriod14.toString();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PT0S" + "'", str75, "PT0S");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 100, 10, (int) (byte) -1, 97, (int) (byte) 1, 4, 0, 1);
        org.joda.time.MutablePeriod mutablePeriod10 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray11 = mutablePeriod10.getValues();
        int int12 = mutablePeriod10.getHours();
        mutablePeriod10.addMinutes((int) (byte) 100);
        java.lang.Object obj15 = mutablePeriod10.clone();
        boolean boolean16 = mutablePeriod8.equals((java.lang.Object) mutablePeriod10);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "PT97H101M0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "PT97H101M0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "PT97H101M0.097S");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        java.lang.String str3 = mutablePeriod2.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod8.indexOf(durationFieldType9);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        mutablePeriod2.clear();
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod2.setPeriod((long) 100, 100L, chronology15);
        org.joda.time.MutablePeriod mutablePeriod17 = mutablePeriod2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod18 = mutablePeriod2.toMutablePeriod();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        int int27 = mutablePeriod24.getYears();
        org.joda.time.DurationFieldType[] durationFieldTypeArray28 = mutablePeriod24.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray28);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        org.joda.time.format.PeriodFormatter periodFormatter6 = null;
        java.lang.String str7 = mutablePeriod5.toString(periodFormatter6);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = mutablePeriod5.getFieldTypes();
        mutablePeriod5.addMonths((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.010S" + "'", str7, "PT0.010S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType39, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((-1L), (long) (short) 10, periodType39, chronology48);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        mutablePeriod3.add((long) (short) 1);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod3.setPeriod((long) 1, (long) (byte) -1, chronology9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        org.joda.time.MutablePeriod mutablePeriod41 = org.joda.time.MutablePeriod.parse("PT0.105S");
        mutablePeriod19.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(mutablePeriod41);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod2.getYears();
        mutablePeriod2.clear();
        int int10 = mutablePeriod2.getHours();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant13, readableInstant14, periodType15);
        int int17 = mutablePeriod16.size();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant18, readableInstant19, periodType20);
        int int22 = mutablePeriod21.size();
        mutablePeriod16.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod21);
        boolean boolean25 = mutablePeriod16.equals((java.lang.Object) 0.0d);
        org.joda.time.ReadableInterval readableInterval26 = null;
        mutablePeriod16.setPeriod(readableInterval26);
        org.joda.time.PeriodType periodType28 = mutablePeriod16.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 10, (long) (short) -1, periodType28, chronology29);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2, periodType28);
        org.joda.time.Chronology chronology34 = null;
        mutablePeriod2.setPeriod((long) 4, (long) 107, chronology34);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        int int14 = mutablePeriod4.getMillis();
        int int15 = mutablePeriod4.size();
        mutablePeriod4.setHours((-1));
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod4.setPeriod(1L, chronology19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        org.joda.time.Chronology chronology37 = null;
        mutablePeriod35.add((long) '#', chronology37);
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod35.add(10L, chronology40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) '#', chronology43);
        mutablePeriod44.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType54 = null;
        int int55 = mutablePeriod53.indexOf(durationFieldType54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod60.addHours((-1));
        mutablePeriod53.add((org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.PeriodType periodType64 = mutablePeriod53.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType64);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod44, periodType64);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Duration duration68 = mutablePeriod44.toDurationTo(readableInstant67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration68, readableInstant69);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration68, readableInstant71);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType81 = null;
        int int82 = mutablePeriod80.indexOf(durationFieldType81);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod87.addHours((-1));
        mutablePeriod80.add((org.joda.time.ReadablePeriod) mutablePeriod87);
        org.joda.time.PeriodType periodType91 = mutablePeriod80.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType91);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration68, readableInstant73, periodType91);
        org.joda.time.Chronology chronology94 = null;
        mutablePeriod35.setPeriod((org.joda.time.ReadableDuration) duration68, chronology94);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType97 = mutablePeriod35.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(periodType91);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType13 = null;
        int int14 = mutablePeriod12.indexOf(durationFieldType13);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        mutablePeriod12.add((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.PeriodType periodType23 = mutablePeriod12.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType23);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant4, readableInstant5, periodType23);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 8, (long) ' ', periodType23);
        mutablePeriod26.setMinutes((int) '4');
        org.joda.time.PeriodType periodType29 = mutablePeriod26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (-98), (long) 52, periodType29);
        org.joda.time.Chronology chronology32 = null;
        mutablePeriod30.add((long) 0, chronology32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        mutablePeriod25.setPeriod((long) (short) 100, (long) 97);
        mutablePeriod25.addMinutes(52);
        java.lang.String str31 = mutablePeriod25.toString();
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT52M0.003S" + "'", str31, "PT52M0.003S");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 52, 0L, chronology2);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) 100, chronology2);
        mutablePeriod3.addHours((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod3.toDurationFrom(readableInstant6);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod4.get(durationFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = mutablePeriod4.getFieldType(96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.addHours((int) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod5.toDurationTo(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod5.toDurationFrom(readableInstant15);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod21.setPeriod((long) 100, chronology25);
        mutablePeriod21.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod21.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = mutablePeriod36.indexOf(durationFieldType37);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        mutablePeriod36.add((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.PeriodType periodType47 = mutablePeriod36.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31, periodType47);
        org.joda.time.PeriodType periodType49 = mutablePeriod48.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration16, periodType49);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType49);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-98), (int) 'a', 107, 52, (-1), 197, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.PeriodType periodType16 = mutablePeriod4.getPeriodType();
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod4.setPeriod((long) 52, 0L, chronology19);
        mutablePeriod4.add((long) 52);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        int int35 = mutablePeriod18.getYears();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        org.joda.time.Period period32 = mutablePeriod31.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) (byte) 100, (int) '4', (int) '#', (int) (byte) 1, (int) (short) -1, (int) ' ', 10, (int) '#');
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) '#', chronology43);
        mutablePeriod44.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType54 = null;
        int int55 = mutablePeriod53.indexOf(durationFieldType54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod60.addHours((-1));
        mutablePeriod53.add((org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.PeriodType periodType64 = mutablePeriod53.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType64);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod44, periodType64);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Duration duration68 = mutablePeriod44.toDurationTo(readableInstant67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration68, readableInstant69);
        org.joda.time.Chronology chronology71 = null;
        mutablePeriod41.setPeriod((org.joda.time.ReadableDuration) duration68, chronology71);
        mutablePeriod31.setPeriod((org.joda.time.ReadableDuration) duration68);
        org.joda.time.DurationFieldType[] durationFieldTypeArray74 = mutablePeriod31.getFieldTypes();
        org.joda.time.Chronology chronology76 = null;
        mutablePeriod31.add(0L, chronology76);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(durationFieldTypeArray74);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        mutablePeriod15.setWeeks((int) (short) 10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        mutablePeriod19.setDays(107);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(periodType17);
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod18.add(1L, chronology20);
        org.joda.time.PeriodType periodType22 = mutablePeriod18.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(0, (int) ' ', 87, (int) '4', 107, 52, (int) (byte) 100, 24, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(52, 97, 8, (-98), (int) (byte) 10, 4, (int) (short) -1, 32, periodType22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (short) 10, periodType22, chronology25);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) '#', periodType21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType14 = mutablePeriod13.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType14, chronology16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addHours((-1));
        mutablePeriod22.addMonths((int) (byte) -1);
        int int27 = mutablePeriod22.getMinutes();
        mutablePeriod22.add((long) (byte) 10);
        mutablePeriod22.setMonths((int) '4');
        int int32 = mutablePeriod22.size();
        mutablePeriod17.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, (long) 10, chronology2);
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
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration11);
        mutablePeriod3.addSeconds(100);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod3.toDurationTo(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47);
        mutablePeriod48.setMinutes((int) (byte) 100);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(duration46);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) -1, 97, (int) (short) -1, (int) (byte) 100, (-98), (-98), (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.addHours(10);
        mutablePeriod3.addMonths((-1));
        org.joda.time.DurationFieldType durationFieldType8 = null;
        boolean boolean9 = mutablePeriod3.isSupported(durationFieldType8);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod3.toMutablePeriod();
        mutablePeriod10.setMinutes((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(mutablePeriod10);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        int int13 = mutablePeriod8.size();
        java.lang.String str14 = mutablePeriod8.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P97M" + "'", str14, "P97M");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        mutablePeriod42.addMinutes(10);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod47.setPeriod((long) (short) 0, chronology49);
        int int51 = mutablePeriod47.getSeconds();
        mutablePeriod42.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', (int) (byte) 10, 0, (int) ' ', 1, (int) (short) 1, (int) (short) 10, 52);
        mutablePeriod8.addMonths(37);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int int8 = mutablePeriod7.getYears();
        org.joda.time.MutablePeriod mutablePeriod10 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray11 = mutablePeriod10.getValues();
        int int12 = mutablePeriod10.getHours();
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod10.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod18.toDurationFrom(readableInstant19);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType38, chronology39);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableInstant14, (org.joda.time.ReadableDuration) duration20, periodType38);
        mutablePeriod10.add((org.joda.time.ReadableDuration) duration20);
        mutablePeriod7.add((org.joda.time.ReadableDuration) duration20);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        mutablePeriod4.setMonths(10);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 1, 0, 10, (int) (byte) 10);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        mutablePeriod4.addYears(97);
        int int10 = mutablePeriod4.getMinutes();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (-1L), chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, chronology4);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType20 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) '#', periodType20, chronology22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod5, periodType20);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 10, (long) 8);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = mutablePeriod2.toDurationFrom(readableInstant3);
        mutablePeriod2.setSeconds(35);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        int[] intArray5 = mutablePeriod3.getValues();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod3.setPeriod((long) (byte) 1, 0L, chronology10);
        mutablePeriod3.addWeeks((int) '4');
        org.joda.time.MutablePeriod mutablePeriod14 = mutablePeriod3.copy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod14);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        mutablePeriod28.setMinutes((int) (byte) 10);
        mutablePeriod28.setPeriod((long) (-41));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        org.joda.time.DurationFieldType durationFieldType7 = mutablePeriod3.getFieldType((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        mutablePeriod3.setPeriod(readableInstant8, readableInstant9);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 1);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod13.toDurationTo(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
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
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 100, periodType53, chronology57);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, readableInstant17, periodType53);
        mutablePeriod59.setHours(35);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType78 = mutablePeriod77.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) '#', periodType78, chronology80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) ' ', (long) (byte) 1, periodType78);
        mutablePeriod59.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod82);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType78);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        mutablePeriod14.addMonths((int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        org.joda.time.Chronology chronology32 = null;
        mutablePeriod28.setPeriod((long) 100, chronology32);
        mutablePeriod28.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = mutablePeriod28.toDurationFrom(readableInstant36);
        mutablePeriod28.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant40, readableInstant41, periodType42);
        int int44 = mutablePeriod43.size();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(readableInstant45, readableInstant46, periodType47);
        int int49 = mutablePeriod48.size();
        mutablePeriod43.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod48);
        boolean boolean51 = mutablePeriod28.equals((java.lang.Object) mutablePeriod48);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod56.addHours((-1));
        org.joda.time.Chronology chronology60 = null;
        mutablePeriod56.setPeriod((long) 100, chronology60);
        mutablePeriod56.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = mutablePeriod56.toDurationFrom(readableInstant64);
        mutablePeriod48.setPeriod((org.joda.time.ReadableDuration) duration65);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod75.addHours((-1));
        org.joda.time.Chronology chronology79 = null;
        mutablePeriod75.setPeriod((long) 100, chronology79);
        mutablePeriod75.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType83 = mutablePeriod75.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(periodType83);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((long) 10, periodType83, chronology85);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(readableInstant68, readableInstant69, periodType83);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration65, readableInstant67, periodType83);
        mutablePeriod14.add((org.joda.time.ReadableDuration) duration65);
        mutablePeriod14.setPeriod((long) '#');
        org.joda.time.ReadableInstant readableInstant92 = null;
        org.joda.time.Duration duration93 = mutablePeriod14.toDurationTo(readableInstant92);
        org.joda.time.ReadableInstant readableInstant94 = null;
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration93, readableInstant94);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertNotNull(duration93);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        mutablePeriod8.addSeconds((int) (byte) 0);
        mutablePeriod8.addWeeks(8);
        int[] intArray15 = mutablePeriod8.getValues();
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.copy();
        mutablePeriod16.setPeriod((long) (byte) -1, (long) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 8, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(mutablePeriod16);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(4, (int) (byte) 10, 0, (int) (byte) -1, 100, (int) (byte) 1, (int) (short) 10, (int) '#');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) '#', chronology10);
        mutablePeriod11.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutablePeriod11.setPeriod(readableInstant14, readableInstant15);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod11.setPeriod(100L, chronology18);
        mutablePeriod11.setPeriod((int) 'a', (int) ' ', (int) '4', (int) (byte) 100, (int) (short) 0, (int) ' ', (-1), (int) ' ');
        mutablePeriod11.setDays((int) (short) 100);
        java.lang.String str31 = mutablePeriod11.toString();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) '#', chronology33);
        mutablePeriod34.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        mutablePeriod34.setPeriod(readableInstant37, readableInstant38);
        org.joda.time.DurationFieldType[] durationFieldTypeArray40 = mutablePeriod34.getFieldTypes();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(10L, periodType42, chronology43);
        int int45 = mutablePeriod44.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod44);
        org.joda.time.DurationFieldType durationFieldType48 = mutablePeriod44.getFieldType((int) (short) 1);
        mutablePeriod34.set(durationFieldType48, (int) '#');
        mutablePeriod11.add(durationFieldType48, 97);
        int int53 = mutablePeriod8.indexOf(durationFieldType48);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P97Y32M52W100DT32M0.968S" + "'", str31, "P97Y32M52W100DT32M0.968S");
        org.junit.Assert.assertNotNull(durationFieldTypeArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, readableInstant38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod44.addHours((-1));
        org.joda.time.Chronology chronology48 = null;
        mutablePeriod44.setPeriod((long) 100, chronology48);
        mutablePeriod44.setSeconds(8);
        org.joda.time.PeriodType periodType52 = mutablePeriod44.getPeriodType();
        mutablePeriod39.add((org.joda.time.ReadablePeriod) mutablePeriod44);
        mutablePeriod39.add(0L);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        mutablePeriod42.addMinutes(10);
        mutablePeriod42.addYears((int) (byte) 1);
        mutablePeriod42.setPeriod(24, (int) (byte) -1, 8, (int) (byte) 0, 96, 52, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, readableInstant57);
        java.lang.Class<?> wildcardClass59 = mutablePeriod58.getClass();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMillis(0);
        int int9 = mutablePeriod4.getHours();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setValue(100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        mutablePeriod36.addDays(10);
        int int43 = mutablePeriod36.getMonths();
        mutablePeriod36.setPeriod((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutablePeriod4.setPeriod(readableInstant7, readableInstant8);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        org.joda.time.ReadableInterval readableInterval55 = null;
        mutablePeriod4.setPeriod(readableInterval55);
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
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        java.lang.String str3 = mutablePeriod2.toString();
        mutablePeriod2.setValue((int) (short) 0, 100);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod14.toDurationFrom(readableInstant15);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType32 = null;
        int int33 = mutablePeriod31.indexOf(durationFieldType32);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod38.addHours((-1));
        mutablePeriod31.add((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.PeriodType periodType42 = mutablePeriod31.getPeriodType();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType42, chronology43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType42);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableInstant9, (org.joda.time.ReadableDuration) duration16, periodType42);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(readableInstant7, readableInstant8, periodType42);
        org.joda.time.PeriodType periodType48 = mutablePeriod47.getPeriodType();
        mutablePeriod2.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod47);
        mutablePeriod2.setPeriod(35, 4, (-41), (int) (short) -1, 1, (-1), (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType48);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, (int) (short) 10, (int) (short) 0, 52);
        org.joda.time.ReadableInterval readableInterval5 = null;
        mutablePeriod4.setPeriod(readableInterval5);
        mutablePeriod4.addMillis(35);
        mutablePeriod4.setPeriod(100L);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        int int9 = mutablePeriod4.getYears();
        mutablePeriod4.setPeriod((int) 'a', (int) '#', (int) '4', (int) (byte) 0, (int) (short) 10, (int) ' ', (int) (short) 100, (int) (short) 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod4.toDurationFrom(readableInstant19);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.setPeriod((long) (short) 1, chronology3);
        mutablePeriod1.clear();
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod9.setPeriod((-1L), chronology11);
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod9.add(0L, chronology14);
        org.joda.time.PeriodType periodType16 = mutablePeriod9.getPeriodType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 4, periodType16, chronology17);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod44.toDurationFrom(readableInstant45);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType62 = null;
        int int63 = mutablePeriod61.indexOf(durationFieldType62);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod68.addHours((-1));
        mutablePeriod61.add((org.joda.time.ReadablePeriod) mutablePeriod68);
        org.joda.time.PeriodType periodType72 = mutablePeriod61.getPeriodType();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType72, chronology73);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType72);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(readableInstant39, (org.joda.time.ReadableDuration) duration46, periodType72);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant38, periodType72);
        mutablePeriod77.setMinutes((int) (byte) -1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(periodType72);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(10L, periodType11, chronology12);
        mutablePeriod13.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = mutablePeriod13.toDurationFrom(readableInstant17);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = mutablePeriod23.toDurationTo(readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType36 = null;
        int int37 = mutablePeriod35.indexOf(durationFieldType36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addHours((-1));
        mutablePeriod35.add((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.PeriodType periodType46 = mutablePeriod35.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType46, chronology48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration25, readableInstant26, periodType46);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(readableInstant9, (org.joda.time.ReadableDuration) duration18, periodType46);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(97, (int) 'a', (int) (byte) 0, 100, (-1), 100, (int) (short) 0, 1, periodType46);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = mutablePeriod52.toDurationFrom(readableInstant53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration54);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(duration54);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) (short) 0, chronology2);
        org.joda.time.PeriodType periodType4 = mutablePeriod3.getPeriodType();
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        mutablePeriod3.setWeeks(100);
        mutablePeriod3.setDays(100);
        org.joda.time.ReadableInterval readableInterval11 = null;
        mutablePeriod3.add(readableInterval11);
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod3.setPeriod((long) (short) 100, chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        int int21 = mutablePeriod19.getMillis();
        java.lang.Object obj22 = mutablePeriod19.clone();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) '#', chronology34);
        mutablePeriod35.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType45 = null;
        int int46 = mutablePeriod44.indexOf(durationFieldType45);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod51.addHours((-1));
        mutablePeriod44.add((org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.PeriodType periodType55 = mutablePeriod44.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType55);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod35, periodType55);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((int) ' ', (int) 'a', (int) (byte) 10, 8, (int) ' ', (int) (short) 1, (int) (byte) 0, (int) (byte) -1, periodType55);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(periodType55);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) '4', (long) (short) 100, periodType55);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(obj22, periodType55, chronology61);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType55);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "PT0S");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(periodType55);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 100, 1, (int) '#', (int) (short) -1, (int) (byte) 100, (int) (byte) 0, 4, (int) (byte) 100);
        mutablePeriod8.setPeriod(8, 1, (int) (byte) 1, 8, (int) (byte) 100, 24, 37, (int) (short) 100);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod3.toDurationFrom(readableInstant7);
        mutablePeriod3.setPeriod((long) '4', (long) (byte) 100);
        mutablePeriod3.addYears((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = mutablePeriod3.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        org.joda.time.ReadableInterval readableInterval16 = null;
        mutablePeriod3.add(readableInterval16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        boolean boolean14 = mutablePeriod5.equals((java.lang.Object) 0.0d);
        org.joda.time.ReadableInterval readableInterval15 = null;
        mutablePeriod5.setPeriod(readableInterval15);
        org.joda.time.PeriodType periodType17 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType17);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(10L, (long) (short) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) '#', chronology23);
        mutablePeriod24.setMinutes(8);
        mutablePeriod24.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        org.joda.time.Chronology chronology37 = null;
        mutablePeriod33.setPeriod((long) 100, chronology37);
        mutablePeriod33.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = mutablePeriod33.toDurationFrom(readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, readableInstant43);
        org.joda.time.Chronology chronology45 = null;
        mutablePeriod24.setPeriod((org.joda.time.ReadableDuration) duration42, chronology45);
        org.joda.time.Chronology chronology47 = null;
        mutablePeriod21.setPeriod((org.joda.time.ReadableDuration) duration42, chronology47);
        mutablePeriod18.add((org.joda.time.ReadableDuration) duration42);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(duration42);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = mutablePeriod2.indexOf(durationFieldType3);
        mutablePeriod2.addYears((int) (short) 1);
        org.joda.time.PeriodType periodType7 = mutablePeriod2.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, (long) (byte) 0, chronology2);
        mutablePeriod3.clear();
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = mutablePeriod3.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, chronology15);
        mutablePeriod16.addSeconds(10);
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod16.setPeriod((long) 0, (long) (short) 0, chronology21);
        org.joda.time.Period period23 = mutablePeriod16.toPeriod();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 100, (int) '4', (int) (byte) 1, (int) (short) 0, (int) (byte) 1, (int) (short) 1, 97, (int) (byte) 1);
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
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType42, chronology46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) (short) 0, 1, (int) ' ', (int) '#', (int) (short) 10, (int) ' ', (int) (short) 0, 0, periodType42);
        org.joda.time.Chronology chronology51 = null;
        mutablePeriod48.setPeriod((long) 1, (long) 100, chronology51);
        org.joda.time.Chronology chronology54 = null;
        mutablePeriod48.add(0L, chronology54);
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod48);
        java.lang.Object obj58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(obj58);
        org.joda.time.PeriodType periodType60 = mutablePeriod59.getPeriodType();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) ' ', periodType60, chronology61);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(periodType60);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod8, periodType60);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType60);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) '#', chronology11);
        mutablePeriod12.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = mutablePeriod21.indexOf(durationFieldType22);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod28.addHours((-1));
        mutablePeriod21.add((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.PeriodType periodType32 = mutablePeriod21.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType32);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod12, periodType32);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) ' ', (int) 'a', (int) (byte) 10, 8, (int) ' ', (int) (short) 1, (int) (byte) 0, (int) (byte) -1, periodType32);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) '4', (long) (short) 100, periodType32);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = mutablePeriod37.toDurationTo(readableInstant38);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration39);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        org.joda.time.MutablePeriod mutablePeriod60 = mutablePeriod59.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval61 = null;
        mutablePeriod60.setPeriod(readableInterval61);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(mutablePeriod60);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        int int3 = mutablePeriod1.getHours();
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod1.toMutablePeriod();
        mutablePeriod4.addDays((int) (short) 100);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        org.joda.time.ReadableInterval readableInterval14 = null;
        mutablePeriod3.setPeriod(readableInterval14);
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod3.copy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(mutablePeriod16);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(0L, (long) '4');
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        int int18 = mutablePeriod2.getMinutes();
        mutablePeriod2.clear();
        mutablePeriod2.setWeeks((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        mutablePeriod16.addDays(10);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(periodType63);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, readableInstant60);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(periodType53);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod8.addHours((-1));
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.setPeriod((long) 100, chronology12);
        mutablePeriod8.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType16 = mutablePeriod8.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(periodType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 10, periodType16, chronology18);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType16);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) "PT0.001S", periodType16, chronology21);
        mutablePeriod22.setMonths(8);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        java.lang.Class<?> wildcardClass76 = duration17.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        mutablePeriod1.setYears(96);
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = mutablePeriod1.toString(periodFormatter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P96YT0.001S" + "'", str5, "P96YT0.001S");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        // The following exception was thrown during execution in test generation
        try {
            int int24 = mutablePeriod2.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
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
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration16, chronology35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod2.toDurationFrom(readableInstant37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration38);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(duration38);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod3.setPeriod((long) 10, (long) 96, chronology9);
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod3.toMutablePeriod();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setMillis((int) (byte) 10);
        mutablePeriod0.addMinutes((int) (byte) -1);
        mutablePeriod0.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType7 = mutablePeriod0.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod0.add((long) 100, chronology9);
        mutablePeriod0.addDays((int) (short) -1);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        org.joda.time.MutablePeriod mutablePeriod22 = mutablePeriod4.copy();
        mutablePeriod4.add((long) (-41));
        mutablePeriod4.addDays(87);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod22);
    }
}

