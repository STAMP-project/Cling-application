import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
        mutablePeriod4.setSeconds((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setMillis((int) (byte) 10);
        mutablePeriod0.addMinutes((int) (byte) -1);
        mutablePeriod0.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType7 = mutablePeriod0.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod0.add((long) 100, chronology9);
        mutablePeriod0.addHours((int) (byte) -1);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        mutablePeriod4.addMillis((int) (short) 100);
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
        mutablePeriod4.add(durationFieldType41, (int) ' ');
        int int45 = mutablePeriod4.getDays();
        mutablePeriod4.addMillis((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType49 = mutablePeriod4.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        mutablePeriod33.addYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        mutablePeriod4.addMonths((int) '#');
        int int11 = mutablePeriod4.getYears();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod17.toDurationFrom(readableInstant18);
        mutablePeriod17.addMonths((int) (short) 0);
        mutablePeriod17.addMinutes((int) '#');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod29.setPeriod((long) 100, chronology33);
        mutablePeriod29.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod29.toDurationFrom(readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration38, readableInstant39);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant24, (org.joda.time.ReadableDuration) duration38, periodType41);
        mutablePeriod17.setPeriod((org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant12, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(readableInstant45, readableInstant46, periodType47);
        int int49 = mutablePeriod48.size();
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableInstant50, readableInstant51, periodType52);
        int int54 = mutablePeriod53.size();
        mutablePeriod48.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod53);
        org.joda.time.DurationFieldType[] durationFieldTypeArray56 = mutablePeriod48.getFieldTypes();
        org.joda.time.DurationFieldType durationFieldType58 = mutablePeriod48.getFieldType((int) (short) 0);
        mutablePeriod44.set(durationFieldType58, (int) '4');
        mutablePeriod4.set(durationFieldType58, (int) (short) 1);
        org.joda.time.DurationFieldType[] durationFieldTypeArray63 = mutablePeriod4.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray56);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertNotNull(durationFieldTypeArray63);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        org.joda.time.ReadableInterval readableInterval42 = null;
        mutablePeriod40.setPeriod(readableInterval42);
        java.lang.Object obj44 = mutablePeriod40.clone();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "PT0S");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        mutablePeriod12.setSeconds((int) (short) 1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT97H1M52.097S" + "'", str9, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration30);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        mutablePeriod4.setWeeks(100);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        org.joda.time.MutablePeriod mutablePeriod89 = mutablePeriod4.toMutablePeriod();
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
        org.junit.Assert.assertNotNull(mutablePeriod89);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) '#', chronology19);
        mutablePeriod20.setMinutes(8);
        mutablePeriod20.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod29.addHours((-1));
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod29.setPeriod((long) 100, chronology33);
        mutablePeriod29.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod29.toDurationFrom(readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration38, readableInstant39);
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod20.setPeriod((org.joda.time.ReadableDuration) duration38, chronology41);
        mutablePeriod20.setHours((int) '4');
        mutablePeriod20.addMillis(8);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod20.toDurationTo(readableInstant47);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(10L, periodType53, chronology54);
        mutablePeriod55.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = mutablePeriod55.toDurationFrom(readableInstant59);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = mutablePeriod65.toDurationTo(readableInstant66);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType78 = null;
        int int79 = mutablePeriod77.indexOf(durationFieldType78);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod84.addHours((-1));
        mutablePeriod77.add((org.joda.time.ReadablePeriod) mutablePeriod84);
        org.joda.time.PeriodType periodType88 = mutablePeriod77.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType88);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType88, chronology90);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration67, readableInstant68, periodType88);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod(readableInstant51, (org.joda.time.ReadableDuration) duration60, periodType88);
        org.joda.time.Chronology chronology94 = null;
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod((long) '#', 1L, periodType88, chronology94);
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod(readableInstant17, (org.joda.time.ReadableDuration) duration48, periodType88);
        org.joda.time.MutablePeriod mutablePeriod97 = new org.joda.time.MutablePeriod((long) 35, (long) '#', periodType88);
        org.joda.time.MutablePeriod mutablePeriod98 = new org.joda.time.MutablePeriod(periodType88);
        org.joda.time.MutablePeriod mutablePeriod99 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant13, periodType88);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(periodType88);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        mutablePeriod70.addMillis((int) (short) -1);
        mutablePeriod70.add((-1), 0, (int) 'a', (int) 'a', 0, (int) (short) 10, (int) '#', 1);
        int int82 = mutablePeriod70.getMinutes();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-41) + "'", int82 == (-41));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.add(0L);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType13 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(periodType13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 10, periodType13, chronology15);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod21.toDurationTo(readableInstant22);
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration23);
        mutablePeriod16.setMonths(0);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration23);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType65);
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        mutablePeriod31.setPeriod(readableInstant32, readableInstant33);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        mutablePeriod30.setWeeks((int) (byte) 10);
        mutablePeriod30.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        mutablePeriod22.addMillis((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter16 = null;
        java.lang.String str17 = mutablePeriod4.toString(periodFormatter16);
        mutablePeriod4.setWeeks((int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter20 = null;
        java.lang.String str21 = mutablePeriod4.toString(periodFormatter20);
        int int22 = mutablePeriod4.size();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT1M0.100S" + "'", str17, "PT1M0.100S");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "P1WT1M0.100S" + "'", str21, "P1WT1M0.100S");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 0, (long) 'a');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 0, periodType4, chronology5);
        int int7 = mutablePeriod6.getYears();
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
        boolean boolean26 = mutablePeriod6.isSupported(durationFieldType24);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod31.addMinutes((int) (byte) -1);
        mutablePeriod31.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = mutablePeriod31.toDurationFrom(readableInstant36);
        mutablePeriod6.add((org.joda.time.ReadableDuration) duration37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod46.toDurationTo(readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType59 = null;
        int int60 = mutablePeriod58.indexOf(durationFieldType59);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod65.addHours((-1));
        mutablePeriod58.add((org.joda.time.ReadablePeriod) mutablePeriod65);
        org.joda.time.PeriodType periodType69 = mutablePeriod58.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType69);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType69, chronology71);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration48, readableInstant49, periodType69);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant40, readableInstant41, periodType69);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration37, readableInstant39, periodType69);
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration37);
        mutablePeriod2.setPeriod((-98), (int) (byte) 0, (int) (byte) 1, (int) (short) 1, (int) (byte) 10, 0, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(periodType69);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.lang.Class<?> wildcardClass75 = periodType68.getClass();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(10L, periodType19, chronology20);
        mutablePeriod21.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod21.toDurationFrom(readableInstant25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = mutablePeriod31.toDurationTo(readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
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
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration33, readableInstant34, periodType54);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(readableInstant17, (org.joda.time.ReadableDuration) duration26, periodType54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(97, (int) 'a', (int) (byte) 0, 100, (-1), 100, (int) (short) 0, 1, periodType54);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(10, 35, (int) (byte) 0, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 10, (int) (byte) 10, periodType54);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(100L, periodType54, chronology62);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(periodType54);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = mutablePeriod2.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        mutablePeriod3.addHours((int) (byte) 0);
        mutablePeriod3.setMillis((-41));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 8 + "'", int66 == 8);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(52, (int) (byte) 0, (int) ' ', (int) '#');
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 97, (long) (byte) 0, chronology2);
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = mutablePeriod3.toString(periodFormatter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.097S" + "'", str5, "PT0.097S");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType4);
        mutablePeriod5.setMinutes((int) (short) 100);
        org.joda.time.ReadableInterval readableInterval8 = null;
        mutablePeriod5.setPeriod(readableInterval8);
        org.joda.time.MutablePeriod mutablePeriod19 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray20 = mutablePeriod19.getValues();
        int int21 = mutablePeriod19.getHours();
        org.joda.time.MutablePeriod mutablePeriod22 = mutablePeriod19.toMutablePeriod();
        org.joda.time.PeriodType periodType23 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod5, periodType23, chronology25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) '#', (long) ' ', periodType23);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutablePeriod27.setPeriod(readablePeriod28);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = mutablePeriod3.getFieldTypes();
        int int5 = mutablePeriod3.getMonths();
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        mutablePeriod4.setYears((int) ' ');
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        int int20 = mutablePeriod4.size();
        mutablePeriod4.clear();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        java.lang.String str38 = mutablePeriod37.toString();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT0.048S" + "'", str38, "PT0.048S");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        mutablePeriod4.addMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        org.joda.time.ReadableInstant readableInstant12 = null;
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
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(readableInstant12, (org.joda.time.ReadableDuration) duration48);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration48);
        org.junit.Assert.assertNotNull(duration6);
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        int int49 = mutablePeriod38.getYears();
        java.lang.Class<?> wildcardClass50 = mutablePeriod38.getClass();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod2.add(0L, chronology4);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(10L, periodType10, chronology11);
        mutablePeriod12.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod12.toDurationFrom(readableInstant16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod22.toDurationTo(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType35 = null;
        int int36 = mutablePeriod34.indexOf(durationFieldType35);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod41.addHours((-1));
        mutablePeriod34.add((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.PeriodType periodType45 = mutablePeriod34.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType45, chronology47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant25, periodType45);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(readableInstant8, (org.joda.time.ReadableDuration) duration17, periodType45);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(97, (int) 'a', (int) (byte) 0, 100, (-1), 100, (int) (short) 0, 1, periodType45);
        int int52 = mutablePeriod51.getHours();
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int[] intArray8 = mutablePeriod7.getValues();
        mutablePeriod7.setYears((int) (byte) 100);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod7);
        mutablePeriod7.addHours((int) ' ');
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 97, 1, 0, 97]");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        mutablePeriod1.setMinutes((int) (byte) 1);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    @Ignore
  public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationFrom(readableInstant16);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration17);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration17);
        int int20 = mutablePeriod4.getDays();
        org.joda.time.PeriodType periodType21 = mutablePeriod4.getPeriodType();
        java.lang.Class<?> wildcardClass22 = mutablePeriod4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        org.joda.time.ReadableInterval readableInterval78 = null;
        mutablePeriod77.setPeriod(readableInterval78);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT1M0.100S" + "'", str44, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        int int27 = mutablePeriod26.getMonths();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod26);
        int int29 = mutablePeriod28.size();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        mutablePeriod4.setSeconds((-1));
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        mutablePeriod2.addDays(100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) 8);
        mutablePeriod4.setMonths((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.setDays((int) (byte) 1);
        int int10 = mutablePeriod3.getWeeks();
        mutablePeriod3.setMinutes(0);
        mutablePeriod3.addYears(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) '#', 100, 0);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(periodType5);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.add(1L, chronology8);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = mutablePeriod6.indexOf(durationFieldType10);
        int int12 = mutablePeriod6.getMinutes();
        mutablePeriod6.setSeconds((int) (byte) 0);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(10L, periodType16, chronology17);
        int int19 = mutablePeriod18.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod18);
        org.joda.time.DurationFieldType durationFieldType22 = mutablePeriod18.getFieldType((int) (short) 1);
        int int23 = mutablePeriod6.indexOf(durationFieldType22);
        int int24 = mutablePeriod4.get(durationFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = mutablePeriod4.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        int int56 = mutablePeriod55.getYears();
        org.joda.time.format.PeriodFormatter periodFormatter57 = null;
        java.lang.String str58 = mutablePeriod55.toString(periodFormatter57);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0.100S" + "'", str58, "PT0.100S");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray18 = mutablePeriod2.getFieldTypes();
        mutablePeriod2.setWeeks(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray18);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(97, (int) (short) 0, (-1), (int) (short) -1, (int) '#', 52, (int) ' ', (int) (short) -1);
        mutablePeriod8.addHours(100);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.setValue((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology2);
        int int4 = mutablePeriod3.getHours();
        mutablePeriod3.clear();
        mutablePeriod3.setDays((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) '#', chronology3);
        mutablePeriod4.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutablePeriod4.setPeriod(readableInstant7, readableInstant8);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod4.copy();
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
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant92 = null;
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, readableInstant92);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration42);
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration42);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(periodType82);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        mutablePeriod24.addMillis((int) (byte) 100);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutablePeriod32);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        mutablePeriod4.setSeconds(4);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        mutablePeriod27.setWeeks((int) '#');
        mutablePeriod27.setHours((int) ' ');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        mutablePeriod3.addSeconds(97);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod3.setPeriod(readableInstant9, readableInstant10);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, (long) ' ', chronology2);
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod3.toMutablePeriod();
        mutablePeriod3.clear();
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT0.010S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) '4', (int) (byte) 1, 52, (int) (byte) 100, (int) (short) 1, (int) '#', 4, (int) ' ');
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '#', chronology2);
        mutablePeriod3.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType13 = null;
        int int14 = mutablePeriod12.indexOf(durationFieldType13);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        mutablePeriod12.add((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.PeriodType periodType23 = mutablePeriod12.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType23);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod3.toDurationTo(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
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
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant32, periodType55);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod64.addHours((-1));
        org.joda.time.Chronology chronology68 = null;
        mutablePeriod64.setPeriod((long) 100, chronology68);
        mutablePeriod64.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Duration duration73 = mutablePeriod64.toDurationFrom(readableInstant72);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType80 = null;
        int int81 = mutablePeriod79.indexOf(durationFieldType80);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod86.addHours((-1));
        mutablePeriod79.add((org.joda.time.ReadablePeriod) mutablePeriod86);
        org.joda.time.PeriodType periodType90 = mutablePeriod79.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration73, readableInstant74, periodType90);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((long) (short) 10, periodType90);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration27, periodType90);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(periodType90);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        mutablePeriod32.setMonths((int) ' ');
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        mutablePeriod1.setPeriod((long) (byte) 10, (long) (short) 1);
        int int5 = mutablePeriod1.getMonths();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.getMillis();
        int int5 = mutablePeriod3.getDays();
        mutablePeriod3.setPeriod((long) (byte) 10, (long) 0);
        mutablePeriod3.setSeconds((-41));
        mutablePeriod3.setPeriod((long) (byte) -1, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod();
        mutablePeriod46.setMillis((int) (byte) 10);
        mutablePeriod46.addMinutes((int) (byte) -1);
        mutablePeriod46.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType53 = mutablePeriod46.getPeriodType();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType53, chronology54);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant44, periodType53);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) (short) 0, periodType53);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType53);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        int[] intArray15 = mutablePeriod4.getValues();
        int int16 = mutablePeriod4.size();
        java.lang.Object obj17 = mutablePeriod4.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 193, 2, 0, 194]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "PT193H2M0.194S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "PT193H2M0.194S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "PT193H2M0.194S");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = mutablePeriod2.getFieldTypes();
        java.lang.Class<?> wildcardClass9 = mutablePeriod2.getClass();
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) '#', (int) (short) -1, 35, 97, (int) (short) 0, (int) (short) 1, (int) ' ', (int) ' ');
        mutablePeriod8.addMonths(97);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 1, 100, (int) ' ', (int) (byte) 10);
        mutablePeriod4.addMonths(87);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        mutablePeriod2.setPeriod(readableInstant10, readableInstant11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = mutablePeriod2.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) 10);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod7.toDurationFrom(readableInstant15);
        mutablePeriod7.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableInstant19, readableInstant20, periodType21);
        int int23 = mutablePeriod22.size();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant24, readableInstant25, periodType26);
        int int28 = mutablePeriod27.size();
        mutablePeriod22.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod27);
        boolean boolean30 = mutablePeriod7.equals((java.lang.Object) mutablePeriod27);
        mutablePeriod27.setMillis((int) '#');
        org.joda.time.ReadableInterval readableInterval33 = null;
        mutablePeriod27.setPeriod(readableInterval33);
        org.joda.time.MutablePeriod mutablePeriod35 = mutablePeriod27.toMutablePeriod();
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mutablePeriod35);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod2.getYears();
        mutablePeriod2.clear();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(10L, (long) (short) 10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) '#', chronology14);
        mutablePeriod15.setMinutes(8);
        mutablePeriod15.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod24.addHours((-1));
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod24.setPeriod((long) 100, chronology28);
        mutablePeriod24.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = mutablePeriod24.toDurationFrom(readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration33, readableInstant34);
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod15.setPeriod((org.joda.time.ReadableDuration) duration33, chronology36);
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration33, chronology38);
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration33, chronology40);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration33);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod();
        mutablePeriod46.setMillis((int) (byte) 10);
        mutablePeriod46.addMinutes((int) (byte) -1);
        mutablePeriod46.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType53 = mutablePeriod46.getPeriodType();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType53, chronology54);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant44, periodType53);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        int int58 = mutablePeriod57.getYears();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', (int) (short) 100, 10, 8);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod4.setPeriod((long) (-41), (long) (short) 100, chronology7);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        int int5 = mutablePeriod3.getYears();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        org.joda.time.ReadableInterval readableInterval77 = null;
        mutablePeriod76.setPeriod(readableInterval77);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) -1, chronology1);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (-41), chronology1);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        mutablePeriod1.setPeriod(0L);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', (int) (short) 100, (int) (short) 0, (-98), (int) (byte) 0, 96, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        java.lang.String str51 = mutablePeriod4.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PT97H" + "'", str51, "PT97H");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 197, (long) (byte) -1);
        int int3 = mutablePeriod2.getMonths();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.lang.Object obj0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod7.indexOf(durationFieldType8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.addHours((-1));
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod7, chronology18);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod24.addHours((-1));
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod24.setPeriod((long) 100, chronology28);
        mutablePeriod24.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType32 = mutablePeriod24.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        mutablePeriod19.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
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
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod19, periodType78);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType78);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(periodType78);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(obj0, periodType78);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((java.lang.Object) periodType78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PT1M0.100S" + "'", str52, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(periodType78);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 100, 1L);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray27 = mutablePeriod4.getFieldTypes();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(durationFieldTypeArray27);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P100M10W1DT10M0.948S");
        org.joda.time.DurationFieldType[] durationFieldTypeArray2 = mutablePeriod1.getFieldTypes();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray2);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        int int14 = mutablePeriod3.getDays();
        int[] intArray15 = mutablePeriod3.getValues();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 97, 1, 0, 97]");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setYears((int) (short) -1);
        int int7 = mutablePeriod2.getDays();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(readableInstant61, readableInstant62, periodType63);
        org.joda.time.Chronology chronology67 = null;
        mutablePeriod64.setPeriod((long) 8, 100L, chronology67);
        org.joda.time.Chronology chronology70 = null;
        mutablePeriod64.add((long) 8, chronology70);
        org.joda.time.DurationFieldType durationFieldType73 = mutablePeriod64.getFieldType(0);
        boolean boolean74 = mutablePeriod60.isSupported(durationFieldType73);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(mutablePeriod60);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = mutablePeriod2.indexOf(durationFieldType3);
        mutablePeriod2.addYears((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = mutablePeriod2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 10, (int) ' ', 0, (int) (short) 1);
        int int5 = mutablePeriod4.getMillis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 87, (long) (short) -1, chronology2);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        mutablePeriod80.setHours((int) (short) 1);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) (short) 10, periodType39);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (byte) 10, 10, (int) '4', 8, (-1), 97, (int) (byte) 10, 100, periodType39);
        mutablePeriod42.setYears((int) (byte) 100);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        java.lang.String str3 = mutablePeriod2.toString();
        mutablePeriod2.setHours((int) '#');
        mutablePeriod2.setPeriod((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue((int) ' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(100L, (long) 1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.format.PeriodFormatter periodFormatter7 = null;
        java.lang.String str8 = mutablePeriod3.toString(periodFormatter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0.100S" + "'", str8, "PT0.100S");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        mutablePeriod4.addMillis((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType30 = mutablePeriod29.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod35.addHours((-1));
        org.joda.time.Chronology chronology39 = null;
        mutablePeriod35.setPeriod((long) 100, chronology39);
        mutablePeriod35.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = mutablePeriod35.toDurationFrom(readableInstant43);
        mutablePeriod35.addMinutes((int) (byte) 1);
        mutablePeriod29.add((org.joda.time.ReadablePeriod) mutablePeriod35);
        mutablePeriod29.addMillis((int) (short) 100);
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
        mutablePeriod29.add(durationFieldType66, (int) ' ');
        int int70 = mutablePeriod4.indexOf(durationFieldType66);
        java.lang.Class<?> wildcardClass71 = durationFieldType66.getClass();
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 96, (long) 100);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        mutablePeriod2.add(readableInterval8);
        int int10 = mutablePeriod2.getHours();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod47.setPeriod((-1L), chronology49);
        int int51 = mutablePeriod47.getDays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray52 = mutablePeriod47.getFieldTypes();
        mutablePeriod2.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray52);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration11, periodType45);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod54.addHours((-1));
        org.joda.time.Chronology chronology58 = null;
        mutablePeriod54.setPeriod((long) 100, chronology58);
        mutablePeriod54.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = mutablePeriod54.toDurationFrom(readableInstant62);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType70 = null;
        int int71 = mutablePeriod69.indexOf(durationFieldType70);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod76.addHours((-1));
        mutablePeriod69.add((org.joda.time.ReadablePeriod) mutablePeriod76);
        org.joda.time.PeriodType periodType80 = mutablePeriod69.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration63, readableInstant64, periodType80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) (short) 10, periodType80);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(0L, 1L, periodType80);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration11, periodType80);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod84.setValue(8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(periodType80);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        mutablePeriod77.setHours((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT1M0.100S" + "'", str44, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "PT1H0.087S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "PT1H0.087S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "PT1H0.087S");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (short) 100, 0, (int) (byte) 1, 52, 52, (int) (short) -1, (int) '4');
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (byte) 1, 10L, chronology11);
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod12.setMonths(197);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod4.get(durationFieldType9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        mutablePeriod4.setPeriod(readableInterval11);
        mutablePeriod4.addMonths((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod4.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType14 = mutablePeriod13.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType14, chronology16);
        mutablePeriod17.addHours((int) (byte) 1);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        mutablePeriod19.setPeriod(0L, 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        mutablePeriod29.addSeconds((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.Duration duration84 = mutablePeriod57.toDurationFrom(readableInstant83);
        org.joda.time.Chronology chronology86 = null;
        mutablePeriod57.add(0L, chronology86);
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
        org.junit.Assert.assertNotNull(duration84);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod24.setValue((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        mutablePeriod4.addMonths((int) '#');
        mutablePeriod4.setDays((-1));
        mutablePeriod4.setMonths((int) (short) 0);
        mutablePeriod4.clear();
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) 8, 100L, chronology6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod3.add((long) 8, chronology9);
        mutablePeriod3.setWeeks(0);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(10L, periodType14, chronology15);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(10L, periodType18, chronology19);
        int int21 = mutablePeriod20.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod20);
        org.joda.time.DurationFieldType durationFieldType24 = mutablePeriod20.getFieldType((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        mutablePeriod20.setPeriod(readableInstant25, readableInstant26);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 1);
        mutablePeriod20.add((org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = mutablePeriod30.toDurationTo(readableInstant32);
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration33, chronology35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(duration33);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.PeriodType periodType15 = mutablePeriod4.getPeriodType();
        mutablePeriod4.addYears((int) (short) 0);
        mutablePeriod4.addDays((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 52, chronology1);
        mutablePeriod2.add((long) (-1));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod24, chronology27);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.setPeriod((long) 100, chronology15);
        mutablePeriod11.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod11.toDurationFrom(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21);
        mutablePeriod22.setPeriod((long) 8, 10L);
        org.joda.time.ReadableInterval readableInterval26 = null;
        mutablePeriod22.setPeriod(readableInterval26);
        mutablePeriod22.setPeriod((long) 1, (long) 97);
        int[] intArray31 = mutablePeriod22.getValues();
        mutablePeriod22.setHours((int) (byte) 1);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0, 0, 0, 0, 0, 96]");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant39, readableInstant40, periodType41);
        mutablePeriod42.setMinutes((int) (short) 100);
        org.joda.time.Period period45 = mutablePeriod42.toPeriod();
        mutablePeriod42.setWeeks(100);
        int int48 = mutablePeriod42.getMillis();
        int int49 = mutablePeriod42.getSeconds();
        java.lang.String str50 = mutablePeriod42.toString();
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = mutablePeriod58.toDurationFrom(readableInstant59);
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
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod(readableInstant53, (org.joda.time.ReadableDuration) duration60, periodType86);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod(readableInstant51, readableInstant52, periodType86);
        int int92 = mutablePeriod91.getDays();
        mutablePeriod42.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod91);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod91);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "P100WT100M" + "'", str50, "P100WT100M");
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(periodType86);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        int int9 = mutablePeriod4.getMonths();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.addHours((-1));
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod14.setPeriod((long) 100, chronology18);
        mutablePeriod14.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod14.toDurationFrom(readableInstant22);
        mutablePeriod14.setHours((int) (short) 0);
        mutablePeriod14.setPeriod((long) 100, (long) (short) 1);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType38 = null;
        int int39 = mutablePeriod37.indexOf(durationFieldType38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod44.addHours((-1));
        mutablePeriod37.add((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.PeriodType periodType48 = mutablePeriod37.getPeriodType();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType48, chronology49);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(readableDuration29, readableInstant30, periodType48);
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod51, chronology53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) '#', chronology56);
        mutablePeriod57.setMinutes(8);
        mutablePeriod57.setYears((int) (short) -1);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(periodType62);
        org.joda.time.Chronology chronology65 = null;
        mutablePeriod63.add(1L, chronology65);
        mutablePeriod63.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(readableInstant69, readableInstant70, periodType71);
        mutablePeriod72.setMinutes((int) (short) 100);
        org.joda.time.Period period75 = mutablePeriod72.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.Duration duration82 = mutablePeriod80.toDurationFrom(readableInstant81);
        mutablePeriod80.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(10L, periodType86, chronology87);
        int int89 = mutablePeriod88.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod88);
        org.joda.time.DurationFieldType durationFieldType92 = mutablePeriod88.getFieldType((int) (short) 1);
        int int93 = mutablePeriod80.get(durationFieldType92);
        boolean boolean94 = period75.isSupported(durationFieldType92);
        int int95 = mutablePeriod63.indexOf(durationFieldType92);
        int int96 = mutablePeriod57.get(durationFieldType92);
        int int97 = mutablePeriod54.get(durationFieldType92);
        mutablePeriod4.add(durationFieldType92, 52);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(durationFieldType92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 52, (long) (short) 100, chronology2);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) 8, 100L, chronology6);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod3.indexOf(durationFieldType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        mutablePeriod3.setPeriod(readableInstant10, readableInstant11);
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod3.setPeriod((long) (-1), (long) 52, chronology15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        int int41 = mutablePeriod40.getMonths();
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        org.joda.time.Period period57 = mutablePeriod56.toPeriod();
        int int58 = mutablePeriod56.getMillis();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        int int28 = mutablePeriod4.getWeeks();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 52, chronology2);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) '#', (long) 0, chronology6);
    }

    @Test
    @Ignore
  public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationFrom(readableInstant16);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration17);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration17);
        int int20 = mutablePeriod4.getDays();
        org.joda.time.PeriodType periodType21 = mutablePeriod4.getPeriodType();
        int int22 = mutablePeriod4.size();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 10, (int) '#', (int) (byte) 0, (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod4.setPeriod(readableInstant5, readableInstant6);
        mutablePeriod4.setMillis((int) (short) 1);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType16 = mutablePeriod15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) '#', periodType16, chronology18);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) ' ', (long) (byte) 1, periodType16);
        int[] intArray21 = mutablePeriod20.getValues();
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0, 0, 0, 0, 0, -31]");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMillis((int) (byte) -1);
        int int16 = mutablePeriod4.getWeeks();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(10L, periodType18, chronology19);
        int int21 = mutablePeriod20.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod20);
        org.joda.time.format.PeriodFormatter periodFormatter23 = null;
        java.lang.String str24 = mutablePeriod22.toString(periodFormatter23);
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.010S" + "'", str24, "PT0.010S");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.joda.time.MutablePeriod mutablePeriod9 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray10 = mutablePeriod9.getValues();
        int int11 = mutablePeriod9.getHours();
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod9.toMutablePeriod();
        org.joda.time.PeriodType periodType13 = mutablePeriod9.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType13);
        int[] intArray15 = mutablePeriod14.getValues();
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 97, 0, 100, 0, 97, 52, 1]");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        int int9 = mutablePeriod4.getYears();
        mutablePeriod4.setHours(0);
        mutablePeriod4.addYears(97);
        mutablePeriod4.setPeriod(0, (-1), 1, (-41), (int) (byte) -1, 4, 4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        int[] intArray28 = mutablePeriod24.getValues();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod27.addHours((-1));
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod27.setPeriod((long) 100, chronology31);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType38 = null;
        int int39 = mutablePeriod37.indexOf(durationFieldType38);
        mutablePeriod27.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType46 = null;
        int int47 = mutablePeriod45.indexOf(durationFieldType46);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod52.addHours((-1));
        mutablePeriod45.add((org.joda.time.ReadablePeriod) mutablePeriod52);
        mutablePeriod45.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableInstant58, readableInstant59, periodType60);
        mutablePeriod61.setMinutes((int) (short) 100);
        org.joda.time.Period period64 = mutablePeriod61.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Duration duration71 = mutablePeriod69.toDurationFrom(readableInstant70);
        mutablePeriod69.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(10L, periodType75, chronology76);
        int int78 = mutablePeriod77.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod77);
        org.joda.time.DurationFieldType durationFieldType81 = mutablePeriod77.getFieldType((int) (short) 1);
        int int82 = mutablePeriod69.get(durationFieldType81);
        boolean boolean83 = period64.isSupported(durationFieldType81);
        boolean boolean84 = mutablePeriod45.isSupported(durationFieldType81);
        int int85 = mutablePeriod37.get(durationFieldType81);
        boolean boolean86 = mutablePeriod16.isSupported(durationFieldType81);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        // The following exception was thrown during execution in test generation
        try {
            int int39 = mutablePeriod4.getValue(96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(10L, periodType19, chronology20);
        mutablePeriod21.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod21.toDurationFrom(readableInstant25);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = mutablePeriod31.toDurationTo(readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
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
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration33, readableInstant34, periodType54);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(readableInstant17, (org.joda.time.ReadableDuration) duration26, periodType54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(97, (int) 'a', (int) (byte) 0, 100, (-1), 100, (int) (short) 0, 1, periodType54);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(10, 35, (int) (byte) 0, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 10, (int) (byte) 10, periodType54);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) ' ', periodType54, chronology62);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(periodType54);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType34);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) ' ', (int) (byte) 10, (int) (byte) 10, (int) (short) -1, (int) (byte) 10, (int) 'a', (int) (short) 1, 10, periodType34);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(periodType34);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.setDays((int) (byte) 1);
        int int10 = mutablePeriod3.getWeeks();
        mutablePeriod3.setMinutes(0);
        int int13 = mutablePeriod3.getYears();
        mutablePeriod3.setPeriod(1, 197, 4, (int) (byte) 10, (int) (byte) 100, 4, 35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT0.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '#', chronology2);
        mutablePeriod3.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        mutablePeriod3.setPeriod(readableInstant6, readableInstant7);
        org.joda.time.MutablePeriod mutablePeriod9 = mutablePeriod3.copy();
        org.joda.time.ReadableInstant readableInstant10 = null;
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
        mutablePeriod13.setHours((int) '4');
        mutablePeriod13.addMillis(8);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = mutablePeriod13.toDurationTo(readableInstant40);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(10L, periodType46, chronology47);
        mutablePeriod48.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = mutablePeriod48.toDurationFrom(readableInstant52);
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
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(readableInstant44, (org.joda.time.ReadableDuration) duration53, periodType81);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((long) '#', 1L, periodType81, chronology87);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration41, periodType81);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant91 = null;
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, readableInstant91);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration41);
        mutablePeriod93.addMinutes(0);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(periodType81);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        mutablePeriod16.add((long) 197);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod40.setPeriod((long) (short) 10, (long) 97, chronology43);
        java.lang.Object obj45 = mutablePeriod40.clone();
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "PT0.087S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "PT0.087S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "PT0.087S");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        mutablePeriod4.setPeriod((long) 97, 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod4.add((long) 52, chronology31);
        mutablePeriod4.addHours(1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType4);
        mutablePeriod5.setMinutes((int) (short) 100);
        org.joda.time.Period period8 = mutablePeriod5.toPeriod();
        java.lang.String str9 = mutablePeriod5.toString();
        org.joda.time.PeriodType periodType10 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) 1, (long) 35, periodType10);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT100M" + "'", str9, "PT100M");
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        org.joda.time.Chronology chronology47 = null;
        mutablePeriod38.add((long) (-41), chronology47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(mutablePeriod41);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        mutablePeriod4.clear();
        mutablePeriod4.clear();
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        int[] intArray3 = mutablePeriod2.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = mutablePeriod2.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        int int44 = mutablePeriod42.getDays();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 4);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        mutablePeriod1.setSeconds(100);
        int int38 = mutablePeriod1.getSeconds();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod44.addHours((-1));
        org.joda.time.Chronology chronology48 = null;
        mutablePeriod44.setPeriod((long) 100, chronology48);
        mutablePeriod44.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = mutablePeriod44.toDurationFrom(readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType60 = null;
        int int61 = mutablePeriod59.indexOf(durationFieldType60);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod66.addHours((-1));
        mutablePeriod59.add((org.joda.time.ReadablePeriod) mutablePeriod66);
        org.joda.time.PeriodType periodType70 = mutablePeriod59.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration53, readableInstant54, periodType70);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) (short) 10, periodType70);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(0L, 1L, periodType70);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType70);
        mutablePeriod74.setMillis(0);
        mutablePeriod2.add((org.joda.time.ReadablePeriod) mutablePeriod74);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 1);
        mutablePeriod2.setMonths(87);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, 0L);
        mutablePeriod2.addYears((int) (short) 10);
        org.joda.time.Period period5 = mutablePeriod2.toPeriod();
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', (int) (byte) 0, 97, 1, 1, (int) (short) 0, 52, (int) '4');
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
        mutablePeriod33.add(8, (int) 'a', (int) (byte) -1, 10, 8, 0, (int) (byte) 1, 52);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.MutablePeriod mutablePeriod45 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray46 = mutablePeriod45.getValues();
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = mutablePeriod51.toDurationFrom(readableInstant52);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType61 = null;
        int int62 = mutablePeriod60.indexOf(durationFieldType61);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod67.addHours((-1));
        mutablePeriod60.add((org.joda.time.ReadablePeriod) mutablePeriod67);
        org.joda.time.PeriodType periodType71 = mutablePeriod60.getPeriodType();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType71, chronology72);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant47, (org.joda.time.ReadableDuration) duration53, periodType71);
        mutablePeriod45.setPeriod((org.joda.time.ReadableDuration) duration53);
        mutablePeriod33.setPeriod((org.joda.time.ReadableDuration) duration53);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(periodType71);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        org.joda.time.ReadableInstant readableInstant35 = null;
        mutablePeriod33.setPeriod(readableInstant34, readableInstant35);
        org.joda.time.Chronology chronology39 = null;
        mutablePeriod33.setPeriod((long) 100, (long) 8, chronology39);
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod33.setPeriod((-1L), 0L, chronology43);
        java.lang.String str45 = mutablePeriod33.toString();
        mutablePeriod33.setYears(10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PT0.001S" + "'", str45, "PT0.001S");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, chronology1);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        mutablePeriod14.addHours(4);
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        int int42 = mutablePeriod39.getDays();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "P10Y100M1W1DT100H0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "P10Y100M1W1DT100H0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "P10Y100M1W1DT100H0.001S");
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        mutablePeriod4.addMillis((int) (short) 100);
        mutablePeriod4.setMinutes((int) (byte) 0);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(10, (int) '4', (int) '4', 35);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        mutablePeriod11.add((-1L));
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        org.joda.time.MutablePeriod mutablePeriod87 = mutablePeriod86.toMutablePeriod();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(mutablePeriod87);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        int int2 = mutablePeriod1.getMillis();
        java.lang.Class<?> wildcardClass3 = mutablePeriod1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        java.lang.Object obj5 = mutablePeriod4.clone();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "PT0.011S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "PT0.011S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "PT0.011S");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        mutablePeriod42.setYears((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        mutablePeriod27.setWeeks((int) '#');
        int int30 = mutablePeriod27.getYears();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        int int45 = mutablePeriod3.getMillis();
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.Period period7 = mutablePeriod3.toPeriod();
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = mutablePeriod3.getFieldTypes();
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((-1L), chronology1);
        java.lang.Object obj3 = mutablePeriod2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "PT0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "PT0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "PT0.001S");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(10L, periodType2, chronology3);
        mutablePeriod4.addHours((int) (byte) 10);
        org.joda.time.PeriodType periodType7 = mutablePeriod4.getPeriodType();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 8, periodType7, chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (short) -1, chronology11);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        int int14 = mutablePeriod12.indexOf(durationFieldType13);
        mutablePeriod12.addYears((int) (short) 1);
        mutablePeriod12.setDays((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod23.setPeriod((long) 100, chronology27);
        mutablePeriod23.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = mutablePeriod23.toDurationFrom(readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant35);
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(10L, periodType45, chronology46);
        mutablePeriod47.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = mutablePeriod47.toDurationFrom(readableInstant51);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType58 = mutablePeriod57.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(readableInstant43, (org.joda.time.ReadableDuration) duration52, periodType58);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 'a', (long) (byte) 10, periodType58, chronology60);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant40, periodType58);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod9, periodType58);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = mutablePeriod68.toDurationFrom(readableInstant69);
        mutablePeriod68.addMonths((int) (short) 0);
        int int73 = mutablePeriod68.getYears();
        mutablePeriod9.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod68);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        mutablePeriod70.setValue(1, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(duration72);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(periodType23);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (-41), (long) (-1), periodType23);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        java.lang.String str50 = mutablePeriod47.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT0S" + "'", str50, "PT0S");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        int int10 = mutablePeriod4.getMillis();
        mutablePeriod4.addYears((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        mutablePeriod27.addWeeks((int) (short) 100);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((java.lang.Object) (short) 100, periodType34, chronology35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        mutablePeriod12.add(4, (int) (short) 10, 8, (int) (byte) 10, 1, (int) (short) 10, 52, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.setValue(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        java.lang.String str10 = mutablePeriod4.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P-1MT96H1M0.097S" + "'", str10, "P-1MT96H1M0.097S");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        org.joda.time.PeriodType periodType5 = mutablePeriod1.getPeriodType();
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod1.add((long) (short) 1, chronology7);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue((int) '#', 107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        int int7 = mutablePeriod4.getMinutes();
        mutablePeriod4.setHours((-1));
        org.joda.time.ReadableInterval readableInterval10 = null;
        mutablePeriod4.setPeriod(readableInterval10);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        mutablePeriod12.setHours((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        mutablePeriod27.setPeriod((long) ' ', 0L);
        int int31 = mutablePeriod27.getMonths();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod2.setPeriod(100L, chronology9);
        mutablePeriod2.setPeriod((int) 'a', (int) ' ', (int) '4', (int) (byte) 100, (int) (short) 0, (int) ' ', (-1), (int) ' ');
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
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType61);
        org.joda.time.Chronology chronology66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((java.lang.Object) ' ', periodType61, chronology66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(periodType61);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
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
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType29, chronology33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType29);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, (-1L), periodType29, chronology36);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((java.lang.Object) chronology36);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        int int22 = mutablePeriod4.getSeconds();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        mutablePeriod3.addDays(100);
        org.joda.time.ReadableInterval readableInterval7 = null;
        mutablePeriod3.add(readableInterval7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 8);
        int int2 = mutablePeriod1.getWeeks();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) '#', chronology4);
        mutablePeriod5.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        mutablePeriod5.setPeriod(readableInstant8, readableInstant9);
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod5.setPeriod(100L, chronology12);
        int[] intArray14 = mutablePeriod5.getValues();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType15);
        mutablePeriod16.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod26 = mutablePeriod16.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType27 = null;
        boolean boolean28 = mutablePeriod16.isSupported(durationFieldType27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(periodType29);
        org.joda.time.Chronology chronology32 = null;
        mutablePeriod30.add(1L, chronology32);
        mutablePeriod30.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableInstant36, readableInstant37, periodType38);
        mutablePeriod39.setMinutes((int) (short) 100);
        org.joda.time.Period period42 = mutablePeriod39.toPeriod();
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
        boolean boolean61 = period42.isSupported(durationFieldType59);
        int int62 = mutablePeriod30.indexOf(durationFieldType59);
        int int63 = mutablePeriod16.indexOf(durationFieldType59);
        int int64 = mutablePeriod5.get(durationFieldType59);
        int int65 = mutablePeriod1.indexOf(durationFieldType59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod4.setPeriod(readableInstant5, readableInstant6);
        mutablePeriod4.add((int) (short) 10, (int) ' ', (int) (short) 1, (int) '#', (int) (short) 0, 97, (int) '#', (int) (short) 0);
        mutablePeriod4.addWeeks((int) (short) 0);
        mutablePeriod4.setMinutes((int) (byte) 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0.107S");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod6.toDurationFrom(readableInstant14);
        mutablePeriod6.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter18 = null;
        java.lang.String str19 = mutablePeriod6.toString(periodFormatter18);
        mutablePeriod6.setWeeks((int) (short) 1);
        mutablePeriod6.setPeriod((long) 10, (long) (short) 10);
        mutablePeriod1.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod6);
        mutablePeriod6.addYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1M0.100S" + "'", str19, "PT1M0.100S");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod56.setValue(35, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        int int7 = mutablePeriod4.size();
        mutablePeriod4.setPeriod((int) (byte) 10, 0, 8, (int) (byte) -1, (int) (short) 100, 0, 1, (int) '4');
        org.joda.time.PeriodType periodType17 = mutablePeriod4.getPeriodType();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType33 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant18, readableDuration19, periodType33);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant16, periodType33);
        mutablePeriod36.add((long) (byte) 10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        mutablePeriod18.setMinutes((int) 'a');
        int int37 = mutablePeriod18.getHours();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        mutablePeriod8.addMillis((int) '#');
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod2.setPeriod(100L, chronology9);
        int[] intArray11 = mutablePeriod2.getValues();
        mutablePeriod2.addWeeks(100);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) 10, (long) 8);
        mutablePeriod16.addSeconds((int) (short) -1);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        mutablePeriod16.setHours((int) 'a');
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(0L, (long) 'a', periodType2);
        mutablePeriod3.addMonths((int) '#');
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod4.toMutablePeriod();
        mutablePeriod12.setMillis(35);
        org.junit.Assert.assertNotNull(mutablePeriod12);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType13 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 0, periodType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod4.setPeriod(100L, 0L, chronology18);
        int[] intArray20 = mutablePeriod4.getValues();
        org.joda.time.Chronology chronology21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) intArray20, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0, 0, 0, 0, 0, -100]");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        mutablePeriod77.setMillis((int) (short) 100);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT1M0.100S" + "'", str44, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "PT0.100S");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(197, (int) (byte) 0, (int) (byte) -1, 4);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMillis(0);
        org.joda.time.MutablePeriod mutablePeriod9 = mutablePeriod4.copy();
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        mutablePeriod4.addMonths((int) '#');
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod4.copy();
        mutablePeriod4.addMonths(1);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        mutablePeriod40.addHours((int) (byte) 100);
        mutablePeriod40.setPeriod((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod40.setValue(87, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 87");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        org.joda.time.Period period44 = mutablePeriod43.toPeriod();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.PeriodType periodType7 = mutablePeriod3.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) '#', chronology9);
        mutablePeriod10.setMinutes(8);
        mutablePeriod10.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod19.setPeriod((long) 100, chronology23);
        mutablePeriod19.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = mutablePeriod19.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant29);
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration28, chronology31);
        mutablePeriod10.setHours((int) '4');
        mutablePeriod10.addMillis(8);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod10.toDurationTo(readableInstant37);
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration38);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration38);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (byte) 0, chronology2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setValue((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod2.indexOf(durationFieldType5);
        mutablePeriod2.setValue((int) (byte) 1, (int) (short) -1);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        mutablePeriod2.setPeriod(readableInstant10, readableInstant11);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod2.toMutablePeriod();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(mutablePeriod13);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter16 = null;
        java.lang.String str17 = mutablePeriod4.toString(periodFormatter16);
        mutablePeriod4.addHours((int) (short) -1);
        mutablePeriod4.addMinutes((-98));
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT1M0.100S" + "'", str17, "PT1M0.100S");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((-1L), (long) (short) 1, periodType82);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(periodType82);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, 107, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        int int6 = mutablePeriod3.getWeeks();
        mutablePeriod3.addMillis(0);
        int int9 = mutablePeriod3.getWeeks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType14 = mutablePeriod6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(periodType14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 10, periodType14, chronology16);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (short) 100, periodType14);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(periodType14);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 8, 100L, chronology2);
        int int4 = mutablePeriod3.getMonths();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod9.addHours((-1));
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod9.setPeriod((long) 100, chronology13);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        mutablePeriod9.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        mutablePeriod19.add((long) 100);
        mutablePeriod19.addSeconds((int) '4');
        mutablePeriod19.addMonths((int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        org.joda.time.Chronology chronology37 = null;
        mutablePeriod33.setPeriod((long) 100, chronology37);
        mutablePeriod33.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = mutablePeriod33.toDurationFrom(readableInstant41);
        mutablePeriod33.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(readableInstant45, readableInstant46, periodType47);
        int int49 = mutablePeriod48.size();
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableInstant50, readableInstant51, periodType52);
        int int54 = mutablePeriod53.size();
        mutablePeriod48.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod53);
        boolean boolean56 = mutablePeriod33.equals((java.lang.Object) mutablePeriod53);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod61.addHours((-1));
        org.joda.time.Chronology chronology65 = null;
        mutablePeriod61.setPeriod((long) 100, chronology65);
        mutablePeriod61.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = mutablePeriod61.toDurationFrom(readableInstant69);
        mutablePeriod53.setPeriod((org.joda.time.ReadableDuration) duration70);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod80.addHours((-1));
        org.joda.time.Chronology chronology84 = null;
        mutablePeriod80.setPeriod((long) 100, chronology84);
        mutablePeriod80.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType88 = mutablePeriod80.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod(periodType88);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((long) 10, periodType88, chronology90);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod(readableInstant73, readableInstant74, periodType88);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration70, readableInstant72, periodType88);
        mutablePeriod19.add((org.joda.time.ReadableDuration) duration70);
        mutablePeriod19.setPeriod((long) '#');
        boolean boolean97 = mutablePeriod3.equals((java.lang.Object) mutablePeriod19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(periodType88);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        mutablePeriod3.addMinutes((int) (short) 1);
        int int9 = mutablePeriod3.getMinutes();
        mutablePeriod3.setPeriod((int) (byte) 10, 8, (int) (byte) -1, (int) (short) 100, (int) (byte) 0, 0, (int) (byte) 10, 1);
        mutablePeriod3.addMinutes((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        int int75 = mutablePeriod74.getWeeks();
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.clear();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod4.toDurationTo(readableInstant8);
        java.lang.Class<?> wildcardClass10 = mutablePeriod4.getClass();
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod2.setPeriod(100L, chronology9);
        int[] intArray11 = mutablePeriod2.getValues();
        mutablePeriod2.addWeeks(100);
        mutablePeriod2.addYears((int) (byte) 1);
        mutablePeriod2.setPeriod((long) (short) -1, (long) ' ');
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        int int10 = mutablePeriod4.getHours();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod4.toDurationTo(readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        mutablePeriod15.setPeriod(readableInstant16, readableInstant17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        mutablePeriod2.add((-1), 52, 10, (int) (byte) 100, 197, 1, 0, 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        mutablePeriod72.setHours((int) (byte) 10);
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType37 = mutablePeriod4.getFieldType(87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(durationFieldTypeArray34);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 10, (long) 8);
        mutablePeriod2.addSeconds((int) (short) -1);
        mutablePeriod2.setPeriod(8, (int) (short) -1, (-98), (int) (byte) 0, 107, (int) (byte) 0, 1, 96);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        mutablePeriod14.setMonths((int) ' ');
        org.joda.time.DurationFieldType[] durationFieldTypeArray20 = mutablePeriod14.getFieldTypes();
        mutablePeriod14.setMillis(1);
        mutablePeriod14.addMinutes((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(durationFieldTypeArray20);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = mutablePeriod4.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0S" + "'", str26, "PT0S");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (-98), chronology1);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("P-1MT96H1M0.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod18.toDurationFrom(readableInstant19);
        org.joda.time.MutablePeriod mutablePeriod21 = mutablePeriod18.toMutablePeriod();
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod18.setPeriod((long) 1, chronology23);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = mutablePeriod29.indexOf(durationFieldType30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod36.addHours((-1));
        mutablePeriod29.add((org.joda.time.ReadablePeriod) mutablePeriod36);
        mutablePeriod29.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(readableInstant42, readableInstant43, periodType44);
        mutablePeriod45.setMinutes((int) (short) 100);
        org.joda.time.Period period48 = mutablePeriod45.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = mutablePeriod53.toDurationFrom(readableInstant54);
        mutablePeriod53.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(10L, periodType59, chronology60);
        int int62 = mutablePeriod61.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod61);
        org.joda.time.DurationFieldType durationFieldType65 = mutablePeriod61.getFieldType((int) (short) 1);
        int int66 = mutablePeriod53.get(durationFieldType65);
        boolean boolean67 = period48.isSupported(durationFieldType65);
        boolean boolean68 = mutablePeriod29.isSupported(durationFieldType65);
        mutablePeriod18.add(durationFieldType65, 97);
        int int71 = mutablePeriod3.get(durationFieldType65);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT100M" + "'", str7, "PT100M");
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 52 + "'", int71 == 52);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        mutablePeriod3.addDays(52);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT100M" + "'", str7, "PT100M");
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = mutablePeriod4.toDurationFrom(readableInstant8);
        java.lang.String str10 = mutablePeriod4.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT97H1M0.097S" + "'", str10, "PT97H1M0.097S");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        org.joda.time.Period period70 = mutablePeriod4.toPeriod();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(period70);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        mutablePeriod33.add((int) (short) 1, (int) 'a', 0, (int) (byte) 1, (int) (short) 100, (int) (short) 100, (int) (short) 100, (int) (byte) 1);
        mutablePeriod33.add((long) 10);
        int int46 = mutablePeriod33.getValue(1);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 1, 10L, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(10L, periodType5, chronology6);
        int int8 = mutablePeriod7.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod7);
        org.joda.time.DurationFieldType durationFieldType11 = mutablePeriod7.getFieldType((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        mutablePeriod7.setPeriod(readableInstant12, readableInstant13);
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod7);
        int int16 = mutablePeriod7.getMillis();
        mutablePeriod7.addMonths(97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1);
        mutablePeriod2.setSeconds((int) (byte) 10);
        mutablePeriod2.setMillis((int) (short) -1);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        mutablePeriod3.addMinutes((int) (short) 1);
        int int9 = mutablePeriod3.getMinutes();
        mutablePeriod3.setPeriod((int) (byte) 10, 8, (int) (byte) -1, (int) (short) 100, (int) (byte) 0, 0, (int) (byte) 10, 1);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutablePeriod3.setPeriod(readablePeriod19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        mutablePeriod24.setMinutes((int) (short) 100);
        org.joda.time.Period period27 = mutablePeriod24.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod32.toDurationFrom(readableInstant33);
        mutablePeriod32.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(10L, periodType38, chronology39);
        int int41 = mutablePeriod40.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod40);
        org.joda.time.DurationFieldType durationFieldType44 = mutablePeriod40.getFieldType((int) (short) 1);
        int int45 = mutablePeriod32.get(durationFieldType44);
        boolean boolean46 = period27.isSupported(durationFieldType44);
        org.joda.time.MutablePeriod mutablePeriod47 = period27.toMutablePeriod();
        int int48 = mutablePeriod47.getMinutes();
        mutablePeriod47.setMillis((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableInstant51, readableInstant52, periodType53);
        int int55 = mutablePeriod54.size();
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(readableInstant56, readableInstant57, periodType58);
        int int60 = mutablePeriod59.size();
        mutablePeriod54.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod59);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod66.addHours((-1));
        org.joda.time.Chronology chronology70 = null;
        mutablePeriod66.setPeriod((long) 100, chronology70);
        mutablePeriod66.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Duration duration75 = mutablePeriod66.toDurationFrom(readableInstant74);
        mutablePeriod66.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter78 = null;
        java.lang.String str79 = mutablePeriod66.toString(periodFormatter78);
        mutablePeriod66.setWeeks((int) (short) 1);
        mutablePeriod66.setPeriod((long) 10, (long) (short) 10);
        org.joda.time.DurationFieldType durationFieldType86 = mutablePeriod66.getFieldType((int) (byte) 0);
        boolean boolean87 = mutablePeriod54.isSupported(durationFieldType86);
        boolean boolean88 = mutablePeriod47.isSupported(durationFieldType86);
        mutablePeriod3.set(durationFieldType86, 96);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 8 + "'", int60 == 8);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "PT1M0.100S" + "'", str79, "PT1M0.100S");
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        java.lang.String str7 = mutablePeriod3.toString();
        mutablePeriod3.addHours((int) (byte) 0);
        mutablePeriod3.setMinutes(0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT100M" + "'", str7, "PT100M");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '#', chronology2);
        mutablePeriod3.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType13 = null;
        int int14 = mutablePeriod12.indexOf(durationFieldType13);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        mutablePeriod12.add((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.PeriodType periodType23 = mutablePeriod12.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType23);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod3.toDurationTo(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType40 = null;
        int int41 = mutablePeriod39.indexOf(durationFieldType40);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod46.addHours((-1));
        mutablePeriod39.add((org.joda.time.ReadablePeriod) mutablePeriod46);
        org.joda.time.PeriodType periodType50 = mutablePeriod39.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType50);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant32, periodType50);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, readableInstant54);
        mutablePeriod55.addSeconds((-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(periodType50);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = mutablePeriod1.isSupported(durationFieldType12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(periodType14);
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod15.add(1L, chronology17);
        mutablePeriod15.setMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        mutablePeriod24.setMinutes((int) (short) 100);
        org.joda.time.Period period27 = mutablePeriod24.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod32.toDurationFrom(readableInstant33);
        mutablePeriod32.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(10L, periodType38, chronology39);
        int int41 = mutablePeriod40.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod40);
        org.joda.time.DurationFieldType durationFieldType44 = mutablePeriod40.getFieldType((int) (short) 1);
        int int45 = mutablePeriod32.get(durationFieldType44);
        boolean boolean46 = period27.isSupported(durationFieldType44);
        int int47 = mutablePeriod15.indexOf(durationFieldType44);
        int int48 = mutablePeriod1.indexOf(durationFieldType44);
        mutablePeriod1.addHours((int) 'a');
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) '#', chronology52);
        mutablePeriod53.setMinutes(8);
        org.joda.time.DurationFieldType durationFieldType56 = null;
        int int57 = mutablePeriod53.indexOf(durationFieldType56);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableInstant58, readableInstant59, periodType60);
        org.joda.time.Chronology chronology64 = null;
        mutablePeriod61.setPeriod((long) 8, 100L, chronology64);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = mutablePeriod70.toDurationFrom(readableInstant71);
        mutablePeriod70.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(10L, periodType76, chronology77);
        int int79 = mutablePeriod78.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod78);
        org.joda.time.DurationFieldType durationFieldType82 = mutablePeriod78.getFieldType((int) (short) 1);
        int int83 = mutablePeriod70.get(durationFieldType82);
        boolean boolean84 = mutablePeriod61.isSupported(durationFieldType82);
        boolean boolean85 = mutablePeriod53.isSupported(durationFieldType82);
        int int86 = mutablePeriod1.get(durationFieldType82);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(durationFieldType82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 100 + "'", int86 == 100);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.lang.Object obj33 = mutablePeriod4.clone();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "PT32.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "PT32.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "PT32.100S");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = mutablePeriod42.toDurationFrom(readableInstant43);
        mutablePeriod42.setSeconds((int) '4');
        java.lang.String str47 = mutablePeriod42.toString();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) '#', chronology49);
        mutablePeriod50.setMinutes(8);
        mutablePeriod50.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod59.addHours((-1));
        org.joda.time.Chronology chronology63 = null;
        mutablePeriod59.setPeriod((long) 100, chronology63);
        mutablePeriod59.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Duration duration68 = mutablePeriod59.toDurationFrom(readableInstant67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration68, readableInstant69);
        org.joda.time.Chronology chronology71 = null;
        mutablePeriod50.setPeriod((org.joda.time.ReadableDuration) duration68, chronology71);
        mutablePeriod50.setHours((int) '4');
        mutablePeriod50.addMillis(8);
        mutablePeriod42.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.MutablePeriod mutablePeriod78 = mutablePeriod42.toMutablePeriod();
        mutablePeriod1.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod42);
        int[] intArray80 = mutablePeriod42.getValues();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PT97H1M52.097S" + "'", str47, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(mutablePeriod78);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[0, 0, 0, 0, 52, 0, 0, 108]");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        mutablePeriod1.addMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod1.copy();
        org.joda.time.ReadableInterval readableInterval5 = null;
        mutablePeriod4.setPeriod(readableInterval5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod4.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod16.addHours((-1));
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod16.setPeriod((long) 100, chronology20);
        mutablePeriod16.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType24 = mutablePeriod16.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (byte) 1, 1L, periodType24, chronology25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, readableInstant9, periodType24);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        int int28 = mutablePeriod27.getYears();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        org.joda.time.MutablePeriod mutablePeriod35 = mutablePeriod31.toMutablePeriod();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod35);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        mutablePeriod21.setSeconds(87);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod21);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 87, chronology2);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.setSeconds((int) '4');
        mutablePeriod4.addYears((int) 'a');
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
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(readableInstant11, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod49.addHours((-1));
        org.joda.time.Chronology chronology53 = null;
        mutablePeriod49.setPeriod((long) 100, chronology53);
        mutablePeriod49.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType57 = mutablePeriod49.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(periodType57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 10, periodType57, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType57, chronology61);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) (short) 100, (long) (byte) 0, periodType57);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1, periodType57);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant38, periodType57);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration32);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(periodType57);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) '#', 100, 0);
        java.lang.String str5 = mutablePeriod4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT97H35M100S" + "'", str5, "PT97H35M100S");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod3.setPeriod((long) 0, (long) 96, chronology29);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        java.lang.String str3 = mutablePeriod2.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod8.indexOf(durationFieldType9);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        mutablePeriod8.setMillis((int) (short) -1);
        mutablePeriod8.add((long) (short) 100);
        mutablePeriod8.add((int) 'a', (int) (short) -1, (int) '4', (int) (short) 100, (int) 'a', 35, (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        mutablePeriod24.add((long) (byte) 10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        int[] intArray15 = mutablePeriod4.getValues();
        int int16 = mutablePeriod4.getWeeks();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod21.toDurationFrom(readableInstant22);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType31 = null;
        int int32 = mutablePeriod30.indexOf(durationFieldType31);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        mutablePeriod30.add((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.PeriodType periodType41 = mutablePeriod30.getPeriodType();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType41, chronology42);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant17, (org.joda.time.ReadableDuration) duration23, periodType41);
        int int45 = mutablePeriod44.getDays();
        mutablePeriod44.clear();
        mutablePeriod44.addMinutes(10);
        org.joda.time.ReadableInterval readableInterval49 = null;
        mutablePeriod44.setPeriod(readableInterval49);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 193, 2, 0, 194]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(10L, periodType18, chronology19);
        mutablePeriod20.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = mutablePeriod20.toDurationFrom(readableInstant24);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = mutablePeriod30.toDurationTo(readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType43 = null;
        int int44 = mutablePeriod42.indexOf(durationFieldType43);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod49.addHours((-1));
        mutablePeriod42.add((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.joda.time.PeriodType periodType53 = mutablePeriod42.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType53, chronology55);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant33, periodType53);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(readableInstant16, (org.joda.time.ReadableDuration) duration25, periodType53);
        mutablePeriod11.setPeriod((org.joda.time.ReadableDuration) duration25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(periodType53);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) '#', 100, 0);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(periodType5);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.add(1L, chronology8);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = mutablePeriod6.indexOf(durationFieldType10);
        int int12 = mutablePeriod6.getMinutes();
        mutablePeriod6.setSeconds((int) (byte) 0);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(10L, periodType16, chronology17);
        int int19 = mutablePeriod18.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod18);
        org.joda.time.DurationFieldType durationFieldType22 = mutablePeriod18.getFieldType((int) (short) 1);
        int int23 = mutablePeriod6.indexOf(durationFieldType22);
        int int24 = mutablePeriod4.get(durationFieldType22);
        int int25 = mutablePeriod4.getMinutes();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 1, 10L, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(10L, periodType5, chronology6);
        int int8 = mutablePeriod7.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod7);
        org.joda.time.DurationFieldType durationFieldType11 = mutablePeriod7.getFieldType((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        mutablePeriod7.setPeriod(readableInstant12, readableInstant13);
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod7);
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
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod73.addHours((-1));
        org.joda.time.Chronology chronology77 = null;
        mutablePeriod73.setPeriod((long) 100, chronology77);
        mutablePeriod73.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType81 = mutablePeriod73.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(periodType81);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 10, periodType81, chronology83);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType81, chronology85);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant66, periodType81);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology91 = null;
        mutablePeriod3.setPeriod((long) (byte) 1, (long) ' ', chronology91);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType81);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationTo(readableInstant12);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod19.addHours((-1));
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod19.setPeriod((long) 100, chronology23);
        mutablePeriod19.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = mutablePeriod19.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant29);
        mutablePeriod11.setPeriod((org.joda.time.ReadableDuration) duration28);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration28);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.lang.String str43 = mutablePeriod40.toString();
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PT0.134S" + "'", str43, "PT0.134S");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        mutablePeriod1.addMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod1.copy();
        mutablePeriod1.setSeconds(52);
        mutablePeriod1.setSeconds((int) (short) 1);
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        mutablePeriod4.setMonths(100);
        mutablePeriod4.addSeconds((-41));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        int int8 = mutablePeriod3.getDays();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, chronology9);
        mutablePeriod10.setMonths(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P-1MT96H1M0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, 1, 52, 8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType7);
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod8.setPeriod((long) 8, 100L, chronology11);
        mutablePeriod8.clear();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod18.setPeriod((long) 100, chronology22);
        mutablePeriod18.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod18.toDurationFrom(readableInstant26);
        mutablePeriod18.addMillis((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod18.toDurationFrom(readableInstant30);
        mutablePeriod8.add((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration31, chronology33);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration31);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = mutablePeriod13.indexOf(durationFieldType14);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        mutablePeriod13.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.PeriodType periodType24 = mutablePeriod13.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(52, (int) (byte) 1, 35, 1, (-1), 107, (int) (byte) 1, 0, periodType24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (short) 10, periodType24, chronology26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        int int22 = mutablePeriod2.getYears();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = mutablePeriod2.indexOf(durationFieldType3);
        int int5 = mutablePeriod2.getHours();
        int int6 = mutablePeriod2.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', 0, 52, 52, 8, (int) (byte) 10, (int) '#', 1);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(10L, periodType10, chronology11);
        int int13 = mutablePeriod12.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod12);
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod12.getFieldType((int) (short) 1);
        mutablePeriod8.set(durationFieldType16, (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationFieldType16);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant50, periodType65);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = mutablePeriod71.getValue((-98));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType65);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) 8, 100L, chronology6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod3.add((long) 8, chronology9);
        mutablePeriod3.setWeeks(0);
        mutablePeriod3.addYears(0);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(0L, (long) 4, chronology2);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod22.toDurationFrom(readableInstant23);
        mutablePeriod22.addMonths((int) (short) 0);
        mutablePeriod22.setYears((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = mutablePeriod33.toDurationFrom(readableInstant34);
        mutablePeriod33.setSeconds((int) '4');
        java.lang.String str38 = mutablePeriod33.toString();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) '#', chronology40);
        mutablePeriod41.setMinutes(8);
        mutablePeriod41.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod50.addHours((-1));
        org.joda.time.Chronology chronology54 = null;
        mutablePeriod50.setPeriod((long) 100, chronology54);
        mutablePeriod50.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = mutablePeriod50.toDurationFrom(readableInstant58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration59, readableInstant60);
        org.joda.time.Chronology chronology62 = null;
        mutablePeriod41.setPeriod((org.joda.time.ReadableDuration) duration59, chronology62);
        mutablePeriod41.setHours((int) '4');
        mutablePeriod41.addMillis(8);
        mutablePeriod33.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod41);
        mutablePeriod41.clear();
        int int71 = mutablePeriod41.getValue((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.Duration duration78 = mutablePeriod76.toDurationFrom(readableInstant77);
        mutablePeriod76.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(10L, periodType82, chronology83);
        int int85 = mutablePeriod84.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod84);
        org.joda.time.DurationFieldType durationFieldType88 = mutablePeriod84.getFieldType((int) (short) 1);
        int int89 = mutablePeriod76.get(durationFieldType88);
        mutablePeriod41.add(durationFieldType88, (int) (short) 1);
        mutablePeriod22.add(durationFieldType88, 8);
        int int94 = mutablePeriod4.get(durationFieldType88);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT97H1M52.097S" + "'", str38, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(duration78);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(durationFieldType88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.setYears((-41));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod3.toDurationFrom(readableInstant7);
        mutablePeriod3.setPeriod((long) '4', (long) (byte) 100);
        mutablePeriod3.setPeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod15.setPeriod((long) (short) 0, chronology17);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod15);
        int int20 = mutablePeriod3.getYears();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, (int) (byte) 10, (int) '4', (int) ' ', (-1), 100, (int) (short) 0, (int) (byte) 1);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.setPeriod((-1L), chronology10);
        int int12 = mutablePeriod8.getDays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = mutablePeriod8.getFieldTypes();
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod8.add((long) (short) 1, chronology15);
        mutablePeriod8.setDays((int) (byte) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray19 = mutablePeriod8.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(durationFieldTypeArray19);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        mutablePeriod4.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = mutablePeriod4.toDurationFrom(readableInstant9);
        mutablePeriod4.add((long) ' ');
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        mutablePeriod24.addHours((int) (byte) 100);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType32 = null;
        int int33 = mutablePeriod31.indexOf(durationFieldType32);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod31);
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod34.setPeriod(0L, chronology36);
        mutablePeriod24.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod34);
        mutablePeriod34.addYears(0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = mutablePeriod1.isSupported(durationFieldType12);
        java.lang.Object obj14 = mutablePeriod1.clone();
        mutablePeriod1.setYears((int) (short) 0);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "P100M100WT100H99.999S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "P100M100WT100H99.999S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "P100M100WT100H99.999S");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = mutablePeriod6.indexOf(durationFieldType7);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod13.addHours((-1));
        mutablePeriod6.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.PeriodType periodType17 = mutablePeriod6.getPeriodType();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType17, chronology18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        mutablePeriod19.setPeriod(readableInstant20, readableInstant21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        mutablePeriod19.setPeriod(readableInterval23);
        int int25 = mutablePeriod19.getMillis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        mutablePeriod24.addHours((int) (byte) 100);
        int int27 = mutablePeriod24.getMillis();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 97, chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
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
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType65);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(readableInstant22, readableInstant23, periodType65);
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((java.lang.Object) chronology20, periodType65);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant18, periodType65);
        int int73 = mutablePeriod72.getWeeks();
        org.joda.time.ReadableInterval readableInterval74 = null;
        mutablePeriod72.add(readableInterval74);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        java.lang.String str3 = mutablePeriod2.toString();
        mutablePeriod2.setHours((int) '#');
        mutablePeriod2.setPeriod((long) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        mutablePeriod8.setPeriod((long) 'a');
        mutablePeriod8.setHours((int) (short) 10);
        mutablePeriod8.setSeconds((int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        // The following exception was thrown during execution in test generation
        try {
            int int61 = mutablePeriod7.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 0);
        mutablePeriod1.addMinutes((-1));
        mutablePeriod1.addYears((int) (short) -1);
        mutablePeriod1.setMinutes((int) ' ');
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((java.lang.Object) durationFieldType64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(4, (int) (byte) 10, 10, 100, (int) (byte) 10, (int) '4', (int) 'a', 87);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) '#', chronology2);
        mutablePeriod3.setPeriod((int) (short) 0, 0, 0, (int) (short) 100, (int) (byte) 10, (int) (short) -1, 4, 1);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) ' ', 0, 52, 52, 8, (int) (byte) 10, (int) '#', 1);
        mutablePeriod21.addSeconds((int) '4');
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
        mutablePeriod48.setPeriod((int) (short) 1, (int) (byte) 100, 97, (int) '#', 1, (int) (short) 100, (int) (byte) -1, 97);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.Duration duration82 = mutablePeriod80.toDurationFrom(readableInstant81);
        mutablePeriod80.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(10L, periodType86, chronology87);
        int int89 = mutablePeriod88.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod88);
        org.joda.time.DurationFieldType durationFieldType92 = mutablePeriod88.getFieldType((int) (short) 1);
        int int93 = mutablePeriod80.get(durationFieldType92);
        mutablePeriod48.set(durationFieldType92, (int) (byte) 0);
        mutablePeriod21.add(durationFieldType92, (int) (short) 10);
        int int98 = mutablePeriod3.indexOf(durationFieldType92);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(durationFieldType92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 1 + "'", int98 == 1);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        org.joda.time.Chronology chronology74 = null;
        mutablePeriod4.setPeriod((long) '4', chronology74);
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        mutablePeriod31.addMinutes(96);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = mutablePeriod3.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray14);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod20.setPeriod((long) 0, (long) (short) -1, chronology23);
        org.junit.Assert.assertNotNull(duration15);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        org.joda.time.ReadableInterval readableInterval28 = null;
        mutablePeriod27.add(readableInterval28);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod27);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P52WT1M0.197S");
        mutablePeriod1.setWeeks((int) 'a');
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        int int16 = mutablePeriod11.getMinutes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.setDays((int) (byte) 1);
        int int10 = mutablePeriod3.getWeeks();
        int int11 = mutablePeriod3.getMinutes();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        int int9 = mutablePeriod4.getYears();
        mutablePeriod4.addMillis(100);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        mutablePeriod31.add((long) (short) 1);
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
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        mutablePeriod27.addMonths((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        mutablePeriod26.addSeconds((int) '#');
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, 0L, chronology2);
        mutablePeriod3.addHours(52);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod25.addHours((-1));
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod25.setPeriod((long) 100, chronology29);
        mutablePeriod25.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod25.toDurationFrom(readableInstant33);
        mutablePeriod25.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableInstant37, readableInstant38, periodType39);
        int int41 = mutablePeriod40.size();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(readableInstant42, readableInstant43, periodType44);
        int int46 = mutablePeriod45.size();
        mutablePeriod40.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod45);
        boolean boolean48 = mutablePeriod25.equals((java.lang.Object) mutablePeriod45);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod53.addHours((-1));
        org.joda.time.Chronology chronology57 = null;
        mutablePeriod53.setPeriod((long) 100, chronology57);
        mutablePeriod53.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = mutablePeriod53.toDurationFrom(readableInstant61);
        mutablePeriod45.setPeriod((org.joda.time.ReadableDuration) duration62);
        mutablePeriod45.setPeriod((int) (short) 1, (int) (byte) 100, 97, (int) '#', 1, (int) (short) 100, (int) (byte) -1, 97);
        org.joda.time.PeriodType periodType73 = mutablePeriod45.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant20, periodType73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(periodType73);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod74);
        org.joda.time.DurationFieldType durationFieldType77 = mutablePeriod74.getFieldType(0);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(durationFieldType77);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        org.joda.time.Chronology chronology48 = null;
        mutablePeriod4.setPeriod((long) (-1), (long) (-1), chronology48);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant29);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        int int12 = mutablePeriod4.getMillis();
        mutablePeriod4.setSeconds(1);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod20.setPeriod((long) 100, chronology24);
        mutablePeriod20.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType28 = mutablePeriod20.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(periodType28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (byte) 0, periodType28);
        org.joda.time.ReadableInterval readableInterval31 = null;
        mutablePeriod30.add(readableInterval31);
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
        mutablePeriod30.add(durationFieldType91, 0);
        mutablePeriod4.add(durationFieldType91, (int) 'a');
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(periodType28);
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
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        mutablePeriod6.addDays((int) (short) 10);
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
        mutablePeriod6.setPeriod((org.joda.time.ReadableDuration) duration24);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod58.addHours((-1));
        org.joda.time.Chronology chronology62 = null;
        mutablePeriod58.setPeriod((long) 100, chronology62);
        mutablePeriod58.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType66 = mutablePeriod58.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod(periodType66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 10, periodType66, chronology68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType66, chronology70);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) (short) 100, (long) (byte) 0, periodType66);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1, periodType66);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration24, periodType66);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration24, periodType75);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType66);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = mutablePeriod3.indexOf(durationFieldType4);
        mutablePeriod3.addYears((int) (short) 1);
        mutablePeriod3.setDays((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.addHours((-1));
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod14.setPeriod((long) 100, chronology18);
        mutablePeriod14.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod14.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant26);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(10L, periodType36, chronology37);
        mutablePeriod38.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = mutablePeriod38.toDurationFrom(readableInstant42);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType49 = mutablePeriod48.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(readableInstant34, (org.joda.time.ReadableDuration) duration43, periodType49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 'a', (long) (byte) 10, periodType49, chronology51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant31, periodType49);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(periodType49);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType5);
        int int7 = mutablePeriod6.size();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant8, readableInstant9, periodType10);
        int int12 = mutablePeriod11.size();
        mutablePeriod6.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        boolean boolean15 = mutablePeriod6.equals((java.lang.Object) 0.0d);
        org.joda.time.ReadableInterval readableInterval16 = null;
        mutablePeriod6.setPeriod(readableInterval16);
        org.joda.time.PeriodType periodType18 = mutablePeriod6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant1, readableInstant2, periodType18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) 97, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter16 = null;
        java.lang.String str17 = mutablePeriod4.toString(periodFormatter16);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = mutablePeriod32.indexOf(durationFieldType33);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        mutablePeriod32.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.PeriodType periodType43 = mutablePeriod32.getPeriodType();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType43, chronology44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, periodType43, chronology47);
        org.joda.time.Chronology chronology50 = null;
        mutablePeriod4.add((long) 100, chronology50);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT1M0.100S" + "'", str17, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        int int52 = mutablePeriod4.getHours();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        mutablePeriod40.addHours((int) (byte) 100);
        mutablePeriod40.setSeconds((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = mutablePeriod51.toDurationFrom(readableInstant52);
        mutablePeriod51.addMonths((int) (short) 0);
        mutablePeriod51.addMinutes((int) '#');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod63.addHours((-1));
        org.joda.time.Chronology chronology67 = null;
        mutablePeriod63.setPeriod((long) 100, chronology67);
        mutablePeriod63.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = mutablePeriod63.toDurationFrom(readableInstant71);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration72, readableInstant73);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(readableInstant58, (org.joda.time.ReadableDuration) duration72, periodType75);
        mutablePeriod51.setPeriod((org.joda.time.ReadableDuration) duration72);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(readableInstant46, (org.joda.time.ReadableDuration) duration72);
        mutablePeriod40.setPeriod((org.joda.time.ReadableDuration) duration72);
        mutablePeriod40.setSeconds(97);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration72);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant11, readableInstant12, periodType13);
        int int15 = mutablePeriod14.size();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod14.toDurationFrom(readableInstant22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = mutablePeriod36.toDurationFrom(readableInstant37);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType54 = null;
        int int55 = mutablePeriod53.indexOf(durationFieldType54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod60.addHours((-1));
        mutablePeriod53.add((org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.PeriodType periodType64 = mutablePeriod53.getPeriodType();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType64, chronology65);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType64);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(readableInstant31, (org.joda.time.ReadableDuration) duration38, periodType64);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(readableInstant29, readableInstant30, periodType64);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (short) -1, periodType64);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) 8, periodType64, chronology71);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, readableInstant25, periodType64);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod80.addHours((-1));
        org.joda.time.Chronology chronology84 = null;
        mutablePeriod80.setPeriod((long) 100, chronology84);
        mutablePeriod80.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType88 = mutablePeriod80.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod(periodType88);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((long) 10, periodType88, chronology90);
        org.joda.time.Chronology chronology92 = null;
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType88, chronology92);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod(readableInstant9, (org.joda.time.ReadableDuration) duration23, periodType88);
        org.joda.time.Chronology chronology95 = null;
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod((long) (short) 100, periodType88, chronology95);
        org.joda.time.MutablePeriod mutablePeriod97 = new org.joda.time.MutablePeriod((int) (short) 100, 35, 8, (int) (byte) 100, 97, (int) (byte) 100, 0, (-98), periodType88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType88);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod();
        mutablePeriod46.setMillis((int) (byte) 10);
        mutablePeriod46.addMinutes((int) (byte) -1);
        mutablePeriod46.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType53 = mutablePeriod46.getPeriodType();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType53, chronology54);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant44, periodType53);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        mutablePeriod57.setPeriod(35, (-1), 100, 0, (int) '4', 100, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType53);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        mutablePeriod4.addDays(1);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        org.joda.time.ReadableInterval readableInterval28 = null;
        mutablePeriod27.setPeriod(readableInterval28);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 10, chronology1);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 100, (long) (-1));
        int int3 = mutablePeriod2.getHours();
        mutablePeriod2.addMinutes((-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, 0, 1, (int) (byte) 100, 0, 100, (int) '#', (int) (short) 10);
        int int9 = mutablePeriod8.getMonths();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        org.joda.time.ReadableInterval readableInterval54 = null;
        mutablePeriod42.setPeriod(readableInterval54);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod24.addHours((-1));
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod24.setPeriod((long) 100, chronology28);
        mutablePeriod24.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = mutablePeriod24.toDurationFrom(readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration33, readableInstant34);
        mutablePeriod35.add((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 8, (int) (byte) 10, 1);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod49.addHours((-1));
        org.joda.time.Chronology chronology53 = null;
        mutablePeriod49.setPeriod((long) 100, chronology53);
        mutablePeriod49.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = mutablePeriod49.toDurationFrom(readableInstant57);
        mutablePeriod49.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter61 = null;
        java.lang.String str62 = mutablePeriod49.toString(periodFormatter61);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType78 = null;
        int int79 = mutablePeriod77.indexOf(durationFieldType78);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod84.addHours((-1));
        mutablePeriod77.add((org.joda.time.ReadablePeriod) mutablePeriod84);
        org.joda.time.PeriodType periodType88 = mutablePeriod77.getPeriodType();
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType88, chronology89);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType88);
        org.joda.time.Chronology chronology92 = null;
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod49, periodType88, chronology92);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod35, periodType88);
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod(readableInstant18, readableInstant19, periodType88);
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration17, periodType88);
        org.joda.time.MutablePeriod mutablePeriod97 = new org.joda.time.MutablePeriod((long) 107, (-1L), periodType88);
        org.joda.time.MutablePeriod mutablePeriod98 = new org.joda.time.MutablePeriod(100, 0, 35, (int) (short) -1, (int) ' ', 0, (int) (byte) 0, 52, periodType88);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "PT1M0.100S" + "'", str62, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(periodType88);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 8, 100L, chronology2);
        int int4 = mutablePeriod3.getMonths();
        org.joda.time.format.PeriodFormatter periodFormatter5 = null;
        java.lang.String str6 = mutablePeriod3.toString(periodFormatter5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.092S" + "'", str6, "PT0.092S");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        org.joda.time.ReadableInterval readableInterval20 = null;
        mutablePeriod2.add(readableInterval20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) 8);
        mutablePeriod4.setMinutes(97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.format.PeriodFormatter periodFormatter5 = null;
        java.lang.String str6 = mutablePeriod3.toString(periodFormatter5);
        int int7 = mutablePeriod3.getDays();
        mutablePeriod3.setMinutes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.010S" + "'", str6, "PT0.010S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 0, periodType3, chronology4);
        int int6 = mutablePeriod5.getYears();
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
        boolean boolean25 = mutablePeriod5.isSupported(durationFieldType23);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod30.addMinutes((int) (byte) -1);
        mutablePeriod30.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = mutablePeriod30.toDurationFrom(readableInstant35);
        mutablePeriod5.add((org.joda.time.ReadableDuration) duration36);
        org.joda.time.ReadableInstant readableInstant38 = null;
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
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration36, readableInstant38, periodType68);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) 'a', 0L, periodType68, chronology75);
        mutablePeriod76.addMonths(8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        org.joda.time.ReadableInterval readableInterval23 = null;
        mutablePeriod17.setPeriod(readableInterval23);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P35DT97H0.097S" + "'", str14, "P35DT97H0.097S");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        mutablePeriod7.setPeriod(4, 8, (int) (byte) 1, 8, (int) (byte) 1, 1, (int) (short) -1, (int) (short) 1);
        mutablePeriod7.setPeriod(10L, (long) 'a');
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 0, 10L, periodType37, chronology43);
        int int45 = mutablePeriod44.getWeeks();
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, (long) (short) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) '#', chronology5);
        mutablePeriod6.setMinutes(8);
        mutablePeriod6.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod15.addHours((-1));
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod15.setPeriod((long) 100, chronology19);
        mutablePeriod15.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod15.toDurationFrom(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant25);
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod6.setPeriod((org.joda.time.ReadableDuration) duration24, chronology27);
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration24, chronology29);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = mutablePeriod42.toDurationFrom(readableInstant43);
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
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant37, (org.joda.time.ReadableDuration) duration44, periodType70);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(readableInstant35, readableInstant36, periodType70);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) (short) -1, periodType70);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType70, chronology77);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) (byte) 1, periodType70, chronology79);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration24, periodType70);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', (int) (byte) 0, 97, 1, 1, (int) (short) 0, 52, (int) '4');
        mutablePeriod8.setWeeks(52);
        org.joda.time.ReadableInterval readableInterval11 = null;
        mutablePeriod8.setPeriod(readableInterval11);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        int int20 = mutablePeriod4.getDays();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod2.setPeriod(100L, chronology9);
        int[] intArray11 = mutablePeriod2.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter12 = null;
        java.lang.String str13 = mutablePeriod2.toString(periodFormatter12);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0.100S" + "'", str13, "PT0.100S");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod42);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        mutablePeriod3.setPeriod((long) 197, (long) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        int int45 = mutablePeriod24.getSeconds();
        mutablePeriod24.add(97, (int) (short) 100, (int) (short) 0, 0, (int) (byte) -1, (int) (short) 0, (int) (short) -1, 100);
        mutablePeriod24.addHours(100);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType33 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) (byte) 10, (int) (byte) 0, (int) (short) 10, (int) '#', (int) '#', (int) (short) 1, 1, periodType33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant18, readableDuration19, periodType33);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant16, periodType33);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(periodType33);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        mutablePeriod4.addMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4);
        int int12 = mutablePeriod11.getYears();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        mutablePeriod4.setSeconds(1);
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = mutablePeriod4.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod4.copy();
        org.joda.time.DurationFieldType[] durationFieldTypeArray9 = mutablePeriod8.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldTypeArray7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray9);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        int int26 = mutablePeriod4.getMillis();
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod4.setPeriod((long) (-41), (long) 'a', chronology29);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "PT0.138S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "PT0.138S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "PT0.138S");
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 197 + "'", int26 == 197);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(periodType52);
        int int55 = mutablePeriod54.getMinutes();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(obj0, chronology1);
        mutablePeriod2.setPeriod((int) '4', 97, 87, 24, (-98), 0, 107, (int) (byte) -1);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        java.lang.Object obj72 = mutablePeriod24.clone();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "P1Y97W35DT1H100M0.903S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "P1Y97W35DT1H100M0.903S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "P1Y97W35DT1H100M0.903S");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P100M10W1DT10M0.948S");
        mutablePeriod1.setSeconds((int) (byte) 1);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod8.addHours((-1));
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod8.setPeriod((long) 100, chronology12);
        mutablePeriod8.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType16 = mutablePeriod8.getPeriodType();
        mutablePeriod1.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
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
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) '#', chronology70);
        mutablePeriod71.setMinutes(8);
        mutablePeriod71.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod80.addHours((-1));
        org.joda.time.Chronology chronology84 = null;
        mutablePeriod80.setPeriod((long) 100, chronology84);
        mutablePeriod80.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant88 = null;
        org.joda.time.Duration duration89 = mutablePeriod80.toDurationFrom(readableInstant88);
        org.joda.time.ReadableInstant readableInstant90 = null;
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration89, readableInstant90);
        org.joda.time.Chronology chronology92 = null;
        mutablePeriod71.setPeriod((org.joda.time.ReadableDuration) duration89, chronology92);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod(readableInstant68, (org.joda.time.ReadableDuration) duration89);
        org.joda.time.Chronology chronology95 = null;
        mutablePeriod67.setPeriod((org.joda.time.ReadableDuration) duration89, chronology95);
        org.joda.time.Chronology chronology97 = null;
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration89, chronology97);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(duration89);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod30.addMinutes((int) (byte) -1);
        mutablePeriod30.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = mutablePeriod30.toDurationFrom(readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
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
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) (short) 10, periodType71);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(0L, 1L, periodType71);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration36, readableInstant37, periodType71);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(periodType71);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod12, periodType71);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(0, 35, (int) (byte) 1, (int) (short) 1, (int) ' ', 0, 0, 8, periodType71);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(periodType71);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 0, 100L);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue(52, 197);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.addMillis((int) (short) 10);
        int int10 = mutablePeriod3.getMonths();
        org.joda.time.format.PeriodFormatter periodFormatter11 = null;
        java.lang.String str12 = mutablePeriod3.toString(periodFormatter11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0.110S" + "'", str12, "PT0.110S");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        mutablePeriod1.setPeriod((long) (byte) 10, (long) (short) 1);
        mutablePeriod1.setValue(0, (int) ' ');
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        mutablePeriod31.setValue((int) (byte) 1, (-98));
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        mutablePeriod3.addMinutes((int) (short) 1);
        int int9 = mutablePeriod3.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = mutablePeriod3.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        org.joda.time.Chronology chronology39 = null;
        mutablePeriod33.setPeriod((long) (short) -1, chronology39);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType48 = null;
        int int49 = mutablePeriod47.indexOf(durationFieldType48);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod54.addHours((-1));
        mutablePeriod47.add((org.joda.time.ReadablePeriod) mutablePeriod54);
        org.joda.time.PeriodType periodType58 = mutablePeriod47.getPeriodType();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType58, chronology59);
        int int61 = mutablePeriod60.getYears();
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
        int int80 = mutablePeriod60.indexOf(durationFieldType78);
        boolean boolean81 = mutablePeriod33.isSupported(durationFieldType78);
        org.joda.time.Chronology chronology84 = null;
        mutablePeriod33.setPeriod((long) 87, (long) (short) -1, chronology84);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(obj0, chronology1);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (short) 0, (long) 'a');
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 0, periodType7, chronology8);
        int int10 = mutablePeriod9.getYears();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationFrom(readableInstant16);
        mutablePeriod15.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(10L, periodType21, chronology22);
        int int24 = mutablePeriod23.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod23);
        org.joda.time.DurationFieldType durationFieldType27 = mutablePeriod23.getFieldType((int) (short) 1);
        int int28 = mutablePeriod15.get(durationFieldType27);
        boolean boolean29 = mutablePeriod9.isSupported(durationFieldType27);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addMinutes((int) (byte) -1);
        mutablePeriod34.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = mutablePeriod34.toDurationFrom(readableInstant39);
        mutablePeriod9.add((org.joda.time.ReadableDuration) duration40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = mutablePeriod49.toDurationTo(readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType62 = null;
        int int63 = mutablePeriod61.indexOf(durationFieldType62);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod68.addHours((-1));
        mutablePeriod61.add((org.joda.time.ReadablePeriod) mutablePeriod68);
        org.joda.time.PeriodType periodType72 = mutablePeriod61.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType72);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType72, chronology74);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration51, readableInstant52, periodType72);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(readableInstant43, readableInstant44, periodType72);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration40, readableInstant42, periodType72);
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Chronology chronology80 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration40, chronology80);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((java.lang.Object) duration40, chronology82);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(periodType72);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        java.lang.String str3 = mutablePeriod2.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod8.indexOf(durationFieldType9);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        mutablePeriod8.setMillis((int) (short) -1);
        java.lang.Object obj14 = mutablePeriod8.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "PT97H1M0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "PT97H1M0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "PT97H1M0.001S");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        mutablePeriod3.setDays((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        mutablePeriod27.setWeeks((int) '#');
        org.joda.time.ReadableInterval readableInterval30 = null;
        mutablePeriod27.setPeriod(readableInterval30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int[] intArray8 = mutablePeriod7.getValues();
        mutablePeriod7.setYears((int) (byte) 100);
        mutablePeriod7.addMillis((int) (short) 1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 100, chronology14);
        int int16 = mutablePeriod15.getMonths();
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod15.setPeriod((long) (short) -1, chronology19);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(10L, periodType30, chronology31);
        mutablePeriod32.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = mutablePeriod32.toDurationFrom(readableInstant36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = mutablePeriod42.toDurationTo(readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType55 = null;
        int int56 = mutablePeriod54.indexOf(durationFieldType55);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod61.addHours((-1));
        mutablePeriod54.add((org.joda.time.ReadablePeriod) mutablePeriod61);
        org.joda.time.PeriodType periodType65 = mutablePeriod54.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType65, chronology67);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration44, readableInstant45, periodType65);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(readableInstant28, (org.joda.time.ReadableDuration) duration37, periodType65);
        org.joda.time.Chronology chronology71 = null;
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration37, chronology71);
        int int73 = mutablePeriod4.getMonths();
        org.joda.time.DurationFieldType[] durationFieldTypeArray74 = mutablePeriod4.getFieldTypes();
        int int75 = mutablePeriod4.size();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 8 + "'", int75 == 8);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(10L, periodType4, chronology5);
        mutablePeriod6.addHours((int) (byte) 10);
        org.joda.time.PeriodType periodType9 = mutablePeriod6.getPeriodType();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 8, periodType9, chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (short) -1, chronology13);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod14.addYears((int) (short) 1);
        mutablePeriod14.setDays((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod25.addHours((-1));
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod25.setPeriod((long) 100, chronology29);
        mutablePeriod25.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = mutablePeriod25.toDurationFrom(readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant37);
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(10L, periodType47, chronology48);
        mutablePeriod49.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = mutablePeriod49.toDurationFrom(readableInstant53);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType60 = mutablePeriod59.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableInstant45, (org.joda.time.ReadableDuration) duration54, periodType60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 'a', (long) (byte) 10, periodType60, chronology62);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant42, periodType60);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod11, periodType60);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 97, periodType60);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) (short) -1, periodType60, chronology67);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(periodType60);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod5.toDurationFrom(readableInstant13);
        mutablePeriod5.setHours((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = mutablePeriod21.toDurationFrom(readableInstant22);
        mutablePeriod21.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(10L, periodType27, chronology28);
        int int30 = mutablePeriod29.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod29);
        org.joda.time.DurationFieldType durationFieldType33 = mutablePeriod29.getFieldType((int) (short) 1);
        int int34 = mutablePeriod21.get(durationFieldType33);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addMinutes((int) (byte) -1);
        mutablePeriod39.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = mutablePeriod39.toDurationFrom(readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod54.addHours((-1));
        org.joda.time.Chronology chronology58 = null;
        mutablePeriod54.setPeriod((long) 100, chronology58);
        mutablePeriod54.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = mutablePeriod54.toDurationFrom(readableInstant62);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType70 = null;
        int int71 = mutablePeriod69.indexOf(durationFieldType70);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod76.addHours((-1));
        mutablePeriod69.add((org.joda.time.ReadablePeriod) mutablePeriod76);
        org.joda.time.PeriodType periodType80 = mutablePeriod69.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration63, readableInstant64, periodType80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) (short) 10, periodType80);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(0L, 1L, periodType80);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration45, readableInstant46, periodType80);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(periodType80);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod21, periodType80);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod5, periodType80);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((long) 197, periodType80);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(periodType80);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod2.setPeriod(100L, chronology9);
        int[] intArray11 = mutablePeriod2.getValues();
        mutablePeriod2.addWeeks(100);
        mutablePeriod2.addYears((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        int int17 = mutablePeriod2.indexOf(durationFieldType16);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 100, (long) (byte) 100);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = mutablePeriod2.toDurationTo(readableInstant3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 0, periodType65, chronology66);
        int int68 = mutablePeriod67.getYears();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Duration duration75 = mutablePeriod73.toDurationFrom(readableInstant74);
        mutablePeriod73.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod(10L, periodType79, chronology80);
        int int82 = mutablePeriod81.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod81);
        org.joda.time.DurationFieldType durationFieldType85 = mutablePeriod81.getFieldType((int) (short) 1);
        int int86 = mutablePeriod73.get(durationFieldType85);
        boolean boolean87 = mutablePeriod67.isSupported(durationFieldType85);
        mutablePeriod63.add(durationFieldType85, 97);
        int int90 = mutablePeriod10.indexOf(durationFieldType85);
        mutablePeriod10.addDays(52);
        int int93 = mutablePeriod10.getSeconds();
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(durationFieldType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        org.joda.time.PeriodType periodType14 = mutablePeriod2.getPeriodType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0.001S" + "'", str13, "PT0.001S");
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.lang.Object obj0 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod6.addHours((-1));
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod6.setPeriod((long) 100, chronology10);
        mutablePeriod6.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType14 = mutablePeriod6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(periodType14);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) 0, periodType14);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(obj0, periodType14);
        java.lang.Object obj18 = mutablePeriod17.clone();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod17.setPeriod(readableDuration19, chronology20);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "PT0S");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        int int2 = mutablePeriod1.getDays();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        mutablePeriod4.setSeconds((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod1.indexOf(durationFieldType5);
        int int7 = mutablePeriod1.getMinutes();
        mutablePeriod1.addMinutes((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        mutablePeriod4.setPeriod(readableInstant9, readableInstant10);
        int int12 = mutablePeriod4.getMillis();
        mutablePeriod4.clear();
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
        mutablePeriod29.setWeeks((int) (short) 1);
        mutablePeriod29.setPeriod((long) 10, (long) (short) 10);
        org.joda.time.DurationFieldType durationFieldType49 = mutablePeriod29.getFieldType((int) (byte) 0);
        boolean boolean50 = mutablePeriod17.isSupported(durationFieldType49);
        boolean boolean51 = mutablePeriod4.equals((java.lang.Object) durationFieldType49);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        mutablePeriod16.setPeriod(readableInstant17, readableInstant18);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod16.setValue((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M52.097S");
        org.joda.time.MutablePeriod mutablePeriod2 = mutablePeriod1.toMutablePeriod();
        int int3 = mutablePeriod2.getMillis();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 10, (long) 8);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = mutablePeriod2.getValue((-41));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod19.toDurationFrom(readableInstant20);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = mutablePeriod36.indexOf(durationFieldType37);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod43.addHours((-1));
        mutablePeriod36.add((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.PeriodType periodType47 = mutablePeriod36.getPeriodType();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType47, chronology48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType47);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(readableInstant14, (org.joda.time.ReadableDuration) duration21, periodType47);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(readableInstant12, readableInstant13, periodType47);
        int int53 = mutablePeriod52.getDays();
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod52);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod61.addHours((-1));
        org.joda.time.Chronology chronology65 = null;
        mutablePeriod61.setPeriod((long) 100, chronology65);
        mutablePeriod61.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType69 = mutablePeriod61.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(periodType69);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) (short) -1, (long) 97, periodType69, chronology71);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType69, chronology73);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P100WT100M" + "'", str11, "P100WT100M");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(periodType69);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod14.addHours((-1));
        mutablePeriod14.addDays((int) (short) 10);
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
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant53);
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod66.addHours((-1));
        org.joda.time.Chronology chronology70 = null;
        mutablePeriod66.setPeriod((long) 100, chronology70);
        mutablePeriod66.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType74 = mutablePeriod66.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(periodType74);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 10, periodType74, chronology76);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) (byte) 1, periodType74, chronology78);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) (short) 100, (long) (byte) 0, periodType74);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1, periodType74);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(readableInstant9, (org.joda.time.ReadableDuration) duration32, periodType74);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod87.addHours((-1));
        org.joda.time.Chronology chronology91 = null;
        mutablePeriod87.setPeriod((long) 100, chronology91);
        mutablePeriod87.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType95 = mutablePeriod87.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod(periodType95);
        org.joda.time.MutablePeriod mutablePeriod97 = new org.joda.time.MutablePeriod(readableInstant8, (org.joda.time.ReadableDuration) duration32, periodType95);
        org.joda.time.MutablePeriod mutablePeriod98 = new org.joda.time.MutablePeriod((int) '4', (int) (short) -1, (int) (byte) 0, (int) (short) 1, 87, (int) (short) -1, 4, 0, periodType95);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(periodType95);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(10L, periodType9, chronology10);
        mutablePeriod11.setPeriod((long) (byte) 0, 100L);
        org.joda.time.PeriodType periodType15 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) (short) 100, (int) '4', 0, (int) (byte) -1, 52, (int) (short) 1, 10, 0, periodType15);
        mutablePeriod16.addMonths((int) (short) 100);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1, chronology2);
        int int4 = mutablePeriod3.getHours();
        mutablePeriod3.setPeriod(0L, 1L);
        org.joda.time.Chronology chronology8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) 0L, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        org.joda.time.MutablePeriod mutablePeriod34 = mutablePeriod1.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval35 = null;
        mutablePeriod1.add(readableInterval35);
        int int37 = mutablePeriod1.getWeeks();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(mutablePeriod34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int[] intArray8 = mutablePeriod7.getValues();
        mutablePeriod7.setYears((int) (byte) 100);
        mutablePeriod7.addMillis((int) (short) 1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 100, chronology14);
        int int16 = mutablePeriod15.getMonths();
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType19 = mutablePeriod15.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(0L, 10L, chronology2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = mutablePeriod3.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((int) (byte) 10, 10, (int) '4', 8, (-1), 97, (int) (byte) 10, 100, periodType59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(1L, periodType59, chronology63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((java.lang.Object) int18, periodType59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(periodType59);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, (-41), 97, (int) (byte) 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        mutablePeriod4.addMonths(0);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        org.joda.time.MutablePeriod mutablePeriod26 = mutablePeriod4.copy();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod26);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        mutablePeriod14.add((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.PeriodType periodType25 = mutablePeriod14.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType25, chronology27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 0, periodType25);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 100, periodType25, chronology30);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(100L, periodType25);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 'a', (long) ' ', periodType25);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, periodType25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) 10, (-1L), periodType2, chronology3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod4.setPeriod(readableInstant5, readableInstant6);
        int int8 = mutablePeriod4.getMinutes();
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
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType51 = null;
        int int52 = mutablePeriod50.indexOf(durationFieldType51);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod57.addHours((-1));
        mutablePeriod50.add((org.joda.time.ReadablePeriod) mutablePeriod57);
        org.joda.time.PeriodType periodType61 = mutablePeriod50.getPeriodType();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType61, chronology62);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant43, periodType61);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod64);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(readableInstant66, readableInstant67, periodType68);
        int int70 = mutablePeriod69.size();
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(readableInstant71, readableInstant72, periodType73);
        int int75 = mutablePeriod74.size();
        mutablePeriod69.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod74);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.Duration duration78 = mutablePeriod69.toDurationFrom(readableInstant77);
        mutablePeriod65.setPeriod((org.joda.time.ReadableDuration) duration78);
        boolean boolean80 = mutablePeriod4.equals((java.lang.Object) duration78);
        int int81 = mutablePeriod4.getWeeks();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 8 + "'", int70 == 8);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 8 + "'", int75 == 8);
        org.junit.Assert.assertNotNull(duration78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, (-98), 35, (int) (byte) 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT0.032S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType73);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(periodType73);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        mutablePeriod40.setPeriod((long) 97);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        mutablePeriod40.setPeriod(readableInstant73, readableInstant74);
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 97, chronology2);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', (int) (short) 100, (int) (byte) 1, 97, (int) (short) 1, (int) '#', (int) (short) 0, 100);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod8.toString(periodFormatter9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        mutablePeriod8.setPeriod(readableInterval11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        mutablePeriod8.setPeriod(readableInstant13, readableInstant14);
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.copy();
        mutablePeriod8.setDays((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P32Y100M1W97DT1H35M0.100S" + "'", str10, "P32Y100M1W97DT1H35M0.100S");
        org.junit.Assert.assertNotNull(mutablePeriod16);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.PeriodType periodType16 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(periodType16);
        java.lang.Object obj18 = mutablePeriod17.clone();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod17, chronology19);
        mutablePeriod17.setYears((int) (short) 10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "P10Y");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "P10Y");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "P10Y");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(periodType56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod57, chronology58);
        mutablePeriod1.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod59);
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
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        mutablePeriod50.addWeeks(24);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = mutablePeriod4.toDurationTo(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType41 = null;
        int int42 = mutablePeriod40.indexOf(durationFieldType41);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod47.addHours((-1));
        mutablePeriod40.add((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.PeriodType periodType51 = mutablePeriod40.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant33, periodType51);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableInstant1, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant55);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration28);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod3.toDurationTo(readableInstant18);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 8);
        mutablePeriod1.setMillis((int) (byte) 1);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, 0L);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        java.lang.String str3 = mutablePeriod2.toString();
        mutablePeriod2.setHours((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue(107, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 107");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 0, periodType34);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType34);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(periodType34);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod3.setPeriod((long) 8, 100L, chronology6);
        mutablePeriod3.setWeeks(0);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        int int8 = mutablePeriod4.getWeeks();
        mutablePeriod4.add((long) ' ');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant11, readableInstant12, periodType13);
        int int15 = mutablePeriod14.size();
        mutablePeriod14.addYears(10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant18, readableInstant19, periodType20);
        mutablePeriod21.setMinutes((int) (short) 100);
        org.joda.time.Period period24 = mutablePeriod21.toPeriod();
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
        boolean boolean43 = period24.isSupported(durationFieldType41);
        int int44 = mutablePeriod14.get(durationFieldType41);
        int int45 = mutablePeriod4.indexOf(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        int int3 = mutablePeriod1.getHours();
        mutablePeriod1.addMinutes((int) (byte) 100);
        mutablePeriod1.setDays(8);
        mutablePeriod1.setMonths((-1));
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(periodType10);
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod11.add(1L, chronology13);
        org.joda.time.PeriodType periodType15 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.Chronology chronology17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((java.lang.Object) (-1), periodType15, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.ReadableInterval readableInterval2 = null;
        mutablePeriod1.add(readableInterval2);
        mutablePeriod1.setWeeks((int) (byte) 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        int int7 = mutablePeriod4.getMinutes();
        mutablePeriod4.setMillis(197);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        mutablePeriod40.setMinutes(107);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 100, (int) '4', (int) (byte) 1, (int) (short) 0, (int) (byte) 1, (int) (short) 1, 97, (int) (byte) 1);
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod8.setPeriod((long) 'a', 10L, chronology11);
        mutablePeriod8.addWeeks(0);
        mutablePeriod8.addDays(8);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P32Y100M1W97DT1H35M0.100S");
        int int2 = mutablePeriod1.getDays();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        int int12 = mutablePeriod4.getDays();
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = mutablePeriod4.getFieldTypes();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType66);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) ' ');
        int int2 = mutablePeriod1.size();
        mutablePeriod1.add((int) (short) 1, (-1), (int) (byte) 100, (int) '#', (int) (byte) 0, 35, (int) (byte) 1, (int) 'a');
        int int12 = mutablePeriod1.getWeeks();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) '#', 1, 10, 0, (int) (short) -1, 197, 0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        mutablePeriod11.setDays(32);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) -1, 4, (int) (short) -1, (-1), (int) (short) 10, 0, 4);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        mutablePeriod27.addWeeks((int) (short) 100);
        int int34 = mutablePeriod27.size();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        mutablePeriod28.add((long) 1);
        mutablePeriod28.setWeeks((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = mutablePeriod5.toDurationFrom(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
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
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod(readableInstant8, readableInstant9, periodType85);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType85);
        org.joda.time.ReadableInstant readableInstant94 = null;
        org.joda.time.PeriodType periodType95 = null;
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, readableInstant94, periodType95);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT1M0.100S" + "'", str59, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(periodType85);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) ' ', (long) 96, chronology2);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 97, chronology1);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.toMutablePeriod();
        mutablePeriod2.addDays(8);
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        java.lang.Object obj3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(obj3);
        org.joda.time.PeriodType periodType5 = mutablePeriod4.getPeriodType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) ' ', periodType5, chronology6);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType5);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType5);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod();
        mutablePeriod46.setMillis((int) (byte) 10);
        mutablePeriod46.addMinutes((int) (byte) -1);
        mutablePeriod46.setMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType53 = mutablePeriod46.getPeriodType();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType53, chronology54);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant44, periodType53);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        int int58 = mutablePeriod57.getWeeks();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("P100WT100M", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        org.joda.time.Period period62 = mutablePeriod4.toPeriod();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 52, 0, 0, 1, 0, 297]");
        org.junit.Assert.assertNotNull(period62);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(10L, periodType6, chronology7);
        mutablePeriod8.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod8.toDurationFrom(readableInstant12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = mutablePeriod18.toDurationTo(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType31 = null;
        int int32 = mutablePeriod30.indexOf(durationFieldType31);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        mutablePeriod30.add((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.PeriodType periodType41 = mutablePeriod30.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType41, chronology43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant21, periodType41);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableInstant4, (org.joda.time.ReadableDuration) duration13, periodType41);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) '#', 1L, periodType41, chronology47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType41);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((java.lang.Object) readableInstant0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.setDays((int) (byte) 1);
        int int10 = mutablePeriod3.getWeeks();
        int int11 = mutablePeriod3.getHours();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 100, periodType1);
        java.lang.Object obj3 = mutablePeriod2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "PT0.100S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "PT0.100S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "PT0.100S");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        int int1 = mutablePeriod0.getMinutes();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = mutablePeriod0.toDurationFrom(readableInstant2);
        int int4 = mutablePeriod0.getSeconds();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        mutablePeriod40.setPeriod((long) 97);
        org.joda.time.PeriodType periodType73 = mutablePeriod40.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod(periodType73);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray66);
        org.junit.Assert.assertNotNull(periodType73);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        java.lang.Object obj27 = mutablePeriod2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType29 = mutablePeriod2.getFieldType(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "PT1M0.035S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "PT1M0.035S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "PT1M0.035S");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int int16 = mutablePeriod14.indexOf(durationFieldType15);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        mutablePeriod14.setMonths((int) ' ');
        org.joda.time.DurationFieldType[] durationFieldTypeArray20 = mutablePeriod14.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = mutablePeriod14.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(durationFieldTypeArray20);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) '4');
        org.joda.time.ReadableInterval readableInterval2 = null;
        mutablePeriod1.add(readableInterval2);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P35DT97H97M0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(10L, periodType37, chronology38);
        mutablePeriod39.addHours((int) (byte) 10);
        org.joda.time.PeriodType periodType42 = mutablePeriod39.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((java.lang.Object) duration15, periodType42);
        mutablePeriod43.setSeconds(24);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType42);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        int int6 = mutablePeriod3.getWeeks();
        org.joda.time.DurationFieldType durationFieldType8 = mutablePeriod3.getFieldType(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 8, 100L, chronology2);
        int int4 = mutablePeriod3.getMonths();
        org.joda.time.MutablePeriod mutablePeriod6 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
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
        org.joda.time.Chronology chronology39 = null;
        mutablePeriod6.setPeriod((org.joda.time.ReadableDuration) duration20, chronology39);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod6);
        int int42 = mutablePeriod6.getDays();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        mutablePeriod1.setPeriod((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (short) 100, (-1));
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod1.toMutablePeriod();
        mutablePeriod11.setMonths((int) '4');
        mutablePeriod11.setSeconds(197);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod2.add((long) (short) -1, chronology4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(10L, periodType7, chronology8);
        mutablePeriod9.setPeriod((long) (byte) 0, 100L);
        mutablePeriod9.setMonths(97);
        mutablePeriod2.add((org.joda.time.ReadablePeriod) mutablePeriod9);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(10L, periodType10, chronology11);
        mutablePeriod12.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod12.toDurationFrom(readableInstant16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = mutablePeriod22.toDurationTo(readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType35 = null;
        int int36 = mutablePeriod34.indexOf(durationFieldType35);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod41.addHours((-1));
        mutablePeriod34.add((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.PeriodType periodType45 = mutablePeriod34.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType45, chronology47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, readableInstant25, periodType45);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(readableInstant8, (org.joda.time.ReadableDuration) duration17, periodType45);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(97, (int) 'a', (int) (byte) 0, 100, (-1), 100, (int) (short) 0, 1, periodType45);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = mutablePeriod51.toDurationFrom(readableInstant52);
        int int54 = mutablePeriod51.getYears();
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT0.048S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        org.joda.time.Chronology chronology39 = null;
        mutablePeriod33.setPeriod((long) (short) -1, chronology39);
        mutablePeriod33.setMillis((int) '4');
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = mutablePeriod1.getValue(87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 87");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.Period period6 = mutablePeriod3.toPeriod();
        java.lang.Class<?> wildcardClass7 = period6.getClass();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 197, periodType37, chronology44);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(35, (-1), (int) (byte) 0, (int) (short) 10, (int) (byte) 10, (int) (byte) -1, 97, (-98));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        int int40 = mutablePeriod19.getYears();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        mutablePeriod3.setPeriod((int) (short) -1, 87, 96, 24, 96, (-1), 197, 107);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 10, (int) '#', (int) (byte) 0, (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod4.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
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
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableInstant9, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod61.addHours((-1));
        org.joda.time.Chronology chronology65 = null;
        mutablePeriod61.setPeriod((long) 100, chronology65);
        mutablePeriod61.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = mutablePeriod61.toDurationFrom(readableInstant69);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType77 = null;
        int int78 = mutablePeriod76.indexOf(durationFieldType77);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod83.addHours((-1));
        mutablePeriod76.add((org.joda.time.ReadablePeriod) mutablePeriod83);
        org.joda.time.PeriodType periodType87 = mutablePeriod76.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration70, readableInstant71, periodType87);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (short) 0, periodType87);
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, readableInstant54, periodType87);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod(readableInstant8, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology92 = null;
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration19, chronology92);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(periodType87);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, 0L, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod3.setPeriod(readableInstant5, readableInstant6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addHours((-1));
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod42.setPeriod((long) 100, chronology46);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType53 = null;
        int int54 = mutablePeriod52.indexOf(durationFieldType53);
        mutablePeriod42.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod52);
        mutablePeriod52.setMonths((int) ' ');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableInstant58, readableInstant59, periodType60);
        int int62 = mutablePeriod61.size();
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(readableInstant63, readableInstant64, periodType65);
        int int67 = mutablePeriod66.size();
        mutablePeriod61.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod66);
        org.joda.time.DurationFieldType[] durationFieldTypeArray69 = mutablePeriod61.getFieldTypes();
        org.joda.time.DurationFieldType durationFieldType71 = mutablePeriod61.getFieldType((int) (short) 0);
        mutablePeriod52.set(durationFieldType71, 87);
        mutablePeriod10.add(durationFieldType71, 107);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 8 + "'", int62 == 8);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 8 + "'", int67 == 8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray69);
        org.junit.Assert.assertNotNull(durationFieldType71);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        mutablePeriod27.setHours(35);
        mutablePeriod27.setMillis(24);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMillis();
        mutablePeriod3.addMinutes(0);
        mutablePeriod3.addHours((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        mutablePeriod76.setPeriod((long) (short) 0, (long) 24);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M0.100S" + "'", str42, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(periodType68);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) (byte) 10);
        int int3 = mutablePeriod2.getHours();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = mutablePeriod2.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = mutablePeriod3.toDurationFrom(readableInstant7);
        mutablePeriod3.setPeriod((long) '4', (long) (byte) 100);
        mutablePeriod3.setPeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod15.setPeriod((long) (short) 0, chronology17);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod15);
        int int20 = mutablePeriod3.getSeconds();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        mutablePeriod36.setPeriod((long) (-1), 10L);
        org.joda.time.PeriodType periodType40 = mutablePeriod36.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (byte) -1, (int) (short) 100, (int) (short) -1, (int) 'a', 0, (int) 'a', 100, (int) (short) 10, periodType40);
        java.lang.String str43 = mutablePeriod42.toString();
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "P-1Y100M-1W97DT97M100.010S" + "'", str43, "P-1Y100M-1W97DT97M100.010S");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(10, 100, 8, 197);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        mutablePeriod4.addYears((-41));
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(mutablePeriod27);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMillis(0);
        int int9 = mutablePeriod4.getHours();
        mutablePeriod4.setPeriod(8, (int) (byte) 10, (-41), 100, 0, (int) (short) 1, (-41), 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', (int) 'a', 52, (int) '#');
        org.joda.time.ReadableInterval readableInterval5 = null;
        mutablePeriod4.setPeriod(readableInterval5);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) 0);
        mutablePeriod1.setMonths(0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-41), (long) 52, chronology2);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.lang.Object obj1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(obj1);
        org.joda.time.PeriodType periodType3 = mutablePeriod2.getPeriodType();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) ' ', periodType3, chronology4);
        mutablePeriod5.addYears(52);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-1), (int) (byte) -1, 8, 52, 1, 0, 97, (int) (short) 1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-98), (long) '#', chronology2);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M52.097S");
        java.lang.Object obj2 = null;
        boolean boolean3 = mutablePeriod1.equals(obj2);
        mutablePeriod1.setDays(0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) '#', 8, 100, (int) (short) 1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod4.setPeriod(readableInstant5, readableInstant6);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 24);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) (byte) 10);
        int int3 = mutablePeriod2.getHours();
        java.lang.Class<?> wildcardClass4 = mutablePeriod2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

